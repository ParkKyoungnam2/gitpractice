package com.mycompany.myapp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.PageMaker;
import com.mycompany.myapp.service.BoardService;

@Controller
@RequestMapping("/board")
public class BController {
	
	@Inject
	BoardService boardService;
	@RequestMapping("/list")
	public String boardList(Criteria cri,Model model) {
		
		
		PageMaker pg = new PageMaker(cri,1000);
		model.addAttribute("list", boardService.listWithPaging(cri));
		model.addAttribute(pg);
		
		return "/board/list";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/board/write";
	}
	
	@RequestMapping("/writeform")
	public String writeFrom(BoardVO boardVO) {
		boardService.insert(boardVO);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/read")
	public String read(@RequestParam("bno")Long bNo, Model model) {
		boardService.bHitUpdate(bNo);
		model.addAttribute("board",boardService.read(bNo));
		
		return "/board/read";
	}
	
	@RequestMapping("/modify")
	public String modify(@RequestParam("bno")Long bNo, Model model) {
		//뭔가 마음에 걸리네 .. 이렇게 하면 안될꺼같음 나중에 고치는걸로
		model.addAttribute("board",boardService.read(bNo));
		return "/board/modify";
	}
	
	@RequestMapping("/modifyform")
	public String modifyForm(BoardVO vo) {
		
		boardService.modify(vo);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("bno")Long bNo) {
		
		boardService.delete(bNo);
		
		return "redirect:/board/list";
	}
}
