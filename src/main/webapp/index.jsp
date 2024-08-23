<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link 	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
			rel="stylesheet" 
			integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
			crossorigin="anonymous">

</head>
<body>

	<div align="center">
		섭섭이와 배우는 백엔드 웹 어플리케이션 수업(feat.Jslim)
	</div>
	<hr/>
	<div align ="right">
		<form action="index" method="get">
			<label>
				아이디 :
				<input type = "text" name = "id">
			</label>
			<label>
				패스워드 :
				<input type = "password" name = "pwd">
			</label>
			<button type="submit"  class="btn btn-primary">로그인</button>
			<a href="join.jsp" class="btn btn-danger">가입하기</a>
		</form>
		
	</div>
	
</body>
</html>