package com.mycompany.myapp.servicetest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class ServiceTest {

	@Inject
	BoardService boardService;
	
	@Test
	public void getListTest() {
		boardService.getlist();
	}
	
	@Test
	public void readTest() {
		BoardVO vo = boardService.read(1L);
	}
	
	@Test
	public void modifyTest() {
		BoardVO vo = boardService.read(8L);
		
		vo.setbTitle("글 제목 수정 테스트");
		vo.setbName("글 작성자 수정 테스트");
		vo.setbContent("글 내용 수정 테스트");
		
		boardService.modify(vo);
	}
	
	@Test
	public void deleteTest() {
		boardService.delete(21L);
	}

}
