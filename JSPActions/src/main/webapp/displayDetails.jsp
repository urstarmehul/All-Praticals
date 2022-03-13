<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
    <jsp:useBean id="product" class="com.mehul.jsp.Product">
         <jsp:setProperty name="product" property="*"/>
    </jsp:useBean>

<h2>Product Details</h2><br/>
Id:<jsp:getProperty property="id" name="product"/> <br/><br/>
Name:<jsp:getProperty property="name" name="product"/>  <br/><br/>
Description:<jsp:getProperty property="description" name="product"/>  <br/><br/>
Id:<jsp:getProperty property="price" name="product"/>

</body>
</html>