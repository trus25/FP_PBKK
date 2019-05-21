<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Untitled Document</title>
    <!-- Bootstrap -->
	<link href="css/bootstrap-4.3.1.css" rel="stylesheet">
	  
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	
  </head>
    <body>
   <body style="padding-top: 70px">
  	<!-- body code goes here -->
    <div class="container-fluid">
      <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light"><a class="navbar-brand text-primary font-weight-bold" href="#">SIBEKAS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent1">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active"> <a class="nav-link" href="listBarang">Home <span class="sr-only">(current)</span></a> </li>
            <li class="nav-item"> <a class="nav-link" href="#">Input Barang</a></li>
            <li class="nav-item dropdown">
  <div class="dropdown-menu" aria-labelledby="navbarDropdown1"> <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Something else here</a> </div>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>
    	<div class="container jumbotron" style="background-color: skyblue">
        <h3>Form Input Barang</h3>
        
        <form:form method="POST"
          action="savebarang" modelAttribute="products" class="form-horizontal" >
             <form:hidden path="id"/>
            <div class="form-group">
                    <form:label path="barangUserid" class="control-label col-sm-2">
                      User id</form:label>
                       <div class="col-sm-10">
                    <form:input path="barangUserid" class="form-control"/></div>
                </div>
                <div class="form-group">
                    <form:label path="barangCategory" class="control-label col-sm-2">
                      barang Category</form:label>
                       <div class="col-sm-10">
                    <form:input path="barangCategory" class="form-control"/></div>
                </div>
                <div class="form-group">
                    <form:label path="barangName" class="control-label col-sm-2" >Name</form:label>
                     <div class="col-sm-10">
                   <form:input path="barangName" class="form-control"/></div>
               </div>
              
                <div class="form-group">
                    <form:label path="barangPrice" class="control-label col-sm-2">
                      Harga</form:label>
                       <div class="col-sm-10">
                    <form:input path="barangPrice" class="form-control"/></div>
                </div>
                <div class="form-group">
						<input type="submit" value="Submit" class="btn float-right btn btn-primary">
					</div>
           
        </form:form>
        
   		</div>
   		</div>
    </body>
</html>

