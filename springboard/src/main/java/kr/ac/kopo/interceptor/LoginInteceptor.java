package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import kr.ac.kopo.member.vo.MemberVO;

public class LoginInteceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("prehandle 동작");
//		System.out.println("handler : " + handler);
//		System.out.println("conxtexPath: " + request.getContextPath());
//		System.out.println("uri : " + request.getRequestURI());
//		System.out.println("queryString : " + request.getQueryString());
		
		String dest = request.getRequestURI();
		dest=dest.substring(request.getContextPath().length());
//		queryString  관련된 처리?
		
		HttpSession session = request.getSession();
		MemberVO loginVO = (MemberVO) session.getAttribute("loginVO");
		session.setAttribute("dest", dest);
		
		if(loginVO == null) {
			//로그인 안 된 경우
			
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}else {
			//로그인된 경우
			return true;
		}
	}

//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		// TODO Auto-generated method stub
////		System.out.println("posthandle 동작");
//	}
//
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("afterCompletion 동작");
//	}

}
