<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body><center>
<h1>aStudent Registration Form</h1>
<form:form action="studentRegister.do" method="post" commandName="studentCommand">
<table>
<tr>
	<td>Student ID</td>
	<td><form:input path="sid"/></td>
	<td><font color=red size=5><form:errors path="sid"/></font></td>
</tr>
<tr>
	<td>Student Name</td>
	<td><form:input path="sname"/></td>
	<td><font color=red size=5><form:errors path="sname"/></font></td>
</tr>
<tr>
	<td>Phone</td>
	<td><form:input path="phone"/></td>
	<td><font color=red size=5><form:errors path="phone"/></font></td>
</tr>
<tr>
	<td>Student Email</td>
	<td><form:input path="email"/></td>
	<td><font color=red size=5><form:errors path="email"/></font></td>
</tr>

<tr>
	<td>Student Timings</td>
	<td><form:checkbox path="timings" value="07:00A.M-09:00A.M"/>07:00A.M-09:00A.M<br/>
		<form:checkbox path="timings" value="09:00A.M-11:00A.M"/>09:00A.M-11:00A.M<br/>
		<form:checkbox path="timings" value="02:00P.M-04:00P.M"/>02:00P.M-04:00P.M<br/>
		<form:checkbox path="timings" value="04:00P.M-06:00P.M"/>04:00P.M-06:00P.M<br/>
	</td>
	<td><font color=red size=5><form:errors path="timings"/></font></td>
</tr>
<tr>
	<td>Student Qualification</td>
	<td><form:select path="qualification">
	<form:option value="-select-"/>
	<form:option value="B.Tech"/>
	<form:option value="M.Tech"/>
	<form:option value="M.Sc"/>
	<form:option value="B.Sc"/>
	<form:option value="B.C.A"/>
	<form:option value="M.C.A"/>
	</form:select></td>
	<td><font color=red size=5><form:errors path="qualification"/></font></td>
</tr>
<tr>
	<td>Student Gender</td>
	<td><form:radiobutton path="gender" value="Male"/>Male<br/>
		<form:radiobutton path="gender" value="Female"/>Female
	</td>
	<td><font color=red size=5><form:errors path="gender"/></font></td>
</tr>
<tr>
	<td>Remarks</td>
	<td><form:textarea path="remarks" rows="5" cols="20"/></td>
	<td><font color=red size=5><form:errors path="remarks"/></font></td>
</tr>
</table>
<input type="submit" value="Register"/>
</form:form>
</center>
</body>
</html>