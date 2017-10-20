package com.answern.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answern.feign.demo.config.ReadConfig;

@Controller
@RequestMapping(value = "/index" )
public class TestController {
	
	@Autowired
	ReadConfig readConfig;
	
	@RequestMapping(value = "/index" , method=RequestMethod.GET)
	public String  index() { 
		return "index"; 
	}
	@RequestMapping(value = "/redconfig" , method=RequestMethod.GET)
	@ResponseBody
	public String  redconfig() { 
		return "redconfig="+readConfig.getMsg(); 
	}

}
