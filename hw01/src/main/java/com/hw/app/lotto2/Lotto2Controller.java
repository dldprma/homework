package com.hw.app.lotto2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto2")
public class Lotto2Controller extends HttpServlet{
	
	// view
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/lotto2/lotto.jsp").forward(req, resp);
	}
	
	// process
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Integer> userNumbers = new ArrayList<>();
		// data
		for(int a = 1; a <= 6; a ++) {
			String tempNum = "manual"+ a;
			String numStr = req.getParameter(tempNum);
			
			if(numStr != null && !numStr.isEmpty()) {
				int num = Integer.parseInt(numStr);
				userNumbers.add(num);
			}
		}
		
		
		//번호 저장 리스트
		Set<Integer> lottoNumbers = new HashSet<>();
		
		// 로또 번호 생성
		Random random = new Random();
		
		while(lottoNumbers.size() < 6) {
			int number = random.nextInt(45)+1;
			lottoNumbers.add(number);
		}
		
		List<String> lottoNumberStr = new ArrayList<>();

		for(int number : lottoNumbers) {
			lottoNumberStr.add(Integer.toString(number));
		}
		
		// 맞췄는지 카운트
		int cnt_ = 0;
		for(int lottoNumber : lottoNumbers) {
			if(userNumbers.contains(lottoNumber)) {
				cnt_++;
			}
		}
		
		String result = "";
		if(cnt_ == 6){
			result = "1등입니다!";
		}else if(cnt_ == 5){
			result = "2등입니다!";
		}else if(cnt_ == 4){
			result = "3등입니다!";
		}else{
			result = "꽝입니다! 다시 도전해보세요!";
		}
		
		String cnt = Integer.toString(cnt_); 
		
		// 리스트 저장하기
		req.setAttribute("lottoNumbers", lottoNumberStr);
		req.setAttribute("matchCount", cnt);
		req.setAttribute("result", result);
		// 결과 페이지로 포워딩
		req.getRequestDispatcher("/WEB-INF/views/lotto2/result.jsp").forward(req, resp);
	}
}
