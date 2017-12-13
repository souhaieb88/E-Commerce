<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>


<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/jsp/template/header.jsp" %>
    <div class="container-wrapper">

      <!-- Three columns of text below the carousel -->
      <div class="container">
      
      		<div class="page-header">
      			<h1>Product detail</h1>
      			<p class="lead">Here is all the informations about the product</p>
      		</div>
      		<div class="container">
      			<div class="row">
      				<div class="col-md-5">
      					<img alt="image" src="#" style=" height:300px ; width:400%"/>
      				
      				</div>
      				<div class="col-md-5">
      					<h3>${product.productName}</h3>
      					<p>${product.productDescription}</p>
      					 <p><strong >Manufacturer : </strong>${product.productManufacturer}</p>
      					<p><strong >Category : </strong>${product.productCategory}Category</p>
      					<p><strong >Condition : </strong>${product.productCondition}Condition</p>
      					<p><strong >Price : </strong>${product.productPrice}</p>
      				</div>
      			</div>
      		
      		</div>
	       
<%@include file="/WEB-INF/jsp/template/footer.jsp" %>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
   

