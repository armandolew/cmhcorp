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
      <title>MEDEM :: ${employee.name} :: Nuevo Historial Clinico</title>
    </head>

    <body id="historia_clinica">

		<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
		
		<div class="container" id="medicalRecord">
		  <div class="col-md-12">
		    <div class="row">

				<jsp:include page="layouts/employee_tabs_nav_layouts.jsp"></jsp:include>	
              	
              	<div class="tab-content">
              	  <div class="tab-pane fade in active">
	                <div class="panel panel-default form">
	              	  <div class="panel-body">
						<div class="col-md-12">
						
		                  <div class="panel-body">
		                    <div class="panel panel-default">
		                      <div class="panel-heading">
		                        <h4 class="panel-title">Historia Clinica</h4>  
		                      </div><!-- .panel-heading -->
		
		                      <div class="panel-body">
		                        <div class="panel-group" id="accordion">
		                         <form:form action="/medem/addMedicalHistory" method="POST" modelAttribute="medicalHistory">
		
									<jsp:include page="layouts/exams/sexual_activity_layout.jsp"></jsp:include>
		
		                            <div class="panel panel-primary" id="currentAilment">
		                              <div class="panel-heading">
		                                <h4 class="panel-title">
		                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionFour">
		                                    Padecimiento actual
		                                  </a>
		                                </h4>
		                              </div>
		                              <div id="accordionFour" class="panel-collapse collapse">
		                                <div class="panel-body">
		                                  <div class="form-group">
		                                    <form:label path="currentCondition">Descripci&#243;n</form:label>
		                                     <form:textarea path="currentCondition" class="form-control" rows="5"></form:textarea>
		                                  </div><!-- .form-group -->                                    
		                                </div>
		                              </div>                              
		                            </div><!-- #currentAilment -->
		
									<jsp:include page="layouts/exams/physical_exploration_layout.jsp"></jsp:include>
		
		
		                            <div class="panel panel-primary" id="analisis">
		                              <div class="panel-heading">
		                                <h4 class="panel-title">
		                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionEight">
		                                    An&#225;lisis
		                                  </a>
		                                </h4>
		                              </div>
		                              <div id="accordionEight" class="panel-collapse collapse">
		                                <div class="panel-body">
		                                  <div class="form-group">
		                                    <form:label path="analysis">Descripci&#243;n</form:label>
		                                     <form:textarea class="form-control" rows="5" path="analysis"></form:textarea>
		                                  </div><!--.form-group  -->                                    
		                                </div>
		                              </div>                              
		                            </div><!-- #analisis --> 
		
		                            <div class="panel panel-primary" id="treatment">
		                              <div class="panel-heading">
		                                <h4 class="panel-title">
		                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionNine">
		                                    Tratamiento
		                                  </a>
		                                </h4>
		                              </div>
		                              <div id="accordionNine" class="panel-collapse collapse">
		                                <div class="panel-body">
		                                  <div class="form-group">
		                                    <form:label path="treatment" >Descripci&#243;n</form:label>
		                                     <form:textarea class="form-control" rows="5" path="treatment"></form:textarea>
		                                  </div><!-- .form-group -->                                    
		                                </div>
		                              </div>                              
		                            </div><!-- #treatment -->
		
									<jsp:include page="layouts/exams/risk_layout.jsp"></jsp:include>
									
		                            <form:hidden path="createdBy" value="${user.username }" />
		                            <form:hidden path="employee.id" value="${employee.getId() }" />
		                            <br/><br/>                                                                                     
		                            <input type="submit" class="btn btn-block btn-primary" value="Generar Historia Clinica" />
		
		                          </form:form><!-- form -->
		                        </div><!-- #accordion -->
		                      </div><!-- .panel-body -->
		
		                                            
		                    </div><!-- .panel panel-default -->
		                  </div><!-- .panel-body -->						
						
						
						</div><!-- .col-md-12 -->	              	  
	              	  </div><!-- .panel-body -->
	              	</div><!-- .panel panel-default form -->
	              </div><!-- .tab-pane fade in active -->
              	</div><!-- .tab-content -->	    
		    </div><!-- .row -->
		  </div><!-- .col-med-12 -->
		</div><!-- .container -->	
		
		<jsp:include page="layouts/footer_layout.jsp"></jsp:include>	

    </body>

  </html>