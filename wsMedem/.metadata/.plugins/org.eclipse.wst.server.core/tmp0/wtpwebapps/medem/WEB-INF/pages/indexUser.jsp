<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="css/custom.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="js/main_functions.js"></script>
      <title>MEDEM :: Usuarios</title>
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
          <a href="#" class="navbar-brand"><img src="../../imgs/logocmh.png" class="main_logo" alt="CMH Corp"/></a>
        </div><!-- .navbar-header -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Login</a></li>
          </ul><!-- .nav navbar-nav navbar-right -->          
        </div><!-- #navbarCollapse --> 
      </nav><!-- .navbar navbar-default -->

      <div class="container">
        <div class="row">
          <div class="col-md-10 col-md-offset-1">
            <div class="login-panel panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">Busqueda</h3>
              </div><!-- .panel-heading -->
              <div class="panel-body">
                <div id="myModal" class="modal fade">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title"><i class="fa fa-warning"></i> Atenci&#243;n</h4>                          
                      </div><!-- .modal-header -->
                      <div class="modal-body">
                        <p></p>
                      </div><!-- .modal-body -->
                    </div><!-- .modal-content -->
                  </div><!-- .modal-dialog -->
                </div><!-- .modal fade -->

                <form id="searchForm" action="dashboard.html" method="post" onsubmit="return validateSearchForm(this);">
                  <div class="row">
                    <div class="col-sm-8">
                      <input type="text" class="form-control" id="searchValue" name="searchValue" placeholder="Introduzca informaci&#243;n a buscar" />
                    </div><!-- .col-sm-8 -->
                    <div class="col-sm-4">
                      <button type="submit" class="btn btn-primary">
                        <i class="fa fa-search"></i> Buscar
                      </button>
                    </div><!-- .col-sm-4 -->
                  </div><!-- .row -->
                </form>  

                <div class="form_separator"></div>
                <div class="panel panel-primary">
                  <div class="panel-heading">
                    Resultados
                  </div><!-- .panel-heading -->  
                  <div class="panel-body">
                    <table class="table table-striped table-bordered table-condensed">
                      <thead>
                        <tr>
                          <th>Nombre</th>
                          <th>Apellido paterno</th>
                          <th>Apellido materno</th>
                          <th>Area</th>
                        </tr>  
                      </thead>
                      <tbody>
                        <tr>
                          <td>Nombre</td>
                          <td>Apellido</td>
                          <td>Apellido</td>
                          <td>Ropa</td>
                        </tr>
                        <tr>
                          <td>Nombre</td>
                          <td>Apellido</td>
                          <td>Apellido</td>
                          <td>Ropa</td>
                        </tr>
                        <tr>
                          <td>Nombre</td>
                          <td>Apellido</td>
                          <td>Apellido</td>
                          <td>Ropa</td>
                        </tr>                                                
                      </tbody>
                    </table>
                  </div><!-- .panel-body -->                 
                </div><!-- .panel panel-primary -->
              </div><!-- .panel-body -->
            </div><!-- .login-panel panel panel-default -->

          </div><!-- .col-md-4 col-md-offset-4 -->
        </div><!-- .row -->  
      </div><!-- .container -->
    </body>
  </html>