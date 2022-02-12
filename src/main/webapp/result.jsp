<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Seperator Results</title>
</head>
<body>
<p>${userCoinPouch.getName()} contains the following: <br /> <br /> 
First Name: ${userCoinPouch.getFirstName()} <br /> 
Middle Name: ${userCoinPouch.getMiddleName()} <br /> 
Last Name: ${userCoinPouch.getLastName()} <br /> 
</p>
<a href="index.jsp">Select another name to seperate!</a>


</body>
</html>