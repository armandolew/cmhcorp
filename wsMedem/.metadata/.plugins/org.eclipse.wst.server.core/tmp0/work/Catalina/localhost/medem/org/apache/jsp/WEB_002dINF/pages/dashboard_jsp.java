/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-20 17:26:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("\t<html>\n");
      out.write("\t\t<head>\n");
      out.write("\t\t\t<meta charset=\"utf=8\">\n");
      out.write("      \t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      \t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("      \t\t<script src=\"bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("      \t\t<link href=\"bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      \t\t<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("\t\t\t<link href=\"css/general_layout_override.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t<script src=\"js/main_functions.js\"></script>\n");
      out.write("      \t\t<title>MEDEM :: Bienvenido</title>\n");
      out.write("\t\t</head>\n");
      out.write("\t\t\n");
      out.write("\t\t<body id=\"dashboard\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/navigation_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t  <div class=\"col-md-12\">\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t\t\t      <div class=\"panel panel-default\">\n");
      out.write("\t\t\t        <div class=\"panel-heading\">\n");
      out.write("\t\t\t          <h3 class=\"panel-title\">Bienvenido <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></h3>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        <div class=\"panel-body\">\n");
      out.write("\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t             <div class=\"panel panel-company\">\n");
      out.write("\t\t\t               <div class=\"panel-heading\">\n");
      out.write("\t\t\t                 <div class=\"row\">\n");
      out.write("\t\t\t                   <div class=\"col-xs-3\">\n");
      out.write("\t\t\t                     <i class=\"glyphicon glyphicon-bookmark\"></i>\n");
      out.write("\t\t\t                   </div><!-- .col-xs-3 -->\n");
      out.write("\t\t\t                   <div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t                     <div class=\"huge\">Empresa: <br/><b>Comercial Mexicana</b></div>\n");
      out.write("\t\t\t                   </div><!-- .col-xs-9 text-right -->\n");
      out.write("\t\t\t                 </div><!-- .row -->\n");
      out.write("\t\t\t               </div><!-- .panel-heading -->\n");
      out.write("\t\t\t             </div><!-- .panel panel-employees -->\n");
      out.write("\t\t\t            </div><!-- .col-lg-3 col-md-6 -->\n");
      out.write("\t\t\t          </div><!-- .control-group -->\t\t\t        \n");
      out.write("\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t             <div class=\"panel panel-employees\">\n");
      out.write("\t\t\t               <div class=\"panel-heading\">\n");
      out.write("\t\t\t                 <div class=\"row\">\n");
      out.write("\t\t\t                   <div class=\"col-xs-3\">\n");
      out.write("\t\t\t                     <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("\t\t\t                   </div><!-- .col-xs-3 -->\n");
      out.write("\t\t\t                   <div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t                     <div class=\"huge\">Empleados: <br/><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t                   </div><!-- .col-xs-9 text-right -->\n");
      out.write("\t\t\t                 </div><!-- .row -->\n");
      out.write("\t\t\t               </div><!-- .panel-heading -->\n");
      out.write("\t\t\t             </div><!-- .panel panel-employees -->\n");
      out.write("\t\t\t            </div><!-- .col-lg-3 col-md-6 -->\n");
      out.write("\t\t\t          </div><!-- .control-group -->\n");
      out.write("\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t              <div class=\"panel panel-areas\">\n");
      out.write("\t\t\t                <div class=\"panel-heading\">\n");
      out.write("\t\t\t                  <div class=\"row\">\n");
      out.write("\t\t\t                    <div class=\"col-xs-3\">\n");
      out.write("\t\t\t                      <i class=\"glyphicon glyphicon-flag\"></i>\n");
      out.write("\t\t\t                    </div><!-- .col-xs-3 -->\n");
      out.write("\t\t\t                    <div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t                      <div class=\"huge\">Areas: <br/><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${areasCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\n");
      out.write("\t\t\t                    </div><!-- .col-xs-9 text-right -->\n");
      out.write("\t\t\t                  </div><!-- .row -->\n");
      out.write("\t\t\t                </div><!-- .panel-heading -->\n");
      out.write("\t\t\t              </div><!-- .panel panel-areas -->\n");
      out.write("\t\t\t            </div><!-- .col-lg-3 col-md-6 -->\n");
      out.write("\t\t\t          </div><!-- .control-group -->\n");
      out.write("\t\t\t          <div class=\"control-group\">\n");
      out.write("\t\t\t            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t              <div class=\"panel panel-records\">\n");
      out.write("\t\t\t                <div class=\"panel-heading\">\n");
      out.write("\t\t\t                  <div class=\"row\">\n");
      out.write("\t\t\t                    <div class=\"col-xs-3\">\n");
      out.write("\t\t\t                      <i class=\"glyphicon glyphicon-dashboard\"></i>\n");
      out.write("\t\t\t                    </div><!-- .col-xs-3 -->\n");
      out.write("\t\t\t                    <div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t                      Historias clinicas: <br/><b>60%</b>\n");
      out.write("\t\t\t                      <div class=\"progress\">\n");
      out.write("  \t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-white\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\">\n");
      out.write("    \t\t\t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t                    </div><!-- .col-xs-9 text-right -->\n");
      out.write("\t\t\t                  </div><!-- .row -->\n");
      out.write("\t\t\t                </div><!-- .panel-heading -->\n");
      out.write("\t\t\t              </div><!-- .panel panel-areas -->\n");
      out.write("\t\t\t            </div><!-- .col-lg-3 col-md-6 -->\n");
      out.write("\t\t\t          </div><!-- .control-group -->\t\t\t          \n");
      out.write("\t\t\t        </div><!-- .panel-body -->\n");
      out.write("\t\t\t      </div><!-- .panel panel-default -->\n");
      out.write("\t\t\t    </div><!--  .row -->\n");
      out.write("\t\t\t  </div><!-- .col-md-12 -->\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouts/footer_layout.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("            <div id=\"myModal\" class=\"modal fade\">\n");
      out.write("              <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                  <div class=\"modal-header modal-header-danger\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                    <h4 class=\"modal-title\"><i class=\"fa fa-warning\"></i> Cargando</h4>                          \n");
      out.write("                  </div><!-- .modal-header -->\n");
      out.write("                  <div class=\"modal-body\">\n");
      out.write("                    <p></p>\n");
      out.write("                  </div><!-- .modal-body -->\n");
      out.write("                </div><!-- .modal-content -->\n");
      out.write("              </div><!-- .modal-dialog -->\n");
      out.write("            </div><!-- .modal fade\" -->\n");
      out.write("\t\t\n");
      out.write("\t\t</body>\n");
      out.write("\t</html>\n");
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
}
