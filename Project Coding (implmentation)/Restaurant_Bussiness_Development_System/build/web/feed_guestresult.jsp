<html>
<head>
<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->
<title>SUTZI</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="mm_restaurant1.css" type="text/css" />
</head>
<body bgcolor="#0066cc">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr bgcolor="#99ccff">
	<td width="134" nowrap="nowrap" bgcolor="#FFFFFF" ><img src="images/logo.png" width="101" height="80"  /></td>
	<td height="60" colspan="3" nowrap="nowrap" bgcolor="#FFFFFF" class="logo"><p align="center"><strong></strong></p>
	<div align="center"><span class="tagline"></span></td>
	<td width="4" bgcolor="#FFFFFF">&nbsp;</td>
	<td width="164" bgcolor="#FFFFFF"></td>
	</tr>

	<tr bgcolor="#003399">
	<td width="134" nowrap="nowrap">&nbsp;</td>
	<td height="36" colspan="3" id="navigation" nowrap="nowrap" class="navText"><a href="index.html">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="login.html">FEEDBACK</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="admin.html">Administrator</a>&nbsp;
      &nbsp;&nbsp;&nbsp;</td>
	  <td width="4">&nbsp;</td>
	<td width="164">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="6"></td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="2" valign="top" bgcolor="#ffffcc">
	<table border="0" cellspacing="0" cellpadding="0" width="230">
		
	</table>	</td>
	<td width="51" valign="top"></td>
	<td width="454" valign="top"><br />
	&nbsp;<br />
	<table border="0" cellspacing="0" cellpadding="0" width="440">
		<tr>
		<td class="pageHeader"></td>
		</tr>

		<tr>
		<td class="bodyText"><p>

</p>
<%@ page import ="java.sql.*" %>
<%@ page import ="java.util.*" %>

<%
 Class.forName("oracle.jdbc.driver.OracleDriver");
 String gid = request.getParameter("gid");
 String gmail = request.getParameter("gmail");
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
	int ins = stins.executeUpdate("insert into guestfeed(guestid, guest_mail, parking_lot, price, rating, food_rating, service_rating, yn, food_type, feedback) values ('" + gid + "','" + gmail + "','" + plot + "',' " + price + " ','" + rat + "','" + frat + "','" + srat + "','" + yn + "','" + food + "','" + feed + "')");
	if ( ins > 0) {
        
       out.print("<b>THANK YOU For Your Usefull FEEDBACK</b><br>");
    } else 
	{
        out.print("<b>FAILED to take entries,Please TRY AGAIN</b><br>"+"<a href='login.html'>Return to FEEDBACK Page</a><br><br>");
    }
	%>
	
	
	<br />		</td>
		</tr>
	</table>	</td>
	<td width="4">&nbsp;</td>
	<td width="164">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="6"></td>
	</tr>

	<tr>
	<td colspan="6">&nbsp;</td>
	</tr>


	<tr bgcolor="#003399">
	<td colspan="6"></td>
	</tr>

	<tr>
	<td colspan="6"></td>
	</tr>

	<tr bgcolor="#003399">
	<td colspan="6"></td>
	</tr>


	<tr>
	<td width="134">&nbsp;</td>
	<td width="188">&nbsp;</td>
	<td width="51">&nbsp;</td>
	<td width="454">&nbsp;</td>
	<td width="4">&nbsp;</td>
	<td width="164">&nbsp;</td>
	</tr>
</table>
</body>
</html>
     
