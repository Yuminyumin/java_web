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
		<form action="joinUser" method="post">
			<label>
				아이디 :
				<input type = "text" name = "id">
			</label>
			<br/>
			<label>
				패스워드 :
				<input type = "password" name = "pwd">
			</label>
			<br/>
			<label>
				이름 :
				<input type = "text" name = "name">
			</label>
			<br/>
			<label>
				성별 :
				<input type = "radio" name = "gender">남자
				<input type = "radio" name = "gender">여자
			</label>
			<br/>
			<button type="submit"  class="btn btn-primary">가입</button>
		</form>
	</div>
	
</body>
</html>