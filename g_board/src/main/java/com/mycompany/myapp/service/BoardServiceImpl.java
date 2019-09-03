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

}
