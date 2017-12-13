<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/jsp/template/header.jsp" %>
    <div class="container-wrapper">

      <!-- Three columns of text below the carousel -->
      <div class="container">
      
      		<div class="page-header">
      			<h1>All Products</h1>
      			<p class="lead">Checkout All the awesome Products available now</p>
      		
      		</div>
      
            <table class="table table-striped table-hover">
            	<thead class="bg-success">
            		<tr>
            			<th>Thumb Image</th>
            			<th>Product Name</th>
            			<th>Category</th>
            			<th>Condition</th>
            			<th>Price</th>
            			<th></th>
            		</tr>
            	</thead>
            	<c:forEach items="${products}" var="product">
            	<tr>
            		<td><img alt="image" src="#"></td>
            		<td>${product.productName}</td>
            		<td>${product.productCategory}</td>
            		<td>${product.productCondition}</td>
            		<td>${product.productPrice}</td>
            		<td><a href="<c:url value="/ProductList/ViewProduct/${product.productId}"></c:url>"><span class="glyphicon glyphicon-info-sign"></span></a></td>
            	</tr>
            	</c:forEach>
            </table>
	       
<%@include file="/WEB-INF/jsp/template/footer.jsp" %>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
   

