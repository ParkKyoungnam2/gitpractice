package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> getlist();
	
	public void insert(BoardVO boardVO);
	
	public BoardVO read(Long bNo);
	
	public void modify(BoardVO boardVO);
	
	public void bHitUpdate(Long bNo);
	
	public void delete(Long bNo);
	
	public List<BoardVO> listWithPaging(Criteria cri);
}
