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
import com.haibei.pojo.application.Params;
import com.haibei.pojo.application.ParamsExample;
import com.haibei.pojo.application.ParamsExample.Criteria;
import com.haibei.service.application.ParamsService;



@Controller
@RequestMapping("/params")
public class ParamsController {
	@Resource
	ParamsService Service;
//	@InitBinder
//	public void init(WebDataBinder binder) {
//
//	binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//
//	}

//	@RequestMapping(value = "/{busiId}", method = RequestMethod.GET)
//	public String index(@PathVariable("busiId") Integer id, ModelMap model) {	
//		model.put("busiId", id);
//		return "ams/";
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {	
		;
		return "ams/params";
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> list(@ModelAttribute("page") Page page) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		ParamsExample example = new ParamsExample();
		Criteria criteria = example.createCriteria();
		if (page.getConditions() != null) {
			if (page.getConditions().get("funcId") != null && !page.getConditions().get("funcId").equals(0)) {
				criteria.andFuncIdEqualTo(Long.valueOf(page.getConditions().get("busiId").toString()));
			}
			//isUseable
			if (page.getConditions().get("isUseable") != null && !page.getConditions().get("isUseable").equals("")) {
				//criteria.andIsUseableEqualTo(page.getConditions().get("isUseable").toString());
			}
			if (page.getConditions().get("paramName") != null && !page.getConditions().get("paramName").equals("")) {
				criteria.andParamNameLike("%"+page.getConditions().get("paramName").toString()+"%");
			}
		}
		//page.setNumPerPage(10);
		page.setTotalCount(Service.countByExample(example));
		example.setRowsPerPage(page.getNumPerPage());
		example.setLimitStart((page.getPageNum() - 1) * page.getNumPerPage());
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", Service.selectByExample(example));
		System.out.println(page.getPageNum());
		model.put("page", page);

		return model;
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> update(Params app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", Service.updateByPrimaryKeySelective(app));
		
		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insert(Params app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", Service.insertSelective(app));
		
		return model;
	}
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> del(Params app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", Service.deleteByPrimaryKey(app.getWid()));
		
		return model;
	}
}
