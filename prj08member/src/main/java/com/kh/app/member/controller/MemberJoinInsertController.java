package com.kh.app.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/join/insert")
public class MemberJoinInsertController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// data
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		String userNick = req.getParameter("userNick");
		
		// insert (원래는 DB에 insert해야하는데 출력문으로 대체)
		System.out.println(userId);
		System.out.println(userPwd);
		System.out.println(userNick);
		
		//result
//		PrintWriter out = resp.getWriter();
//		out.write("<h1>join succes</h1>");
		
		resp.sendRedirect("/app08/home/view");
	}

}
