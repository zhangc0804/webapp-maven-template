package com.oldox.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oldox.framework.entity.KindEditorContent;
import com.oldox.framework.service.KindEditorService;
import com.oldox.framework.service.UserService;

@Controller
public class KindEditorController {
	
	@Autowired
	private KindEditorService kindEditorService;
	
	@RequestMapping("/kindeditor/index")
	public String index(@RequestParam String content){
		System.out.println(content);
		return "/kindeditor/index";
	}
	
	@RequestMapping("/kindeditor/getById")
	public String getById(@RequestParam Long id){
		return "/kindeditor/index";
	}
	
	@RequestMapping("/kindeditor/saveOrUpdate")
	public String saveOrUpdate(@RequestParam String content){
		System.out.println(content);
		KindEditorContent contentEntity = new KindEditorContent();
		contentEntity.setContent(content);
		kindEditorService.saveOrUpdate(contentEntity);
		return "/kindeditor/index";
	}

}
