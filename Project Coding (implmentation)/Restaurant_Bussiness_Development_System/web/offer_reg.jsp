<%@ page import ="java.sql.*" %>
<%@ page import ="java.util.*" %>

<%
 Class.forName("oracle.jdbc.driver.OracleDriver");
 
 String uid = request.getParameter("user");
 String offer = request.getParameter("offer");
 String code = request.getParameter("code");
 
 java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
	
	Statement stins = con.createStatement();
	
	int ins = stins.executeUpdate("insert into offer_code(userid, code, offer) values ('" + uid + "','" + code + "','" + offer + "')");
	
	if ( ins > 0) {
        
       out.print("<b>THANK YOU For Your Usefull FEEDBACK. DO VISIT AGAIN.</b><br>"+"<a href='login.html'>Return to FEEDBACK Page</a><br><br>");
    } else {
        out.print("<b>FAILED to take entries,Please TRY AGAIN</b><br>"+"<a href='login.html'>Return to FEEDBACK Page</a><br><br>");
    }
%>