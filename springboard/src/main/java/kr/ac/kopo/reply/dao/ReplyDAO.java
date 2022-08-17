package kr.ac.kopo.reply.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.reply.vo.ReplyVO;

import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class ReplyDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insertReply(ReplyVO reply) {
		sqlSessionTemplate.insert("reply.dao.replyDAO.insertReply", reply);
	}
}
