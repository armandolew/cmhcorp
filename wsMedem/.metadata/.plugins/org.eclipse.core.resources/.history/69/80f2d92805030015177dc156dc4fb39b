<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <script src="/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
	  <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/additional-methods.js"></script>
	  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	  <script src="/medem/js/main_functions.js" ></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet">
      <title>MEDEM :: ${company.name } :: Areas</title>
    </head>

    <body id="indexArea">

			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>	
			
			<div class="modal fade" id="confirm-delete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header modal-header-danger">
			        Atención
			      </div>
			      <div class="modal-body">
			        ¿Está seguro que quiere eliminar el registro?
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
			        <a class="btn btn-danger btn-ok">Eliminar</a>
			      </div>
			    </div>
			  </div>
			</div>				
 
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="col-md-10 col-md-offset-1">
			        <div class="login-panel panel panel-default">
					  <div class="panel-heading">
                	    <h3 class="panel-title"><span class="glyphicon glyphicon-search"></span> :: Búsqueda</h3>
              		  </div><!-- .panel-heading -->	
					  <div class="panel-body">
		                <form id="searchForm" action="/medem/searchArea" method="POST">
		                  <div class="row">
		                    <div class="col-sm-8">
		                      <input type="text" class="form-control" id="search" name="search" placeholder="Introduzca informaci&#243;n a buscar" />
		                      <input type="hidden" name="companyId" value="${company.id }" />
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
		                
		                <a href="/medem/newArea/${company.id}" class="btn btn-primary"><span class="glyphicon glyphicon-plus-sign"></span> Agregar área</a>
		                
		                <hr class="divider">
		                
						<div class="panel panel-primary">
                  		  <div class="panel-heading">
                    		<span class="glyphicon glyphicon-flag"></span> :: Areas
                  		  </div><!-- .panel-heading -->  
                  		  <div class="panel-body">
                    		<table class="table table-striped table-bordered table-condensed table-responsive">
                      		  <thead>
                        		<tr class="info">
                          		  <th>Nombre</th>
                          		  <th>Creada</th>
                          		  <security:authorize access="hasRole('ROLE_ADMIN')">
                          		  <th>Editar</th>
                          		  <th>Eliminar</th>
                          		  </security:authorize>
                        		</tr>  
                      		  </thead>
                      		  <c:if test="${!empty listAreas}">
	                      	  <tbody>
	                        	<c:forEach items="${listAreas}" var="area">
		                          <tr>
                              	    <td>${area.name}</td>
                              		<td>${area.createdAt}</td>
                              		<security:authorize access="hasRole('ROLE_ADMIN')">
                              		<td class="text-center">
                              		  <a href="/medem/editArea/${area.id }" class="btn btn-warning btn-sm">
                              		    <span class="glyphicon glyphicon-edit"></span> Editar
                              		  </a>
                              		</td>
                              		<td class="text-center">
										<a href="#" data-href="/medem/deleteArea/${area.id }" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#confirm-delete">
										  <span class="glyphicon glyphicon-remove-circle"></span> Eliminar
										</a>                            		
                              		</td>
                              		</security:authorize>
		                          </tr>
	                          	</c:forEach>                                              
	                      	  </tbody>
                      		  </c:if>
                    		</table>
                  		</div><!-- .panel-body -->                 
                	  </div><!-- .panel panel-primary -->	
                	  
					  <ul class="pagination pull-right">
						<li><a href="#">1</a></li>
					  	<li><a href="#">2</a></li>
					  	<li><a href="#">3</a></li>
					  	<li><a href="#">4</a></li>
					  	<li><a href="#">5</a></li>
					  </ul>                	  	                		  
					  </div>            		  		        
			        </div>
			      </div>
			    </div>
			  </div>
			</div> 	
			
			<jsp:include page="layouts/footer_layout.jsp"></jsp:include>		
 
    </body>
    
    <script>
      $("#confirm-delete").on("show.bs.modal", function(e) {
        $(this).find(".btn-ok").attr("href", $(e.relatedTarget).data("href"));
      });
      
	  //Form validation 
	  $validator = $("#searchForm").validate({
	    rules:{
	    	search: {
	    	  minlength: 2,
              required: true
	    	}
	    },
	  	messages: {
	  		search: "Por favor, introduzca el <b>termino a buscar</b>."
	  	},
		highlight: function (element) {
            $(element).closest("div").addClass('has-error');
	    },
	    submitHandler: function(form) { 
	      	form.submit(); 
	    }    	    
	  });
		  
		//Form validation      
    </script>    
  </html>