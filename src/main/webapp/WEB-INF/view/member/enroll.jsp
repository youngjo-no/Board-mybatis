<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 등록</h1>
	<form action="/member/enroll2" method="post">
		<div class="input">
			<label>name</label>
			<input name="name" type="text">
		</div>
		<div class="input">
			<label>tel</label> 
			<input name="tel" type="text">
		</div>
		<div class="input">
			<label>age</label>
			<input name="age" type="text">
		</div>
		<button class="btn" type="submit">등록</button>
		
	</form>

</body>
</html>