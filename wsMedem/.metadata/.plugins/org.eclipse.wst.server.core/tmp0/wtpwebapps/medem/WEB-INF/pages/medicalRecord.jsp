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
      <title>MEDEM :: ${employee.name} :: Nuevo Historial Clinico</title>
    </head>

    <body id="historia_clinica">

		<jsp:include page="layouts/navigation_layout.jsp"></jsp:include>
		
		<div class="container" id="medicalRecord">
		  <div class="col-md-12">
		    <div class="row">

				<jsp:include page="layouts/employee_tabs_nav_layouts.jsp"></jsp:include>	
              	
              	<div class="tab-content">
              	  <div class="tab-pane fade in active">
	                <div class="panel panel-default form">
	              	  <div class="panel-body">
						<div class="col-md-12">
						
                  <div class="panel-body">
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">Historia Clinica</h4>  
                      </div><!-- .panel-heading -->

                      <div class="panel-body">
                        <div class="panel-group" id="accordion">
                         <form:form action="/medem/addMedicalHistory" method="POST" modelAttribute="MedicalHistory">
                            <div class="panel panel-primary" id="personalPatologicals">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
                                    Personales patol&#243;gicos
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionOne" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group" id="hospitalizations">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="1"> Hospitalizaciones
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="hospitalizationsDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->
                                  <div class="form-group" id="surgicals">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="2"> Quirurgicas
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="surgicalDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->                                                                                
                                  <div class="form-group" id="pathologicals">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="3"> Patol&#243;gicos
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="pathologicalDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->       


                                  <div class="form-group" id="allergics">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="4"> Alergicos
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="alergicDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->            

                                  <div class="form-group" id="traumatics">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="5"> Traum&#225;ticos
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="traumaticDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->  

                                  <div class="form-group" id="transfusions">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="personalPathologicals" onclick="displayTextarea(this);" value="6"> Transfusionales
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment" name="transfusionsDesc"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #personalPatologicals -->  

                            <div class="panel panel-primary" id="personalNonPatologicals">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionTwo">
                                    Personales no pat&#243;logicos
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionTwo" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group" id="hygiene">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="hygieneCheck" onclick="displayTextarea(this);"> Higiene
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->    

                                  <div class="form-group" id="smoking">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="smokingCheck" onclick="displayTextarea(this);"> Tabaquismo
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->                                                                                
                                  <div class="form-group" id="alcoholism">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="alcoholismCheck" onclick="displayTextarea(this);"> Alcoholismo
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->       


                                  <div class="form-group" id="addictions">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="addictionsCheck" onclick="displayTextarea(this);"> Toxicomanias
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->            

                                  <div class="form-group" id="physicalActivity">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="physicalActivityCheck" onclick="displayTextarea(this);"> Actividad fisica
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->   

                                  <div class="form-group" id="nutrition">
                                    <div class="checkbox">
                                      <label>
                                        <input type="checkbox" name="nutritionCheck" onclick="displayTextarea(this);"> Alimentaci&#243;n
                                      </label><br/>
                                      <textarea class="form-control" rows="5" id="comment"></textarea>
                                    </div><!-- .checkbox -->
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #personalPatologicals -->  

                            <div class="panel panel-primary" id="sexualActivity">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionThree">
                                    Vida sexual
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionThree" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.ivsa" class="col-sm-3">IVSA/NPS:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control required" id="ivsa" path="sexualActivity.ivsa" placeholder="IVSA/NPS"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group -->
                                  </div><!-- .row -->

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.contraceptiveMethod" class="col-sm-3">Metodo anticonceptivo:</form:label>
                                      <div class="col-sm-4">
                                        <form:select class="form-control required" path="sexualActivity.contraceptiveMethod">
                                          <form:option value="1">Preservativo</form:option>
                                          <form:option value="2">Pastilla</form:option>
                                          <form:option value="3">Interrupcion</form:option>
                                        </form:select>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->        

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.ets" class="col-sm-3">ETS:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control required" id="ets" path="sexualActivity.ets" placeholder="ETS"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->  

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.menarche" class="col-sm-3">Menarca:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control required" id="menarche" path="sexualActivity.menarche" data-name="menarca" placeholder="Menarca"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->  

                                  <div class="form_divider"></div>

                            <c:if test="${employee.getGender() == 1 }">  
                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.cycles" class="col-sm-3">Ciclos:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control required" id="cycles" path="sexualActivity.cycles" data-name="ciclos" placeholder="Ciclos"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->     

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.rhythm" class="col-sm-3">Ritmo:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control" id="rhythm" path="sexualActivity.rhythm" placeholder="Ritmo"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->  

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.pregnancies" class="col-sm-3">Gestas:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control required" id="pregnancies" path="sexualActivity.pregnancies" data-name="gestas" placeholder="Gestas"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.stops" class="col-sm-3">Paras:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control" id="stops" path="sexualActivity.stops" placeholder="Paras"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->        

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.abortions" class="col-sm-3">Abortos:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control" id="abortions" path="sexualActivity.abortions" placeholder="Abortos"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->  

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.csections" class="col-sm-3">Ces&#225;reas:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control" id="csections" path="sexualActivity.csections" placeholder="Ces&#225;reas"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->                                                                                    

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.menopause" class="col-sm-3">Menopausia:</form:label>
                                      <div class="col-sm-4">
                                        <form:input type="text" class="form-control" id="menopause" path="sexualActivity.menopause" placeholder="Menopausia"/>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->           

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.prevention" class="col-sm-3">Prevenci&#243;n:</form:label>
                                      <div class="col-sm-4">
                                        <div id="datetimepicker1" class="input-append">
                                          <form:input type="text" id="datepicker" class="form-control" path="sexualActivity.prevention" tabindex="4" />
                                        </div><!-- .input-append -->
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->      

                                  <div class="form_divider"></div>

                                  <div class="row">
                                    <div class="form-group">
                                      <form:label path="sexualActivity.result" class="col-sm-3">Resultado de prevenci&#243;n:</form:label>
                                      <div class="col-sm-4">
                                        <form:select class="form-control" path="sexualActivity.result">
                                          <form:option value="1">Positivo</form:option>
                                          <form:option value="2">Negativo</form:option>
                                        </form:select>
                                      </div><!-- .col-sm-4 -->
                                      <div class="col-sm-5"></div><!-- .col-sm-7 -->                        
                                    </div><!-- .form-group --> 
                                  </div><!-- .row -->
                                  </c:if>                                  
                                </div><!-- .panel-body -->
                              </div>                              
                            </div><!-- #sexualActivity -->  

                            <div class="panel panel-primary" id="currentAilment">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionFour">
                                    Padecimiento actual
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionFour" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group">
                                    <form:label path="currentCondition">Descripci&#243;n</form:label>
                                     <form:textarea path="currentCondition" class="form-control" rows="5"></form:textarea>
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #currentAilment -->

                            <div class="panel panel-primary" id="aparatus">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionFive">
                                    Interrogatorio por aparatos
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionFive" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="row">
                                    <div class="col-md-4">
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Sintomas generales</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Astenia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Adinamia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Anorexia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Fiebre</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>             
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->    
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato digestivo</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Halit&#243;sis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Disfagia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Odinofagia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Pirosis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>N&#225;usea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>  
                                              <tr>
                                                <td>V&#243;mito</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>  
                                              <tr>
                                                <td>Hematemesis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Dolor abdominal</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Meteorismo</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                              
                                              <tr>
                                                <td>Flatulencia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>         
                                              <tr>
                                                <td>Constipaci&#243;n</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Diarrea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Rectorragia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Melena</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Pujo y tenesmo</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>               
                                              <tr>
                                                <td>Ictericia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>          
                                              <tr>
                                                <td>Coluria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Acolia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>   
                                              <tr>
                                                <td>Hemorragias</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Sistema endocrino</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Bocio</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Letargia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Hiperquinesis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Galactorrea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Amenorrea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>   
                                              <tr>
                                                <td>Gimecomastia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>             
                                              <tr>
                                                <td>Obesidad</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                                                                                 
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->

                                    </div><!-- .col-md-4 -->
                                    <div class="col-md-4">
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato urinario</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Poliuria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Anuria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Polaquiuria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Oliguria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Nicturia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Disuria</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                              
                                              <tr>
                                                <td>Tenesmo vesical</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>   
                                              <tr>
                                                <td>Enuresis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>  
                                              <tr>
                                                <td>Incontinencia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                                                                  
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato Genital</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Críptorquidia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Fimosis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Sangrado</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Flujo</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Leucorrea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Dolor</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Prurito</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                                
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato Hematol&#243;gico</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Palidez</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Astenia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Adinamia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Hemorragias</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Adenopatias</td>
                                                <td><input type="checkbox" /></td>
                                              </tr> 
                                              <tr>
                                                <td>Esplenomegalia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                                              
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Sistema Osteomuscular</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Ganglios</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Artralgias</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Mialgias</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->                                                                                                                                                                       
                                    </div><!-- .col-md-4 -->
                                    <div class="col-md-4">
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Psicos&#243;matico</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Delirios</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Ansiedad</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Depresi&#243;n</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                              
                                              <tr>
                                                <td>Ideaci&#243;n suicida</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Amnesia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                   
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato Respiratorio</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Tos</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Disnea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Dolor t&#243;racio</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Hemoptisis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Cianosis</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Alteraciones de la voz</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                                                         
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Aparato Cardiovascular</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Dolor precordial</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Palpitaciones</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Edema</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Acufenos</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Fosfenos</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>   
                                              <tr>
                                                <td>Síncope</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Lipotimia</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>  
                                              <tr>
                                                <td>Cefalea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                            
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->
                                      <div class="panel panel-default">
                                        <div class="panel-heading">
                                          <h4 class="panel-title">Sistema nervioso</h4>
                                        </div><!-- .panel-heading -->
                                        <div class="panel-body">
                                          <table class="table">
                                            <tbody>
                                              <tr>
                                                <td>Cefalea</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Síncope</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Convulsiones</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>
                                              <tr>
                                                <td>Vertigo</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>  
                                              <tr>
                                                <td>Marcha y equilibrio</td>
                                                <td><input type="checkbox" /></td>
                                              </tr>                                                   
                                            </tbody>
                                          </table>
                                        </div><!-- .panel-body -->
                                      </div><!-- .panel panel-default -->                                                                                                                        
                                    </div><!-- .col-md-4 -->
                                                             
                                  </div><!-- .row -->                                  
                                </div><!-- .panel-body -->
                              </div>                              
                            </div><!-- #aparatus -->

                            <div class="panel panel-primary" id="physicalCheckUp">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionSix">
                                    Exploraci&#243;n fisica
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionSix" class="panel-collapse collapse">
                                <div class="panel-body">
                                    <div class="panel panel-default">
                                      <div class="panel-heading">
                                        <h4 class="panel-title">Signos vitales</h4>
                                      </div><!-- .panel-heading -->     
                                      <div class="panel-body">
                                        <div class="col-sm-6">
                                          <div class="panel panel-default">
                                            <div class="panel-body">
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.heartRate" class="col-sm-6">Frecuencia cardiaca:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.heartRate" placeholder="Latidos por minuto"/>
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->  
                                              <div class="form_divider"></div>    
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.bloodPressure" class="col-sm-6">Tensi&#243;n arterial:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.bloodPressure" placeholder="mm/Hg"/>
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->  
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.respiratoryRate" class="col-sm-6">Frecuencia respiratoria:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.respiratoryRate" placeholder="Respiraciones por minuto"/>
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row --> 
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.temperature" class="col-sm-6">Temperatura:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.temperature" data-name="temperatura" placeholder="&#176;C"/>
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.weight" class="col-sm-6">Peso:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.weight" placeholder="kg"/>
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
                                                  <form:label path="physicalExploration.size" class="col-sm-6">Talla:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.size" id="size" placeholder="m"/>
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->  
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.imc" class="col-sm-6">IMC:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control" path="physicalExploration.imc" placeholder="" id="imc"  />
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row --> 
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.waist" class="col-sm-6">Circunferencia de la cintura:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.waist" placeholder="cm" />
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                  <form:label path="physicalExploration.hips" class="col-sm-6">Circunferencia de la cadera:</form:label>
                                                  <div class="col-sm-6">
                                                    <form:input type="text" class="form-control required" path="physicalExploration.hips" placeholder="cm" />
                                                  </div><!-- .col-sm-4 -->                       
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->      
                                              <div class="form_divider"></div>
                                              <div class="row">
                                                <div class="form-group">
                                                 <form:label path="physicalExploration.weightIndex" class="col-sm-6">Indice sobrepeso</form:label>
                                                 <div class="col-sm-6">
                                                   <form:select path="physicalExploration.weightIndex" class="form-control" tabindex="17">
                                                     <form:option value="1">Sobrepeso</form:option>
                                                     <form:option value="2">Obesidad 1</form:option>
                                                     <form:option value="3">Obesidad 2</form:option>
                                                     <form:option value="4">Obesidad 3</form:option>
                                                    </form:select><!-- .form-control --> 
                                                  </div><!-- .col-sm-6 -->                    
                                                </div><!-- .form-group -->
                                              </div><!-- .row -->                                                          
                                            </div><!-- .panel-body -->
                                          </div>
                                        </div><!-- .col-sm-6 -->                                
                                      </div><!-- .panel-body -->                       
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Inspecci&#243;n general</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" path="physicalExploration.general"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Cabeza y cuello</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" path="physicalExploration.head" data-name="cabeza y cuello"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->   
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Torax</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" path="physicalExploration.torax"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Abd&#243;men</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" path="physicalExploration.abdomen" data-name="abdomen"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Miembros</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" id="limb" path="physicalExploration.limbs" data-name="miembros"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Genitales</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" id="genitalInspection" path="physicalExploration.genitals" data-name="genitales"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->
                                  <div class="panel panel-default">
                                    <div class="panel-heading">
                                      <h4 class="panel-title">Sistema nervioso</h4>
                                    </div><!-- .panel-heading -->
                                    <div class="panel-body">
                                      <form:textarea class="form-control required" rows="5" id="nervousSystem" path="physicalExploration.nervousSystem" data-name="sistema nervioso"></form:textarea>
                                    </div><!-- .panel-body -->
                                  </div><!-- .panel panel-default -->                                     
                                </div><!-- .panel-body -->
                              </div>                              
                            </div><!-- #physicalCheckUp -->   

                            <div class="panel panel-primary" id="diagnoses">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionSeven">
                                    Diagn�sticos
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
                                                          <td>Hipertensi�n</td>
                                                          <td><input name="cardiovascular" type="checkbox" value="3" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Hipotensi�n ortost�stica</td>
                                                          <td><input name="cardiovascular" type="checkbox" value="4" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Infarto agudo de miocardio</td>
                                                          <td><input name="cardiovascular" type="checkbox" value="5" /></td>
                                                        </tr>  
                                                        <tr>
                                                          <td>Insuficiencia venosa perif�rica</td>
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
                                                      Dermatol�gico <b class="caret"></b>
                                                    </a>
                                                  </h4>                                                
                                                </div><!-- #headingOne -->
                                                <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                                                  <div class="panel-body">
                                                    <table class="table">
                                                      <tbody>
                                                        <tr>
                                                          <td>Absceso cut�neo</td>
                                                          <td><input name="dermatological" type="checkbox" value="1" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Acn�</td>
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
                                                          <td>Exantema s�bito</td>
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
                                                          <td>Colecistitis cr�nica</td>
                                                          <td><input name="digestive" type="checkbox" value="4" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Constipaci�n</td>
                                                          <td><input name="digestive" type="checkbox" value="5" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Dispepsia funcional</td>
                                                          <td><input name="digestive" type="checkbox" value="6" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Enfermedad �cido p�ptica</td>
                                                          <td><input name="digestive" type="checkbox" value="7" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Enfermedad por reflujo gastroesof�gico</td>
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
                                                          <td>Infecci�n genitourinaria</td>
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
                                                      Ginecol�gico <b class="caret"></b>
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
                                                          <td>Mastopat�a fibroqu�stica</td>
                                                          <td><input name="gynecological" type="checkbox" value="5" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Menstruaci�n irregular</td>
                                                          <td><input name="gynecological" type="checkbox" value="6" /></td>
                                                        </tr>   
                                                        <tr>
                                                          <td>S�ndrome de Ovario Poliqu�stico</td>
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
                                                      Hematol�gico <b class="caret"></b>
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
                                                          <td>Trastornos de la coagulaci�n</td>
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
                                                      Inmunol�gico <b class="caret"></b>
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
                                                          <td>Rinitis al�rgica</td>
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
                                                      Metab�lico <b class="caret"></b>
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
                                                          <td>Deshidrataci�n</td>
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
                                                          <td>Intoxicaci�n</td>
                                                          <td><input name="metabolic" type="checkbox" value="12" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Insolaci�n</td>
                                                          <td><input name="metabolic" type="checkbox" value="13" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Obesidad end�gena</td>
                                                          <td><input name="metabolic" type="checkbox" value="14" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Obesidad ex�gena</td>
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
                                                      Neurol�gico <b class="caret"></b>
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
                                                          <td>Migra�a</td>
                                                          <td><input name="neurological" type="checkbox" value="6" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Neuralgia de trig�mino</td>
                                                          <td><input name="neurological" type="checkbox" value="7" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Neuropatia diabetica</td>
                                                          <td><input name="neurological" type="checkbox" value="8" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>V�rtigo de origen central</td>
                                                          <td><input name="neurological" type="checkbox" value="9" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>V�rtigo de origen peri�rico</td>
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
                                                      Obst�trico <b class="caret"></b>
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
                                                          <td>Exposicici�n ocupacional a radiaciones</td>
                                                          <td><input name="occupational" type="checkbox" value="1" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a otros factores de riesgo</td>
                                                          <td><input name="occupational" type="checkbox" value="2" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a polvos</td>
                                                          <td><input name="occupational" type="checkbox" value="3" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a ruido</td>
                                                          <td><input name="occupational" type="checkbox" value="4" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a temperaturas extremas</td>
                                                          <td><input name="occupational" type="checkbox" value="5" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a t�xicos</td>
                                                          <td><input name="occupational" type="checkbox" value="6" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Exposici�n ocupacional a vibraciones</td>
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
                                                      Odontol�gico <b class="caret"></b>
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
                                                      Oftalmol�gico <b class="caret"></b>
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
                                                          <td>Chalazi�n</td>
                                                          <td><input name="ophthalmological" type="checkbox" value="5" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Conjuntivitis</td>
                                                          <td><input name="ophthalmological" type="checkbox" value="6" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Corrosi�n</td>
                                                          <td><input name="ophthalmological" type="checkbox" value="7" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Cuerpo extra�o en ojo</td>
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
                                                          <td>Miop�a</td>
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
                                                          <td>Pterigi�n</td>
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
                                                          <td>S�ndrome de ojo rojo</td>
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
                                                      Ortop�dico <b class="caret"></b>
                                                    </a>
                                                  </h4>                                                
                                                </div><!-- #headingOne -->
                                                <div id="collapseFifteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFifteen">
                                                  <div class="panel-body">
                                                    <table class="table">
                                                      <tbody>
                                                        <tr>
                                                          <td>Acortamiento de miembro p�lvico</td>
                                                          <td><input name="orthopedic" type="checkbox" value="1" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Cervicalgia</td>
                                                          <td><input name="orthopedic" type="checkbox" value="2" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Ci�tica</td>
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
                                                          <td>Distensi�n muscular</td>
                                                          <td><input name="orthopedic" type="checkbox" value="8" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Dolor tor�cico</td>
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
                                                          <td>Espol�n calc�neo</td>
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
                                                          <td>S�ndrome de hombro doloroso</td>
                                                          <td><input name="orthopedic" type="checkbox" value="19" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>S�ndrome del tunel del carpo</td>
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
                                                          <td>Tort�colis</td>
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
                                                      Otorrinolaringol�gico <b class="caret"></b>
                                                    </a>
                                                  </h4>                                                
                                                </div><!-- #headingOne -->
                                                <div id="collapseSixteen" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSixteen">
                                                  <div class="panel-body">
                                                    <table class="table">
                                                      <tbody>
                                                        <tr>
                                                          <td>Barotrauma �tico</td>
                                                          <td><input name="otolaryngology" type="checkbox" value="1" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Cerumen impactado</td>
                                                          <td><input name="otolaryngology" type="checkbox" value="2" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Cuerpo extra�o en o�do</td>
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
                                                      Psicol�gico <b class="caret"></b>
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
                                                          <td>Toxicoman�as</td>
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
                                                          <td>Bronquitis cr�nica</td>
                                                          <td><input name="respiratory" type="checkbox" value="3" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Enfermedad Pulmonar Obstructiva Cr�nica</td>
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
                                                          <td>Traque�tis</td>
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
                                                      Reumatol�gico <b class="caret"></b>
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
                                                      Traumatol�gico <b class="caret"></b>
                                                    </a>
                                                  </h4>                                                
                                                </div><!-- #headingOne -->
                                                <div id="collapseTwenteOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwenteOne">
                                                  <div class="panel-body">
                                                    <table class="table">
                                                      <tbody>
                                                        <tr>
                                                          <td>Abulsi�n</td>
                                                          <td><input name="trauma" type="checkbox" value="1" /></td>
                                                        </tr>
                                                        <tr>
                                                          <td>Amputaci�n</td>
                                                          <td><input name="trauma" type="checkbox" value="2" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Contusi�n</td>
                                                          <td><input name="trauma" type="checkbox" value="3" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Esguince cervical</td>
                                                          <td><input name="trauma" type="checkbox" value="4" /></td>
                                                        </tr> 
                                                        <tr>
                                                          <td>Esguince de mu�eca</td>
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
                                                          <td>Trauma ac�stico</td>
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
                                                          <td>Cuerpo extra�o en faringe</td>
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
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionEight">
                                    An&#225;lisis
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionEight" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group">
                                    <form:label path="analysis">Descripci&#243;n</form:label>
                                     <form:textarea class="form-control" rows="5" path="analysis"></form:textarea>
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #analisis --> 

                            <div class="panel panel-primary" id="treatment">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionNine">
                                    Tratamiento
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionNine" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group">
                                    <form:label path="treatment" >Descripci&#243;n</form:label>
                                     <form:textarea class="form-control" rows="5" path="treatment"></form:textarea>
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #treatment -->

                            <div class="panel panel-primary" id="risk">
                              <div class="panel-heading">
                                <h4 class="panel-title">
                                  <a data-toggle="collapse" data-parent="#accordion" href="#accordionTen">
                                    Riesgo
                                  </a>
                                </h4>
                              </div>
                              <div id="accordionTen" class="panel-collapse collapse">
                                <div class="panel-body">
                                  <div class="form-group">
                                    <ul class="list-group">
                                      <li class="list-group-item list-group-item-success"><form:radiobutton path="risk.id" value="1" /> <b>Bajo</b></li>
                                      <li class="list-group-item list-group-item-warning"><form:radiobutton path="risk.id" value="2" /> <b>Medio</b></li>
                                      <li class="list-group-item list-group-item-danger"><form:radiobutton path="risk.id" value="3" /> <b>Alto</b></li>
                                    </ul>
                                  </div><!-- .form-group -->                                    
                                </div>
                              </div>                              
                            </div><!-- #risk -->                          
                            
                            <form:hidden path="employee.id" value="${employee.getId() }" />
                            <form:hidden path="createdBy" value="${user.username }" />
                            <form:hidden path="createdAt" value="2015-04-13" />
                            <br/><br/>                                                                                     
                            <input type="submit" class="btn btn-block btn-primary" value="Generar Historia Clinica" />

                          </form:form><!-- form -->
                        </div><!-- #accordion -->
                      </div><!-- .panel-body -->

                                            
                    </div><!-- .panel panel-default -->
                  </div><!-- .panel-body -->						
						
						
						</div><!-- .col-md-12 -->	              	  
	              	  </div><!-- .panel-body -->
	              	</div><!-- .panel panel-default form -->
	              </div><!-- .tab-pane fade in active -->
              	</div><!-- .tab-content -->	    
		    </div><!-- .row -->
		  </div><!-- .col-med-12 -->
		</div><!-- .container -->	
		
		<jsp:include page="layouts/footer_layout.jsp"></jsp:include>	

    </body>

  </html>