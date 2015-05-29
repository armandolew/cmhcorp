<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
