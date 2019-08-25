<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="userRegForm">Create Account</a>
<h2>Login</h2>
	<form action="login" method="post" enctype="utf-8">
		<p>
			<label>ID:<br> <input type="text" name="uid" />
			</label>
		</p>
		<p>
			<label>Password:<br> <input type="password" name="pw" />
			</label>
		</p>
		<input type="submit" value="Create"> <input type="reset"
			value="Cancel">
	</form>
</body>
</html>
