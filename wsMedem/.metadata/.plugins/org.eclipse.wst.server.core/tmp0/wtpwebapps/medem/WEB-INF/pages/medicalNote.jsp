<%@page session="true"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
  <html>
    <head>
      <meta charset="utf=8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
      <link href="bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
      <link href="css/general_layout_override.css" rel="stylesheet">
      <script src="bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
      <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
      <script src="js/main_functions.js"></script>
      <title>MEDEM :: Empleado :: Nueva Nota Medico</title>
    </head>

    <body id="medicalNote">

      <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>

      <div class="container">
        <div class="row">
          <div class="panel-body">
            <h1 class="page-header patient_name">
              Empleado
            </h1><!-- .page-header patient_name -->  
            <div class="panel-body">

              <ul class="nav nav-tabs">
                <li><a href="employeeShow?id=${employee_id}">Ficha de Identificaci&#243;n</a></li>
                <li><a href="workBackground?id=${employee_id}">Antecedentes Laborales</a></li>
                <li><a href="familyHistory?id=${employee_id}">Antecedentes Heredofamiliares</a></li>
                <li><a href="medicalRecord?id=${employee_id}">Historia Clinica</a></li>
                <li><a href="medicalExam?id=${employee_id}">Examenes Medicos</a></li>
                <li class="active"><a href="#">Notas Medicas</a></li>                
              </ul><!-- .nav nav-tabs -->

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

              <div class="tab-content">
                <div class="tab-pane fade in active" id="medicalExam">
                  <div class="panel-body">
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">Nota Medica</h4>  
                      </div><!-- .panel-heading -->

                      <form:form action="/medem/addMedicalNote" method="POST" modelAttribute="MedicalNote">

                        <div class="panel-body">
                        
                              <div class="panel panel-primary" id="medicalNoteType">
                                <div class="panel-heading">
                                  Tipo de Nota
                                </div><!-- .panel-heading -->
                                <div class="panel-body">
                                  <div class="row">
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="radio" name="type" value="1" /> Seguimiento
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="radio" name="type" value="2" /> Consulta
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                  </div><!-- .row -->
                                </div><!-- .panel-body -->
                              </div><!-- .panel panel-primay -->                          
                          

                              <div class="panel panel-primary" id="personalNonPatologicals">
                                <div class="panel-heading">
                                  Signos vitales
                                </div><!-- .panel-heading -->                        
                                <div class="panel-body">
                                  <div class="col-sm-6">
                                    <div class="panel panel-default">
                                      <div class="panel-body">
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="heartRate" class="col-sm-6">Frecuencia cardiaca:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="heartRate" name="heartRate" data-name="frecuencia cardiaca" placeholder="Latidos por minuto"/>
                                            </div><!-- .col-sm-4 -->                       
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->  
                                        <div class="form_divider"></div>    
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="bloodPressure" class="col-sm-6">Tensi&#243;n arterial:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="bloodPressure" name="bloodPressure" data-name="presion arterial" placeholder="mm/Hg"/>
                                            </div><!-- .col-sm-4 -->                      
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->  
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="respiratoryRate" class="col-sm-6">Frecuencia respiratoria:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="respiratoryRate" name="respiratoryRate" data-name="frecuencia respiratoria" placeholder="Respiraciones por minuto"/>
                                            </div><!-- .col-sm-4 -->                        
                                          </div><!-- .form-group -->
                                        </div><!-- .row --> 
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="temperature" class="col-sm-6">Temperatura:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="temperature" name="temperature" data-name="temperatura" placeholder="&#176;C"/>
                                            </div><!-- .col-sm-4 -->                      
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="weight" class="col-sm-6">Peso:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="weight" name="weight" data-name="peso" placeholder="kg"/>
                                            </div><!-- .col-sm-4 -->                      
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->        
                                      </div><!-- .panel-body -->
                                    </div>
                                  </div><!-- .col-sm-6 -->
                                  <div class="col-sm-6">
                                    <div class="panel panel-default">
                                      <div class="panel-body">
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="size" class="col-sm-6">Talla:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="size" name="size" data-name="talla" placeholder="m"/>
                                            </div><!-- .col-sm-4 -->                    
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->  
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="username" class="col-sm-6">IMC:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control" id="imc" name="username" placeholder="" readonly=true />
                                            </div><!-- .col-sm-4 -->                       
                                          </div><!-- .form-group -->
                                        </div><!-- .row --> 
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="waist" class="col-sm-6">Circunferencia de la cintura:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="waist" name="waist" data-name="circunferencia de cintura" placeholder="cm" />
                                            </div><!-- .col-sm-4 -->                       
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                            <label for="hips" class="col-sm-6">Circunferencia de la cadera:</label>
                                            <div class="col-sm-6">
                                              <input type="text" class="form-control required" id="hips" name="hips" data-name="circunferencia de cadera" placeholder="cm" />
                                            </div><!-- .col-sm-4 -->                       
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->        
                                        <div class="form_divider"></div>
                                        <div class="row">
                                          <div class="form-group">
                                           <label for="weightIndex" class="col-sm-6">Indice sobrepeso</label>
                                           <div class="col-sm-6">
                                             <select name="weightIndex" id="weightIndex" class="form-control" readonly=true tabindex="17">
                                               <option value=""></option>
                                               <option value="0">Sin Sobrepeso</option>
                                               <option value="1">Sobrepeso</option>
                                               <option value="2">Obesidad 1</option>
                                               <option value="3">Obesidad 2</option>
                                               <option value="4">Obesidad 3</option>
                                              </select><!-- .form-control --> 
                                            </div><!-- .col-sm-6 -->                    
                                          </div><!-- .form-group -->
                                        </div><!-- .row -->          
                                      </div><!-- .panel-body -->
                                    </div>
                                  </div><!-- .col-sm-6 -->  
                                </div><!-- .panel-body -->
                              </div><!-- .panel panel-primary -->

                              <div class="panel panel-primary">
                                <div class="panel-heading">
                                  Hallazgos exploraci&#243;n fisica
                                </div><!-- .panel-heading -->                        
                                <div class="panel-body">
                                  <label for="findings">Descripci&#243;n</label>
                                  <textarea class="form-control" rows="5" id="findings" name="findings"></textarea>
                                </div><!-- .panel-body -->
                              </div><!-- .panel panel-primary -->

                              <div class="panel panel-primary" id="examDiagnosis">
                                <div class="panel-heading">
                                  Diagn&#243;sticos
                                </div><!-- .panel-heading -->                        
                                <div class="panel-body">
                                  <div class="row">
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="checkbox" name="diagnosis" value="1" /> Sano
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="checkbox" name="diagnosis" value="2" /> Diabetes
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="checkbox" name="diagnosis" value="3" /> Hipertensi&#243;n
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="checkbox" name="diagnosis" value="4" /> Dislipidemia
                                      </label>
                                    </div><!-- .col-sm-2 -->
                                    <div class="col-sm-2">
                                      <label>
                                        <input type="checkbox" name="diagnosis" value="5" /> Otros
                                      </label>
                                    </div><!-- .col-sm-2 -->                                                     
                                  </div><!-- .row -->
                                  <div class="row">
                                    <div class="col-sm-12">
                                      <label for="username">Descripci&#243;n</label>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div>
                                  </div><!-- .row -->
                                </div><!-- .panel-body -->
                              </div><!-- .panel panel-primary -->

                              <div class="panel panel-primary">
                                <div class="panel-heading">
                                  An&#225;lisis
                                </div><!-- .panel-heading -->                        
                                <div class="panel-body">
                                  <label for="analisis">Descripci&#243;n</label>
                                  <textarea class="form-control required" rows="5" id="analisis" name="analisis" data-name="analisis"></textarea>
                                </div><!-- .panel-body -->                        
                              </div><!-- .panel panel-primary -->

                              <div class="panel panel-primary">
                                <div class="panel-heading">
                                  Tratamiento
                                </div><!-- .panel-heading -->                        
                                <div class="panel-body">
                                  <label for="treatment">Descripci&#243;n</label>
                                  <textarea class="form-control required" rows="5" id="treatment" name="treatment" data-name="tratamiento"></textarea>
                                </div><!-- .panel-body -->                        
                              </div><!-- .panel panel-primary --> 
                                                 
                              <input type="hidden" name="employee_id" value="${employee_id }" />
                              <button type="submit" class="btn btn-block btn-primary">Generar Nota Medica</button>                         

                            </form:form><!-- #newForm -->                        
                    </div><!-- .panel panel-default -->
                  </div><!-- .panel-body -->
                </div><!-- .tab-pane fade in active -->
              </div><!-- .tab-content -->

            </div><!-- .panel-body -->          
          </div><!-- .panel-body -->   
        </div><!-- . row -->
      </div><!-- .container -->  

      <script>
        var current_date = new Date();
        $( "#datepicker" ).datepicker({
          dateFormat: "dd-mm-yy",
          buttonImage: "https://ssl.mackinaw-city.com/newreservations/images/date-picker.png",
          defaultDate: current_date
        });                      
      </script>      

    </body>

  </html>