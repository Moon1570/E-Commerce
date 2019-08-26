<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book</title>
</head>
<body>

<h2>New Book...</h2>

<form action="/eCommerce/category" method="post">
		<table align="center">
			
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"  value="${categories.name}"></td>
			</tr>
			
			<tr>
				<td>Description</td>
				<td><input type="text" name="description" value="${categories.description}"></td>
			</tr>
			
			
			
			<tr>
				<td>
				
				<c:if test="${action=='update'}">
				<input type="hidden" value="update" name="action">	
				</c:if>
				
				<c:if test="${action=='new'}">
				<input type="hidden" value="new" name="action">
				</c:if>
				
				<input type="hidden" value="${categories.id}" name="categoryId">
				</td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>