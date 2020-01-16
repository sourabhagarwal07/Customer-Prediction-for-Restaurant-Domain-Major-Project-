package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class feed_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

 Class.forName("oracle.jdbc.driver.OracleDriver");
 String uid = request.getParameter("uid");
    java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
	int rowcount=-1;
    Statement stmt = con.createStatement();
    ResultSet resultSet = stmt.executeQuery("SELECT COUNT(userid) FROM userfeed where userid='" + uid + "'");

    // Get the number of rows from the result set
    resultSet.next();
    rowcount = resultSet.getInt(1);
	//out.print("Number of rows="+rowcount);
	//if(!resultSet.next()) {
      //          out.println("Wait for the server. OR " +
        //        "Please <A HREF='self.jsp'>try again</A>.");
          //  } else {}
		  if(rowcount>1)
		  {
		  
      out.write("\r\n");
      out.write("\t\t  <b>Welcome OLD Customer<br></b>\r\n");
      out.write("\t\t  ");

		  int rowcnt=-1;
    Statement stmnt = con.createStatement();
    ResultSet resultset = stmnt.executeQuery("select count(yn) from userfeed where userid='U1004' and yn='n'");

    // Get the number of rows from the result set
    resultset.next();
    rowcnt = resultset.getInt(1);
	
	int rwcnt=-1;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select count(yn) from userfeed where userid='U1004' and yn='y'");

    // Get the number of rows from the result set
    rs.next();
    rwcnt = rs.getInt(1);
	if(rwcnt>rowcnt)
	{
	
      out.write("\r\n");
      out.write("\t<b>Customer Will Visit Again<br></b>\r\n");
      out.write("\t<p>Here is his next visit offer<br></p>\r\n");
      out.write("\t");

	}
	else
	{
		
      out.write("\r\n");
      out.write("\t\t<b>Customer may not visit again<br></b>\r\n");
      out.write("\t\t<p>Here is his next time visit offer<br></p>\r\n");
      out.write("\t\t");

	}
	
      out.write("\r\n");
      out.write("\t\t  ");

		  }
		  else
		  {
		  
      out.write("\r\n");
      out.write("          <b>Welcome New Customer<br></b>\r\n");
      out.write("\t\t  <p>Here is your Exclusive Offer when you visit again<br></p>\r\n");
      out.write("\t\t  ");

		  Statement st1 = con.createStatement();
		  ResultSet rs1 = st1.executeQuery("SELECT promo FROM ( SELECT promo FROM newuserpromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs1.next();
          
      out.write("\r\n");
      out.write("          <img src=\"");
out.println(rs1.getString(1));
      out.write("\" alt=\"offer\" height=350 width=500 align=center>\r\n");
      out.write("\t\t  ");

		  }
		  
      out.write("\r\n");
      out.write("\t\t  ");
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
