package edu.kh.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		// 전달받은 값을 얻어오면 한글이 깨지는 현상 발생
		// 요청데이터 문자 인코딩과 서버의 문자 인코딩이 달라서
		// 해결방법 : 전달받은 데이터의 문자 인코딩을 서버에 맞게 변경
		req.setCharacterEncoding("UTF-8");
		
		String inputID = req.getParameter("inputID");
		String inputPw = req.getParameter("inputPw");
		String inputName = req.getParameter("inputName");
		String intro = req.getParameter("intro");
		
		// 응답화면 만들기
		// -> 자바에서 일일히 하드코딩하기 귀찮음 -> JSP가 대신 화면을 만들어서 응답해줌
		
		//JSP가 대신 화면을 만들어 주기 위해서 Servlet 이 어떤 요청을 받았는지 알아야한다
		
		//Servlet 이 받은 요청을 JSP로 위임하는 작업을 진행
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
		
		dispatcher.forward(req, resp);
		
		
	
	
   }

}
