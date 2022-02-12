<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment</title>
</head>
<body>
<h1>Name Seperator!</h1>
<form action="getNameSeperatorServlet" method="post">
Enter your Full Name (First Middle and Last Name, use a space between the names, please!):
<input type="text" name="userName" size="50">
<input type="submit" value="Seperate Names" />
</form>
</body>
</html>