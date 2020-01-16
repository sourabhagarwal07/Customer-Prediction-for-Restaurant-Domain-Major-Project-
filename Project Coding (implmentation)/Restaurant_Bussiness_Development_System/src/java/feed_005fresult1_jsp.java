package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class feed_005fresult1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->\n");
      out.write("<title>SUTZI</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_restaurant1.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#0066cc\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t<tr bgcolor=\"#99ccff\">\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" ><img src=\"images/logo.png\" width=\"101\" height=\"80\"  /></td>\n");
      out.write("\t<td height=\"60\" colspan=\"3\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" class=\"logo\"><p align=\"center\"><strong></strong></p>\n");
      out.write("\t<div align=\"center\"><span class=\"tagline\"></span></td>\n");
      out.write("\t<td width=\"4\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\" bgcolor=\"#FFFFFF\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\">&nbsp;</td>\n");
      out.write("\t<td height=\"36\" colspan=\"3\" id=\"navigation\" nowrap=\"nowrap\" class=\"navText\"><a href=\"index.html\">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <a href=\"login.html\">FEEDBACK</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"admin.html\">Administrator</a>&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t  <td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"2\" valign=\"top\" bgcolor=\"#ffffcc\">\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"230\">\n");
      out.write("\t\t\n");
      out.write("\t</table>\t</td>\n");
      out.write("\t<td width=\"51\" valign=\"top\"></td>\n");
      out.write("\t<td width=\"454\" valign=\"top\"><br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"440\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td class=\"pageHeader\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td class=\"bodyText\"><p>\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

 Class.forName("oracle.jdbc.driver.OracleDriver");
 String uid = request.getParameter("uid");
 String umail = request.getParameter("umail");
 String plot = request.getParameter("radiopar");
 String price = request.getParameter("radiop");
 String rat = request.getParameter("ratingo");
 String frat = request.getParameter("ratingf");
 String srat = request.getParameter("ratings");
 String yn = request.getParameter("yn");
 String food = request.getParameter("radio");
 String feed = request.getParameter("feed");
    java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
	
	Statement stins = con.createStatement();
	int ins = stins.executeUpdate("insert into userfeed1(userid, user_mail, parking_lot, price, rating, food_rating, service_rating, yn, food_type, feedback) values ('" + uid + "','" + umail + "','" + plot + "',' " + price + " ','" + rat + "','" + frat + "','" + srat + "','" + yn + "','" + food + "','" + feed + "')");
	if ( ins > 0) {
        
       out.print("<b>THANK YOU For Your Usefull FEEDBACK</b><br>");
    } else {
        out.print("<b>FAILED to take entries,Please TRY AGAIN</b><br>"+"<a href='login.html'>Return to FEEDBACK Page</a><br><br>");
    }
	
	int rowcount5=-1;
    Statement st5 = con.createStatement();
    ResultSet rs5 = st5.executeQuery("SELECT COUNT(userid) FROM userfeed1 where userid='" + uid + "'");

    // Get the number of rows from the result set
    rs5.next();
    rowcount5 = rs5.getInt(1);
	
	int rowcount=-1;
    Statement stmt = con.createStatement();
    ResultSet resultSet = stmt.executeQuery("SELECT COUNT(userid) FROM userfeed where userid='" + uid + "'");

    // Get the number of rows from the result set
    resultSet.next();
    rowcount = resultSet.getInt(1);
	
      out.write("\n");
      out.write("\t<form method=\"post\" action=\"offer_reg.jsp\">\n");
      out.write("\t");

		  if(rowcount>1 || rowcount5>1)
		  {
		  
      out.write("\n");
      out.write("\t\t  <b>Welcome OLD Customer<br></b>\n");
      out.write("\t\t  ");

		  int rowcnt=-1;
    Statement stmnt = con.createStatement();
    ResultSet resultset = stmnt.executeQuery("select count(yn) from userfeed where userid='"+uid+"' and yn='n'");

    // Get the number of rows from the result set
    resultset.next();
    rowcnt = resultset.getInt(1);
	
	int rwcnt=-1;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select count(yn) from userfeed where userid='"+uid+"' and yn='y'");

    // Get the number of rows from the result set
    rs.next();
    rwcnt = rs.getInt(1);
	if(rwcnt>rowcnt)
	{
	
      out.write("\n");
      out.write("\t<b>Customer Will Visit Again<br></b>\n");
      out.write("\t<p>Here is his next visit offer<br></p>\n");
      out.write("\t");

	Statement st2 = con.createStatement();
		  ResultSet rs2 = st2.executeQuery("SELECT promo FROM ( SELECT promo FROM olduserhappypromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs2.next();
          
      out.write("\n");
      out.write("          <img src=\"");
out.println(rs2.getString(1));
      out.write("\" alt=\"offer\" height=350 width=500 align=center>\n");
      out.write("\t\t  \n");
      out.write("\t\t  <input type=\"hidden\" name=\"offer\" value=\"");
      out.print( rs2.getString(1) );
      out.write("\" hidden/>\n");
      out.write("\t");

	}
	else
	{
		
      out.write("\n");
      out.write("\t\t<b>Customer may not visit again<br></b>\n");
      out.write("\t\t<p>Here is his next time visit offer<br></p>\n");
      out.write("\t\t");

	Statement st3 = con.createStatement();
		  ResultSet rs3 = st3.executeQuery("SELECT promo FROM ( SELECT promo FROM oldusersadpromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs3.next();
          
      out.write("\n");
      out.write("          <img src=\"");
out.println(rs3.getString(1));
      out.write("\" alt=\"offer\" height=350 width=500 align=center>\n");
      out.write("\t\t  <input type=\"hidden\" name=\"offer\" value=\"");
      out.print( rs3.getString(1) );
      out.write("\"/>\n");
      out.write("\t\t");

	}
	
      out.write("\n");
      out.write("\t\t  ");

		  }
		  else
		  {
		  
      out.write("\n");
      out.write("          <b>Welcome New Customer<br></b>\n");
      out.write("\t\t  <p>Here is your Exclusive Offer when you visit again<br></p>\n");
      out.write("\t\t  ");

		  Statement st1 = con.createStatement();
		  ResultSet rs1 = st1.executeQuery("SELECT promo FROM ( SELECT promo FROM newuserpromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs1.next();
          
      out.write("\n");
      out.write("          <img src=\"");
out.println(rs1.getString(1));
      out.write("\" alt=\"offer\" height=350 width=500 align=center>\n");
      out.write("\t\t  <input type=\"hidden\" name=\"offer\" value=\"");
      out.print( rs1.getString(1) );
      out.write("\"/>\n");
      out.write("\t\t  ");

		  }
		  
      out.write("\n");
      out.write("\t\t  \n");

Random rand = new Random();
int n = rand.nextInt(90000) + 10000;

      out.write("\n");
      out.write("        USERID     :<input type=\"text\" name=\"user\" value=\"");
 out.print(uid); 
      out.write("\" readonly /> \n");
      out.write("        OFFER CODE :<input type=\"text\" name=\"code\" value=\"");
      out.print(n);
      out.write("\" readonly />\n");
      out.write("                    <input type=\"submit\" value=\"Print and Send Feedback\">\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\t\tÂ <br />\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\t</td>\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td colspan=\"6\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td colspan=\"6\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td colspan=\"6\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td colspan=\"6\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"134\">&nbsp;</td>\n");
      out.write("\t<td width=\"188\">&nbsp;</td>\n");
      out.write("\t<td width=\"51\">&nbsp;</td>\n");
      out.write("\t<td width=\"454\">&nbsp;</td>\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("     \n");
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
