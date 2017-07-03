package com.test.lwk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.lwk.service.INewService;

@Controller
@RequestMapping("news")
public class NewController {
	
	@Autowired
	private INewService newService;
	
	@RequestMapping("getAll")
	public String getAll(Model model){
		model.addAttribute("newList", newService.getAllNews());
		return "news/news";
	}
}
