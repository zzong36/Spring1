package kr.ac.kopo.reply.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.reply.vo.ReplyVO;

import kr.ac.kopo.reply.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	@ResponseBody
	@PostMapping("/reply")
	public void writeReply(ReplyVO reply) {
//		System.out.println(reply);
		replyService.writeReply(reply);
	}
	
	//reply/{boardNO} 요청이 들어오면 받을수 있는 get handler
	@ResponseBody
	@GetMapping("reply/{boardNo}")
	public List<ReplyVO> getAllReply(@PathVariable("boardNo") int boardNo) {
		
		List<ReplyVO> replyList = replyService.selectReplyList(boardNo);
		
		return replyList;
	}
}
