package com.mycompany.myapp.mapper;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;

public interface BoardMapper {
	public int count();
	
	public BoardVO get(long bNo);
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO boardVO);
	
	public void delete(long bNo);
	
	public void modify(BoardVO boardVO);
}
