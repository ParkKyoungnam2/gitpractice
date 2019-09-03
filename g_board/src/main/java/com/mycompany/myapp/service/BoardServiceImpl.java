package com.mycompany.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getlist() {
		// TODO Auto-generated method stub
		return boardMapper.getList();
	}

	@Override
	public void insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.insert(boardVO);
	}

	@Override
	public BoardVO read(Long bNo) {
		// TODO Auto-generated method stub
		
		return boardMapper.get(bNo);
	}

	@Override
	public void modify(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.modify(boardVO);
	}

	@Override
	public void bHitUpdate(Long bNo) {
		// TODO Auto-generated method stub
		boardMapper.bHitUpdate(bNo);
	}

	@Override
	public void delete(Long bNo) {
		// TODO Auto-generated method stub
		boardMapper.delete(bNo);
	}

}
