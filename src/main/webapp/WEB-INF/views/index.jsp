<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> ${requestScope.message} </h2>

<h1> Hello Welcome to Spring Boot</h1>
<form action='<spring:url value="/login"/>' method="post">
<input type="email" name="email"><br>
<input type="password" name="password"><br>
<button>Login</button>
</form>
</body>
</html>