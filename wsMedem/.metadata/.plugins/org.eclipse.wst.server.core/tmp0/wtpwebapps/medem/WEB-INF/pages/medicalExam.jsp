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
      <title>MEDEM :: Empleado :: Nuevo Examen Medico</title>
    </head>

    <body id="medicalExam">

      <jsp:include page="layouts/navigation_layout.jsp"></jsp:include>

      <div class="container">
        <div class="row">
          <div class="panel-body">
            <h1 class="page-header patient_name">
              ${employee.name } ${employee.lastName1 } ${employee.lastName2}
            </h1><!-- .page-header patient_name -->  
            <div class="panel-body">

              <ul class="nav nav-tabs">
                <li><a href="employeeShow?id=${employee.getId()}">Ficha de Identificaci&#243;n</a></li>
                <li><a href="workBackground?id=${employee.getId()}">Antecedentes Laborales</a></li>
                <li><a href="familyHistory?id=${employee.getId()}">Antecedentes Heredofamiliares</a></li>
                <li><a href="medicalRecord?id=${employee.getId()}">Historia Clinica</a></li>
                <li class="active"><a href="#">Examenes Medicos</a></li>
                <li><a href="medicalNote?id=${employee.getId()}">Notas Medicas</a></li>                
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
                          <h4 class="panel-title">Examen Medico</h4>  
                        </div><!-- .panel-heading -->

                        <div class="panel-body">
                            <div class="panel-group" id="accordion">
                              <form:form action="/medem/addMedicalExam" method="POST" modelAttribute="MedicalExam">

                                <div class="panel panel-primary" id="type">
                                  <div class="panel-heading">
                                    <h4 class="panel-title">
                                      <a data-toggle="collapse" data-parent="#accordion" href="#accordionZero">Tipo de Examen</a>
                                    </h4>
                                  </div><!-- .panel-heading -->

                                  <div id="accordionZero" class="panel-collapse collapse">
                                    <div class="panel-body">
                                      <div class="row">
                                        <div class="col-sm-2">
                                          <form:label path="type">
                                            <form:radiobutton path="type" value="1" /> Consulta
                                          </form:label>
                                        </div><!-- .col-sm-2 -->
                                        <div class="col-sm-2">
                                          <form:label path="type">
                                            <form:radiobutton path="type" value="2" /> Seguimiento
                                          </form:label>
                                        </div><!-- .col-sm-2 -->
                                      </div><!-- .row -->                                      
                                    </div><!-- .panel-body -->
                                  </div><!-- accordionZero -->
                                </div><!-- #type -->

                                <div class="panel panel-primary" id="motive">
                                  <div class="panel-heading">
                                    <h4 class="panel-title">
                                      <a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
                                        Motivo
                                      </a>
                                    </h4>
                                  </div>   <!-- panel-heading -->

                                  <div id="accordionOne" class="panel-collapse collapse">
                                      <div class="panel-body">
                                        <div class="row">
                                          <div class="col-sm-2">
                                            <form:label path="motive">
                                              <form:radiobutton path="motive" value="1" /> Periodico
                                            </form:label>
                                          </div><!-- .col-sm-2 -->
                                          <div class="col-sm-2">
                                            <form:label path="motive">
                                              <form:radiobutton path="motive" value="2" /> Cambio de puesto
                                            </form:label>
                                          </div><!-- .col-sm-2 -->
                                          <div class="col-sm-2">
                                            <form:label path="motive">
                                              <form:radiobutton path="motive" value="3" /> Egreso
                                            </form:label>
                                          </div><!-- .col-sm-2 -->
                                          <div class="col-sm-2">
                                            <form:label path="motive">
                                              <form:radiobutton path="motive" value="4" /> Post exposicion
                                            </form:label>
                                          </div><!-- .col-sm-2 -->
                                        </div><!-- .row -->                                         
                                      </div><!-- panel-body -->
                                  </div><!-- #accordionOne -->                               
                                </div><!-- #motive -->

                                <div class="panel panel-primary" id="physicalExploration">
                                  <div class="panel-heading">
                                    <h4 class="panel-title">
                                      <a data-toggle="collapse" data-parent="#accordion" href="#accordionTwo">
                                        Signos vitales
                                      </a>
                                    </h4>
                                  </div>   <!-- panel-heading -->

                                  <div id="accordionTwo" class="panel-collapse collapse">
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
                                  </div><!-- #accordionOne -->                               
                                </div><!-- #physicalExploration -->   

                                <div class="panel panel-primary" id="findings">
                                  <div class="panel-heading">
                                    <h4 class="panel-title">
                                      <a data-toggle="collapse" data-parent="#accordion" href="#accordionThree">
                                        Hallazgos Exploracion Fisica
                                      </a>
                                    </h4>
                                  </div>
                                  <div id="accordionThree" class="panel-collapse collapse">
                                    <div class="panel-body">
                                      <div class="form-group">
                                        <label for="findings" data-toggle="tooltip" data-original-title="[?] El nombre de usuario debe contener mas de 3 caracteres alfanumericos. No se deben incluir espacios en blanco.">Descripci&#243;n</label>
                                         <textarea class="form-control" rows="5" id="findings" name="findings"></textarea>
                                      </div><!-- .form-group -->                                    
                                    </div>
                                  </div>                              
                                </div><!-- #findings --> 



                                <div class="panel panel-primary" id="diagnoses">
                                  <div class="panel-heading">
                                    <h4 class="panel-title">
                                      <a data-toggle="collapse" data-parent="#accordion" href="#accordionSeven">
                                        Diagnósticos
                                      </a>
                                    </h4>
                                  </div>
                                  <div id="accordionSeven" class="panel-collapse collapse">
                                    <div class="panel-body">
                                      <div class="row">

                                          <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="false">

                                              <div class="col-md-4">

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingOne">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                          Anexos <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Alopecia</td>
                                                              <td><input name="annexes" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Onicocriptosis</td>
                                                              <td><input name="annexes" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Onicomicosis</td>
                                                              <td><input name="annexes" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Pediculosis</td>
                                                              <td><input name="annexes" type="checkbox" value="4" /></td>
                                                            </tr>             
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTwo">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                                                          Cardiovascular <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Angina estable</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Angina inestable</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Hipertensión</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Hipotensión ortostástica</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Infarto agudo de miocardio</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="5" /></td>
                                                            </tr>  
                                                            <tr>
                                                              <td>Insuficiencia venosa periférica</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="6" /></td>
                                                            </tr>  
                                                            <tr>
                                                              <td>Dolor precordial</td>
                                                              <td><input name="cardiovascular" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                          </tbody>
                                                        </table>

                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->                                              

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingThree">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="true" aria-controls="collapseThree">
                                                          Dermatológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Absceso cutáneo</td>
                                                              <td><input name="dermatological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Acné</td>
                                                              <td><input name="dermatological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cloasma</td>
                                                              <td><input name="dermatological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Dermatitis</td>
                                                              <td><input name="dermatological" type="checkbox" value="4" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Dermatitis de contacto</td>
                                                              <td><input name="dermatological" type="checkbox" value="5" /></td>
                                                            </tr>   
                                                            <tr>
                                                              <td>Dermatosis</td>
                                                              <td><input name="dermatological" type="checkbox" value="6" /></td>
                                                            </tr>             
                                                            <tr>
                                                              <td>Exantema súbito</td>
                                                              <td><input name="dermatological" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Herpes zoster</td>
                                                              <td><input name="dermatological" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Miliaria</td>
                                                              <td><input name="dermatological" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Mordedura o picadura de insectos</td>
                                                              <td><input name="dermatological" type="checkbox" value="10" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Prurigo por insecto</td>
                                                              <td><input name="dermatological" type="checkbox" value="11" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Quemadura de primer grado</td>
                                                              <td><input name="dermatological" type="checkbox" value="12" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Quemadura de segundo grado</td>
                                                              <td><input name="dermatological" type="checkbox" value="13" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Quemadura de tercer grado</td>
                                                              <td><input name="dermatological" type="checkbox" value="14" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Quemadura solar</td>
                                                              <td><input name="dermatological" type="checkbox" value="15" /></td>
                                                            </tr> 
                                                          </tbody>
                                                        </table>

                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingFour">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
                                                          Digestivo <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Amebiasis</td>
                                                              <td><input name="digestive" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Candidiasis</td>
                                                              <td><input name="digestive" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Colecistitis aguda</td>
                                                              <td><input name="digestive" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Colecistitis crónica</td>
                                                              <td><input name="digestive" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Constipación</td>
                                                              <td><input name="digestive" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Dispepsia funcional</td>
                                                              <td><input name="digestive" type="checkbox" value="6" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Enfermedad ácido péptica</td>
                                                              <td><input name="digestive" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Enfermedad por reflujo gastroesofágico</td>
                                                              <td><input name="digestive" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Enterobiasis</td>
                                                              <td><input name="digestive" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Esofagitis</td>
                                                              <td><input name="digestive" type="checkbox" value="10" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Gastritis</td>
                                                              <td><input name="digestive" type="checkbox" value="11" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Gastroenteritis probablemente infecciosa</td>
                                                              <td><input name="digestive" type="checkbox" value="12" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Hemorragia de tubo digestivo alto</td>
                                                              <td><input name="digestive" type="checkbox" value="13" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Hemorragia de tubo digestivo bajo</td>
                                                              <td><input name="digestive" type="checkbox" value="14" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Oxiuriasis</td>
                                                              <td><input name="digestive" type="checkbox" value="15" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Parasitosis, pb</td>
                                                              <td><input name="digestive" type="checkbox" value="16" /></td>
                                                            </tr>             
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingFive">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="true" aria-controls="collapseFive">
                                                          Genitourinario <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Cistitis</td>
                                                              <td><input name="genitourinary" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Infección genitourinaria</td>
                                                              <td><input name="genitourinary" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Litiasis renal</td>
                                                              <td><input name="genitourinary" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Pielonefritis</td>
                                                              <td><input name="genitourinary" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Uretritis</td>
                                                              <td><input name="genitourinary" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                          </tbody>
                                                        </table>

                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingSix">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseSix" aria-expanded="true" aria-controls="collapseSix">
                                                          Ginecológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Amenorrea secundaria</td>
                                                              <td><input name="gynecological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cervicovaginitis</td>
                                                              <td><input name="gynecological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Dismenorrea</td>
                                                              <td><input name="gynecological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Mastodinia</td>
                                                              <td><input name="gynecological" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Mastopatía fibroquística</td>
                                                              <td><input name="gynecological" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Menstruación irregular</td>
                                                              <td><input name="gynecological" type="checkbox" value="6" /></td>
                                                            </tr>   
                                                            <tr>
                                                              <td>Síndrome de Ovario Poliquístico</td>
                                                              <td><input name="gynecological" type="checkbox" value="7" /></td>
                                                            </tr>     
                                                            <tr>
                                                              <td>Vaginitis aguda</td>
                                                              <td><input name="gynecological" type="checkbox" value="8" /></td>
                                                            </tr>                                                                                                                                                                    
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingSeven">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseSeven" aria-expanded="true" aria-controls="collapseSeven">
                                                          Hematológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseSeven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSeven">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Anemia ferropenica</td>
                                                              <td><input name="hematological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Anemia normocitica normocromica</td>
                                                              <td><input name="hematological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Anemia, otras</td>
                                                              <td><input name="hematological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Trastornos de la coagulación</td>
                                                              <td><input name="hematological" type="checkbox" value="4" /></td>
                                                            </tr>
                                                          </tbody>

                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingEight">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseEight" aria-expanded="true" aria-controls="collapseEight">
                                                          Inmunológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseEight" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEight">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Alergia alimentaria</td>
                                                              <td><input name="immune" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Alergia medicamentosa</td>
                                                              <td><input name="immune" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Asma</td>
                                                              <td><input name="immune" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Atopia</td>
                                                              <td><input name="immune" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Rinitis alérgica</td>
                                                              <td><input name="immune" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Urticaria</td>
                                                              <td><input name="immune" type="checkbox" value="6" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->                                                                                                                                                                                                                                      


                                              </div><!-- .col-md-4 -->

                                              <div class="col-md-4">

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingNine">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseNine" aria-expanded="true" aria-controls="collapseNine">
                                                          Metabólico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseNine" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingNine">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Acantosis nigricans</td>
                                                              <td><input name="metabolic" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Deshidratación</td>
                                                              <td><input name="metabolic" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Diabetes mellitus</td>
                                                              <td><input name="metabolic" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Diabetes, otras</td>
                                                              <td><input name="metabolic" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Dislipidemia mixta</td>
                                                              <td><input name="metabolic" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Golpe de calor</td>
                                                              <td><input name="metabolic" type="checkbox" value="6" /></td>
                                                            </tr>                                                              
                                                            <tr>
                                                              <td>Gota</td>
                                                              <td><input name="metabolic" type="checkbox" value="7" /></td>
                                                            </tr>   
                                                            <tr>
                                                              <td>Hipercolesterolemia</td>
                                                              <td><input name="metabolic" type="checkbox" value="8" /></td>
                                                            </tr>  
                                                            <tr>
                                                              <td>Hipertrigliceridemia</td>
                                                              <td><input name="metabolic" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Hiperuricemia</td>
                                                              <td><input name="metabolic" type="checkbox" value="10" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Hipotiroidismo</td>
                                                              <td><input name="metabolic" type="checkbox" value="11" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Intoxicación</td>
                                                              <td><input name="metabolic" type="checkbox" value="12" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Insolación</td>
                                                              <td><input name="metabolic" type="checkbox" value="13" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Obesidad endógena</td>
                                                              <td><input name="metabolic" type="checkbox" value="14" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Obesidad exógena</td>
                                                              <td><input name="metabolic" type="checkbox" value="15" /></td> 
                                                            </tr>
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTen" aria-expanded="true" aria-controls="collapseTen">
                                                          Neurológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Cefalea</td>
                                                              <td><input name="neurological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cefalea tensional</td>
                                                              <td><input name="neurological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Crisis convulsiva</td>
                                                              <td><input name="neurological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Epilepsia</td>
                                                              <td><input name="neurological" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Insomnio</td>
                                                              <td><input name="neurological" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Migraña</td>
                                                              <td><input name="neurological" type="checkbox" value="6" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Neuralgia de trigémino</td>
                                                              <td><input name="neurological" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Neuropatia diabetica</td>
                                                              <td><input name="neurological" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Vértigo de origen central</td>
                                                              <td><input name="neurological" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Vértigo de origen periérico</td>
                                                              <td><input name="neurological" type="checkbox" value="10" /></td>
                                                            </tr>                                                  
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingEleven">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseEleven" aria-expanded="true" aria-controls="collapseEleven">
                                                          Obstétrico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseEleven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEleven">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Amenaza de aborto</td>
                                                              <td><input name="obstetric" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Embarazo</td>
                                                              <td><input name="obstetric" type="checkbox" value="2" /></td>
                                                            </tr>
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTwelve">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwelve" aria-expanded="true" aria-controls="collapseTwelve">
                                                          Ocupacional <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTwelve" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwelve">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Exposicición ocupacional a radiaciones</td>
                                                              <td><input name="occupational" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a otros factores de riesgo</td>
                                                              <td><input name="occupational" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a polvos</td>
                                                              <td><input name="occupational" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a ruido</td>
                                                              <td><input name="occupational" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a temperaturas extremas</td>
                                                              <td><input name="occupational" type="checkbox" value="5" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a tóxicos</td>
                                                              <td><input name="occupational" type="checkbox" value="6" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Exposición ocupacional a vibraciones</td>
                                                              <td><input name="occupational" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingThirteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseThirteen" aria-expanded="true" aria-controls="collapseThirteen">
                                                          Odontológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseThirteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThirteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Absceso periamigdalino</td>
                                                              <td><input name="dental" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Anodoncia</td>
                                                              <td><input name="dental" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Caries dental</td>
                                                              <td><input name="dental" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Gingivitis</td>
                                                              <td><input name="dental" type="checkbox" value="4" /></td>
                                                            </tr>
                                                          </tbody>
                                                        </table>

                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingFourteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFourteen" aria-expanded="true" aria-controls="collapseFourteen">
                                                          Oftalmológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseFourteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFourteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Blefaritis</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Astenia</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Blefaroconjuntivitis</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Catarata</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Chalazión</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Conjuntivitis</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="6" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Corrosión</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="7" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cuerpo extraño en ojo</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="8" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Estrabismo</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="9" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Glaucoma</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="10" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Hemorragia conjuntival</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="11" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Hipermetropia</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="12" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Miopía</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="13" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Orzuelo</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="14" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Presbicia</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="15" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Pterigión</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="16" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Queratitis</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="17" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Queratoconjuntivitis</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="18" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Síndrome de ojo rojo</td>
                                                              <td><input name="ophthalmological" type="checkbox" value="19" /></td>
                                                            </tr>
                                                          </tbody>
                                                        </table>

                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->                                               

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingFifteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFifteen" aria-expanded="true" aria-controls="collapseFifteen">
                                                          Ortopédico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseFifteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFifteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Acortamiento de miembro pélvico</td>
                                                              <td><input name="orthopedic" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cervicalgia</td>
                                                              <td><input name="orthopedic" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Ciática</td>
                                                              <td><input name="orthopedic" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cifosis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Contractura muscular</td>
                                                              <td><input name="orthopedic" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Costocondritis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="6" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Desgarro muscular</td>
                                                              <td><input name="orthopedic" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Distensión muscular</td>
                                                              <td><input name="orthopedic" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Dolor torácico</td>
                                                              <td><input name="orthopedic" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Dorsalgia</td>
                                                              <td><input name="orthopedic" type="checkbox" value="10" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Escoliosis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="11" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Espolón calcáneo</td>
                                                              <td><input name="orthopedic" type="checkbox" value="12" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Gonartrosis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="13" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Hallux valgus</td>
                                                              <td><input name="orthopedic" type="checkbox" value="14" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Lordosis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="15" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Mialgia</td>
                                                              <td><input name="orthopedic" type="checkbox" value="16" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Pie plano</td>
                                                              <td><input name="orthopedic" type="checkbox" value="17" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Quiste sinovial</td>
                                                              <td><input name="orthopedic" type="checkbox" value="18" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Síndrome de hombro doloroso</td>
                                                              <td><input name="orthopedic" type="checkbox" value="19" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Síndrome del tunel del carpo</td>
                                                              <td><input name="orthopedic" type="checkbox" value="20" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Sinovitis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="21" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Tendinitis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="22" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Tendinitis rotuliana</td>
                                                              <td><input name="orthopedic" type="checkbox" value="23" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Tenosinovitis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="24" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Tortícolis</td>
                                                              <td><input name="orthopedic" type="checkbox" value="25" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 



                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingSixteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseSixteen" aria-expanded="true" aria-controls="collapseSixteen">
                                                          Otorrinolaringológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseSixteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSixteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Barotrauma ótico</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cerumen impactado</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Cuerpo extraño en oído</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="3" /></td>
                                                            </tr>                                                              
                                                            <tr>
                                                              <td>Hipoacusia conductiva</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Hipoacusia neurosensorial</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Mastoiditis aguda</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="6" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Otitis externa</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Otitis media no supurativa</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Otitis media supurativa</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Timpanosclerosis</td>
                                                              <td><input name="otolaryngology" type="checkbox" value="10" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default -->                                                                                                                                                                                                                                                                                     

                                              </div><!-- .col-md-4 -->

                                              <div class="col-md-4">


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingSeventeen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseSeventeen" aria-expanded="true" aria-controls="collapseSeventeen">
                                                          Psicológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseSeventeen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSeventeen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Alcoholismo</td>
                                                              <td><input name="psychological" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Anorexia</td>
                                                              <td><input name="psychological" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Bulimia</td>
                                                              <td><input name="psychological" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Crisis conversiva</td>
                                                              <td><input name="psychological" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Crisis de ansiedad</td>
                                                              <td><input name="psychological" type="checkbox" value="5" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Tabaquismo</td>
                                                              <td><input name="psychological" type="checkbox" value="6" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Toxicomanías</td>
                                                              <td><input name="psychological" type="checkbox" value="7" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingEighteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseEighteen" aria-expanded="true" aria-controls="collapseEighteen">
                                                          Respiratorio <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseEighteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingEighteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Amigdalitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Bronquitis aguda</td>
                                                              <td><input name="respiratory" type="checkbox" value="2" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Bronquitis crónica</td>
                                                              <td><input name="respiratory" type="checkbox" value="3" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Enfermedad Pulmonar Obstructiva Crónica</td>
                                                              <td><input name="respiratory" type="checkbox" value="4" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Faringitis aguda</td>
                                                              <td><input name="respiratory" type="checkbox" value="5" /></td>
                                                            </tr>   
                                                            <tr>
                                                              <td>Faringoamigdalitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="6" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Laringitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="7" /></td>
                                                            </tr>  
                                                            <tr>
                                                              <td>Rinitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="8" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Rinitis vasomotora</td>
                                                              <td><input name="respiratory" type="checkbox" value="9" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Rinofaringitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="10" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Sinusitis</td>
                                                              <td><input name="respiratory" type="checkbox" value="11" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Sinusitis aguda</td>
                                                              <td><input name="respiratory" type="checkbox" value="12" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Traqueítis</td>
                                                              <td><input name="respiratory" type="checkbox" value="13" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 

                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingNineteen">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseNineteen" aria-expanded="true" aria-controls="collapseNineteen">
                                                          Reumatológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseNineteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingNineteen">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Artritis</td>
                                                              <td><input name="rheumatologic" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Osteoartrosis</td>
                                                              <td><input name="rheumatologic" type="checkbox" value="2" /></td>
                                                            </tr>                      
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTwente">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwente" aria-expanded="true" aria-controls="collapseTwente">
                                                          Sano <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTwente" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwente">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Sano</td>
                                                              <td><input name="healthy" type="checkbox" value="1" /></td>
                                                            </tr>                     
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTwenteOne">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwenteOne" aria-expanded="true" aria-controls="collapseTwenteOne">
                                                          Traumatológico <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTwenteOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwenteOne">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Abulsión</td>
                                                              <td><input name="trauma" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Amputación</td>
                                                              <td><input name="trauma" type="checkbox" value="2" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Contusión</td>
                                                              <td><input name="trauma" type="checkbox" value="3" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Esguince cervical</td>
                                                              <td><input name="trauma" type="checkbox" value="4" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Esguince de muñeca</td>
                                                              <td><input name="trauma" type="checkbox" value="5" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Esguince de tobillo</td>
                                                              <td><input name="trauma" type="checkbox" value="6" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Fractura expuesta</td>
                                                              <td><input name="trauma" type="checkbox" value="7" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Fractura, descartar</td>
                                                              <td><input name="trauma" type="checkbox" value="8" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Herida contusa</td>
                                                              <td><input name="trauma" type="checkbox" value="9" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Herida cortante</td>
                                                              <td><input name="trauma" type="checkbox" value="10" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Trauma acústico</td>
                                                              <td><input name="trauma" type="checkbox" value="11" /></td>
                                                            </tr>                                                                              
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 


                                                  <div class="panel panel-default">
                                                    <div class="panel-heading" role="tab" id="headingTwenteTwo">
                                                      <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwenteTwo" aria-expanded="true" aria-controls="collapseTwenteTwo">
                                                          Urgencia <b class="caret"></b>
                                                        </a>
                                                      </h4>                                                
                                                    </div><!-- #headingOne -->
                                                    <div id="collapseTwenteTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwenteTwo">
                                                      <div class="panel-body">
                                                        <table class="table">
                                                          <tbody>
                                                            <tr>
                                                              <td>Cuerpo extraño en faringe</td>
                                                              <td><input name="urgency" type="checkbox" value="1" /></td>
                                                            </tr>
                                                            <tr>
                                                              <td>Epistaxis</td>
                                                              <td><input name="urgency" type="checkbox" value="2" /></td>
                                                            </tr> 
                                                            <tr>
                                                              <td>Otros</td>
                                                              <td><input name="urgency" type="checkbox" value="3" /></td>
                                                            </tr>                       
                                                          </tbody>
                                                        </table>
                                                      </div><!-- .panel-body -->
                                                    </div><!-- #collapseOne -->
                                                  </div><!-- . panel panel-default --> 
                                              </div><!-- .col-md-4 -->                                             
                                          </div><!-- #accordion.panel-group -->
                                                                 
                                      </div><!-- .row -->                                  
                                    </div><!-- .panel-body -->
                                  </div>                              
                                </div><!-- #diagnoses -->



                                  <div class="panel panel-primary" id="analisis">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#accordionFive">
                                          An&#225;lisis
                                        </a>
                                      </h4>
                                    </div>
                                    <div id="accordionFive" class="panel-collapse collapse">
                                      <div class="panel-body">
                                        <div class="form-group">
                                          <form:label path="analisis">Descripci&#243;n</form:label>
                                           <form:textarea class="form-control" rows="5" id="analisis" path="analisis"></form:textarea>
                                        </div><!-- .form-group -->                                    
                                      </div>
                                    </div>                              
                                  </div><!-- #analisis --> 

                                  <div class="panel panel-primary" id="treatment">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#accordionSix">
                                          Tratamiento
                                        </a>
                                      </h4>
                                    </div>
                                    <div id="accordionSix" class="panel-collapse collapse">
                                      <div class="panel-body">
                                        <div class="form-group">
                                          <form:label path="treatment">Descripci&#243;n</form:label>
                                           <form:textarea class="form-control" rows="5" id="treatment" path="treatment"></form:textarea>
                                        </div><!-- .form-group -->                                    
                                      </div>
                                    </div>                              
                                  </div><!-- #treatment -->

                                  <div class="panel panel-primary" id="risk">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion" href="#accordionSeven">
                                          Riesgo
                                        </a>
                                      </h4>
                                    </div>
                                    <div id="accordionSeven" class="panel-collapse collapse">
                                      <div class="panel-body">
                                        <div class="form-group">
                                          <form:label path="employeeRisk" >Riesgo: </form:label>
                                          <ul>
                                            <li><form:radiobutton path="employeeRisk" value="1" /> Bajo</li>
                                            <li><form:radiobutton path="employeeRisk" value="2" /> Medio</li>
                                            <li><form:radiobutton path="employeeRisk" value="3" /> Alto</li>
                                          </ul>
                                        </div><!-- .form-group -->                                    
                                      </div>
                                    </div>                              
                                  </div><!-- #analisis -->                             
                                  
                                  <form:hidden path="employeeId" value="${employee.getId() }" />
                                  <form:hidden path="userId" value="1" />
                                  <form:hidden path="createdAt" value="2015-04-13" />
                                  <br/><br/>                                                                                     
                                  <input type="submit" class="btn btn-block btn-primary" value="Generar Examen Medico" />

                              </form:form> <!-- form -->
                            </div><!-- #accordion -->
                        </div><!-- .panel-body -->                        
                      </div><!-- .panel panel-default -->
                  </div><!-- .panel-body -->
                </div><!-- .tab-pane fade in active -->
              </div><!-- .tab-content -->

            </div><!-- .panel-body -->          
          </div><!-- .panel-body -->   
        </div><!-- . row -->
      </div><!-- .container -->  
      
      <c:if test="${!empty errorMessage }">
        <script>
          showErrorMessage("${errorMessage}");
        </script>
      </c:if>

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