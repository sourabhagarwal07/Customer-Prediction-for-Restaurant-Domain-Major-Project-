<html>
<head>
<title>Feedback Widget Flat Responsive Widget Template :: w3layouts</title>
<!-- for-mobile-apps -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Feedback Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!-- //for-mobile-apps -->

<link href='//fonts.googleapis.com/css?family=Josefin+Slab:400,100,100italic,300,300italic,400italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div class="content">
	<h1>CODE VERIFIER</h1>
	<div class="main">
	<%@ page import ="java.sql.*" %>
<%
 Class.forName("oracle.jdbc.driver.OracleDriver");
 %>
 <FORM ACTION="verify_code.jsp" METHOD="POST">
            Please enter the OFFER CODE
            <BR>
			<INPUT Type="TEXT" NAME="user" placeholder="ENTER USERID">
            <INPUT TYPE="TEXT" NAME="code" placeholder="ENTER OFFER CODE">
            <BR>
            <INPUT TYPE="SUBMIT" value="Submit">
        </FORM>
	<%	
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
		
		Statement st = con.createStatement();
		
		String uid = request.getParameter("user");
		String id = request.getParameter("code");  

            ResultSet rs = st.executeQuery("select offer from offer_code where userid = '" + uid + "' and code = '" + id + "'") ; 
		
		if(rs.next()) 
		{
			session.setAttribute("userid", uid);
			%>
			<img src=" <%= rs.getString(1) %> " >
			<%
        } 
		else 
		{       
		out.println("<b>(ENTER VALID OFFER CODE)</b>");
		}
		%>
 
			
</div>
</div>		
<b>GO BACK TO </b><a href="login.html">FEEDBACK</a><br>
</body>
</html>
				