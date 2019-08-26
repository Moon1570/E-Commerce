<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	
	<h2 align="center">Category</h2>
	<a href="/eCommerce/categories?action=new">Add New CAt</a>

	<table align="center" border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Description</td>

		</tr>

		<c:forEach items="${categories}" var="book">
			<tr>
				<td>${category.id}</td>
				<td>${category.name}</td>
				<td>${category.description}</td>
				<td><a href="/eCommerce/categories?action=update&id=${category.id}">Update</a></td>
				<td><a href="/eCommerce/categories?action=delete&id=${category.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>





</body>
</html>