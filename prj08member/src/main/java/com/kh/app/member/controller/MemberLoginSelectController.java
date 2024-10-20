package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/login/select")
public class MemberLoginSelectController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청받은 정보 받아오기
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		// 출력문으로 대체
		System.out.println(userId);
		System.out.println(userPwd);
		
		// 세션을 받아와서 변수 s에 저장
		HttpSession s = req.getSession();
		// key -> abc, data -> 홍감자
		s.setAttribute("abc", "홍감자");

		// 메인페이지로 보내기
		resp.sendRedirect("/app08/home/view");
	}

}
