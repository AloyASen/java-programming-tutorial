/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.0-RC5
 * Generated at: 2015-06-28 06:52:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("      <div id=\"logo\">\r\n");
      out.write("        <div id=\"logo_text\">\r\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("          <h1><a href=\"user_index.jsp\"><span class=\"logo_colour\">Expenditure tracker & Home budget System</span></a></h1>\r\n");
      out.write("          <h2>Manage your Own Expense</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <nav>\r\n");
      out.write("        <ul class=\"sf-menu\" id=\"nav\">\r\n");
      out.write("          <li><a href=\"insert.jsp\">Entry</a></li>\r\n");
      out.write("          <li><a href=\"#\">Expense Reports</a>\r\n");
      out.write("          <ul>\r\n");
      out.write("              <li><a href=\"report_daily.jsp\">Daily Report</a></li>\r\n");
      out.write("                <li><a href=\"report_monthly.jsp\">Monthly Report</a></li>\r\n");
      out.write("                 <li><a href=\"report_yearly.jsp\">Yearly Report</a></li>\r\n");
      out.write("              </li>\r\n");
      out.write("              \r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("          <li><a href=\"edit_expense.jsp\">Edit Expense</a>\r\n");
      out.write("           \r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"logout1.jsp\">Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
