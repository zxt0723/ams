package com.haibei.controller.ams;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haibei.core.Page;
import com.haibei.pojo.application.Application;
import com.haibei.pojo.application.ApplicationExample;
import com.haibei.pojo.application.ApplicationExample.Criteria;
import com.haibei.pojo.application.Business;
import com.haibei.pojo.application.BusinessExample;
import com.haibei.service.application.ApplicationService;
import com.haibei.service.application.BusinessService;



@Controller
@RequestMapping("/business")
public class BusinessController {
	@Resource
	ApplicationService applicationService;
	@Resource
	BusinessService businessService;
//	@InitBinder
//	public void init(WebDataBinder binder) {
//
//	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("business");
		return "ams/business";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> list(@ModelAttribute("page") Page page) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		BusinessExample example = new BusinessExample();
		com.haibei.pojo.application.BusinessExample.Criteria criteria = example.createCriteria();
		if (page.getConditions() != null) {
			if (page.getConditions().get("appId") != null && !page.getConditions().get("appId").equals("")) {
				criteria.andAppWidEqualTo(Long.valueOf(page.getConditions().get("appId").toString()));
			}else{
				criteria.andAppWidEqualTo(-1L); //·µ»Ø¿Õ±í
			}
			
			if (page.getConditions().get("busiClass") != null && !page.getConditions().get("busiClass").equals("")) {
				criteria.andBusiClassLike("%"+page.getConditions().get("busiClass").toString()+"%");
			}
		}else{
			criteria.andAppWidEqualTo(-1L);
		}
		//page.setNumPerPage(10);
		page.setTotalCount(businessService.countByExample(example));
		example.setRowsPerPage(page.getNumPerPage());
		example.setLimitStart((page.getPageNum() - 1) * page.getNumPerPage());
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.selectByExample(example));
		System.out.println(page.getPageNum());
		model.put("page", page);

		return model;
	}
	
	@RequestMapping(value = "/listByAppId", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> listByAppId(Integer appId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		BusinessExample example = new BusinessExample();
		com.haibei.pojo.application.BusinessExample.Criteria criteria = example.createCriteria();
		criteria.andAppWidEqualTo(appId.longValue());
		
		
		example.setRowsPerPage(100);
		example.setLimitStart(0);
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.selectByExample(example));
		

		return model;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> get(Integer busiId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.selectByPrimaryKey(busiId.longValue()));
		

		return model;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> update(Business busi) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.updateByPrimaryKeySelective(busi));
		
		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> insert(Business app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.insertSelective(app));
		
		return model;
	}
	@RequestMapping(value = "/del", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> del(Business app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", businessService.deleteByPrimaryKey(app.getWid()));
		
		return model;
	}
}
