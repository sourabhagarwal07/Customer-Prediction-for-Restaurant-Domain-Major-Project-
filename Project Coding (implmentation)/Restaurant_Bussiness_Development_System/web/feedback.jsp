<!DOCTYPE html>
<html>
<head>
<title>Feedback</title>
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

<%@ page import ="java.sql.*" %>
<%
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
      out.println("<b>Succefully Logged In.Please Provide Feedback</b><br>");%>


<div class="content">
	<h1>Feedback Form</h1>
	<div class="main">
		<form  method="post" action="feed_result1.jsp">
			<h5>USER ID</h5>
				<input type="text" name="uid" value=<% out.print(userid); %> readonly>
			<h5>Email</h5>
				<input type="text" name="umail" value="johnkeith@mail.com" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'johnkeith@mail.com';}" required="">
		
          <h5>Parking Lot</h5>
			<div class="radio-btns">
					<div class="swit">								
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiopar" value="None" checked=""><i></i>None</label> </div></div>
                        <div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiopar" value="Public"><i></i>Public</label> </div></div>
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiopar" value="Valet Parking"><i></i>Valet Parking</label> </div></div>
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiopar" value="Fee"><i></i>Fee</label> </div></div>
						<div class="clear"></div>
					</div>
			</div>		
		
		<h5>Food Type</h5>
			<div class="radio-btns">
					<div class="swit">								
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radio" value="Veg" checked=""><i></i>Veg</label> </div></div>
                        <div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radio" value="Non Veg"><i></i>Non Veg</label> </div></div>
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radio" value="Chinese"><i></i>Chinese</label> </div></div>
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radio" value="Maxican"><i></i>Maxican</label> </div></div>
						<div class="clear"></div>
					</div>
			</div>
			
			<h5>Price</h5>
			<div class="radio-btns">
					<div class="swit">								
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiop" value="Low" checked=""><i></i>Low</label> </div></div>
                        <div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiop" value="Medium"><i></i>Medium</label> </div></div>
						<div class="check_box_one"> <div class="radio"> <label><input type="radio" name="radiop" value="High"><i></i>High</label> </div></div>
						
						<div class="clear"></div>
					</div>
			</div>
		
		<h5>Food Rating</h5>
			<span class="starRating">
				<input id="rating5" type="radio" name="ratingf" value="2" checked>
				<label for="rating5">2</label>
				<input id="rating4" type="radio" name="ratingf" value="1">
				<label for="rating4">1</label>
				<input id="rating3" type="radio" name="ratingf" value="0" >
				<label for="rating3">0</label>
				
			</span>
			
			<h5>Service Rating</h5>
			<span class="starRating">
				<input id="ratings1" type="radio" name="ratings" value="2" checked>
				<label for="ratings1">2</label>
				<input id="ratings2" type="radio" name="ratings" value="1">
				<label for="ratings2">1</label>
				<input id="ratings3" type="radio" name="ratings" value="0" >
				<label for="ratings3">0</label>
				
			</span>
			
			<h5>Overall Rating</h5>
			<span class="starRating">
				<input id="ratingo1" type="radio" name="ratingo" value="2" checked>
				<label for="ratingo1">2</label>
				<input id="ratingo2" type="radio" name="ratingo" value="1">
				<label for="ratingo2">1</label>
				<input id="ratingo3" type="radio" name="ratingo" value="0" >
				<label for="ratingo3">0</label>
				
			</span>
			
			<h5>Is there anything you would like to tell us?</h5>	
				<textarea name="feed" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Type here';}" required="">Type here</textarea>
				<input type="hidden" name="yn" value="_">
				<input type="submit" value="Send Feedback">
		</form>
	</div>
	
</div>
<%} else {
        out.println("Invalid username or password <a href='index.html'>try again</a>");
    }
%>
</body>
</html>
