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
      <script src="/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	  <script src="/medem/js/main_functions.js"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet" >
      <title>MEDEM :: Area :: Nueva Area.</title>
    </head><!-- HEAD_END -->

	<body id="newArea">
		
		
		   <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>	
		   
		   <jsp:include page="layouts/modal_layout.jsp"></jsp:include>		   
	
	
	       <div class="container">
			  <div class="col-md-12">
			    <div class="row">
					<div class="col-md-8 col-md-offset-2">
					  <div class="panel panel-default">
					    <div class="panel-heading">
                		  <h3 class="panel-title"><span class="glyphicon glyphicon-pencil"></span> :: Datos de la nueva area</h3>
              			</div><!-- .panel-heading -->
              			<div class="panel-body">
		                 <form:form action="/medem/addArea" method="POST" modelAttribute="Area" id="newAreaForm">
		                    <div class="form-group">
		                      <form:label path="name">Nombre del area</form:label>
		                      <form:input path="name" class="form-control required-text" placeholder="Nombre del area" />
		                    </div><!--. form-group input-group -->
		                    
		                    <form:hidden path="createdAt" value="2015-05-22 12:52:33"></form:hidden>
		                    <form:hidden path="createdBy" value="${userName}"></form:hidden> 
		                    <form:hidden path="company.id" value="${id_company}"></form:hidden>
		                    
		                    <input type="submit" class="btn btn-block btn-primary" tabindex="2" value="Crear Nueva Area">
		                  </form:form><!-- .form -->              			
              			</div><!-- .panel-body -->
					  </div><!-- .panel panel-default -->
					</div><!-- .col-md-8 col-md-offset-2 -->			    
			    </div><!-- .row -->
			  </div><!-- .col-md-12 -->
		   </div><!-- .container -->
		   
		   <jsp:include page="layouts/footer_layout.jsp"></jsp:include>
		   
		   <c:if test="${not empty message }" >
      		<script>
        		showMessage("${message}", "danger", "#myModal");
      		</script>
    	   </c:if>
	
	</body>
	
</html>