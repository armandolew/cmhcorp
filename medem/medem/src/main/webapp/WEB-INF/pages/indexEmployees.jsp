<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <title>MEDEM :: Empleados</title>
    </head>

    <body id="indexEmployees">

			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include> 
			
			<jsp:include page="layouts/modal_layout.jsp"></jsp:include>		
 
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="col-md-10 col-md-offset-1">
			        <div class="login-panel panel panel-default">
					  <div class="panel-heading">
                	    <h3 class="panel-title">Empleados</h3>
              		  </div><!-- .panel-heading -->	
					  <div class="panel-body">
		                <form id="searchForm" action="/medem/searchEmployee" method="POST">
		                  <div class="row">
		                    <div class="col-sm-8">
		                      <input type="text" class="form-control" id="search" name="search" placeholder="Introduzca informaci&#243;n a buscar" />
		                      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		                    </div><!-- .col-sm-4 -->
		                    <div class="col-sm-4">
		                      <button type="submit" class="btn btn-primary">
		                        <i class="fa fa-search"></i> Buscar
		                      </button>
		                    </div><!-- .col-sm-4 -->
		                  </div><!-- .row -->
		                </form>  			
		                
		                <hr class="divider">
		                
					  <div class="panel panel-default">
					    <div class="panel-body">
						  <c:if test="${!empty listEmployees}">
						    <ul class="list-group">
						      <c:forEach items="${listEmployees}" var="employee">
						        <li class="list-group-item clearfix">
						          <div class="media">
						            <div class="pull-left">
						              <img src="${employee.profileImage }"  />
						            </div>
							        <div class="media-body">
							          <h3 class="media-heading">
							            ${employee.name} ${employee.lastName1} ${employee.lastName2}
							          </h3>
							          <a href="/medem/employee/${employee.id}" class="btn btn-info btn-sm pull-right">Ver m�s</a>
							        </div>						            
						          </div>
	
						        </li>
						      </c:forEach>
						    </ul>
						  </c:if>
					    </div>
					  </div><!-- .panel panel-default -->	
                	  
					  <ul class="pagination pull-right">
					    <c:forEach begin="1" end="${numberOfPages}" var="i">
					      <li><a href="/medem/indexEmployees/${i}/10">${i}</a></li>
					    </c:forEach>

					  </ul>                	  	                		  
					  </div>            		  		        
			        </div>
			      </div>
			    </div>
			  </div>
			</div> 	
			
	    <c:if test="${!empty message }">
	      <script>
	        showMessage("${message}", "info", "#myModal");
	      </script>
	    </c:if>					
 
    </body>
  </html>