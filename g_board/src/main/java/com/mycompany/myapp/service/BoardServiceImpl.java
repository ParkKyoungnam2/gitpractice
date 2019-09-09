package com.mycompany.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;
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

	@Override
	public List<BoardVO> listWithPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return boardMapper.listWithPaging(cri);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return boardMapper.count();
	}

	@Override
	@Transactional
	public void addReply(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.replyUpdate(boardVO);
		boardMapper.insertReply(boardVO);
	}

}
