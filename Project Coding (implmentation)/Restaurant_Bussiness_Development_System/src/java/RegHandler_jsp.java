package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.lang.*;

public final class RegHandler_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\">\n");
      out.write("\t<script src=\"js/mobile.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<a href=\"index.html\" class=\"logo\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t<ul id=\"navigation\">\n");
      out.write("\t\t\t\t\t<li class=\"selected\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\">HOME</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<a href=\"admin.html\">ADMINISTRATOR</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<a href=\"feedback.html\">FEEDBACK</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"body\">\n");
      out.write("\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>HELLO</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"body\">\n");
      out.write("\t\t\t\t<img src=\"images/bg-header-about.jpg\" alt=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\n");
      out.write("\t\t\t\t\t<h1>BECOME A MEMBER AND LOGIN</h1>\n");
      out.write("\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"article\">\n");
      out.write("                            \n");
      out.write("                            ");
 String username=request.getParameter("uid");
                               String password=request.getParameter("password");
                               String emailid=request.getParameter("email");
                               String payment=request.getParameter("pay");
                               String phone=request.getParameter("phone");
                                
       try {Class.forName("oracle.jdbc.driver.OracleDriver");
         } catch (java.lang.ClassNotFoundException e) {System.out.println("ClassNotFoundException: " + e.getMessage());}   
    Connection con;
    Statement st;
	try{
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
			st=con.createStatement();
    int i = st.executeUpdate("insert into reguser(userid, password, email, payment, phone) values ('" + username + "','" + password + "','" + emailid + "','" +payment+ "','" +phone+ "')");
	
	if ( i > 0) {
        //session.setAttribute("userid", user);
        //response.sendRedirect("i_successfull.jsp");
       out.print("<p>Registration Successfull!"+"<a href='login.html'>Go to Login</a></p>");
    } else {
        out.print("<p><b>Select a unique userID.Your UserID is already taken</b></p>");
    }}
	catch(Exception e){
		out.println(e);
	}
                               
                               
      out.write("\n");
      out.write("\t\t\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div class=\"connect\">\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"facebook\">facebook</a>\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"twitter\">twitter</a>\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"googleplus\">googleplus</a>\n");
      out.write("\t\t\t\t\t<a href=\"\" class=\"pinterest\">pinterest</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<p>&copy;All Rights Reserved.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
