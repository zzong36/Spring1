package kr.ac.kopo.reply.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.reply.vo.ReplyVO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class ReplyDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public void insertReply(ReplyVO reply) {
		sqlSessionTemplate.insert("reply.dao.replyDAO.insertReply", reply);

		
		//t_board replycnt = replyCnt + 1
	}
	
	public List<ReplyVO> selectReplyList(int boardNo){
		List<ReplyVO> list = new ArrayList<>();
		
		list = sqlSessionTemplate.selectList("reply.dao.replyDAO.selectReplyList", boardNo);
		return list;
	}
}
