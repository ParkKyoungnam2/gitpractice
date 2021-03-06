package com.mycompany.myapp.conntest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.mapper.BoardMapper;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class mappertest {
	
	@Inject
	BoardMapper mapper;
	@Test
	public void test() {
		int count = mapper.count();
		System.out.println(count);
	}
	
	@Test
	public void get() {
		BoardVO vo = mapper.get(1L);
	}

	@Test
	public void getList() {
		mapper.getList();
	}
	
	@Test
	public void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setbName("작성자");
		vo.setbTitle("글제목");
		vo.setbContent("글내용");
		mapper.insert(vo);
	}
	
	@Test(expected =MyBatisSystemException.class)
	public void insertTest2() {
		BoardVO vo = new BoardVO();
		mapper.insert(vo);
	}
	
	@Test
	public void deleteTest() {
		mapper.delete(2L);
	}
	
	@Test
	public void modifyTest() {
		BoardVO vo = mapper.get(401L);
		vo.setbName("수정된 작성자test");
		vo.setbTitle("수정된 제목test");
		vo.setbContent("수정된 글 내용test");
		mapper.modify(vo);
	}
	
	@Test
	public void listTest2() {
		Criteria cri = new Criteria(2,10);
		mapper.listWithPaging(cri);
		
	}
	
	@Test
	public void addReply() {
		BoardVO vo = mapper.get(401L);
		
		mapper.replyUpdate(vo);
		
		mapper.insertReply(vo);
		
	}
}
