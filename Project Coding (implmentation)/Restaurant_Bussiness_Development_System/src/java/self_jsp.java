package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class self_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<!-- DW6 -->\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->\r\n");
      out.write("<title>SUTZI</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_restaurant1.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#0066cc\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr bgcolor=\"#99ccff\">\r\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" ><img src=\"images/logo.png\" width=\"101\" height=\"80\" /></td>\r\n");
      out.write("\t<td height=\"60\" colspan=\"3\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" class=\"logo\"><p align=\"center\"><strong></strong></p>\r\n");
      out.write("\t<div align=\"center\"><span class=\"tagline\"></span></td>\r\n");
      out.write("\t<td width=\"4\" bgcolor=\"#FFFFFF\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"164\" bgcolor=\"#FFFFFF\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#003399\">\r\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\">&nbsp;</td>\r\n");
      out.write("\t<td height=\"36\" colspan=\"3\" id=\"navigation\" nowrap=\"nowrap\" class=\"navText\"><a href=\"index.html\">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <a href=\"login.html\">FEEDBACK</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"admin.html\">Administrator</a>&nbsp;\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("\t  <td width=\"4\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\r\n");
      out.write("\t<td colspan=\"6\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\r\n");
      out.write("\t<td colspan=\"2\" valign=\"top\" bgcolor=\"#ffffcc\">\r\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"230\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\t</td>\r\n");
      out.write("\t<td width=\"51\" valign=\"top\"></td>\r\n");
      out.write("\t<td width=\"454\" valign=\"top\"><br />\r\n");
      out.write("\t&nbsp;<br />\r\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"440\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"pageHeader\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td class=\"bodyText\"><p>\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 Class.forName("oracle.jdbc.driver.OracleDriver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");

      out.write("\t\r\n");
      out.write("\t<FORM ACTION=\"self.jsp\" METHOD=\"POST\">\r\n");
      out.write("            Please enter the ID of the USER you want to find:\r\n");
      out.write("            <BR>\r\n");
      out.write("            <INPUT TYPE=\"TEXT\" NAME=\"uid\">\r\n");
      out.write("            <BR>\r\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\r\n");
      out.write("        </FORM>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <H1>Fetching Data From a Database</H1>\r\n");
      out.write("\r\n");
      out.write("        ");
 
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");

            Statement statement = connection.createStatement();

            String id = request.getParameter("uid");  

            ResultSet resultset = 
                statement.executeQuery("select rating,food_rating,service_rating,food_type from userfeed where userid='"+id+"'") ; 


        
      out.write("\r\n");
      out.write("\t\t");

		if(!resultset.next())
		{
			Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");

            Statement st = co.createStatement();

            //String id1 = request.getParameter("uid");  

            ResultSet rs = 
                st.executeQuery("select rating,food_rating,service_rating,food_type from userfeed1 where userid='"+id+"'") ; 
		
      out.write("\r\n");
      out.write("\t\t<TABLE BORDER=\"1\">\r\n");
      out.write("            <TR><th colspan=4>");
 out.println(id); 
      out.write("</th></tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("               <tr><td>Rating</td>\r\n");
      out.write("               <td>FOOD Rating</td>\r\n");
      out.write("               <td>SERVICE Rating</td>\r\n");
      out.write("               <td>FOOD TYPE</td>\r\n");
      out.write("               \r\n");
      out.write("           </TR>\r\n");
      out.write("\t\t   ");
 while(rs.next()){ 
      out.write("\r\n");
      out.write("           <TR>\r\n");
      out.write("               <TD> ");
      out.print( rs.getString(1) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( rs.getString(2) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( rs.getString(3) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( rs.getString(4) );
      out.write(" </TD>\r\n");
      out.write("               \r\n");
      out.write("           </TR>\r\n");
      out.write("\t\t   ");
 
			}
       
      out.write("\r\n");
      out.write("\t   ");

		}
		
        else
		{
			
      out.write("\r\n");
      out.write("        <TABLE BORDER=\"1\">\r\n");
      out.write("            <TR><th colspan=4>");
 out.println(id); 
      out.write("</th></tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("               <tr><td>Rating</td>\r\n");
      out.write("               <td>FOOD Rating</td>\r\n");
      out.write("               <td>SERVICE Rating</td>\r\n");
      out.write("               <td>FOOD TYPE</td>\r\n");
      out.write("               \r\n");
      out.write("           </TR>\r\n");
      out.write("\t\t   ");
 while(resultset.next()){ 
      out.write("\r\n");
      out.write("           <TR>\r\n");
      out.write("               <TD> ");
      out.print( resultset.getString(1) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( resultset.getString(2) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( resultset.getString(3) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( resultset.getString(4) );
      out.write(" </TD>\r\n");
      out.write("               \r\n");
      out.write("           </TR>\r\n");
      out.write("\t\t   ");
 
			}
		}
	   
      out.write("\r\n");
      out.write("       </TABLE>\r\n");
      out.write("       <BR>\r\n");
      out.write("\t   ");

       Statement st1 = connection.createStatement();

            String id1 = request.getParameter("uid");  

            ResultSet rs1 = 
                st1.executeQuery("select userid,email,phone from reguser where userid = '" + id1 + "'") ; 

            if(!rs1.next()) {
                out.println("Wait for the server. OR " +
                "Please <A HREF='self.jsp'>try again</A>.");
            } else {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <TABLE BORDER=\"1\">\r\n");
      out.write("            <TR>\r\n");
      out.write("               <TH>ID</TH>\r\n");
      out.write("               <TH>EMAIL</TH>\r\n");
      out.write("               <TH>PHONE</TH>\r\n");
      out.write("           </TR>\r\n");
      out.write("           <TR>\r\n");
      out.write("               <TD> ");
      out.print( rs1.getString(1) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( rs1.getString(2) );
      out.write(" </TD>\r\n");
      out.write("               <TD> ");
      out.print( rs1.getString(3) );
      out.write(" </TD>\r\n");
      out.write("           </TR>\r\n");
      out.write("       </TABLE>\r\n");
      out.write("       <BR>\r\n");
      out.write("       ");
 
			}
       
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\t   <br />\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\t</td>\r\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td colspan=\"6\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#003399\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"2\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr bgcolor=\"#003399\">\r\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td width=\"134\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"188\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"51\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"454\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\r\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("     \r\n");
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
