package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml"})
public class MyBatisTest {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Test
	public void mybatistT() {
		assertNotNull(sqlSessionTemplate);
	}
	
	@Test
	public void boardSelectAllTest() {
		List<BoardVO> boardList = sqlSessionTemplate.selectList("board.dao.boardDAO.selectAll");
		for(BoardVO board : boardList) {
			System.out.println(board);
		}
	}
	
	@Test
	public void boardNoTest() {
		BoardVO board = sqlSessionTemplate.selectOne("board.dao.boardDAO.selectByNo", 50);
		System.out.println(board);
	}
	
	@Test
	public void insertBoard() {
		BoardVO board = new BoardVO();
		
		board.setTitle("기니피그");
		board.setContent("퍼질러져 누눠있는 후덕한 기니피그");
		board.setWriter("닝닝이");
		
		sqlSessionTemplate.insert("board.dao.boardDAO.insertBoard", board);
	}
}
