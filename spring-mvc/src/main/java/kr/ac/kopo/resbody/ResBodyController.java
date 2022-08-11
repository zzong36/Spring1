package kr.ac.kopo.resbody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.member.MemberVO;

//@RestController (밑에 responsebody는 지워야 한다)
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
	
	@RequestMapping("/resStringListBody.json")
	@ResponseBody
	public List<String> resJsonStringListBody(){
		List<String> list = new ArrayList<>();
		for(int i = 1; i < 4; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}
	
	@RequestMapping("/resVOListBody.json")
	@ResponseBody
	public List<MemberVO> resJsonVOListBody(){
		List<MemberVO> list = new ArrayList<>();
		for(int i = 1; i < 4; i++) {
			MemberVO member = new MemberVO();
			member.setId("hong" + i);
			member.setName("홍길동" + i);
			member.setPassword("1234" + i);
			list.add(member);
		}
		return list;
	}

}
