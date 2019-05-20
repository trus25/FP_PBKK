<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
  </head>
  <body style="padding-top: 70px">
  	<!-- body code goes here -->
    <div class="container-fluid">
      <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light"><a class="navbar-brand text-primary font-weight-bold" href="#">SIBEKAS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1" aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent1">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active"> <a class="nav-link" href="listBarang">Home <span class="sr-only">(current)</span></a> </li>
            <li class="nav-item"> <a class="nav-link" href="formbarang">Input Barang</a></li>
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
      <div class="row">
		  <div class="col-md-6 offset-xl-1 col-xl-3"> <h3>Kategori Item</h3></div>
        <div class="col-md-6 col-xl-7">&nbsp;</div>
        <div class="offset-xl-1 col-xl-3 col-md-6">
		<br>
          <div class="list-group"> <a href="#" class="list-group-item active">
            <p class="mb-1">Buku</p>
            </a> <a href="#" class="list-group-item">
              <p class="mb-1">Alat Elektronik</p>
              </a></div>
        &nbsp;</div>
        <div class="offset-xl-1 col-xl-3 col-md-6">
        <div class="row">
          <c:forEach var="tempBarang" items="${products}">
          <div class="col-md-6">
          <div class="card"> <img class="card-img-top" src="images/buku.jpg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">${tempBarang.barangName} </h5>
              <p class="card-text">Rp ${tempBarang.barangPrice}</p>
              </div>
          </div>
       </div>
       </c:forEach>
       </div>
       </div>
      </div>
      </div>
    
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
	<script src="js/jquery-3.3.1.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/popper.min.js"></script> 
	<script src="js/bootstrap-4.3.1.js"></script>
</body>
</html>