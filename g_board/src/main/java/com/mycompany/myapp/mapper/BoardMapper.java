package com.mycompany.myapp.mapper;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;

public interface BoardMapper {
	public int count();
	
	public BoardVO get(long bNo);
	
	public List<BoardVO> getList();
	
	public List<BoardVO> listWithPaging(Criteria cri);
	
	public void insert(BoardVO boardVO);
	
	public void delete(long bNo);
	
	public void modify(BoardVO boardVO);
	
	public void bHitUpdate(Long bNo);
}
