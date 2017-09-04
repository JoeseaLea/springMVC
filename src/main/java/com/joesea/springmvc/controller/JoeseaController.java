package com.joesea.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joesea.springmvc.vo.PersonVo;

@Controller
@RequestMapping(value="/joesea")
public class JoeseaController {
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="/getPersonInfo")
	@ResponseBody
	public PersonVo getPersonInfo() {
		PersonVo personVo = new PersonVo();
		
		personVo.setName("张三");
		personVo.setAge(18);
		personVo.setAddress("广东省广州市");
		
		return personVo;
	}
}
