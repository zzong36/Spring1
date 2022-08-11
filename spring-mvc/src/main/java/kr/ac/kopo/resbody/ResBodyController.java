package kr.ac.kopo.resbody;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
