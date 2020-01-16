<%@ page import ="java.sql.*" %>
<%@ page import ="java.util.*" %>

<%
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
		  %>
		  <b>Welcome OLD Customer<br></b>
		  <%
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
	%>
	<b>Customer Will Visit Again<br></b>
	<p>Here is his next visit offer<br></p>
	<%
	}
	else
	{
		%>
		<b>Customer may not visit again<br></b>
		<p>Here is his next time visit offer<br></p>
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
		  <%
		  }
		  %>
		  