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
	  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	  <script src="/medem/js/main_functions.js"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet" >
      <title>MEDEM :: Empleado :: Ficha de Identificacion </title>
      <style>
        .card{
    		background-color: #33B08A;
    		border: 1px solid #ddd;
    		border-radius: 4px;
    		display: block;
    		line-height: 1.42857;
    		margin-bottom: 20px;
    		padding: 4px;
    		transition: all 0.2s ease-in-out 0s;     
    		} 
    	.card .header{
    		width: 100%;
    		height: 40px;
    		max-height: 40px;
    		line-height: 40px;
    		text-align: left;
    	}
    	.card .header h4{
    		margin: 0 auto;
    		color: #fff;
    		padding: 0;
    		height: 100%;
    		line-height: 40px;
    		font-size: 16px;
    		padding: 0;
    		color: #fff;
    		border-bottom: 1px solid #fff;
    		width: 95%;
    	}
    	.card .caption{
    		color: #303946;
    		padding: 9px;
    	}
    	.card .caption .alert{
    		margin-bottom: 0!important;
    	}
    	.card .caption .text-muted{
    		color: #fff!important;
    	}
    	.info, .info h4{
    		background-color: #29B6D8!important;
    	}
    	.info h4{
    		color: #fff !important;
    	}
      </style>
    </head>

    <body id="medicalHistoryShow">
 
			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>

			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
	            	<jsp:include page="layouts/employee_tabs_nav_layouts.jsp"></jsp:include>
	              	
	              	<div class="tab-content">
	              	  <div class="tab-pane fade in active">
	              	    <div class="panel panel-default form">
	                      <div class="panel-heading">
	                        <h4 class="panel-title">Historia Clinica</h4>  
	                      </div><!-- .panel-heading -->	              	      	
	              	      <div class="panel-body">

	              	        <div class="col-md-4">
	              	        	<div class="card info">
	              	        	  <div class="header">
	              	        	  	  <h4>Datos</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p><span class="text-muted">Empleado: </span>${medicalHistory.employee.name} ${medicalHistory.employee.lastName1 } ${medicalHistory.employee.lastName2 }</p>
	              	              	  <p><span class="text-muted">Creado por: </span>${medicalHistory.createdBy}</p>
	              	              	  <p><span class="text-muted">Generado: </span>${medicalHistory.createdAt }</span></p>
	              	              	  <p class="label label-info"><span class="glyphicon glyphicon-tag"></span> Ingreso</p>
	              	              </div>
	              	        	</div><!-- .card -->	              	        
	              	        
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Personales patol�gicos</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p><span class="text-muted">IVSA: </span>${medicalHistory.sexualActivity.ivsa}</p>
	              	              	  <p><span class="text-muted">ETS: </span>${medicalHistory.sexualActivity.ets}</p>
	              	              	  <c:if test="${medicalHistory.employee.gender == 1 }">
	              	              	  	<p><span class="text-muted">Ciclos: </span> ${medicalHistory.sexualActivity.cycles }</p>
	              	              	  	<p><span class="text-muted">Ritmo: </span>${medicalHistory.sexualActivity.rhythm }</p>
	              	              	  </c:if>
	              	              </div>
	              	        	</div><!-- .card -->
	              	        	
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Personales no patol�gicos</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p><span class="text-muted">IVSA: </span>${medicalHistory.sexualActivity.ivsa}</p>
	              	              	  <p><span class="text-muted">ETS: </span>${medicalHistory.sexualActivity.ets}</p>
	              	              	  
	              	              </div>
	              	        	</div><!-- .card -->	              	        	
	              	        		              	        
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Actividad sexual</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p><span class="text-muted">IVSA: </span>${medicalHistory.sexualActivity.ivsa}</p>
	              	              	  <p><span class="text-muted">ETS: </span>${medicalHistory.sexualActivity.ets}</p>
	              	              	  <c:if test="${medicalHistory.getEmployee().getGender() == 2 }">
	              	              	    <p><span class="text-muted">Ciclos: ${medicalHistory.sexualActivity.cycles}</span> </p>
	              	              	    <p><span class="text-muted">Ritmo: ${medicalHistory.sexualActivity.rhythm }</span></p>
	              	              	  </c:if> 
	              	              </div>
	              	        	</div><!-- .card -->
	              	        </div><!-- .col-md-4 -->

	              	        <div class="col-md-4">
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Exploraci�n f�sica</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p><span class="text-muted">Frecuencia cardiaca: </span>${medicalHistory.physicalExploration.heartRate}</p>
	              	              	  <p><span class="text-muted">Tensi�n arterial: </span>${medicalHistory.physicalExploration.bloodPressure}</p>
	              	              	  <p><span class="text-muted">Frecuencia respiratoria: </span>${medicalHistory.physicalExploration.respiratoryRate}</p>
	              	              	  <p><span class="text-muted">Temperatura: </span>${medicalHistory.physicalExploration.temperature}</p>
	              	              	  <p><span class="text-muted">Peso: </span>${medicalHistory.physicalExploration.weight}</p>
	              	              	  <p><span class="text-muted">Talla: </span>${medicalHistory.physicalExploration.size}</p>
	              	              	  <p><span class="text-muted">IMC: </span>${medicalHistory.physicalExploration.imc}</p>
	              	              	  <p><span class="text-muted">Circunferencia de la cintura: </span>${medicalHistory.physicalExploration.hips}</p>
	              	              	  <p><span class="text-muted">Circunferencia de la cadera: </span>${medicalHistory.physicalExploration.waist}</p>
	              	              	  <p><span class="text-muted">Indice sobrepeso: </span>${medicalHistory.physicalExploration.weightIndex}</p>
	              	              	  
	              	              	  <hr class="division"/>
	              	              	  
	              	              	  <p><span class="text-muted">Inspecci�n general: </span><br/>${medicalHistory.physicalExploration.general}</p>
	              	              	  <p><span class="text-muted">Cabeza y cuello: </span><br/>${medicalHistory.physicalExploration.head}</p>
	              	              	  <p><span class="text-muted">Torax: </span><br/>${medicalHistory.physicalExploration.torax}</p>
	              	              	  <p><span class="text-muted">Abd�men: </span><br/>${medicalHistory.physicalExploration.abdomen}</p>
	              	              	  <p><span class="text-muted">Miembros: </span><br/>${medicalHistory.physicalExploration.limbs}</p>
	              	              	  <p><span class="text-muted">Genitales: </span><br/>${medicalHistory.physicalExploration.genitals}</p>
	              	              	  <p><span class="text-muted">Sistema nervioso: </span><br/>${medicalHistory.physicalExploration.nervousSystem}</p>
	              	              </div>
	              	        	</div><!-- .card -->

	              	        </div><!-- .col-md-4 -->
	              	        
	              	        <div class="col-md-4">
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>An�lisis</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p>${medicalHistory.analysis}</p>
	              	              </div>
	              	        	</div><!-- .card -->
	              	        	
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Tratamiento</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	              	  <p>${medicalHistory.treatment}</p>
	              	              </div>
	              	        	</div><!-- .card -->
	              	        	
	              	        	<div class="card">
	              	        	  <div class="header">
	              	        	  	  <h4>Riesgo</h4>
	              	        	  </div>
	              	              <div class="caption">
	              	                  <c:set var="val" value="${medicalHistory.risk.id}"/>
									  <c:choose> 
									    <c:when test="${val == '1'}">
										  <div class="alert alert-danger" role="alert"><i class="glyphicon glyphicon-warning-sign
										  "></i> Alto</div>
										</c:when>
										<c:when test="${val == '2'}">
										  <div class="alert alert-warning" role="alert"><i class="glyphicon glyphicon-eye-open
										  "></i> Medio</div>
										</c:when>
										<c:otherwise>
										  <div class="alert alert-success" role="alert"><i class="glyphicon glyphicon-ok

										  "></i> Bajo</div>
										</c:otherwise>
									  </c:choose>
	              	              	  
	              	              </div>
	              	        	</div><!-- .card -->	              	        	

	              	        </div><!-- .col-md-4 -->	              	        

	              	      </div><!-- .panel-body -->
	              	    </div><!-- panel panel-default form -->
	              	  </div><!-- .tab-pane fade in active -->
	              	</div><!-- .tab-content -->
	              				      
			    </div><!-- .row -->
			  </div><!-- .col-md-12 -->
			</div><!-- .container -->   
          
          <!-- footer -->
          <jsp:include page="layouts/footer_layout.jsp"></jsp:include>

    </body>
    

  </html>