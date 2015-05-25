<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

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
	  <script src="/medem/js/main_functions.js"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <link href="/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="/medem/css/general_layout_override.css" rel="stylesheet">
      <link href="/medem/css/custom.css" rel="stylesheet" >
      <title>MEDEM :: Nuevo Empleado</title>
    </head>

	<body id="employee">
	
		    <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>

			<jsp:include page="layouts/modal_layout.jsp" ></jsp:include>
	
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
					<ul class="nav nav-tabs">
                      <li class="active"><a href="#">Ficha de Identificaci&#243;n</a></li>
                    </ul><!-- .nav nav-tabs -->

                    <div class="tab-content">
                    	<div class="tab-pane fade in active" id="employeeId">
                    		<div class="panel panel-default form">
                    			<div class="panel-body">
                    			  <form:form action="/medem/addEmployee" method="POST" modelAttribute="employee" id="newEmployeeForm">
	                                <div class="row">
	                                  <div class="col-sm-4">
	                                    <div class="form-group">
	                                      <form:label path="name"><spring:message text="Nombre(s)" /><span style="color:red;" data-toggle="tooltip" data-placement="right" title="Tooltip on right"> * </span></form:label>
	                                      <form:input path="name" data-name="name" type="text" class="form-control required-text" placeholder="Nombre(s)" tabindex="1"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-4 -->
	                                  <div class="col-sm-4">
	                                    <div class="form-group">
	                                      <form:label path="lastName1"><spring:message text="Apellido paterno" /><span style="color:red;">*</span></form:label>
	                                      <form:input path="lastName1" type="text" class="form-control required-text" placeholder="Apellido paterno" tabindex="1"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-4 -->
	                                  <div class="col-sm-4">
	                                    <div class="form-group">
	                                      <form:label path="lastName2"><spring:message text="Apellido materno" /><span style="color:red;">*</span></form:label>
	                                      <form:input type="text" path="lastName2" class="form-control required-text" placeholder="Apellido materno" tabindex="3"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-4 --> 	                                  	                                  
	                                </div><!-- .row -->

	                                <hr class="divider">
	                                
	                                <div class="row">
	                                  <div class="col-sm-3">
	                                    <div class="form-group" id="dob">
	                                      <form:label path="dateOfBirth"><spring:message text="Fecha de nacimiento" /><span style="color:red;">*</span></form:label>
      									  	<div class="input-group">
      									    	<form:input path="dateOfBirth" id="dateOfBirth" type="text" class="form-control input-small datepicker required-text" placeholder="Fecha de nacimiento" tabindex="4"/>
      									    	<div class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></div>
      									  	</div>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-2 -->  
	                                  <div class="col-sm-2">
	                                    <div class="form-group">
	                                       <form:label path="gender">Genero<span style="color:red;">*</span></form:label>
	                                       <form:select path="gender" id="gender" data-name="Genero" class="form-control required-select" tabindex="5">
	                                         <form:option value="">Genero</form:option>
	                                         <form:option value="1">Femenino</form:option>
	                                         <form:option value="2">Masculino</form:option>
	                                        </form:select><!-- .form-control -->
	                                    </div><!--. form-group input-group -->                         
	                                  </div><!-- .col-sm-2 -->
	                                  <div class="col-sm-3">
	                                    <div class="form-group">
	                                       <form:label path="maritalStatus">Estado civil</form:label>
	                                       <form:select path="maritalStatus" id="maritalStatus" data-name="Estado civil" class="form-control" tabindex="6">
	                                         <form:option value="">Estado civil</form:option>
	                                         <form:option value="1">Soltero</form:option>
	                                         <form:option value="2">Casado</form:option>
	                                        </form:select><!-- .form-control -->
	                                    </div><!--. form-group input-group -->                         
	                                  </div><!-- .col-sm-3 --> 
	                                  <div class="col-sm-4">
	                                    <div class="form-group">
	                                      <form:label path="religion">Religi&#243;n</form:label>
	                                      <form:input path="religion" type="text" class="form-control" id="religion" placeholder="Religi�n" tabindex="7"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-5 --> 	                                  	                                  	                                  	                                
	                                </div><!--  .row  -->
	                                
	                                <hr class="divider"> 
	                                
	                                <div class="row">
	                                  <div class="col-sm-3">
	                                    <div class="form-group">
	                                       <form:label path="bloodGroup.id">Grupo sanguineo<span style="color:red;">*</span></form:label>
	                                       <form:select path="bloodGroup.id" id="bloodGroup.id" data-name="Grupo sanguineo" class="form-control required-select" tabindex="8">
	                                         <option value="">Grupo sanguineo</option>
	                                         <form:option value="1">A</form:option>
	                                         <form:option value="2">B</form:option>
	                                         <form:option value="3">AB</form:option>
	                                         <form:option value="4">O</form:option>
	                                        </form:select><!-- .form-control -->
	                                    </div><!--. form-group input-group -->                         
	                                  </div><!-- .col-sm-3 -->
	                                  <div class="col-sm-3">
	                                    <div class="form-group">
	                                       <form:label path="rh">Rh<span style="color:red;">*</span></form:label>
	                                       <form:select path="rh" id="rh" class="form-control required-select" tabindex="9" data-name="Rh">
	                                         <form:option value="">Rh</form:option>
	                                         <form:option value="1">[+]</form:option>
	                                         <form:option value="2">[-]</form:option>
	                                       </form:select><!-- .form-control -->
	                                    </div><!--. form-group input-group -->                         
	                                  </div><!-- .col-sm-3 --> 
	                                  <div class="col-sm-6">
	                                    <div class="form-group">
	                                      <form:label path="originPlace">Lugar de origen</form:label>
	                                      <form:input path="originPlace" type="text" class="form-control" id="origin" placeholder="Lugar de origen" tabindex="10"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-6 --> 	                                  	                                  	                                
	                                </div><!-- .row -->
	                                
	                                <hr class="divider">
	                                
	                                <div class="row">
	                                  <div class="col-sm-4">
	                                    <div class="form-group">
	                                      <form:label path="address.street">Domicilio<span style="color:red;">*</span></form:label>
	                                      <form:input path="address.street" class="form-control required-text" placeholder="Domicilio" tabindex="11" />
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-4 -->	
	                                  <div class="col-sm-3">
	                                    <div class="form-group">
	                                      <form:label path="phone">Telefono<span style="color:red;">*</span></form:label>
	                                      <form:input path="phone" type="text" class="form-control required-text" name="phone" placeholder="Telefono" tabindex="12"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-3 --> 
	                                  <div class="col-sm-3">
	                                    <div class="form-group">
	                                      <form:label path="address.town">Delegaci&#243;n</form:label>
	                                      <form:input path="address.town" type="text" id="town" class="form-control required-text" placeholder="Delegaci�n" tabindex="13"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-3 -->	 
	                                  <div class="col-sm-2">
	                                    <div class="form-group">
	                                      <form:label path="address.zipcode">C&#243;digo postal</form:label>
	                                      <form:input path="address.zipcode" name="zipCode" type="text" id="zipCode" class="form-control required-text" placeholder="C�digo postal" tabindex="14"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-2 -->	                                                                   	                                                                  
	                                </div><!--  .row -->
	                                
	                                <hr class="divider">	
	                                
	                                <div class="row">
	                                  <div class="col-sm-6">
	                                    <div class="form-group">
	                                      <form:label path="contactName">Nombre de la persona de contacto<span style="color:red;">*</span></form:label>
	                                      <form:input path="contactName" type="text" class="form-control required-text" name="contactName" placeholder="Nombre de la persona de contacto" tabindex="15"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-6 -->  
	                                  <div class="col-sm-6">
	                                    <div class="form-group">
	                                      <form:label path="contactPhone">Telefono de la persona de contacto<span style="color:red;">*</span></form:label>
	                                      <form:input path="contactPhone" type="text" class="form-control required-text" name="contactPhone" placeholder="Telefono de la persona de contacto" tabindex="16"/>
	                                    </div><!-- .form-group -->                          
	                                  </div><!-- .col-sm-6 -->       
	                                </div><!-- .row -->  
	                                
	                                <hr class="divider">  
	                                
	                                <div class="row">
	                                 <div class="col-sm-6">
	                                   <div class="form-group">
	                                     <form:label path="area.id">Area<span style="color:red;">*</span></form:label>
	                                     <form:select path="area.id" class="form-control required-select" data-name="Area" tabindex="17">
	                                       <option value="">Area</option>
	                                       <c:forEach items = "${listAreas}" var="area">
		   								     <option value="${area.id}">${area.name}</option>
		   								   </c:forEach>
	                                     </form:select><!-- .form-control -->
	                                   </div><!-- .form-control -->                          
	                                 </div><!-- .col-sm-6 -->                                   
	                                </div><!-- .row -->	
	                                
	                                <hr class="divider"> 
	                                
	                                <form:hidden path="createdAt" value="2015-05-22" />
	                                <form:hidden path="createdBy" value="${userName}" />
	                                <form:hidden path="company.id" value ="${companyId }" />                               	                                
	                                
	                                <input type="submit" class="btn btn-block btn-primary" value="Generar Ficha de Identificaci�n" tabindex="18" />
                                
                                	</form:form>
                    			</div><!-- .panel-body -->
                    		</div><!-- .panel panel-default -->
                    	</div><!-- .tab-pane fade in active -->
                   	</div><!-- .tab-content -->			    
			    </div><!-- .row -->
			  </div><!-- .col-md-12 -->
			</div><!-- .container -->
			
      <!-- Footer -->
      <jsp:include page="layouts/footer_layout.jsp"></jsp:include>			
	
	</body>


    <c:if test="${!empty message }">
      <script>
        showMessage("${message}", "danger", "#myModal");
      </script>
    </c:if>

    <script>
      var current_date = new Date();
      $( ".datepicker" ).datepicker({
          changeMonth: true,
          changeYear: true,
          yearRange: "1900:" + new Date().getFullYear(),
          dateFormat: "yy-mm-dd",
          defaultDate: new Date()
      });       


    </script>

</html>