<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单界面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/findOrders" method="post">
		<!-- 第一栏拉去订单号 -->
		订单号:<input type="text" name="ordersid">
		<!-- 第二栏拉取所属用户的用户名称 -->
		用户名:<input type="text" name="user.username">
			<input type="submit" name="提交">
	</form>
</body>
</html>