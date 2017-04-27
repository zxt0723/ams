package com.haibei.controller.ams;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haibei.core.Page;
import com.haibei.pojo.application.ResInterface;
import com.haibei.pojo.application.ResourceExample;
import com.haibei.service.application.ApplicationService;
import com.haibei.service.application.ResInterfaceService;
import com.haibei.service.application.ResourceService;



@Controller
@RequestMapping("/resource")
public class ResourceController {
	@Resource
	ApplicationService applicationService;
	@Resource
	ResourceService resourceService;
	@Resource
	ResInterfaceService resInterfaceService;
//	@InitBinder
//	public void init(WebDataBinder binder) {
//
//	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("resource");
		return "ams/resource";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> list(@ModelAttribute("page") Page page) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		ResourceExample example = new ResourceExample();
		com.haibei.pojo.application.ResourceExample.Criteria criteria = example.createCriteria();
		if (page.getConditions() != null) {
			if (page.getConditions().get("appId") != null && !page.getConditions().get("appId").equals("")) {
				criteria.andAppIdEqualTo(Long.valueOf(page.getConditions().get("appId").toString()));
			}else{
				criteria.andAppIdEqualTo(-1L); //返回空表
			}
			
			if (page.getConditions().get("resName") != null && !page.getConditions().get("resName").equals("")) {
				criteria.andResNameLike("%"+page.getConditions().get("resName").toString()+"%");
			}
		}else{
			criteria.andAppIdEqualTo(-1L);
		}
		//page.setNumPerPage(10);
		page.setTotalCount(resourceService.countByExample(example));
		example.setRowsPerPage(page.getNumPerPage());
		example.setLimitStart((page.getPageNum() - 1) * page.getNumPerPage());
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.selectByExample(example));
		System.out.println(page.getPageNum());
		model.put("page", page);

		return model;
	}
	
	@RequestMapping(value = "/menuList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> menulist(Integer appId) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		ResourceExample example = new ResourceExample();
		com.haibei.pojo.application.ResourceExample.Criteria criteria = example.createCriteria();
		
		criteria.andAppIdEqualTo(appId.longValue()).andResTypeEqualTo("02");
			
		//page.setNumPerPage(10);
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.selectByExample(example));
		

		return model;
	}
	//得到资源信息
	@RequestMapping(value = "/get", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> get(Integer busiId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.selectByPrimaryKey(busiId.longValue()));
		

		return model;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> update(com.haibei.pojo.application.Resource res) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.updateByPrimaryKeySelective(res));
		
		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> insert(com.haibei.pojo.application.Resource app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.insertSelective(app));
		
		return model;
	}
	@RequestMapping(value = "/del", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> del(com.haibei.pojo.application.Resource app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", resourceService.deleteByPrimaryKey(app.getWid()));
		
		return model;
	}
	
	//资源接口信息
	//public Map<String, Object> saveResInterface(@RequestParam(value = "appId") Long appId,@RequestParam(value = "resId") Long resId,ArrayList<String> ids) {

	@RequestMapping(value = "/saveResInterface", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> saveResInterface(@RequestParam(value = "appId") Long appId,@RequestParam(value = "resId") Long resId,@RequestParam("ids") List<Long> ids) {

		Map<String, Object> model=new HashMap<String,Object>();
	
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		//model.put("data", resourceService.insertSelective(app));
		com.haibei.pojo.application.ResInterfaceExample example=new com.haibei.pojo.application.ResInterfaceExample();
		example.createCriteria().andResIdEqualTo(resId);
		this.resInterfaceService.deleteByExample(example);
		ResInterface resInterface=new ResInterface();
		resInterface.setWid(1L);
		resInterface.setAppId(appId);
		resInterface.setResId(resId);
		for(Long id:ids){
			resInterface.setInterfaceId(id);
			this.resInterfaceService.insertSelective(resInterface);
		}
		model.put("data", ids.size());
		return model;
	}
	@RequestMapping(value = "/getResInterface", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object>getResInterface(Long resId) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		//model.put("data", resourceService.insertSelective(app));
		com.haibei.pojo.application.ResInterfaceExample example=new com.haibei.pojo.application.ResInterfaceExample();
		example.createCriteria().andResIdEqualTo(resId);
		example.setRowsPerPage(100);
		List<ResInterface> resInt=this.resInterfaceService.selectByExample(example);
		List<Long> ids=new ArrayList<Long>();
		for(ResInterface res:resInt){
			ids.add(res.getInterfaceId());
		}
		
		model.put("data",ids);
		return model;
	}
}
