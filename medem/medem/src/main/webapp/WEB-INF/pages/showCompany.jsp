<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="/medem/css/custom.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <script src="/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	  <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
	  <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/additional-methods.js"></script>
      <script src="/medem/js/main_functions.js"></script>
      <title>MEDEM :: Empresa :: ${company.name}</title>
    </head>

    <body id="companyShow">
 
			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
			
			<jsp:include page="layouts/modal_delete_layout.jsp"></jsp:include>		
			
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="panel panel-default form">
			        <div class="panel-body">
			          <div class="col-md-3">
			            <div class="profile-sidebar">
						  <div class="profile-usertitle">
						    <div class="profile-usertitle-name">
						      <h1><span class="glyphicon glyphicon-certificate"></span></h1>
							  ${company.name } 
							</div>
							<hr class="divider">
							<div class="profile-creation">
							  <p><small class="text-muted text-left"><i class="glyphicon glyphicon-time"></i> ${company.createdAt }</small></p>
							  <p><small class="text-info text-left"><i class="glyphicon glyphicon-user"></i> ${company.main_doctor }</small></p>
							</div>
							<hr class="divider">							
							<div class="profile-userbuttons">
							  <a href="/medem/editCompany/${company.id }" class="btn btn-warning btn-sm"><span class="glyphicon glyphicon-edit"></span> Editar</a>
							  <a href="#" data-href="/medem/deleteCompany/${company.id }" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#confirm-delete"><span class="glyphicon glyphicon-remove-circle"></span> Eliminar</a>
							</div><!--. profile-userbuttons -->
						  </div><!-- .profile-usertitle -->	              	      			            	
			            </div><!-- .profile-sidebar -->
			          </div><!-- .col-md-3 -->
			          <div class="col-md-9">
			            <div class="row">
			              <div class="form-group" id="businessName">
                            <label>Razón social</label>
                            <input name="businessName" type="text" class="form-control" value="${company.bussinesName}" readonly/>
                          </div><!-- .form-group -->
                          <hr class="divider">
			              <div class="form-group" id="employeeRegistration">
                            <label>Registro laboral</label>
                            <input name="employeeRegistration" type="text" class="form-control" value="${company.employeeRegistration}" readonly/>
                          </div><!-- .form-group -->
                          <hr class="divider"> 
			              <div class="form-group" id="activity">
                            <label>Actividad/Giro</label>
                            <input name="activity" type="text" class="form-control" value="${company.activity.activity}" readonly/>
                          </div><!-- .form-group -->
                          <hr class="divider"> 
			              <div class="form-group" id="activity">
                            <label>Creado por</label>
                            <input name="userName" type="text" class="form-control" value="${company.createdBy}" readonly/>
                          </div><!-- .form-group -->                          
                          <hr class="divider">
                          <a href="/medem/areas/${company.id}" class="btn btn-primary"><span class="glyphicon glyphicon-flag"></span> Ver áreas de la empresa</a>                                                                       
			            </div><!-- .row -->
			          </div><!-- .col-md-9 -->
			        </div><!-- .panel-body -->
			      </div><!-- .panel panel-default form -->
			    </div><!-- .row -->	
			  </div><!-- .col-md-12 -->
			</div><!-- .container -->     
			
			<jsp:include page="layouts/footer_layout.jsp"></jsp:include> 
    </body>
    
    <script>
      $("#confirm-delete").on("show.bs.modal", function(e) {
        $(this).find(".btn-ok").attr("href", $(e.relatedTarget).data("href"));
      });
    </script>

  </html>