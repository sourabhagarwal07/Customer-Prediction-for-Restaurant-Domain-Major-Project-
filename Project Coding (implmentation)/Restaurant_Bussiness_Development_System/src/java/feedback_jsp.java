package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Feedback</title>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");

    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from reguser where userid='" + userid + "' and password='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
      out.println("<b>Succefully Logged In.Please Provide Feedback</b><br>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("\t<h1>Feedback Form</h1>\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<form  method=\"post\" action=\"feed_result1.jsp\">\r\n");
      out.write("\t\t\t<h5>USER ID</h5>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"uid\" value=");
 out.print(userid); 
      out.write(" readonly>\r\n");
      out.write("\t\t\t<h5>Email</h5>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"umail\" value=\"johnkeith@mail.com\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'johnkeith@mail.com';}\" required=\"\">\r\n");
      out.write("\t\t\r\n");
      out.write("          <h5>Parking Lot</h5>\r\n");
      out.write("\t\t\t<div class=\"radio-btns\">\r\n");
      out.write("\t\t\t\t\t<div class=\"swit\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiopar\" value=\"None\" checked=\"\"><i></i>None</label> </div></div>\r\n");
      out.write("                        <div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiopar\" value=\"Public\"><i></i>Public</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiopar\" value=\"Valet Parking\"><i></i>Valet Parking</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiopar\" value=\"Fee\"><i></i>Fee</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h5>Food Type</h5>\r\n");
      out.write("\t\t\t<div class=\"radio-btns\">\r\n");
      out.write("\t\t\t\t\t<div class=\"swit\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" value=\"Veg\" checked=\"\"><i></i>Veg</label> </div></div>\r\n");
      out.write("                        <div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" value=\"Non Veg\"><i></i>Non Veg</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" value=\"Chinese\"><i></i>Chinese</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" value=\"Maxican\"><i></i>Maxican</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h5>Price</h5>\r\n");
      out.write("\t\t\t<div class=\"radio-btns\">\r\n");
      out.write("\t\t\t\t\t<div class=\"swit\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiop\" value=\"Low\" checked=\"\"><i></i>Low</label> </div></div>\r\n");
      out.write("                        <div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiop\" value=\"Medium\"><i></i>Medium</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"check_box_one\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radiop\" value=\"High\"><i></i>High</label> </div></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h5>Food Rating</h5>\r\n");
      out.write("\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t<input id=\"rating5\" type=\"radio\" name=\"ratingf\" value=\"2\" checked>\r\n");
      out.write("\t\t\t\t<label for=\"rating5\">2</label>\r\n");
      out.write("\t\t\t\t<input id=\"rating4\" type=\"radio\" name=\"ratingf\" value=\"1\">\r\n");
      out.write("\t\t\t\t<label for=\"rating4\">1</label>\r\n");
      out.write("\t\t\t\t<input id=\"rating3\" type=\"radio\" name=\"ratingf\" value=\"0\" >\r\n");
      out.write("\t\t\t\t<label for=\"rating3\">0</label>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h5>Service Rating</h5>\r\n");
      out.write("\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t<input id=\"ratings1\" type=\"radio\" name=\"ratings\" value=\"2\" checked>\r\n");
      out.write("\t\t\t\t<label for=\"ratings1\">2</label>\r\n");
      out.write("\t\t\t\t<input id=\"ratings2\" type=\"radio\" name=\"ratings\" value=\"1\">\r\n");
      out.write("\t\t\t\t<label for=\"ratings2\">1</label>\r\n");
      out.write("\t\t\t\t<input id=\"ratings3\" type=\"radio\" name=\"ratings\" value=\"0\" >\r\n");
      out.write("\t\t\t\t<label for=\"ratings3\">0</label>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h5>Overall Rating</h5>\r\n");
      out.write("\t\t\t<span class=\"starRating\">\r\n");
      out.write("\t\t\t\t<input id=\"ratingo1\" type=\"radio\" name=\"ratingo\" value=\"2\" checked>\r\n");
      out.write("\t\t\t\t<label for=\"ratingo1\">2</label>\r\n");
      out.write("\t\t\t\t<input id=\"ratingo2\" type=\"radio\" name=\"ratingo\" value=\"1\">\r\n");
      out.write("\t\t\t\t<label for=\"ratingo2\">1</label>\r\n");
      out.write("\t\t\t\t<input id=\"ratingo3\" type=\"radio\" name=\"ratingo\" value=\"0\" >\r\n");
      out.write("\t\t\t\t<label for=\"ratingo3\">0</label>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h5>Is there anything you would like to tell us?</h5>\t\r\n");
      out.write("\t\t\t\t<textarea name=\"feed\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Type here';}\" required=\"\">Type here</textarea>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"yn\" value=\"_\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Send Feedback\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
} else {
        out.println("Invalid username or password <a href='index.html'>try again</a>");
    }

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
