package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BController {
	
	@RequestMapping("/list")
	public String boardList() {
		return "/board/list";
	}
	
}
