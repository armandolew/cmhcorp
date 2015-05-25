<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="css/custom.css" rel="stylesheet">
      <link href="css/general_layout_override.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
      <script src="js/main_functions.js"></script>
      <title>MEDEM :: Empleado :: Antecedentes Laborales</title>
    </head>

    <body id="workBackground">

			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>   
  
  			<div class="container">
  			  <div class="col-md-12">
  			    <div class="row">
	            	<ul class="nav nav-tabs">
	                	<li><a href="employeeShow?id=${employeeId }">Ficha de Identificaci&#243;n</a></li>
	                	<li class="active"><a href="#">Ant. Laborales</a></li>
	                	<li><a href="familyHistory?id=${employeeId}">Ant. Heredofamiliares</a></li>
	                	<li><a href="medicalRecord?id=${employeeId}">Historia Clinica</a></li>
	                	<li><a href="medicalExam?id=${employeeId}">Examenes</a></li>
	                	<li><a href="medicalNote?id=${employeeId}">Notas</a></li>                
	              	</ul><!-- .nav nav-tabs -->
	              	
	              	<div class="tab-content">
	              	  <div class="tab-pane fade in active">
	              	    <div class="panel panel-default form">
	              	      <div class="panel-body">
	              	        <div class="panel panel-default">
	              	          <div class="panel-heading">
                        	    <h4 class="panel-title">Antecedentes Laborales</h4>  
                      		  </div><!-- .panel-heading -->
                      		  <div class="panel-body">
                      		    <c:if test="${!empty listWorkBackgrounds}">
                      		    <ul class="list-group timeline">
                      		      <c:forEach items="${listWorkBackgrounds}" var="workBackground">
                      		        <li class="list-group-item clearfix workbackground">
										<div class="info-block block-info clearfix">
											<div class="square-box pull-left">
											  <span class="glyphicon glyphicon-briefcase glyphicon-lg"></span>
											</div>
											<p>Puesto: <b>${workBackground.name}</b></p>
											<p>Actividades: <b>${workBackground.activities}</b></p>
											<p>Accidentes: <b>${workBackground.accidents}</b></p>
											<span>Periodo: ${workBackground.startDate} / ${workBackground.endDate}</span>
										</div>
		              				</li><!-- .list-group-item -->
                      		      </c:forEach>
                      		    </ul><!-- .list-group -->
                      		    <ul class="pagination pull-right">
								  <li><a href="#">1</a></li>
								  <li><a href="#">2</a></li>
								  <li><a href="#">3</a></li>
								  <li><a href="#">4</a></li>
								  <li><a href="#">5</a></li>
								</ul>
                      		    </c:if>
                      		  </div>
	              	        </div><!-- .panel panel-default -->
	              	        <div class="panel panel-default">
	              	          <div class="panel-heading">
                        	    <h4 class="panel-title">Agregar Antecedente Laboral</h4>  
                      		  </div><!-- .panel-heading -->	  
                      		  <div class="panel-body">
                      		    <form:form action="/medem/addWorkBackground" method="POST" modelAttribute="WorkBackground">
                      		      <div class="row">
                      		        <div class="col-sm-2">
									  <div class="form-group">
                                        <label for="name">Nombre del puesto</label>
                                        <input name="name" type="text" class="form-control required" id="name" placeholder="Nombre del puesto" data-name="puesto"/>
                                      </div><!-- .form-group -->                      		        
                      		        </div><!-- .col-sm-2 -->
                      		        <div class="col-sm-2">
                                  	  <div class="form-group">
                                        <label for="activities">Actividades</label>
                                        <textarea name="activities" class="form-control required" id="activities" data-name="actividades"></textarea>
                                      </div><!-- .form-control -->                          
                                    </div><!-- .col-sm-2--> 
                                    <div class="col-sm-2">
                                      <div class="form-group">
                                        <label for="accidents">Accidentes</label>
                                        <textarea class="form-control required" name="accidents" data-name="accidentes"></textarea>
                                      </div><!-- .form-control -->                          
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                        <form:label path="startDate"><spring:message text="Fecha de inicio" /></form:label>
                  						<div class="input-group">
                  						  <form:input path="startDate" name="startDate" required="required" type="text" id="datepicker1" class="form-control input-small" tabindex="4"/>
                  						  <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                  						</div>
                                    </div><!-- .col-sm-2 --> 
                                    <div class="col-sm-2">
                                        <form:label path="endDate"><spring:message text="Fecha de fin" /></form:label>
                  						<div class="input-group">
                  						  <form:input path="endDate" name="endDate" required="required" type="text" id="datepicker2" class="form-control input-small" tabindex="5"/>
                  						  <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                  						</div>
                                    </div><!-- .col-sm-2 --> 
                                    <div class="col-sm-2">
                                      <div class="form-group">
                                        <label for="remarks">Observaciones</label>
                                        <textarea class="form-control required" name="remarks"></textarea>
                                      </div><!-- .form-control -->                          
                                    </div><!-- .col-sm-2 -->                                                                        
                      		      </div><!-- .row -->
                      		      <input name="employeeId" type="hidden" value="${employeeId}" />
                      		      <input name="userName" type="hidden" value="armando" />
                      		      
                             	  <hr class="divider">
                             	  <div class="row">
                              		<button type="submit" class="btn btn-block btn-primary">Generar Antecedente Laboral</button>
                            	  </div><!-- .row -->   
                            	                     		      
                      		    </form:form><!-- form -->
                      		  </div><!-- .panel-body -->            	        
	              	        </div><!-- .panel panel-default -->
	              	      </div><!-- .panel-body -->
	              	    </div><!-- .panel panel-default form -->
	              	  </div><!-- .tab-pane fade in active -->
	              	</div><!-- .tab-content -->
  			    </div><!-- .row -->
  			  </div><!-- .col-md-12 -->
  			</div><!-- .container -->

    </body>
    
    <script>
        var current_date = new Date();
        $( "#datepicker1" ).datepicker({
            changeMonth: true,
            changeYear: true,
            yearRange: "1900:" + new Date().getFullYear(),
            dateFormat: "yy-mm-dd",
            defaultDate: current_date
        });
        $( "#datepicker2" ).datepicker({
            changeMonth: true,
            changeYear: true,
            yearRange: "1900:" + new Date().getFullYear(),
            dateFormat: "yy-mm-dd",
            defaultDate: current_date
        });        
      </script>          

  </html>