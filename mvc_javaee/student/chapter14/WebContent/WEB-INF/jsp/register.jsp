<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册界面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/register" method="post">
		用户名:<input type="text" name="username"><br>
		密码:<input type="text" name="password"><br>
		<input type="submit" value="注册" >
	</form>
</body>
</html>