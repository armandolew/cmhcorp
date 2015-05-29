<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
