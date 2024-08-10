<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>                     
           
</h1>
<form:form action="saveUser" modelAttribute="user" method="post">
<table>



<tr> 
<td>UserName</td>
<td><form  input: path="uname"  ></form></td>
<td><form  errors: path="uname"  class="error" ></form></td>
</tr>


<tr> 
<td>Password</td>
<td><form  password: path="pwd"  ></form></td>
<td><form  errors: path="pwd" class="error" ></form></td>

</tr>
<tr> 
<td>Email</td>
<td><form  input: path="email"  ></form></td>
<td><form  errors: path="email" class="error" ></form></td>

</tr>

<tr> 
<td>phone number</td>
<td><form  input: path="phno"  ></form></td>
<td><form  errors: path="phno" class="error" ></form></td>
</tr>

</table>

</form:form>
</body>
</html>