package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class verify_005fcode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Feedback Widget Flat Responsive Widget Template :: w3layouts</title>\r\n");
      out.write("<!-- for-mobile-apps -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \r\n");
      out.write("<meta name=\"keywords\" content=\"Feedback Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<!-- //for-mobile-apps -->\r\n");
      out.write("\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Josefin+Slab:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\t<h1>CODE VERIFIER</h1>\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\r\n");

 Class.forName("oracle.jdbc.driver.OracleDriver");
 
      out.write("\r\n");
      out.write(" <FORM ACTION=\"verify_code.jsp\" METHOD=\"POST\">\r\n");
      out.write("            Please enter the OFFER CODE\r\n");
      out.write("            <BR>\r\n");
      out.write("\t\t\t<INPUT Type=\"TEXT\" NAME=\"user\" placeholder=\"ENTER USERID\">\r\n");
      out.write("            <INPUT TYPE=\"TEXT\" NAME=\"code\" placeholder=\"ENTER OFFER CODE\">\r\n");
      out.write("            <BR>\r\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\r\n");
      out.write("        </FORM>\r\n");
      out.write("\t");
	
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
		
		Statement st = con.createStatement();
		
		String uid = request.getParameter("user");
		String id = request.getParameter("code");  

            ResultSet rs = st.executeQuery("select offer from offer_code where userid = '" + uid + "' and code = '" + id + "'") ; 
		
		if(rs.next()) 
		{
			session.setAttribute("userid", uid);
			
      out.write("\r\n");
      out.write("\t\t\t<img src=\" ");
      out.print( rs.getString(1) );
      out.write(" \" >\r\n");
      out.write("\t\t\t");

        } 
		else 
		{       
		out.println("<b>(ENTER VALID OFFER CODE)</b>");
		}
		
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("</div>\t\t\r\n");
      out.write("<b>GO BACK TO </b><a href=\"login.html\">FEEDBACK</a><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t\t\t");
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
