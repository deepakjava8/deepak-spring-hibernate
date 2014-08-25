<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
<body>
<center>

	<h1>Student Form Registered for Student ID : [${studentCommand.sid}]</h1>
<table border="1" align="center">

<tr>
	<td>SID</td><td>${studentCommand.sid }</td>
</tr>
<tr>
	<td>SNAME</td><td>${studentCommand.sname }</td>
</tr>
<tr>
	<td>EMAIL</td><td>${studentCommand.email }</td>
</tr>
<tr>
	<td>PHONE</td><td>${studentCommand.phone }</td>
</tr>
<tr>
	<td>GENDER</td><td>${studentCommand.gender}</td>
</tr>
<tr>
	<td>QUALIFICATION</td><td>${studentCommand.qualification}</td>
</tr>
<tr>
	<td>TIMINGS</td><td>${studentCommand.timings}</td>
</tr>
<tr>
	<td>REMARKS</td><td>${studentCommand.remarks}</td>
</tr>

</table>
	
</center>
</body>
</html>