package kr.ac.kopo.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import kr.ac.kopo.member.dao.MemberDAO;
import kr.ac.kopo.member.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;

	public MemberVO confirmLogin(MemberVO member) {
		MemberVO authMember = memberDAO.selectUser(member);
		return authMember;
	}
	
	public void memberRegister(MemberVO member) {
		memberDAO.insertUser(member);
	}
	
//	@Scheduled(fixedDelay = 3000)
//	public void springScheduler() {
//		System.out.println("스케쥴러에 의한 메시지");
//	}

}
