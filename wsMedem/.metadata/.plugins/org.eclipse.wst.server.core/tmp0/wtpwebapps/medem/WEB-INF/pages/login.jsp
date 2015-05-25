<!DOCTYPE>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="css/custom.css" rel="stylesheet">
      <link href="css/general_layout_override.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="js/main_functions.js"></script>
      <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
      <script type='text/javascript' src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/additional-methods.js"></script>
      <title>MEDEM :: Bienvenido</title>
    </head>

    <body id="login" onload="document.loginForm.username.focus();">

      <nav class="navbar navbar-default" role="navigation">
        <!-- csrt for log out-->
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
          <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>

        <div class="navbar-header">
            <a class="navbar-brand" href="http://www.jquery2dotnet.com">MEDEM</a>       
        </div><!-- .navbar-header -->
      </nav><!-- .navbar navbar-default -->

      <div class="container">
        <div class="row">
          <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">MEDEM :: Bienvenido</h3>
              </div><!-- .panel-heading --> 
              
              <div id="myModal" class="modal fade">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header modal-header-danger">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title"><i class="fa fa-warning"></i> Atenci&#243;n</h4>                          
                    </div><!-- .modal-header -->
                    <div class="modal-body">
                      <p></p>
                    </div><!-- .modal-body -->
                  </div><!-- .modal-content -->
                </div><!-- .modal-dialog -->
              </div><!-- .modal fade -->

              <c:if test="${not empty error}">
                <!--<div class="error">${error}</div>-->
                <script>
                  showMessage("${error}", "danger", "#myModal");
                </script>
              </c:if>

              <c:if test="${not empty msg}">
                <!--<div class="msg">${msg}</div>-->
                <script>
                  showMessage("${msg}", "success", "#myModal");
                </script>                
              </c:if>              


              <div class="panel-body">
                <form id="loginForm" name="loginForm" action="<c:url value='j_spring_security_check'/>" method="POST" onsubmit="return validateLoginForm(this);">

                  <div class="form-group">
                    <label for="username">Nombre de usuario:</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Nombre de usuario"/>
                  </div><!--. form-group input-group -->

				  <div class="form-group">
				    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password"/>
                  </div><!--. form-group input-group --> 

                  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />                  

                  <button type="submit" class="btn btn-block btn-primary">Ingrese</button>
                </form>  

              </div><!-- .panel-body -->
            </div><!-- .login-panel panel panel-default -->
          </div><!-- .col-md-4 col-md-offset-4 -->
        </div><!-- .row -->
      </div><!-- .container -->
    </body>
  </html>