	<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	
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
		        <a class="navbar-brand" href="/medem">MEDEM</a>				
			  </div><!-- .navbar-header -->
			  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			    <ul class="nav navbar-nav">
		          <li class="active"><a href="/medem"><span class="glyphicon glyphicon-home"></span> Inicio</a></li>
<%-- 		          <security:authorize access="hasRole('ROLE_ADMIN')"> --%>
<!-- 		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-king"></span> Usuarios <b class="caret"></b></a> -->
<!-- 		            <ul class="dropdown-menu"> -->
<!-- 		              <li><a href="newUser"> -->
<!-- 		                <span class="glyphicon glyphicon-plus-sign"></span> Crear Usuario</a> -->
<!-- 		              </li> -->
<!-- 		              <li><a href="indexEmployees"> -->
<!-- 		                <span class="glyphicon glyphicon-list-alt"></span> Listar Empleados</a> -->
<!-- 		              </li> -->
<!-- 		            </ul> -->
<!-- 		          </li>		           -->
<%-- 		          </security:authorize> --%>
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> Empleados <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="/medem/newEmployee">
		                <span class="glyphicon glyphicon-plus-sign"></span> Crear Empleado</a>
		              </li>
		              <li><a href="/medem/indexEmployees">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Empleados</a>
		              </li>
		            </ul>
		          </li>	
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-bookmark"></span> Empresas <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <security:authorize access="hasRole('ROLE_ADMIN')">
		              <li><a href="/medem/newCompany">
		                <span class="glyphicon glyphicon-plus-sign"></span> Crear Empresa</a>
		              </li>
		              <li><a href="/medem/indexCompany">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Empresas</a>
		              </li>
		              </security:authorize>
		              <li>
		                <a href="/medem/company/1"><span class="glyphicon glyphicon-search"></span> Ver Empresa</a>
		              </li>
		    		</ul>
		    	  </li>
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-flag"></span> Areas <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="/medem/newArea/1">
		    		    <span class="glyphicon glyphicon-plus-sign"></span> Crear Area</a>
		              </li>
		              <li><a href="/medem/areas/1">
		                <span class="glyphicon glyphicon-list-alt"></span> Listar Areas</a>
		              </li>
		    		</ul>
		          </li>	
		          <security:authorize access="hasRole('ROLE_ADMIN')">
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-stats"></span> Reportes <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="/medem/reportCharts">
		                <span class="glyphicon glyphicon-plus-sign"></span> Generar Reporte</a>
		              </li>
		            </ul>
		          </li>	                                		
		          </security:authorize>
			    </ul><!-- .nav navbar-nav -->
			    <ul class="nav navbar-nav navbar-right">
		          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> ${user.username } <b class="caret"></b></a>
		            <ul class="dropdown-menu">
		              <li><a href="#"><span class="glyphicon glyphicon-user"></span> Perfil</a></li>
		              <li class="divider"></li>
		              <li><a href="javascript:logoutFormSubmit();"><span class="glyphicon glyphicon-off"></span> Logout</a></li>
		            </ul>
		          </li>					
			    </ul><!-- .nav navbar-nav navbar-right -->
			  </div><!-- .collapse navbar-collapse -->
			</nav><!-- .navbar navbar-default -->	