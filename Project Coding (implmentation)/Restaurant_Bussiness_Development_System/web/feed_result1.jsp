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
	%>
	<form method="post" action="offer_reg.jsp">
	<%
		  if(rowcount>1 || rowcount5>1)
		  {
		  %>
		  <b>Welcome OLD Customer<br></b>
		  <%
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
	%>
	<b>Customer Will Visit Again<br></b>
	<p>Here is his next visit offer<br></p>
	<%
	Statement st2 = con.createStatement();
		  ResultSet rs2 = st2.executeQuery("SELECT promo FROM ( SELECT promo FROM olduserhappypromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs2.next();
          %>
          <img src="<%out.println(rs2.getString(1));%>" alt="offer" height=350 width=500 align=center>
		  
		  <input type="hidden" name="offer" value="<%= rs2.getString(1) %>" hidden/>
	<%
	}
	else
	{
		%>
		<b>Customer may not visit again<br></b>
		<p>Here is his next time visit offer<br></p>
		<%
	Statement st3 = con.createStatement();
		  ResultSet rs3 = st3.executeQuery("SELECT promo FROM ( SELECT promo FROM oldusersadpromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs3.next();
          %>
          <img src="<%out.println(rs3.getString(1));%>" alt="offer" height=350 width=500 align=center>
		  <input type="hidden" name="offer" value="<%= rs3.getString(1) %>"/>
		<%
	}
	%>
		  <%
		  }
		  else
		  {
		  %>
          <b>Welcome New Customer<br></b>
		  <p>Here is your Exclusive Offer when you visit again<br></p>
		  <%
		  Statement st1 = con.createStatement();
		  ResultSet rs1 = st1.executeQuery("SELECT promo FROM ( SELECT promo FROM newuserpromo ORDER BY dbms_random.value ) WHERE rownum = 1") ;
		  rs1.next();
          %>
          <img src="<%out.println(rs1.getString(1));%>" alt="offer" height=350 width=500 align=center>
		  <input type="hidden" name="offer" value="<%= rs1.getString(1) %>"/>
		  <%
		  }
		  %>
		  
<%
Random rand = new Random();
int n = rand.nextInt(90000) + 10000;
%>
        USERID     :<input type="text" name="user" value="<% out.print(uid); %>" readonly /> 
        OFFER CODE :<input type="text" name="code" value="<%=n%>" readonly />
                    <input type="submit" value="Print and Send Feedback">
                    </form>

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
     
