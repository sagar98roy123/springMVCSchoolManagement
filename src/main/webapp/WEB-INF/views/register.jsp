<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Student</title>
</head>
<body>
	<h1>Fill the form and register yourself</h1>
	<form action="/post-register" method="POST" addAttribute="userpat" name="userpat">
		<input type="text" name="name" id="name" ><br>
		<input type="email" name="email" id="email" ><br>
		<input type="password" name="password" id="password"><br>
		<button type="submit">Register</button>
	</form>
</body>
</html>