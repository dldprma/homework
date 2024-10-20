package com.hw.app.subway;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/subway")
public class SubwayController extends HttpServlet{
	
	// view
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/subway/subway.jsp").forward(req, resp);
	}
	
	// process
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글 인코딩
		req.setCharacterEncoding("UTF-8");
		// data
		String age_ = req.getParameter("age");
		int age = Integer.parseInt(age_);
		
		// 처리
		String charge = "";
		if(age < 8) {
			charge = "어린이는 500원입니다.";
		}else if(age < 20) {
			charge = "청소년은 800원입니다.";
		}else if(age < 65) {
			charge = "성인은 1500원입니다.";
		}else {
			charge = "노인(경로우대) 무료입니다.";
		}
		
		// 저장
		req.setAttribute("age", age_);
		req.setAttribute("charge", charge);
		req.getRequestDispatcher("/WEB-INF/views/subway/charge.jsp").forward(req, resp);
	}
}
