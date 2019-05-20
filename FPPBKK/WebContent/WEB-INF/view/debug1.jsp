<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
asd${products}
<table class="table table-bordered table-striped">
		        		<thead>
		        			<tr>
		        				<th>ID</th>
		        				<th>Product Name</th>
		        				<th>Product Price</th>
		        				<th>Product Condition</th>
		        				<th>Product Guarantee</th>
		        			</tr>
		        		</thead>
		        		<tbody>
<c:forEach var="tempProducts" items="${products}">
		        				<tr>
		        					<td>${tempProducts.id}</td>
		        					<td>${tempProducts.barangName}</td>
		        					<td>${tempProducts.barangCategory}</td>
		        					<td>${tempProducts.barangPrice}</td>
		        					<td>${tempProducts.barangUserid}</td>
		        				</tr>
		        			</c:forEach>
		        			</tbody>
		        	</table>
</body>
</html>