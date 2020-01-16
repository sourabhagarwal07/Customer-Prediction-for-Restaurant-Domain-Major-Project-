<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- DW6 -->
<head>
<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->
<title>SUTZI</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="mm_restaurant1.css" type="text/css" />
</head>
<body bgcolor="#0066cc">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr bgcolor="#99ccff">
	<td width="134" nowrap="nowrap" bgcolor="#FFFFFF" ><img src="images/logo.png" width="101" height="80" /></td>
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
    java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
%>	
	<FORM ACTION="self.jsp" METHOD="POST">
            Please enter the ID of the USER you want to find:
            <BR>
            <INPUT TYPE="TEXT" NAME="uid">
            <BR>
            <INPUT TYPE="SUBMIT" value="Submit">
        </FORM>


        <H1>Fetching Data From a Database</H1>

        <% 
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");

            Statement statement = connection.createStatement();

            String id = request.getParameter("uid");  

            ResultSet resultset = 
                statement.executeQuery("select rating,food_rating,service_rating,food_type from userfeed where userid='"+id+"'") ; 


        %>
		<%
		if(!resultset.next())
		{
			Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");

            Statement st = co.createStatement();

            //String id1 = request.getParameter("uid");  

            ResultSet rs = 
                st.executeQuery("select rating,food_rating,service_rating,food_type from userfeed1 where userid='"+id+"'") ; 
		%>
		<TABLE BORDER="1">
            <TR><th colspan=4><% out.println(id); %></th></tr>
			
               <tr><td>Rating</td>
               <td>FOOD Rating</td>
               <td>SERVICE Rating</td>
               <td>FOOD TYPE</td>
               
           </TR>
		   <% while(rs.next()){ %>
           <TR>
               <TD> <%= rs.getString(1) %> </TD>
               <TD> <%= rs.getString(2) %> </TD>
               <TD> <%= rs.getString(3) %> </TD>
               <TD> <%= rs.getString(4) %> </TD>
               
           </TR>
		   <% 
			}
       %>
	   <%
		}
		
        else
		{
			%>
        <TABLE BORDER="1">
            <TR><th colspan=4><% out.println(id); %></th></tr>
			
               <tr><td>Rating</td>
               <td>FOOD Rating</td>
               <td>SERVICE Rating</td>
               <td>FOOD TYPE</td>
               
           </TR>
		   <% while(resultset.next()){ %>
           <TR>
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%= resultset.getString(4) %> </TD>
               
           </TR>
		   <% 
			}
		}
	   %>
       </TABLE>
       <BR>
	   <%
       Statement st1 = connection.createStatement();

            String id1 = request.getParameter("uid");  

            ResultSet rs1 = 
                st1.executeQuery("select userid,email,phone from reguser where userid = '" + id1 + "'") ; 

            if(!rs1.next()) {
                out.println("Wait for the server. OR " +
                "Please <A HREF='self.jsp'>try again</A>.");
            } else {
        %>

        <TABLE BORDER="1">
            <TR>
               <TH>ID</TH>
               <TH>EMAIL</TH>
               <TH>PHONE</TH>
           </TR>
           <TR>
               <TD> <%= rs1.getString(1) %> </TD>
               <TD> <%= rs1.getString(2) %> </TD>
               <TD> <%= rs1.getString(3) %> </TD>
           </TR>
       </TABLE>
       <BR>
       <% 
			}
       %>
	   
	   <br />		</td>
		</tr>
	</table>	</td>
	<td width="4">&nbsp;</td>
	<td width="164">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="6"><img src="Images/mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
	</tr>

	<tr>
	<td colspan="6">&nbsp;</td>
	</tr>


	<tr bgcolor="#003399">
	<td colspan="6"><img src="Images/mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
	</tr>

	<tr>
	<td colspan="6"><img src="Images/mm_spacer.gif" alt="" width="1" height="2" border="0" /></td>
	</tr>

	<tr bgcolor="#003399">
	<td colspan="6"><img src="Images/mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
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
     
