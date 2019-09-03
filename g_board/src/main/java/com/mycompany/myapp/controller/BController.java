package com.mycompany.myapp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.domain.BoardVO;
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
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write() {
		return "/board/write";
	}
	
	@RequestMapping(value="/writeform", method = RequestMethod.POST)
	public String writeFrom(BoardVO boardVO) {
		boardService.insert(boardVO);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/read")
	public String read(@RequestParam("bno")Long bNo, Model model) {
		boardService.bHitUpdate(bNo);
		BoardVO vo = boardService.read(bNo);
		model.addAttribute("read",vo);
		return "/board/read";
	}
	
	
}
