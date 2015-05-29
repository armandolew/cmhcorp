<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
