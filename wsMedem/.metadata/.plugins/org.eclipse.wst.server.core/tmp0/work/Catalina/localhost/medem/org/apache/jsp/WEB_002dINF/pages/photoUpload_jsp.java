/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-04-24 16:06:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class photoUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE>\n");
      out.write("  <html>\n");
      out.write("    <head>\n");
      out.write("      <meta charset=\"utf=8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("      <link href=\"bootstrap/bootstrap-3.3.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\n");
      out.write("      <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("      <script src=\"bootstrap/bootstrap-3.3.2-dist/js/bootstrap.min.js\"></script>\n");
      out.write("      <script src=\"js/main_functions.js\"></script>\n");
      out.write("      <title>MEDEM :: Bienvenido</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      <nav role=\"navigation\" class=\"navbar navbar-default\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button><!-- .navbar-toggle -->\n");
      out.write("          <a href=\"#\" class=\"navbar-brand\"><img src=\"imgs/logocmh.png\" class=\"main_logo\" alt=\"CMH Corp\"/></a>\n");
      out.write("        </div><!-- .navbar-header -->\n");
      out.write("      </nav><!-- .navbar navbar-default -->\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("            <div class=\"login-panel panel panel-default\">\n");
      out.write("              <div class=\"panel-heading\">\n");
      out.write("                <h3 class=\"panel-title\">MEDEM :: Bienvenido</h3>\n");
      out.write("              </div><!-- .panel-heading --> \n");
      out.write("              \n");
      out.write("              <div id=\"myModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                  <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header modal-header-danger\">\n");
      out.write("                      <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                      <h4 class=\"modal-title\"><i class=\"fa fa-warning\"></i> Atenci&#243;n</h4>                          \n");
      out.write("                    </div><!-- .modal-header -->\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                      <p></p>\n");
      out.write("                    </div><!-- .modal-body -->\n");
      out.write("                  </div><!-- .modal-content -->\n");
      out.write("                </div><!-- .modal-dialog -->\n");
      out.write("              </div><!-- .modal fade -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- \t\t\t\t\t<input type=\"file\" name=\"imageFile\" /> -->\n");
      out.write("<!-- \t\t\t\t\t<input type=\"submit\" value=\"SEND!\" /> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<form enctype=\"multipart/form-data\" method=\"POST\" action=\"uploadEmployeePhoto\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t<input id=\"file\" name=\"file\" type=\"file\" />\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"UPLOAD!\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("              </div><!-- .panel-body -->\n");
      out.write("            </div><!-- .login-panel panel panel-default -->\n");
      out.write("          </div><!-- .col-md-4 col-md-offset-4 -->\n");
      out.write("        </div><!-- .row -->\n");
      out.write("      </div><!-- .container -->\n");
      out.write("    </body>\n");
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
}
