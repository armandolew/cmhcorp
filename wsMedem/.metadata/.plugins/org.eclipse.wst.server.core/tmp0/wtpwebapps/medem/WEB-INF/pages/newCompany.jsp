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
      <title>MEDEM :: Empresa :: Nueva Empresa.</title>
    </head><!-- HEAD_END -->
    
    <body id="newCompany">
      <!-- Navigation -->
      <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
      
	  <jsp:include page="layouts/modal_layout.jsp"></jsp:include>   
      
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">
                  <span class="glyphicon glyphicon-pencil"></span> :: Datos de la nueva empresa
                </h3><!-- .panel-title-->
              </div><!-- .panel-heading -->
              <div class="panel-body">
                <form:form action="/medem/addCompany" method="POST" modelAttribute="company" id="newCompanyForm">
                  <div class="form-group">
                    <form:label path="name">Nombre de la empresa</form:label>
                    <form:input path="name" class="form-control required-text" placeholder="Nombre de la empresa" tabindex="1" />
                  </div><!-- .form-group -->
                  <div class="form-group">
                    <form:label path="bussinesName">Raz�n social</form:label>
                    <form:input path="bussinesName" class="form-control required-text" placeholder="Raz�n social" tabindex="2" />
                  </div><!-- .form-group -->
                  <div class="form-group">
                    <form:label path="employeeRegistration">Registro patronal</form:label>
                    <form:input path="employeeRegistration" class="form-control" placeholder="Registro patronal" tabindex="3" />
                  </div><!-- .form-group -->
		          <div class="form-group">
		            <label for="activitySelect">Giro/actividad</label>
		            <input name="activitySelect" id="activitySelect" class="form-control required-text" placeholder="Giro/actividad" tabindex="4" />
		            <form:hidden path="activity.id" id="activity.id" value="" />
		          </div><!-- .form-group -->     
                  <div class="form-group">
                    <form:label path="main_doctor">Doctor asignado:</form:label>
                    <form:select path="main_doctor" name="main_doctor" class="form-control" tabindex="5">
                      <form:option value="">Doctor asignado</form:option>
                      <form:options items="${usersAvailable}" itemValue="username" itemLabel="username" />
                    </form:select>
                  </div><!-- .form-group --> 	
                  <form:hidden path="createdAt" value="2002-03-30 23:45" ></form:hidden>
                  <form:hidden path="createdBy" value="${userName}"/>
                  <div class="form-group">
                    <input type="submit" class="btn btn-block btn-primary" value="Crear Nueva Empresa" tabindex="6" />
                  </div><!-- .form-group -->                  	                                         				  
                </form:form><!-- #newCompany -->
              </div><!-- .panel-body -->
            </div><!-- .panel panel-default -->
          </div><!-- .col-med-8 col-md-offset-2 -->
        </div><!-- .row -->
      </div><!-- .container -->
      
      <!-- Footer -->
      <jsp:include page="layouts/footer_layout.jsp"></jsp:include>
      
    </body><!-- BODY_END -->
    
    <c:if test="${not empty message }" >
      <script>
        showMessage("${message}", "danger", "#myModal");
      </script>
    </c:if>
    
    <script>
      $(document).ready(function(){
    	  console.log("Done.");
    	  
    	  $('#activitySelect').autocomplete({
    		  minLenght: 3,
    		  delay: 300,
			  source: function(request, response){
				  $.getJSON("${pageContext.request.contextPath}/getTags", request, function(result){
					 console.log(result);
					 response($.map(result, function(item){
					   return{
						   label: item.activity,
						   value: item.id
					   }	 
					 }));
				  });
			  },
    	  
    	  	  select: function(event, ui){
    	  		  event.preventDefault();
                  console.log(ui.item.value);
                  $("#activitySelect").val(ui.item.label);
                  //$("#activity.id").val(ui.item.value);
                  $("#newCompanyForm").find("input[name*='activity.id']").val(ui.item.value);
    	  		  return false;
    	  	  },
    	  	
    	  	  open: function(event, ui) {
                $(".ui-autocomplete").css("z-index", 1000);
              }
    		  
    	  });
    	  
      });
    </script>
  </html><!-- HTML_END -->