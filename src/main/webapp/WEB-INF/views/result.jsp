<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>

	<%-- 
		jsp 표현식 
	
		<% %> : 스크립틀릿 -> 자바코드 작성
		<%= %> : 표현식 -> 자바 서버에서 받아온 값을 표현할 때 사용
	
	 --%>


	<h3 style="color: aliceblue;"><%= request.getParameter("inputName") %>님의 가입을 환영합니다</h3>
	
    <ul>
        <li>id : <%= request.getParameter("inputID") %></li>
        <li>pw :<%= request.getParameter("inputPw") %></li>
	</ul>
	
	<% if( !request.getParameter("intro").equals("") ) {%>
        <h4>자기소개</h4>
        <p>
          <%= request.getParameter("intro") %>
        </p>
    <% } %>
    
</body>
</html>