<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
	<<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	   		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>  
  <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    </head>
    <body>
   
    	<div class="container jumbotron" style="background-color: skyblue">
        <h3>Form Input Barang</h3>
        
        <form:form method="POST"
          action="listBarang" modelAttribute="barang" class="form-horizontal" >
             
                <div class="form-group">
                    <form:label path="name" class="control-label col-sm-2" >Name</form:label>
                     <div class="col-sm-10">
                   <form:input path="name" class="form-control"/></div>
               </div>
               <div class="form-group">
                    <form:label path="id" class="control-label col-sm-2">Id</form:label>
                     <div class="col-sm-10">
                    <form:input path="id" class="form-control"/></div>
                </div>
                <div class="form-group">
                    <form:label path="harga" class="control-label col-sm-2">
                      Harga</form:label>
                       <div class="col-sm-10">
                    <form:input path="harga" class="form-control"/></div>
                </div>
                <div class="form-group">
                	<div class=" btn btn-primary">
                    <input type="submit" value="Submit" class="btn btn-default"/></div>
            	</div>
           
        </form:form>
        
   		</div>
    </body>
</html>

