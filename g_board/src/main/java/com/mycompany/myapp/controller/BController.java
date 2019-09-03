package com.mycompany.myapp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.service.BoardService;

@Controller
@RequestMapping("/board")
public class BController {
	
	@Inject
	BoardService boardService;
	@RequestMapping("/list")
	public String boardList(Model model) {
		
		model.addAttribute("list", boardService.getlist());
		
		return "/board/list";
	}
	
}
