<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="_csrf" content="${_csrf.token}"/>
      <meta name="_csrf_header" content="${_csrf.headerName}"/>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="css/custom.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="js/main_functions.js"></script>
      <title>MEDEM :: Bienvenido</title>
      
      <style>
      .btn-file {
    position: relative;
    overflow: hidden;
}
.btn-file input[type=file] {
    position: absolute;
    top: 0;
    right: 0;
    min-width: 100%;
    min-height: 100%;
    font-size: 100px;
    text-align: right;
    filter: alpha(opacity=0);
    opacity: 0;
    outline: none;
    background: white;
    cursor: inherit;
    display: block;
}
      </style>
    </head>

    <body>

      <nav role="navigation" class="navbar navbar-default">
        <div class="navbar-header">
          <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button><!-- .navbar-toggle -->
          <a href="#" class="navbar-brand"><img src="imgs/logocmh.png" class="main_logo" alt="CMH Corp"/></a>
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

 
              <div class="panel-body">

<%-- 					<form:form method="POST" action="saveFile" modelAttribute="uploadForm" enctype="multipart/form-data"> --%>
<!-- 						<div class="input-group"> -->
<!-- 							<span class="input-group-btn"> -->
<!-- 								<span class="btn btn-primary btn-file"> -->
<!--                         			Browse: <input type="file" name="file"> -->
<!--                     			</span>.btn btn-primary btn-file								 -->
<!-- 							</span>.input-group-btn -->
<!-- 							<input type="text" class="form-control" readonly> -->
<!-- 						</div>.input-group -->
<!-- 						<button type="submit" class="btn btn-primary btn-lg">Subir</button> -->
<%-- 					</form:form> --%>

						<form:form method="POST" action="saveFile?_csrf=${_csrf.token}" modelAttribute="uploadForm" enctype="multipart/form-data">
 							<input type="file" name="file" />
 							<input type="hidden" name="employeeId" value="${employeeId }" />
							<input type="submit" class="btn btn-primary btn-lg" value="Subir" />
						</form:form>
				
              </div><!-- .panel-body -->
            </div><!-- .login-panel panel panel-default -->
          </div><!-- .col-md-4 col-md-offset-4 -->
        </div><!-- .row -->
      </div><!-- .container -->
    </body>
  </html>