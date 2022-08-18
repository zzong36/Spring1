package kr.ac.kopo.reply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo.board.dao.BoardDAOImpl;
import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;

	@Autowired
	private BoardDAOImpl boardDAO;
	
	@Transactional
	public void writeReply(ReplyVO reply) {
		replyDAO.insertReply(reply);
		boardDAO.increaseReplyCount(reply.getBoardNo());
	}
	
	public List<ReplyVO> selectReplyList(int boardNo) {
		List<ReplyVO> list = new ArrayList<>();
		list = replyDAO.selectReplyList(boardNo);
		return list;
	}
	
	@Transactional
	public void deleteReply(int no, int boardNo) {
		replyDAO.deleteReply(no);
		boardDAO.decreaseReplyCount(boardNo);
	}
	
}
