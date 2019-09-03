package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getlist();
	
	public void insert(BoardVO boardVO);
	
	public BoardVO read(Long bNo);
	
	public void modify(BoardVO boardVO);
	
	public void bHitUpdate(Long bNo);
	
	public void delete(Long bNo);
}
