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
import kr.ac.kopo.member.vo.MemberVO;
import kr.ac.kopo.reply.vo.ReplyVO;

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
//			System.out.println(board);
		}
	}
	
	@Test
	public void boardNoTest() {
		BoardVO board = sqlSessionTemplate.selectOne("board.dao.boardDAO.selectByNo", 50);
//		System.out.println(board);
	}
	
//	@Test
//	public void insertBoard() {
//		BoardVO board = new BoardVO();
//		
//		board.setTitle("기니피그");
//		board.setContent("퍼질러져 누눠있는 후덕한 기니피그");
//		board.setWriter("닝닝이");
//		
//		sqlSessionTemplate.insert("board.dao.boardDAO.insertBoard", board);
//	}
	
	@Test
	public void login() {
		MemberVO member = new MemberVO();
		member.setId("zzong36");
		member.setPassword("1234");
		
		member = sqlSessionTemplate.selectOne("member.dao.memberDAO.selectUser", member);
//		System.out.println(member);
	}
	
	@Test
	public void register() {
		MemberVO member = new MemberVO();
		member.setId("test");
		member.setPassword("test");
		member.setName("test");
		
//		sqlSessionTemplate.insert("member.dao.memberDAO.insertUser", member);
	}
	
	@Test
	public void writeReply() {
		ReplyVO reply = new ReplyVO();
		reply.setBoardNo(64);
		reply.setContent("공감합니다");
		reply.setWriter("찍찍이");
		
//		sqlSessionTemplate.insert("reply.dao.replyDAO.insertReply", reply);
		
	}
	
	@Test
	public void updateViewCnt() {
		int no = 64;
		sqlSessionTemplate.update("board.dao.boardDAO.increaseReplyCount", no);
	}
	
	@Test
	public void selectReplyList() {
		int boardNo = 64;
//		List<ReplyVO> list = sqlSessionTemplate.selectList("reply.dao.replyDAO.selectReplyList", boardNo);
//		System.out.println(list);
	}
	
	@Test
	public void deleteReply() {
		int no = 81;
//		sqlSessionTemplate.delete("reply.dao.replyDAO.deleteReply", no);
	}
	
	@Test
	public void decreaseReply() {
		sqlSessionTemplate.update("");
	}
}
