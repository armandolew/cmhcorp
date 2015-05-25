 <%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet">
      <script src="/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="/medem/js/main_functions.js"></script>
      <title>MEDEM :: Editar Area</title>
    </head>

	<body id="newArea">
		
		
		   <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>	
	
	
	       <div class="container">
			  <div class="col-md-12">
			    <div class="row">
					<div class="col-md-8 col-md-offset-2">
					  <div class="panel panel-default">
					    <div class="panel-heading">
                		  <h3 class="panel-title">Datos del Area</h3>
              			</div><!-- .panel-heading -->
              			<div class="panel-body">
		                 <form:form action="/medem/updateArea" method="POST" modelAttribute="Area">
		                    <div class="form-group">
		                      <form:label path="name">Nombre del area</form:label>
		                      <form:input path="name" class="form-control" />
		                    </div><!--. form-group input-group -->
		                    <form:hidden path="id" value="${Area.id }" />
		                    <form:hidden path="createdBy" value="${Area.createdBy }" />
		                    <form:hidden path="company.id" value="${Area.company.id}" />
		                    <form:hidden path="createdAt" value="${Area.createdAt }" />
		                    <form:hidden path="enabled" value="${Area.enabled }" />
		                    <input type="submit" class="btn btn-block btn-primary" tabindex="6" value="Editar Area">
		                  </form:form><!-- .form -->              			
              			</div><!-- .panel-body -->
					  </div><!-- .panel panel-default -->
					</div><!-- .col-md-8 col-md-offset-2 -->			    
			    </div><!-- .row -->
			  </div><!-- .col-md-12 -->
		   </div><!-- .container -->
		   
		   <jsp:include page="layouts/footer_layout.jsp"></jsp:include>
	
	</body>
</html>