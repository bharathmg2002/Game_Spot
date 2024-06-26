<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
    <title>GAME SPOT</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="initial-scale=1">
    
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/templatemo_misc.css">
	<link rel="stylesheet" href="css/templatemo_style.css">
	 <%
	 String gameID = request.getParameter("gameID");
	 String uname = (String) session.getAttribute("username");
    if (null == uname) {
    	session.setAttribute("errorMessage", "Login Failed ");
    	out.println("<script type='text/javascript'>");
	    out.println("alert('To contact us login first!!');");
	    out.println("window.location='login.jsp';"); // Redirect back to the login page
	    out.println("</script>");
    }
 %>
</head>
<body>
	
	<!-- This one in here is responsive menu for tablet and mobiles -->
    <div class="responsive-navigation visible-sm visible-xs">
        <a href="#" class="menu-toggle-btn">
            <i class="fa fa-bars fa-2x"></i>
        </a>
       
        <div class="navigation responsive-menu">
            <ul>
                <li class="home"><a href="index.jsp">Home</a></li>
	            <li class="home"><a href="Registration.jsp">Register</a></li>
	            <li class="home"><a href="login.jsp">Login</a></li>
	            <li class="home"><a href="Cart.jsp">Cart</a></li>
	            <li class="home"><a href="Contact.jsp">Contact us</a></li>
	          
            </ul> <!-- /.main_menu -->
        </div> <!-- /.responsive_menu -->
    </div> <!-- /responsive_navigation -->

	<div id="main-sidebar" class="hidden-xs hidden-sm">
	<div>
    <!-- &nbsp For Space -->
   	Welcome, <%=session.getAttribute("username")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;
		</div>
 		<li class=""><a href="ChangePassword.jsp" class="external">Change My Password</a></li>
 		<li class="home"><a href="logout.jsp" class="external">Logout</a></li>
		<div class="logo"><a href="#">
		  <h1>GAME SPOT</h1>
		</a><br>
		</div> <!-- /.logo -->

		<div class="navigation">
	        <ul class="main-menu">
	            <li class="home"><a href="Welcome.jsp" class="external">Home</a></li>
	            <li class="home"><a href="Registration.jsp" class="external">Register</a></li>
	            <li class="home"><a href="login.jsp" class="external">Login</a></li>
	            <li class="home"><a href="Cart.jsp" class="external">Cart</a></li>
	            <li class="home"><a href="Contact.html" class="external">Contact Us</a></li>
        </ul>
		</div> <!-- /.navigation -->

	</div> <!-- /#main-sidebar -->

	<div id="main-content">

		<div id="templatemo">
			
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<div class="welcome-text">
					  <img src="images/contact.png" height = "200" width = "220">	
						  <h2><strong> </strong></h2>
						  <p>-- Ask Your Questions Here..! We Will Respong You Soon... --</p>
						 <!--Form Begins-->
              				<pre>
               				<form action="ContactServlet" method="post" align="center">
            
              <label class="main">Name: </label>                   <input align="center" type="text" placeholder="name" name="name">
               
              <label class="main">E-Mail: </label>                 <input align="center" type="email" placeholder="email" name="email">
              </br>  
              <!--        
	          <label class="main">Message: </label>     
              </br>           	-->
              <input class="DivMessage" type="text" name="msg" placeholder="Your Message Here..!">
                      
                        
                 <input type = "submit" value = "Submit" style = "background:#38A9E3;
                 
 
  font-family: Open Sans;
  color: #ffffff;
  font-size: 27px;
  padding: 10px 20px 10px 20px;
  text-decoration: none;">
       

       </form>
		</pre>
                		<!--form Ends-->
                 
						  <!--Note-->
						</div>
					</div>
				</div>
			</div>
		</div> <!-- /#sTop -->

		<div class="container-fluid">

		</div>	

		<div class="site-footer">
			<div class="first-footer">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<div class="social-footer">
								<ul>
									<li><a href="#" class="fa fa-facebook"></a></li>
									<li><a href="#" class="fa fa-twitter"></a></li>
									<li><a href="#" class="fa fa-dribbble"></a></li>
									<li><a href="#" class="fa fa-linkedin"></a></li>
									<li><a href="#" class="fa fa-rss"></a></li>
								</ul>
							</div> <!-- /.social-footer -->
						</div> <!-- /.col-md-12 -->
					</div> <!-- /.row -->
				</div> <!-- /.container-fluid -->
			</div> <!-- /.first-footer -->
			<div class="bottom-footer">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-6">
							<p class="copyright">Copyright � 2024 <a href="#">INTERNSHIP PROJECT </a>
                            </p>
						</div> <!-- /.col-md-6 -->
						<div class="col-md-6 credits">
							
						</div> <!-- /.col-md-6 -->
					</div> <!-- /.row -->
				</div> <!-- /.container-fluid -->
			</div> <!-- /.bottom-footer -->
		</div> <!-- /.site-footer -->

	</div> <!-- /#main-content -->

	<!-- JavaScripts -->
	<script src="js/jquery-1.10.2.min.js"></script>
	<script src="js/jquery.singlePageNav.js"></script>
	<script src="js/jquery.flexslider.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/custom.js"></script>
	<script>
		$(document).ready(function(){
			$("a[data-gal^='prettyPhoto']").prettyPhoto({hook: 'data-gal'});
		});

        function initialize() {
          var mapOptions = {
            zoom: 13,
            center: new google.maps.LatLng(40.7809919,-73.9665273)
          };

          var map = new google.maps.Map(document.getElementById('map-canvas'),
              mapOptions);
        }

        function loadScript() {
          var script = document.createElement('script');
          script.type = 'text/javascript';
          script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' +
              'callback=initialize';
          document.body.appendChild(script);
        }

        window.onload = loadScript;
    </script>
<!-- templatemo 394 sonic -->
</body>
</html>