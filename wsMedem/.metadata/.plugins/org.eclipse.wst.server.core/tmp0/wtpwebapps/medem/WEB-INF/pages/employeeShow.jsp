<%@page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <script src="/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
	  <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/additional-methods.js"></script>
	  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	  <script src="/medem/js/main_functions.js"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet" >
      <title>MEDEM :: Empleado :: Ficha de Identificacion </title>
    </head>

    <body id="employeeShow">
 
			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
			
			<jsp:include page="layouts/modal_layout.jsp"></jsp:include>
			
			<jsp:include page="layouts/modal_delete_layout.jsp"></jsp:include>
			
			<jsp:include page="layouts/modal_fileupload_layout.jsp"></jsp:include>
			
			<div class="container">
			  <div class="employeeInfo">
			  <div class="col-md-12">
			    <div class="row">
	            	<ul class="nav nav-tabs">
	                	<li class="active"><a href="#">Ficha de Identificaci&#243;n</a></li>
	                	<li><a href="/medem/familyHistory?id=${id}">Ant. Heredofamiliares</a></li>
	                	<li><a href="/medem/medicalHistory/${id}">Historia Clinica</a></li>
	                	<li><a href="/medem/medicalExam?id=${id}">Examenes</a></li>
	                	<li><a href="/medem/medicalNote?id=${id}">Notas</a></li>                
	              	</ul><!-- .nav nav-tabs -->
	              	
	              	<div class="tab-content">
	              	  <div class="tab-pane fade in active">
	              	    <div class="panel panel-default form">
	              	      <div class="panel-body">
	              	        <div class="col-md-3">
	              	          <div class="profile-sidebar">
	              	            <div class="profile-userpic">
	              	              <img src="/medem/imgs/anon_user_plus.png" class="img-responsive img-circle" alt="">
	              	            </div><!-- .profile-userpic -->
	              	            <div class="profile-usertitle">
	              	              <div class="profile-usertitle-name">
								    
								  </div>
								  <div class="profile-usertitle-job">
									
								  </div>
								  <hr class="divider">
								  <div class="profile-userbuttons">
								    <div class="btn-group-vertical">
								      <a href="#" data-toggle="modal" data-target="#fileUpload" class="btn btn-success btn-sm"><span class="glyphicon glyphicon-upload"></span> Subir Foto</a>
								      <security:authorize access="hasRole('ROLE_ADMIN')">
								      <a href="/medem/editEmployee/${id}" class="btn btn-warning btn-sm"><span class="glyphicon glyphicon-edit"></span> Editar</a>
								      <a href="#" data-href="/medem/deleteEmployee/${id }" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#confirm-delete"><span class="glyphicon glyphicon-remove-circle"></span> Eliminar</a>
								      </security:authorize>
								    </div><!-- .btn-group-vertical -->
								  </div>									  
	              	            </div><!-- .profile-usertitle -->
	              	          </div><!-- .profile-sidebar -->
	              	        </div><!-- .col-med-3 -->
	              	        <div class="col-md-9">
              	              <div class="row">
								<div class="col-sm-2">
                              	  <div class="form-group" id="age">
                                    <label>Edad</label>
                                	<input name="age" type="text" class="form-control required" value="" readonly/>
                              	  </div><!-- .form-group -->                          
                              	</div><!-- .col-sm-2 -->
                     			<div class="col-sm-2">
                      			  <div class="form-group">
                         		    <label for="fullGender">Genero</label>
                         			<input name="fullGender" type="text" class="form-control" value="" readonly />
                      			  </div><!--. form-group -->                         
                    		    </div><!-- .col-sm-2 -->  
                				<div class="col-sm-4">
                  				  <div class="form-group">
                     			    <label for="fullMaritalStatus">Estado civil</label>
                     				<input type="text" name="fullMaritalStatus" class="form-control" value="" readonly />
                  				  </div><!--. form-group -->                         
                				</div><!-- .col-sm-4 -->   
                   				<div class="col-sm-4">
                  				  <div class="form-group">
                       			    <label for="religion">Religi&#243;n</label>
                       				<input type="text" class="form-control" name="religion" value="" readonly />
                     			  </div><!-- .form-group -->                          
                   				</div><!-- .col-sm-4 -->                 				                  		                                	               	              
              	              </div><!-- .row -->
              	              
              	              <hr class="divider"> 
              	              
              	              <div class="row">
              	                <div class="col-sm-3">
				                  <div class="form-group">
				                    <label for="fullBloodGroup">Grupo sanguineo:</label>
				                    <input type="text" name="fullBloodGroup" class="form-control" value="" readonly />
				                  </div><!--. form-group input-group -->                         
				                </div><!-- .col-sm-3 -->
	                            <div class="col-sm-3">
	                              <div class="form-group">
	                                 <label for="fullRh">Rh:</label>
	                                 <input type="text" name="fullRh" class="form-control" value="" readonly />
	                              </div><!--. form-group input-group -->                         
	                            </div><!-- .col-sm-3 --> 	
	                            <div class="col-sm-6">
	                              <div class="form-group">
	                                <label>Lugar de origen:</label>
	                                <input name="originPlace" type="text" class="form-control" value="" readonly />
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-6 --> 	                            			                
              	              </div><!-- .row -->
								
              	              <hr class="divider">
              	              
              	              <div class="row">
	                            <div class="col-sm-4">
	                              <div class="form-group">
	                                <label>Domicilio:</label>
	                                <input name="address.street" type="text" class="form-control" id="address.street" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-4 -->  
	                            <div class="col-sm-3">
	                              <div class="form-group">
	                                <label>Telefono:</label>
	                                <input name="phone" type="text" class="form-control" id="phone" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-3 --> 	
	                            <div class="col-sm-3">
	                              <div class="form-group">
	                                <label>Delegaci&#243;n</label>
	                                <input name="address.town" type="text" class="form-control" id="town" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-3 -->
	                            <div class="col-sm-2">
	                              <div class="form-group">
	                                <label>C&#243;digo postal</label>
	                                <input name="address.zipcode" type="text" class="form-control" id="zipCode" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-2 -->	                                                                    	                
              	              </div><!-- .row -->
              	              
              	              <hr class="divider">
              	              
              	              <div class="row">
	                            <div class="col-sm-6">
	                              <div class="form-group">
	                                <label>Nombre de la persona de contacto:</label>
	                                <input name="contactName" type="text" class="form-control required" id="contactName" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-6 --> 
	                            <div class="col-sm-6">
	                              <div class="form-group">
	                                <label>Telefono de la persona de contacto:</label>
	                                <input name="contactPhone" type="text" class="form-control required" id="contactPhone" value="" readonly/>
	                              </div><!-- .form-group -->                          
	                            </div><!-- .col-sm-6 --> 	                                          	              
              	              </div><!-- .row -->
              	              
	              	        </div><!-- .col-md-9 -->
	              	      </div><!-- .panel-body -->
	              	    </div><!-- panel panel-default form -->
	              	  </div><!-- .tab-pane fade in active -->
	              	</div><!-- .tab-content -->
	              				      
			    </div><!-- .row -->
			  </div><!-- .col-md-12 -->
			  </div><!-- .employeeInfo -->
			</div><!-- .container -->   
          
          <!-- footer -->
          <jsp:include page="layouts/footer_layout.jsp"></jsp:include>

    </body>
    
    <script>
    	$(document).ready(function(){
   		
	       loadEmployeeInformation("${id}");

    	});
    </script>    

  </html>