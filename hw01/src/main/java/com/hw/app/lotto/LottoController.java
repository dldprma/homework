package com.hw.app.lotto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto")
public class LottoController extends HttpServlet {
	
	// view
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/lotto/lotto.jsp").forward(req, resp);
	}
	
	// process
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// data
		String auto_ = req.getParameter("auto");
		int auto = Integer.parseInt(auto_);
		
		// 로또번호 여러 세트 저장 할 리스트
		List<List<String>> allLottoNumbers = new ArrayList<>();
		
		// 사용자가 입력한 숫자만큼 로또 번호 세트를 생성
		for(int k = 0; k < auto; k++) {
			// 로또 번호 세트를 저장 할 리스트
			List<String> lottoNumbers = new ArrayList<>();
			
			Random random = new Random();
			int[] lottoNumber = new int[6];
			
			for(int i = 0; i < 6; i++) {
				int number = random.nextInt(45)+1;	// 1~45 범위
				for(int j = 0; j < i; j++) {
					if(lottoNumber[j] == number) {
						number = random.nextInt(45) + 1;	// 중복 일 경우 다시 생성
						j = -1;
					}
				}
				lottoNumber[i] = number;
			}
			// 문자열로 변환하여 리스트에 추가
			for(int number : lottoNumber) {
				String number_ = Integer.toString(number);
				lottoNumbers.add(number_);
			}
			// 각 세트의 번호를 allLottoNumbers에 저장
			allLottoNumbers.add(lottoNumbers);
		}
		// 전체 리스트를 req에 저장
		req.setAttribute("allLottoNumbers", allLottoNumbers);
		// 결과 페이지로 forwarding
		req.getRequestDispatcher("/WEB-INF/views/lotto/result.jsp").forward(req, resp);
	}
}
