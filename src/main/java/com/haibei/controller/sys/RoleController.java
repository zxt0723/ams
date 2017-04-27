package com.haibei.controller.sys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haibei.core.Page;
import com.haibei.pojo.application.ResInterface;
import com.haibei.pojo.sys.Role;
import com.haibei.pojo.sys.RoleExample;
import com.haibei.pojo.sys.RoleRes;
import com.haibei.pojo.sys.RoleResExample;
import com.haibei.service.application.ApplicationService;
import com.haibei.service.sys.RoleResService;
import com.haibei.service.sys.RoleService;



@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	ApplicationService applicationService;
	@Resource
	RoleService roleService;
	@Resource
	RoleResService roleResService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("role");
		return "sys/role";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> list(@ModelAttribute("page") Page page) {
		Map<String, Object> model=new HashMap<String,Object>();
		// List<XQ> xqList=xQservice.selectByExample(null);
		RoleExample example = new RoleExample();
		com.haibei.pojo.sys.RoleExample.Criteria criteria = example.createCriteria();
		if (page.getConditions() != null) {
			if (page.getConditions().get("appId") != null && !page.getConditions().get("appId").equals("")) {
				criteria.andAppIdEqualTo(Long.valueOf(page.getConditions().get("appId").toString()));
			}else{
				criteria.andAppIdEqualTo(-1L); //返回空表
			}
			
			if (page.getConditions().get("roleName") != null && !page.getConditions().get("roleName").equals("")) {
				criteria.andRoleNameLike("%"+page.getConditions().get("roleName").toString()+"%");
			}
		}else{
			criteria.andAppIdEqualTo(-1L);
		}
		//page.setNumPerPage(10);
		page.setTotalCount(roleService.countByExample(example));
		example.setRowsPerPage(page.getNumPerPage());
		example.setLimitStart((page.getPageNum() - 1) * page.getNumPerPage());
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.selectByExample(example));
		System.out.println(page.getPageNum());
		model.put("page", page);

		return model;
	}
	
	@RequestMapping(value = "/listByAppId", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> listByAppId(Integer appId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		RoleExample example = new RoleExample();
		com.haibei.pojo.sys.RoleExample.Criteria criteria = example.createCriteria();
		criteria.andAppIdEqualTo(appId.longValue());
		
		
		example.setRowsPerPage(100);
		example.setLimitStart(0);
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.selectByExample(example));
		

		return model;
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> get(Integer busiId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.selectByPrimaryKey(busiId.longValue()));
		

		return model;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> update(Role busi) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.updateByPrimaryKeySelective(busi));
		
		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> insert(Role app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.insertSelective(app));
		
		return model;
	}
	@RequestMapping(value = "/del", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> del(Role app) {
		Map<String, Object> model=new HashMap<String,Object>();
	
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleService.deleteByPrimaryKey(app.getWid()));
		
		return model;
	}
	//得到权限
	@RequestMapping(value = "/listResOfRole", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> listResOfRole(Integer roleId) {
		Map<String, Object> model=new HashMap<String,Object>();
		
		RoleResExample example = new RoleResExample();
		com.haibei.pojo.sys.RoleResExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId.longValue());
		
		
		example.setRowsPerPage(100);
		example.setLimitStart(0);
		
		model.put("statusCode", "200");
		model.put("message", "success");
		model.put("data", roleResService.selectByExample(example));
		

		return model;
	}
	//保存权限
	@RequestMapping(value = "/saveRoleRes", method = RequestMethod.POST,headers = "Accept=application/json")
	@ResponseBody
	public Map<String, Object> saveRoleRes(@RequestParam(value = "appId") Long appId,@RequestParam(value = "roleId") Long roleId,@RequestParam("ids") List<Long> ids) {

		Map<String, Object> model=new HashMap<String,Object>();
	
		
		
		model.put("statusCode", "200");
		model.put("message", "success");
		//model.put("data", resourceService.insertSelective(app));
		com.haibei.pojo.sys.RoleResExample example=new com.haibei.pojo.sys.RoleResExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		this.roleResService.deleteByExample(example);
		RoleRes roleRes=new RoleRes();
		roleRes.setWid(1L);
		roleRes.setAppId(appId);
		roleRes.setRoleId(roleId);
		for(Long id:ids){
			roleRes.setResId(id);
			this.roleResService.insertSelective(roleRes);
		}
		model.put("data", ids.size());
		return model;
	}
}
