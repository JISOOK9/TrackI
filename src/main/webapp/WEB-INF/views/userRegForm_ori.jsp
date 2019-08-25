<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Create Account</title>
</head>
<body>
	<h2>Create Account</h2>
	<form action="userReg" method="post" enctype="utf-8">
		<p>
			<label>ID:<br> <input type="text" name="uid" />
			</label>
		</p>
		<p>
			<label>Password:<br> <input type="password" name="pw" />
			</label>
		</p>
		<p>
			<label>Email:<br> <input type="text" name="email" />
			</label>
		</p>
		<p>
			<label>Nickname:<br> <input type="text" name="nick" />
			</label>
		</p>
		<p>
			<label>Gender:<br> <input type="radio" name="gender"
				value="M">Male <input type="radio" name="gender" value="F">Female

			</label>
		</p>
		<p>
			<label>BirthDate:<br> <input type="date" name="bdate" />
			</label>
		</p>
		<input type="submit" value="Create"> <input type="reset"
			value="Cancel">
	</form>
</body>
</html>
