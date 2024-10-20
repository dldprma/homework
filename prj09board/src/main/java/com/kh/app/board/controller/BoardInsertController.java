package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet{
	
	// view page
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(req, resp);
	}
	
	// process data
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//data
		req.setCharacterEncoding("UTF-8");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		// db (출력문으로 대체)
		System.out.println(title);
		System.out.println(content);
		
		int result = 0;
		// result
		if(result == 1) {
			// 작성 성공 -> 게시글 목록
			resp.sendRedirect("/app09/board/list");
		}else {
			// 작성 실패 -> 에러 페이지
//			req.setAttribute("abc", "게시글 작성 실패");
//			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
			HttpSession session = req.getSession();
			session.setAttribute("abc", "게시글 작성 실패!");
			resp.sendRedirect("/app09/common/error");
		}
	}

}
