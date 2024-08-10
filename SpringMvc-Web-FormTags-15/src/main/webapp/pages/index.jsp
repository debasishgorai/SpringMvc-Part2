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
            Product Form
</h1>
<form:form action="saveProduct" modelAttribute="product" method="post">
<table>



<tr> 
<td>Product Id</td>
<td><form  input: path="productId"  ></form></td>

</tr>


<tr> 
<td>Product Name</td>
<td><form  input: path="productName"  ></form></td>

</tr>
<tr> 
<td>Product Price</td>
<td><form  input: path="productPrice"  ></form></td>

</tr>
<tr>
<td></td>
<td><form input type="submit" value="save"></form></td>
</tr>

</table>



</form:form>
</body>
</html>