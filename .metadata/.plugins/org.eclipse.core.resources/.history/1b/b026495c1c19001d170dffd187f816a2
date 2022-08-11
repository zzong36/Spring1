package kr.ac.kopo.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping(value = "/form/joinForm.do")
	public String get() {
		return "form/joinForm";
	}

//	@RequestMapping("/join.do")
//	public String join(HttpServletRequest request) {
//		MemberVO member = new MemberVO();
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name= request.getParameter("name");
//		
//		member.setId(id);
//		member.setId(password);
//		member.setId(name);
//		
//		request.setAttribute("member", member);
//
//		
//		//form/memberInfo.jsp를 보여줘
//		return "form/memberInfo";
//	}

//	@RequestMapping("/join.do")
//	public String join2(HttpServletRequest request,
//			@RequestParam("id") String id,
//			@RequestParam("password") String password,
//			@RequestParam("name") String name) {
//		MemberVO member = new MemberVO();
//		
//		member.setId(id);
//		member.setPassword(password);
//		member.setName(name);
//
//		request.setAttribute("member", member);
//
//		// form/memberInfo.jsp를 보여줘
//		return "form/memberInfo";
//	}

//	@RequestMapping("/join.do")
//	public String join3( MemberVO member) {
//		
//		System.out.println(member.toString());
//
//		//MemberVO의 객체를 memberVO로 등록시킴
//		return "form/memberInfo";
//	}
	
	
//	@RequestMapping("/join.do")
//	//Member Attribute 등록
//	public String join4(@ModelAttribute("member") MemberVO member) {
//		
//		System.out.println(member.toString());
//		
//		//MemberVO의 객체를 memberVO로 등록시킴
//		return "form/memberInfo";
//	}
	
	@RequestMapping("/join.do")
	//Member Attribute 등록
	public ModelAndView join5(MemberVO member) {
		
		ModelAndView mav = new ModelAndView();
		
		//view Namesetting
		mav.setViewName("form/memberInfo");
		mav.addObject("member1", member);
		
		return mav;
	}

}
