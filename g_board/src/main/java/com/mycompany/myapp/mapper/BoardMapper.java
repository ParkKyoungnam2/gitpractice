package com.mycompany.myapp.mapper;

import java.util.List;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;

public interface BoardMapper {
	public int count();
	
	public BoardVO get(Long bId);
	
	public List<BoardVO> getList();
	
	public List<BoardVO> listWithPaging(Criteria cri);
	
	public void insert(BoardVO boardVO);
	
	public void delete(Long bNo);
	
	public void modify(BoardVO boardVO);
	
	public void bHitUpdate(Long bNo);
	
	public void replyUpdate(BoardVO boardVO);
	
	public void insertReply(BoardVO boardVO);
}
