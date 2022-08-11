package kr.ac.kopo.resbody;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.member.MemberVO;

@Controller
public class ResBodyController {
	
	@ResponseBody
	@RequestMapping("/resBody.do")
	public String resStringBody() {
		
		return "OK. 성공";
	}
	
	@RequestMapping("/resBody.json")
	@ResponseBody
	public Map<String, String> resJsonBody(){
		Map<String, String> result = new HashMap<>();
		result.put("id", "HONG");
		result.put("name", "홍길동");
		result.put("password", "1234");
		return result;
	}
	
	@RequestMapping("resVOBody.json")
	@ResponseBody
	public MemberVO resJsonVOBody() {
		MemberVO member = new MemberVO();
		member.setId("PARK");
		member.setName("박길동");
		member.setPassword("123456");
		return member;
	}

}
