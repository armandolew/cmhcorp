<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <title>MEDEM :: Empresas</title>
    </head>

    <body id="indexCompany">

		   <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
		   
 	       <div id="myModal" class="modal fade" role="dialog" data-backdrop="static" data-keyboard="false">
	         <div class="modal-dialog">
	           <div class="modal-content">
	             <div class="modal-header">
	               <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	               <h4 class="modal-title"><i class="fa fa-warning"></i> Atenci&#243;n</h4>                          
	             </div><!-- .modal-header -->
	             <div class="modal-body">
	              
	             </div><!-- .modal-body -->
	           </div><!-- .modal-content -->
	         </div><!-- .modal-dialog -->
	       </div><!-- .modal fade --> 		   
		   
      		<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="col-md-10 col-md-offset-1">
			        <div class="login-panel panel panel-default">
					  <div class="panel-heading">
                	    <h3 class="panel-title"><span class="glyphicon glyphicon-search"></span> :: Búsqueda</h3>
              		  </div><!-- .panel-heading -->	
					  <div class="panel-body">
		                <form id="searchForm" action="/medem/seachCompany" method="POST">
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
		                
						<div class="panel panel-primary">
                  		  <div class="panel-heading">
                    		<span class="glyphicon glyphicon-bookmark"></span> :: Empresas
                  		  </div><!-- .panel-heading -->  
                  		  <div class="panel-body">
                    		<table class="table table-striped table-bordered table-condensed table-responsive">
                      		  <thead>
                        		<tr class="info">
		                          <th>Nombre</th>
		                          <th>Razón social</th>
		                          <th>Registro patronal</th>
                        		</tr>  
                      		  </thead>
		                      <c:if test="${!empty listCompanies}">
		                        <tbody>
		                          <c:forEach items="${listCompanies}" var="company">
		                            <tr>
		                              <td><a href="company/${company.id}">${company.name}</a></td>
		                              <td>${company.businessName}</td>
		                              <td>${company.employeeRegistration}</td>
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
		  
	  $("#searchForm").submit(function(){
		 if($validator.numberOfInvalids() > 0){
			 var errorSummary = "";
			 $.each($validator.errorList, function(){
				 errorSummary += this.message + "<br/>";
			 });
			 showMessage(errorSummary, "danger");
		 } 
		 else{
			 showMessage("Buscando...", "success");
		 }
	  });
		  
		//Form validation    
    </script>
    
  </html>