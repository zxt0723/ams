package com.haibei.controller.ams;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haibei.core.Page;
import com.haibei.pojo.application.Interface;
import com.haibei.pojo.application.InterfaceExample;
import com.haibei.pojo.application.InterfaceExample.Criteria;
import com.haibei.service.application.InterfaceService;



@Controller
@RequestMapping("/iFace")
public class InterfaceController {
	@Resource
	InterfaceService interfaceService;
//	@InitBinder
//	public void init(WebDataBinder binder) {
//
//	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//
//	}

//	@RequestMapping(value = "/{busiId}", method = RequestMethod.GET)
//	public String index(@PathVariable("busiId") Integer id, ModelMap model) {	
//		model.put("busiId", id);
//		return "ams/interface";
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {	
		System.out.println("enter interface! ");
		return "ams/interface";
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> list(@ModelAttribute("page") Page page) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		InterfaceExample example = new InterfaceExample();
		Criteria criteria = example.createCriteria();
		if (page.getConditions() != null) {
			if (page.getConditions().get("busiId") != null && !page.getConditions().get("busiId").equals(0)) {
				criteria.andBusiWidEqualTo(Long.valueOf(page.getConditions().get("busiId").toString()));
			}
			//isUseable
			if (page.getConditions().get("isUseable") != null && !page.getConditions().get("isUseable").equals("")) {
				//criteria.andIsUseableEqualTo(page.getConditions().get("isUseable").toString());
			}
			if (page.getConditions().get("functionName") != null && !page.getConditions().get("functionName").equals("")) {
				criteria.andFunctionNameLike("%"+page.getConditions().get("functionName").toString()+"%");
			}
		}
		//page.setNumPerPage(10);
		page.setTotalCount(interfaceService.countByExample(example));
		example.setRowsPerPage(page.getNumPerPage());
		example.setLimitStart((page.getPageNum() - 1) * page.getNumPerPage());
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", interfaceService.selectByExample(example));
		System.out.println(page.getPageNum());
		model.put("page", page);

		return model;
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> update(Interface app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", interfaceService.updateByPrimaryKeySelective(app));
		
		return model;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> get(Integer funcId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", interfaceService.selectByPrimaryKey(funcId.longValue()));
		

		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insert(Interface app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", interfaceService.insertSelective(app));
		
		return model;
	}
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> del(Interface app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", interfaceService.deleteByPrimaryKey(app.getWid()));
		
		return model;
	}
}
