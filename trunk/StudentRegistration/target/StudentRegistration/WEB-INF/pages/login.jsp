<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<center>
<h1>User Account Login</h1>
<form:form action="verifyUser.do" method="post" commandName="userCommand">
<table>
<tr><td>Username</td><td><form:input path="username"/></td></tr>
<tr><td>Password</td><td><form:password path="password"/></td></tr>
<tr><td><input type="submit" value="Login"/></td></tr>
</table>
</form:form>
</center>
</body>
</html>