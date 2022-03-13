<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!! From JSP</title>
</head>

<body>
<%
Date date = new Date();
%>
<div><h2>Current date is <%=date%></h2></div>
<!-- My Name is ${name} and password is ${password} -->
<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
<br>
Enter your name : <input type="text" name="name"/>
<br><br>
Enter Password : <input type="password" name="password"/>
<br><br>
<input type="submit" value="Login"/>
</form>
</body>
</html>