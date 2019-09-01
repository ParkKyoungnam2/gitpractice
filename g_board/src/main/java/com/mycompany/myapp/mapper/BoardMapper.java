package com.mycompany.myapp.mapper;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;

public interface BoardMapper {
	public int count();
	
	public BoardVO get(long bNo);
	
	public List<BoardVO> getList();
}
