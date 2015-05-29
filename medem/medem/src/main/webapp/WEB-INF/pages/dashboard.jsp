<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!DOCTYPE>
	<html>
		<head>
			<meta charset="utf=8">
      		<meta name="viewport" content="width=device-width, initial-scale=1.0">
      		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      		<script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      		<link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      		<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			<link href="css/general_layout_override.css" rel="stylesheet">
			<script src="js/main_functions.js"></script>
      		<title>MEDEM :: Bienvenido</title>
		</head>
		
		
		
		<body id="dashboard">
		
			${testVariable}
		
			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
			
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="panel panel-default">
			        <div class="panel-heading">
			          <h3 class="panel-title">Bienvenido <b>${user.username }</b></h3>
			        </div>
			        <div class="panel-body">
			          <div class="control-group">
			            <div class="col-lg-3 col-md-6">
			             <div class="panel panel-company">
			               <div class="panel-heading">
			                 <div class="row">
			                   <div class="col-xs-3">
			                     <i class="glyphicon glyphicon-bookmark"></i>
			                   </div><!-- .col-xs-3 -->
			                   <div class="col-xs-9 text-right">
			                     <div class="huge">Empresa: <br/><b>Comercial Mexicana</b></div>
			                   </div><!-- .col-xs-9 text-right -->
			                 </div><!-- .row -->
			               </div><!-- .panel-heading -->
			             </div><!-- .panel panel-employees -->
			            </div><!-- .col-lg-3 col-md-6 -->
			          </div><!-- .control-group -->			        
			          <div class="control-group">
			            <div class="col-lg-3 col-md-6">
			             <div class="panel panel-employees">
			               <div class="panel-heading">
			                 <div class="row">
			                   <div class="col-xs-3">
			                     <i class="glyphicon glyphicon-user"></i>
			                   </div><!-- .col-xs-3 -->
			                   <div class="col-xs-9 text-right">
			                     <div class="huge">Empleados: <br/><b>${employeeCount }</b></div>
			                   </div><!-- .col-xs-9 text-right -->
			                 </div><!-- .row -->
			               </div><!-- .panel-heading -->
			             </div><!-- .panel panel-employees -->
			            </div><!-- .col-lg-3 col-md-6 -->
			          </div><!-- .control-group -->
			          <div class="control-group">
			            <div class="col-lg-3 col-md-6">
			              <div class="panel panel-areas">
			                <div class="panel-heading">
			                  <div class="row">
			                    <div class="col-xs-3">
			                      <i class="glyphicon glyphicon-flag"></i>
			                    </div><!-- .col-xs-3 -->
			                    <div class="col-xs-9 text-right">
			                      <div class="huge">Areas: <br/><b>${areasCount }</b></div>
			                    </div><!-- .col-xs-9 text-right -->
			                  </div><!-- .row -->
			                </div><!-- .panel-heading -->
			              </div><!-- .panel panel-areas -->
			            </div><!-- .col-lg-3 col-md-6 -->
			          </div><!-- .control-group -->
			          <div class="control-group">
			            <div class="col-lg-3 col-md-6">
			              <div class="panel panel-records">
			                <div class="panel-heading">
			                  <div class="row">
			                    <div class="col-xs-3">
			                      <i class="glyphicon glyphicon-dashboard"></i>
			                    </div><!-- .col-xs-3 -->
			                    <div class="col-xs-9 text-right">
			                      Historias clinicas: <br/><b>60%</b>
			                      <div class="progress">
  									<div class="progress-bar progress-bar-white" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
    								
  									</div>
								  </div>
			                    </div><!-- .col-xs-9 text-right -->
			                  </div><!-- .row -->
			                </div><!-- .panel-heading -->
			              </div><!-- .panel panel-areas -->
			            </div><!-- .col-lg-3 col-md-6 -->
			          </div><!-- .control-group -->			          
			        </div><!-- .panel-body -->
			      </div><!-- .panel panel-default -->
			    </div><!--  .row -->
			  </div><!-- .col-md-12 -->
			</div>	
			
			<jsp:include page="layouts/footer_layout.jsp"></jsp:include>
			
            <div id="myModal" class="modal fade">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header modal-header-danger">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"><i class="fa fa-warning"></i> Cargando</h4>                          
                  </div><!-- .modal-header -->
                  <div class="modal-body">
                    <p></p>
                  </div><!-- .modal-body -->
                </div><!-- .modal-content -->
              </div><!-- .modal-dialog -->
            </div><!-- .modal fade" -->
		
		</body>
	</html>
