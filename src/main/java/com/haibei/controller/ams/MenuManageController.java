package com.haibei.controller.ams;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/menuManage")
public class MenuManageController
{
  @RequestMapping(value="/",method=RequestMethod.GET)

  public String  list()
  { 

	  System.out.println("main");
	  return "/menuManage/list";
  }
  
}
