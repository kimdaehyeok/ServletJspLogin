<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
		User ID : <c:out value="${users.userId}"></c:out></br>
		User password : <c:out value="${users.password}"></c:out>
		
		example url : http://localhost:8080/user/create?userId=kimdaeahyeok&password=12345
</body>
</html>