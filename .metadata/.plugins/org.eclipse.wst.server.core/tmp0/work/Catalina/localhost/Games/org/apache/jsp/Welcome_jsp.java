/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.13
 * Generated at: 2024-03-23 05:38:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>GAME SPOT</title>\r\n");
      out.write("	<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("	<meta name=\"description\" content=\"\" />\r\n");
      out.write("\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"initial-scale=1\">\r\n");
      out.write("    \r\n");
      out.write("	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<!-- This one in here is responsive menu for tablet and mobiles -->\r\n");
      out.write("    <div class=\"responsive-navigation visible-sm visible-xs\">\r\n");
      out.write("        <a href=\"#\" class=\"menu-toggle-btn\">\r\n");
      out.write("            <i class=\"fa fa-bars fa-2x\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"navigation responsive-menu\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"home\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Registration.jsp\">Register</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Cart.jsp\">Cart</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Contact.jsp\">Contact us</a></li>\r\n");
      out.write("	          \r\n");
      out.write("            </ul> <!-- /.main_menu -->\r\n");
      out.write("        </div> <!-- /.responsive_menu -->\r\n");
      out.write("    </div> <!-- /responsive_navigation -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"main-sidebar\" class=\"hidden-xs hidden-sm\">\r\n");
      out.write("		<div>\r\n");
      out.write("    <!-- &nbsp For Space -->\r\n");
      out.write("    <a><img src=\"images/welcome.png\" width=\"95%\"></a> <h1 style=\"margin:2%; text-align: center;\">");
      out.print(session.getAttribute("username"));
      out.write("</h1>\r\n");
      out.write(" 		</div>\r\n");
      out.write(" 		<br>\r\n");
      out.write(" 		<li class=\"\"><a href=\"ChangePassword.jsp\" class=\"external\"><b>Change My Password</b></a></li>\r\n");
      out.write(" 		<li class=\"home\"><a href=\"logout.jsp\" class=\"external\"><b>Logout</b></a></li>\r\n");
      out.write("		<div class=\"logo\"><a href=\"#\">\r\n");
      out.write("			  <h1>GAME SPOT</h1>\r\n");
      out.write("		</a>\r\n");
      out.write("		</div> <!-- /.logo -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"navigation\">\r\n");
      out.write("	        <ul class=\"main-menu\">\r\n");
      out.write("	            <li class=\"home\"><a href=\"index.jsp\" class=\"external\">Home</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Registration.jsp\" class=\"external\">Register</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Cart.jsp\" class=\"external\">Cart</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Contact.jsp\" class=\"external\">Contact Us</a></li>\r\n");
      out.write("	        </ul>\r\n");
      out.write("		</div> <!-- /.navigation -->\r\n");
      out.write("\r\n");
      out.write("	</div> <!-- /#main-sidebar -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"main-content\">\r\n");
      out.write("\r\n");
      out.write("	  <div id=\"templatemo\">\r\n");
      out.write("			<div class=\"main-slider\">\r\n");
      out.write("				\r\n");
      out.write("			<img src=\"images/main.jpg\" height = \"400\" width = \"90%\" style=\"margin:0 6%;\">		\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"welcome-text\">\r\n");
      out.write("						  <h2>Welcome to Game Spot !!!</h2>\r\n");
      out.write("						  <p><b>Game Spot is a Leading Online Gaming Site in the Internet. We Provide Free and Premium Games for our Customers. If You Want to Download Games You Need to Sign Up from Our Site.</b></p>\r\n");
      out.write("						  <p><b>Thanks for Visiting..! Enjoy Gaming...!</b> </p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div> <!-- /#sTop -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("			<div id=\"about\" class=\"section-content\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("        				<div class=\"member-item\">\r\n");
      out.write("            				<div class=\"member-thumb\">\r\n");
      out.write("                				<a href=\"GameDetails.jsp?gameID=1\" class=\"external\">\r\n");
      out.write("                				<img src=\"images/slide1.jpg\" alt=\"GTA Motor Wars\">\r\n");
      out.write("                				</a>\r\n");
      out.write("                    			\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>GTA MOTORWARS</h4>\r\n");
      out.write("							  <p>INR 500.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("								<a href=\"GameDetails.jsp?gameID=2\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide2.jpg\" alt=\"girl 2\">\r\n");
      out.write("								</a>\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>MODERN COMBAT 5</h4>\r\n");
      out.write("							  <p>INR 750.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("								<a href=\"GameDetails.jsp?gameID=3\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide3.jpg\" alt=\"girl 3\">\r\n");
      out.write("								</a>\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>CALL OF DUTY</h4>\r\n");
      out.write("							  <p>INR 800.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("				</div> <!-- /.row -->			    <!-- /.row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("							<a href=\"GameDetails.jsp?gameID=4\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide4.jpg\" alt=\"Minecraft\">\r\n");
      out.write("							</a>\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>MINECRAFT</h4>\r\n");
      out.write("							  <p>INR 500.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("							<a href=\"GameDetails.jsp?gameID=5\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide5.jpg\" alt=\"girl 5\">\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>BLUR</h4>\r\n");
      out.write("							  <p>INR 750.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("							<a href=\"GameDetails.jsp?gameID=6\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide6.jpg\" alt=\"girl 6\">\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>Fortnite</h4>\r\n");
      out.write("							  <p>INR 800.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("        				<div class=\"member-item\">\r\n");
      out.write("            				<div class=\"member-thumb\">\r\n");
      out.write("                				<a href=\"GameDetails.jsp?gameID=7\" class=\"external\">\r\n");
      out.write("                				<img src=\"images/slide7.jpg\" alt=\"Counter Strike 2\">\r\n");
      out.write("                				</a>\r\n");
      out.write("                    			\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>Counter Strike 2</h4>\r\n");
      out.write("							  <p>INR 500.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("								<a href=\"GameDetails.jsp?gameID=8\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide8.jpg\" alt=\"girl 2\">\r\n");
      out.write("								</a>\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>VOLARANT</h4>\r\n");
      out.write("							  <p>INR 750.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"member-item\">\r\n");
      out.write("							<div class=\"member-thumb\">\r\n");
      out.write("								<a href=\"GameDetails.jsp?gameID=9\" class=\"external\">\r\n");
      out.write("								<img src=\"images/slide9.jpg\" alt=\"girl 3\">\r\n");
      out.write("								</a>\r\n");
      out.write("								<!-- <div class=\"overlay\">\r\n");
      out.write("									<ul class=\"social-member\">\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("										<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div> -->\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"member-content\">\r\n");
      out.write("							  <h4>CYBERPUNK 2077</h4>\r\n");
      out.write("							  <p>INR 800.00</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div> <!-- /.col-md-4 -->\r\n");
      out.write("				</div> <!-- /.row -->\r\n");
      out.write("			</div> <!-- /#about -->\r\n");
      out.write("		    <!-- /#services -->\r\n");
      out.write("		    <!-- /#portfolio -->		    <!-- /#contact -->\r\n");
      out.write("\r\n");
      out.write("		</div> <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"site-footer\">\r\n");
      out.write("			<div class=\"first-footer\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-12\">\r\n");
      out.write("							<div class=\"social-footer\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\r\n");
      out.write("									<li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\r\n");
      out.write("									<li><a href=\"#\" class=\"fa fa-dribbble\"></a></li>\r\n");
      out.write("									<li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\r\n");
      out.write("									<li><a href=\"#\" class=\"fa fa-rss\"></a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div> <!-- /.social-footer -->\r\n");
      out.write("						</div> <!-- /.col-md-12 -->\r\n");
      out.write("					</div> <!-- /.row -->\r\n");
      out.write("				</div> <!-- /.container-fluid -->\r\n");
      out.write("			</div> <!-- /.first-footer -->\r\n");
      out.write("			<div class=\"bottom-footer\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-6\">\r\n");
      out.write("							<p class=\"copyright\">Copyright © 2024 <a href=\"#\">INTERNSHIP Project </a>\r\n");
      out.write("                            </p>\r\n");
      out.write("						</div> <!-- /.col-md-6 -->\r\n");
      out.write("						<div class=\"col-md-6 credits\">\r\n");
      out.write("							\r\n");
      out.write("						</div> <!-- /.col-md-6 -->\r\n");
      out.write("					</div> <!-- /.row -->\r\n");
      out.write("			</div> <!-- /#about -->\r\n");
      out.write("		    <!-- /#services -->\r\n");
      out.write("		    <!-- /#portfolio -->		    <!-- /#contact -->\r\n");
      out.write("\r\n");
      out.write("		</div> <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"site-footer\">\r\n");
      out.write("			\r\n");
      out.write("		</div> <!-- /.site-footer -->\r\n");
      out.write("\r\n");
      out.write("	</div> <!-- /#main-content -->\r\n");
      out.write("\r\n");
      out.write("	<!-- JavaScripts -->\r\n");
      out.write("	<script src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.singlePageNav.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("	<script src=\"js/custom.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document).ready(function(){\r\n");
      out.write("			$(\"a[data-gal^='prettyPhoto']\").prettyPhoto({hook: 'data-gal'});\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("        function initialize() {\r\n");
      out.write("          var mapOptions = {\r\n");
      out.write("            zoom: 13,\r\n");
      out.write("            center: new google.maps.LatLng(40.7809919,-73.9665273)\r\n");
      out.write("          };\r\n");
      out.write("\r\n");
      out.write("          var map = new google.maps.Map(document.getElementById('map-canvas'),\r\n");
      out.write("              mapOptions);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function loadScript() {\r\n");
      out.write("          var script = document.createElement('script');\r\n");
      out.write("          script.type = 'text/javascript';\r\n");
      out.write("          script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' +\r\n");
      out.write("              'callback=initialize';\r\n");
      out.write("          document.body.appendChild(script);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        window.onload = loadScript;\r\n");
      out.write("    </script>\r\n");
      out.write("<!-- templatemo 394 sonic -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
