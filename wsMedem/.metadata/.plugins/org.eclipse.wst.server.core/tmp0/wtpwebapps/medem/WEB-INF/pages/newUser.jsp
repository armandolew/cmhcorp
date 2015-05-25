<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="bootstrap/bootstrap-3.3.2-dist/css/font-awesome.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="css/custom.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="js/main_functions.js"></script>
      <title>MEDEM :: Nuevo Usuario</title>
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
        <div id="navbarCollapse" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
            <li><a href="#">Link 3</a></li>
          </ul><!-- .nav navbar-nav -->
          <ul class="nav navbar-nav navbar-right">
            <li>
              <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-user fa-fw"></i>User</a>
              <ul class="dropdown-menu dropdown-user">
                <li>
                   <a href="#"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                </li>
              </ul><!-- .dropdown-menu dropdown-user -->              
            </li>
          </ul><!-- .nav navbar-nav navbar-right -->          
        </div><!-- #navbarCollapse --> 
      </nav><!-- .navbar navbar-default -->

      <div class="container">
        <div class="row">
          <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">Datos del Nuevo Usuario</h3>
              </div><!-- .panel-heading -->
              <div class="panel-body">

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

                  <form:form action="/medem/addUser" method="POST" modelAttribute="user" id="user">
                    <div class="form-group">
                      <label for="username" data-toggle="tooltip" data-original-title="[?] El nombre de usuario debe contener mas de 3 caracteres alfanumericos. No se deben incluir espacios en blanco.">Nombre de usuario</label>
                      <form:input type="text" class="form-control" path="username" name="username" placeholder="Nombre de usuario" tabindex="1" />
                    </div><!--. form-group input-group -->
                    
                    <div class="form-group">
                      <label for="password" data-toggle="tooltip" data-original-title="[?] El correo electronico debe contener mas de 3 caracteres y ser un correo electronico valido.">Password</label>
                      <form:input type="password" class="form-control" path="password" name="password" placeholder="Password" tabindex="3" />
                    </div><!--. form-group input-group --> 

                    <div class="form-group">
                      <label for="name" data-toggle="tooltip" data-original-title="[?] El nombre de usuario debe contener mas de 3 caracteres alfanumericos. No se deben incluir espacios en blanco.">Nombre</label>
                      <form:input type="text" class="form-control" path="name" name="name" placeholder="Nombre" tabindex="1" />
                    </div><!--. form-group input-group -->
                    
                    <div class="form-group">
                      <label for="lastName1" data-toggle="tooltip" data-original-title="[?] El nombre de usuario debe contener mas de 3 caracteres alfanumericos. No se deben incluir espacios en blanco.">Apellido paterno</label>
                      <form:input type="text" class="form-control" path="firstname" name="firstname" placeholder="Nombre" tabindex="1" />
                    </div><!--. form-group input-group -->
                    
                    <div class="form-group">
                      <label for="lastName2" data-toggle="tooltip" data-original-title="[?] El nombre de usuario debe contener mas de 3 caracteres alfanumericos. No se deben incluir espacios en blanco.">Apellido materno</label>
                      <form:input type="text" class="form-control" path="lastname" name="lastname" placeholder="Nombre" tabindex="1" />
                    </div><!--. form-group input-group -->                                        

                    <div class="form-group">
                      <label for="profesionalLicense" data-toggle="tooltip" data-original-title="[?] La cedula profesional debe contener mas de 5 caracteres numericos.">Cedula profesional</label>
                      <form:input type="text" class="form-control" path="profesionalLicense" name="profesionalLicense" placeholder="Cedula profesional" tabindex="2" />
                    </div><!--. form-group input-group --> 

                    <div class="form-group">
                      <label for="email" data-toggle="tooltip" data-original-title="[?] El correo electronico debe contener mas de 3 caracteres y ser un correo electronico valido.">Correo electronico</label>
                      <form:input type="text" class="form-control" path="email" name="email" placeholder="Correo electronico" tabindex="3" />
                    </div><!--. form-group input-group -->                                        

                    <div class="form-group">
                       <label for="companyId">Empresa</label>
                       <form:select path="companyId" id="companyId" class="form-control" tabindex="4" >
                            <form:option value="1">Comercial Mexicana</form:option>
                         <form:option value="2">Walmart</form:option>
                         <form:option value="3">Corte Ingl&eacute;s</form:option>
                         <form:option value="4">Farmacias del Ahorro</form:option>
                         <form:option value="5">Starbucks</form:option>
                       </form:select><!-- .form-control -->
                    </div><!--. form-group input-group --> 
					
					<form:hidden value="1" path="active" />                    

                    <button type="submit" class="btn btn-block btn-primary" tabindex="6">Crear Nuevo Usuario</button>
                  </form:form><!-- .form -->

              </div><!-- .panel-body -->
            </div><!-- .login-panel panel panel-default -->
          </div><!-- .col-md-4 col-md-offset-4 -->
        </div><!-- .row -->
      </div><!-- .container -->

    </body>
  </html>