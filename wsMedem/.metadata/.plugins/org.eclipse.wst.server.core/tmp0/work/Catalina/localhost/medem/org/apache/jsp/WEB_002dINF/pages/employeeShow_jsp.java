/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-26 15:25:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeeShow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("    <head>\n");
      out.write("      <meta charset=\"utf=8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("      <script src=\"/medem/bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("      <script type='text/javascript' src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js\"></script>\n");
      out.write("\t  <script type='text/javascript' src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/additional-methods.js\"></script>\n");
      out.write("\t  <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("\t  <script src=\"/medem/js/main_functions.js\"></script>\n");
      out.write("\t  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("      <link href=\"/medem/bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"/medem/css/general_layout_override.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"/medem/css/custom.css\" rel=\"stylesheet\" >\n");
      out.write("      <title>MEDEM :: Empleado :: Ficha de Identificacion </title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"employeeShow\">\n");
      out.write(" \n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navigation_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/modal_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/modal_delete_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/modal_fileupload_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t  <div class=\"employeeInfo\">\n");
      out.write("\t\t\t  <div class=\"col-md-12\">\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t            \t<ul class=\"nav nav-tabs\">\n");
      out.write("\t                \t<li class=\"active\"><a href=\"#\">Ficha de Identificaci&#243;n</a></li>\n");
      out.write("\t                \t<li><a href=\"/medem/familyHistory?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Ant. Heredofamiliares</a></li>\n");
      out.write("\t                \t<li><a href=\"/medem/medicalHistory/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Historia Clinica</a></li>\n");
      out.write("\t                \t<li><a href=\"/medem/medicalExam?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Examenes</a></li>\n");
      out.write("\t                \t<li><a href=\"/medem/medicalNote?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Notas</a></li>                \n");
      out.write("\t              \t</ul><!-- .nav nav-tabs -->\n");
      out.write("\t              \t\n");
      out.write("\t              \t<div class=\"tab-content\">\n");
      out.write("\t              \t  <div class=\"tab-pane fade in active\">\n");
      out.write("\t              \t    <div class=\"panel panel-default form\">\n");
      out.write("\t              \t      <div class=\"panel-body\">\n");
      out.write("\t              \t        <div class=\"col-md-3\">\n");
      out.write("\t              \t          <div class=\"profile-sidebar\">\n");
      out.write("\t              \t            <div class=\"profile-userpic\">\n");
      out.write("\t              \t              <img src=\"/medem/imgs/anon_user_plus.png\" class=\"img-responsive img-circle\" alt=\"\">\n");
      out.write("\t              \t            </div><!-- .profile-userpic -->\n");
      out.write("\t              \t            <div class=\"profile-usertitle\">\n");
      out.write("\t              \t              <div class=\"profile-usertitle-name\">\n");
      out.write("\t\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"profile-usertitle-job\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t  <hr class=\"divider\">\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"profile-userbuttons\">\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"btn-group-vertical\">\n");
      out.write("\t\t\t\t\t\t\t\t      <a href=\"#\" data-toggle=\"modal\" data-target=\"#fileUpload\" class=\"btn btn-success btn-sm\"><span class=\"glyphicon glyphicon-upload\"></span> Subir Foto</a>\n");
      out.write("\t\t\t\t\t\t\t\t      ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t    </div><!-- .btn-group-vertical -->\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t              \t            </div><!-- .profile-usertitle -->\n");
      out.write("\t              \t          </div><!-- .profile-sidebar -->\n");
      out.write("\t              \t        </div><!-- .col-med-3 -->\n");
      out.write("\t              \t        <div class=\"col-md-9\">\n");
      out.write("              \t              <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("                              \t  <div class=\"form-group\" id=\"age\">\n");
      out.write("                                    <label>Edad</label>\n");
      out.write("                                \t<input name=\"age\" type=\"text\" class=\"form-control required\" value=\"\" readonly/>\n");
      out.write("                              \t  </div><!-- .form-group -->                          \n");
      out.write("                              \t</div><!-- .col-sm-2 -->\n");
      out.write("                     \t\t\t<div class=\"col-sm-2\">\n");
      out.write("                      \t\t\t  <div class=\"form-group\">\n");
      out.write("                         \t\t    <label for=\"fullGender\">Genero</label>\n");
      out.write("                         \t\t\t<input name=\"fullGender\" type=\"text\" class=\"form-control\" value=\"\" readonly />\n");
      out.write("                      \t\t\t  </div><!--. form-group -->                         \n");
      out.write("                    \t\t    </div><!-- .col-sm-2 -->  \n");
      out.write("                \t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("                  \t\t\t\t  <div class=\"form-group\">\n");
      out.write("                     \t\t\t    <label for=\"fullMaritalStatus\">Estado civil</label>\n");
      out.write("                     \t\t\t\t<input type=\"text\" name=\"fullMaritalStatus\" class=\"form-control\" value=\"\" readonly />\n");
      out.write("                  \t\t\t\t  </div><!--. form-group -->                         \n");
      out.write("                \t\t\t\t</div><!-- .col-sm-4 -->   \n");
      out.write("                   \t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("                  \t\t\t\t  <div class=\"form-group\">\n");
      out.write("                       \t\t\t    <label for=\"religion\">Religi&#243;n</label>\n");
      out.write("                       \t\t\t\t<input type=\"text\" class=\"form-control\" name=\"religion\" value=\"\" readonly />\n");
      out.write("                     \t\t\t  </div><!-- .form-group -->                          \n");
      out.write("                   \t\t\t\t</div><!-- .col-sm-4 -->                 \t\t\t\t                  \t\t                                \t               \t              \n");
      out.write("              \t              </div><!-- .row -->\n");
      out.write("              \t              \n");
      out.write("              \t              <hr class=\"divider\"> \n");
      out.write("              \t              \n");
      out.write("              \t              <div class=\"row\">\n");
      out.write("              \t                <div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t                  <div class=\"form-group\">\n");
      out.write("\t\t\t\t                    <label for=\"fullBloodGroup\">Grupo sanguineo:</label>\n");
      out.write("\t\t\t\t                    <input type=\"text\" name=\"fullBloodGroup\" class=\"form-control\" value=\"\" readonly />\n");
      out.write("\t\t\t\t                  </div><!--. form-group input-group -->                         \n");
      out.write("\t\t\t\t                </div><!-- .col-sm-3 -->\n");
      out.write("\t                            <div class=\"col-sm-3\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                 <label for=\"fullRh\">Rh:</label>\n");
      out.write("\t                                 <input type=\"text\" name=\"fullRh\" class=\"form-control\" value=\"\" readonly />\n");
      out.write("\t                              </div><!--. form-group input-group -->                         \n");
      out.write("\t                            </div><!-- .col-sm-3 --> \t\n");
      out.write("\t                            <div class=\"col-sm-6\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Lugar de origen:</label>\n");
      out.write("\t                                <input name=\"originPlace\" type=\"text\" class=\"form-control\" value=\"\" readonly />\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-6 --> \t                            \t\t\t                \n");
      out.write("              \t              </div><!-- .row -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("              \t              <hr class=\"divider\">\n");
      out.write("              \t              \n");
      out.write("              \t              <div class=\"row\">\n");
      out.write("\t                            <div class=\"col-sm-4\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Domicilio:</label>\n");
      out.write("\t                                <input name=\"address.street\" type=\"text\" class=\"form-control\" id=\"address.street\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-4 -->  \n");
      out.write("\t                            <div class=\"col-sm-3\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Telefono:</label>\n");
      out.write("\t                                <input name=\"phone\" type=\"text\" class=\"form-control\" id=\"phone\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-3 --> \t\n");
      out.write("\t                            <div class=\"col-sm-3\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Delegaci&#243;n</label>\n");
      out.write("\t                                <input name=\"address.town\" type=\"text\" class=\"form-control\" id=\"town\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-3 -->\n");
      out.write("\t                            <div class=\"col-sm-2\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>C&#243;digo postal</label>\n");
      out.write("\t                                <input name=\"address.zipcode\" type=\"text\" class=\"form-control\" id=\"zipCode\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-2 -->\t                                                                    \t                \n");
      out.write("              \t              </div><!-- .row -->\n");
      out.write("              \t              \n");
      out.write("              \t              <hr class=\"divider\">\n");
      out.write("              \t              \n");
      out.write("              \t              <div class=\"row\">\n");
      out.write("\t                            <div class=\"col-sm-6\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Nombre de la persona de contacto:</label>\n");
      out.write("\t                                <input name=\"contactName\" type=\"text\" class=\"form-control required\" id=\"contactName\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-6 --> \n");
      out.write("\t                            <div class=\"col-sm-6\">\n");
      out.write("\t                              <div class=\"form-group\">\n");
      out.write("\t                                <label>Telefono de la persona de contacto:</label>\n");
      out.write("\t                                <input name=\"contactPhone\" type=\"text\" class=\"form-control required\" id=\"contactPhone\" value=\"\" readonly/>\n");
      out.write("\t                              </div><!-- .form-group -->                          \n");
      out.write("\t                            </div><!-- .col-sm-6 --> \t                                          \t              \n");
      out.write("              \t              </div><!-- .row -->\n");
      out.write("              \t              \n");
      out.write("\t              \t        </div><!-- .col-md-9 -->\n");
      out.write("\t              \t      </div><!-- .panel-body -->\n");
      out.write("\t              \t    </div><!-- panel panel-default form -->\n");
      out.write("\t              \t  </div><!-- .tab-pane fade in active -->\n");
      out.write("\t              \t</div><!-- .tab-content -->\n");
      out.write("\t              \t\t\t\t      \n");
      out.write("\t\t\t    </div><!-- .row -->\n");
      out.write("\t\t\t  </div><!-- .col-md-12 -->\n");
      out.write("\t\t\t  </div><!-- .employeeInfo -->\n");
      out.write("\t\t\t</div><!-- .container -->   \n");
      out.write("          \n");
      out.write("          <!-- footer -->\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer_layout.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("   \t\t\n");
      out.write("\t       loadEmployeeInformation(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write("\n");
      out.write("    \t});\n");
      out.write("    </script>    \n");
      out.write("\n");
      out.write("  </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(null);
    // /WEB-INF/pages/employeeShow.jsp(65,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t      <a href=\"/medem/editEmployee/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-warning btn-sm\"><span class=\"glyphicon glyphicon-edit\"></span> Editar</a>\n");
      out.write("\t\t\t\t\t\t\t\t      <a href=\"#\" data-href=\"/medem/deleteEmployee/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-danger btn-sm\" data-toggle=\"modal\" data-target=\"#confirm-delete\"><span class=\"glyphicon glyphicon-remove-circle\"></span> Eliminar</a>\n");
      out.write("\t\t\t\t\t\t\t\t      ");
    }
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }
}
