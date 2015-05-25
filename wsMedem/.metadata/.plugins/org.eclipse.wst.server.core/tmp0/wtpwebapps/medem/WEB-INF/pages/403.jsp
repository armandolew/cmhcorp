<%@page session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
      		<title>MEDEM :: Atención</title>
		</head>
		
		<body id="dashboard">
		
			<nav class="navbar navbar-default" role="navigation">
			  <!-- csrt for log out-->
			  <c:url value="/j_spring_security_logout" var="logoutUrl" />
  			  <form action="${logoutUrl}" method="post" id="logoutForm">
	  		    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			  </form>

			  <div class="navbar-header">
		        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		          <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
		        </button>
		        <a class="navbar-brand" href="http://www.jquery2dotnet.com">MEDEM</a>				
			  </div><!-- .navbar-header -->
			  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			    <ul class="nav navbar-nav">
		          <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Inicio</a></li>
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Empleados <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="employee">
		                <span class="glyphicon glyphicon-plus-sign"></span> Crear Empleado</a>
		              </li>
		              <li><a href="indexEmployees">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Empleados</a>
		              </li>
		              <li>
		                <a href="#"><span class="glyphicon glyphicon-search"></span> Buscar Empleado</a>
		              </li>
		            </ul>
		          </li>	
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-bookmark"></span> Empresas <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="newCompany">
		                <span class="glyphicon glyphicon-plus-sign"></span> Crear Empresa</a>
		              </li>
		              <li><a href="indexCompany">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Empresa</a>
		              </li>
		              <li>
		                <a href="#"><span class="glyphicon glyphicon-search"></span> Buscar Empresa</a>
		              </li>
		    		</ul>
		    	  </li>
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-flag"></span> Areas <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="newArea?companyId=1">
		    		    <span class="glyphicon glyphicon-plus-sign"></span> Crear Area</a>
		              </li>
		              <li><a href="indexAreas?companyId=1">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Areas</a>
		              </li>
		    		</ul>
		          </li>	
		          <security:authorize access="hasRole('ROLE_ADMIN')">
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-stats"></span> Reportes <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="reportCharts">
		                <span class="glyphicon glyphicon-plus-sign"></span> Generar Reporte</a>
		              </li>
		            </ul>
		          </li>	                                		
		          </security:authorize>
			    </ul><!-- .nav navbar-nav -->
			    <ul class="nav navbar-nav navbar-right">
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> ${userName } <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="#"><span class="glyphicon glyphicon-user"></span> Perfil</a></li>
		              <li class="divider"></li>
		              <li><a href="javascript:logoutFormSubmit();"><span class="glyphicon glyphicon-off"></span> Logout</a></li>
		            </ul>
		          </li>					
			    </ul><!-- .nav navbar-nav navbar-right -->
			  </div><!-- .collapse navbar-collapse -->
			</nav><!-- .navbar navbar-default -->	
			
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="panel panel-default">
			        <div class="panel-heading">
			        	<h3 class="panel-title">Atención</h3>
			        </div>
			        <div class="panel-body">
			          <span class="text-danger"><h3><span class="glyphicon glyphicon-warning-sign
			          "></span> 403 -Recurso de acceso restringido</h3></span>
			          <p><a href="/medem" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Inicio</a></p>
			        </div><!-- .panel-body -->
			      </div><!-- .panel panel-default -->
			    </div><!--  .row -->
			  </div><!-- .col-md-12 -->
			</div>	
		
		</body>
	</html>
