package kr.ac.kopo.reply.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
