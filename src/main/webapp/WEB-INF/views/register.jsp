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

	<h1>this is registration page</h1>

	<form action='<spring:url value="/signup"/>' method="post">
		<select name="type" type="text">
			<option value="Admin">Admin</option>
			<option value="User">User</option>
		</select> <br><input type="text" name="name" placeholder="Enter Your Full Name">
		<br> <input type="email" name="email"
			placeholder="Enter Your Email"> <br> <input
			type="password" name="password" placeholder="Enter Your Password">
		<br>
		<button>save</button>
	</form>
</body>
</html>