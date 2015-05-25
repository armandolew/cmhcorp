<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!DOCTYPE>
	<html>
		<head>
			<meta charset="utf=8">
      		<meta name="viewport" content="width=device-width, initial-scale=1.0">
      		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      		<script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      		<script src="js/morris.js-0.5.1/raphael-min.js"></script>
      		<script src="js/morris.js-0.5.1/morris.min.js"></script>
      		<link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      		<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
			<link href="css/general_layout_override.css" rel="stylesheet">
			<link rel="stylesheet" href="js/morris.js-0.5.1/morris.css">
			<script src="js/main_functions.js"></script>
      		<title>MEDEM :: Reporte</title>
		</head>
		
		<body id="reportCharts">
		
			<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
			
			<div class="container">
			  <div class="col-md-12">
			    <div class="row">
			      <div class="panel panel-default">
			        <div class="panel-heading">
			          <h3 class="panel-title">Reportes <b>${user.username }</b></h3>
			        </div>
			        <div class="panel-body">
					  <div id="myfirstchart" style="height: 250px;"></div><!-- #myfirstchart--> 		          
			        </div><!-- .panel-body -->
			      </div><!-- .panel panel-default -->
			    </div><!--  .row -->
			  </div><!-- .col-md-12 -->
			</div>	
			
			<jsp:include page="layouts/footer_layout.jsp"></jsp:include>
			
            <div id="myModal" class="modal fade">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header modal-header-danger">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"><i class="fa fa-warning"></i> Cargando</h4>                          
                  </div><!-- .modal-header -->
                  <div class="modal-body">
                    <p></p>
                  </div><!-- .modal-body -->
                </div><!-- .modal-content -->
              </div><!-- .modal-dialog -->
            </div><!-- .modal fade" -->
		
		</body>

		<script>
          generateLineGraph = function(){
            Morris.Donut({
              element: "myfirstchart",
              data:[
                { label: 'Diabetes', value: 20 },
                { label: 'Hipertension', value: 10 },
                { label: 'Dislipidemia', value: 5 },
                { label: 'Sanos', value: 5 },
                { label: 'Otras', value: 50 }
              ],
              colors:[
                "#43AEA8",
                "#60B1CC",
                "#DF6A78",
                "#DF6A78",
                "#F4AD49"
              ],
              labelColor: '#000',
              resize: true
            });
          }
        
          generateLineGraph();
      </script>
	</html>
