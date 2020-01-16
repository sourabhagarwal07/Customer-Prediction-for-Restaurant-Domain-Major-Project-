<!doctype html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>
	<link rel="stylesheet" href="css/style1.css" type="text/css">
	<link rel="stylesheet" type="text/css" href="css/mobile.css">
	<script src="js/mobile.js" type="text/javascript"></script>
</head>
<body>
	<div id="page">
		<div id="header">
			<div>
				<a href="index.html" class="logo"><img src="images/logo.png" alt=""></a>
				<ul id="navigation">
					<li class="selected">
						<a href="index.html">HOME</a>
					</li>
					<li class="menu">
						<a href="admin.html">ADMINISTRATOR</a>
					</li>
					<li class="menu">
						<a href="feedback.html">FEEDBACK</a>
					</li>
				</ul>
			</div>
		</div>
		</div>
		<div id="body">
			<div class="header">
				<div>
					<h1>HELLO</h1>
				</div>
			</div>
			<div class="body">
				<img src="images/bg-header-about.jpg" alt="">
			</div>
			<div class="footer">
				<div class="sidebar">
					<h1>BECOME A MEMBER AND LOGIN</h1>
					<p></p>
				</div>
				<div class="article">
                            <%@ page language="java" import="java.sql.*, java.io.*, java.lang.*" %>
                            <% String username=request.getParameter("uid");
                               String password=request.getParameter("password");
                               String emailid=request.getParameter("email");
                               String payment=request.getParameter("pay");
                               String phone=request.getParameter("phone");
                                
       try {Class.forName("oracle.jdbc.driver.OracleDriver");
         } catch (java.lang.ClassNotFoundException e) {System.out.println("ClassNotFoundException: " + e.getMessage());}   
    Connection con;
    Statement st;
	try{
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "sourabh007");
			st=con.createStatement();
    int i = st.executeUpdate("insert into reguser(userid, password, email, payment, phone) values ('" + username + "','" + password + "','" + emailid + "','" +payment+ "','" +phone+ "')");
	
	if ( i > 0) {
        //session.setAttribute("userid", user);
        //response.sendRedirect("i_successfull.jsp");
       out.print("<p>Registration Successfull!"+"<a href='login.html'>Go to Login</a></p>");
    } else {
        out.print("<p><b>Select a unique userID.Your UserID is already taken</b></p>");
    }}
	catch(Exception e){
		out.println(e);
	}
                               
                               %>
							   
							   </div>
			</div>
		</div>
		<div id="footer">
			<div>
				<div class="connect">
					<a href="" class="facebook">facebook</a>
					<a href="" class="twitter">twitter</a>
					<a href="" class="googleplus">googleplus</a>
					<a href="" class="pinterest">pinterest</a>
				</div>
				<p>&copy;All Rights Reserved.</p>
			</div>
		</div>
	</div>
</body>
</html>
