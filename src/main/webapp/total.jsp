<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Shopping Cart Total</title>
</head>
<body>
	<p>$${userTax.getTotal()} 
	<br>
	Your shopping cart cost ${userTax.getPrice()} + 7% Tax!
	</p>
	<a href="index.jsp">Enter another amount</a>
</body>
</html>