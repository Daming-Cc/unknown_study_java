<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		ok,已成功将数据提交id记录
		<form action="${pageContext.request.contextPath}/toRegister" method="post">
			<input type="submit" value="再次注册" >
		</form>
		<form action="${pageContext.request.contextPath}/toOrders" method="post">
			<input type="submit" value="再次查询" >
		</form>
</body>
</html>