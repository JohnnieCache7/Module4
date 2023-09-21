<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Shopping Cart</title>
</head>
<body>
	<h1>Shopping Cart</h1>
	<form action="getTotalServlet" method="post">
	Enter the cost of your shopping cart to get total with tax included: 
	<input type="text" name="userCost" size="10">
	<input type="submit" value="Submit" />
	</form>
	
	<form action="getDiscountServlet" method="post">
	Enter the price of your shopping cart here for a 10% discount: 
	<input type="text" name="userCost2" size="10">
	<input type="submit" value="Submit for discount" />
	</form>
	
</body>
</html>