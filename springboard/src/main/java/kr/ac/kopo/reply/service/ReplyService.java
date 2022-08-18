package kr.ac.kopo.reply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	public void writeReply(ReplyVO reply) {
		replyDAO.insertReply(reply);
	}
	
	public List<ReplyVO> selectReplyList(int boardNo) {
		List<ReplyVO> list = new ArrayList<>();
		list = replyDAO.selectReplyList(boardNo);
		return list;
	}
	
}
