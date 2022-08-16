package kr.ac.kopo.member.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

@SessionAttributes("loginVO")
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {

		MemberVO memberVO = new MemberVO();
		model.addAttribute("memberVO", memberVO);

		// request로 해도됨?
//		requert.setAttribute("memberVO", memberVO);

		return "member/login";
	}

	// 로그인 시 포스트 요청이 들어오는 곳
	@PostMapping("/login")
	public String loginPost(@Valid MemberVO member, BindingResult result, Model model, HttpSession session) {
		/*
		 * 1. MemberVO의 member가 null값이 아닌 valid한 값이 들어왔는가 확인 -> bindResult를 갖고 확인 2.1.
		 * null값을 가진 error값이 들어온 경우 forward member/login.jsp 2.2. 정상값이 들어온 경우 아이디와 비번이
		 * 유효한지 select 문으로 체크 1) 유효한 아이디/비번 welcome!!! 홍길동님 반가워요 세션에 등록 2) 유효하지 않을 때(DB에
		 * 존재하지 않음) - 아이디와 비번이 유효하지 않으니 다시입력하세요 forward member/login.jsp
		 * 
		 * 2.3. Interceptor
		 */
//		System.out.println(result);
//		System.out.println(member);

		if (result.hasErrors()) {
			// null값이 존재 -> 다시입력하세요
			return "member/login";
		} else {

			MemberVO authMember = memberService.confirmLogin(member);
//			System.out.println(authMember);

			if (authMember == null) {
				// 아이디랑 비번이 유효하지 않은 경우
				model.addAttribute("loginmsg", "아이디와 비밀번호가 유효하지 않습니다");
				return "member/login";
			} else {
//				session.setAttribute("loginVO", authMember);
				model.addAttribute("loginVO", authMember);
			}
			return "redirect:/";
		}

	}

	@RequestMapping("/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/";
	}
	
	@GetMapping("/member/register")
	public void registerGet(Model model) {
		MemberVO memberVO1 = new MemberVO();
		
		model.addAttribute("memberVO1", memberVO1);
	}
	
	
//	@PostMapping("member/register")
//	public String registerPost(@Valid @model) {
//		
//	}
}
