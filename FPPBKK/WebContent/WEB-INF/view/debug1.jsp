<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
asd${barang}
<c:forEach var="tempBarang" items="${barang}">
          
              <h5 class="card-title">${tempBarang.namaBarang} </h5>
              <p class="card-text">Rp ${tempBarang.hargaPinjaman}</p>
             
       </c:forEach>
</body>
</html>