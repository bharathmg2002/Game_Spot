/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.13
 * Generated at: 2024-03-23 05:40:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class GameDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("	");

    // Retrieve the gameID parameter from the request
    String gameID = request.getParameter("gameID");

    // You can use the gameID to fetch information about the game from a database or some other source
    // For simplicity, let's just display the gameID for now
    
     // Default values for the case when gameID is not specified or is invalid
        String gameName = "Unknown Game";
        String requirements = "Requirements not available";
        String description = "Description not available";

        // Check if gameID is specified
        if (gameID != null && !gameID.isEmpty()) {
            // Use a switch statement or another logic to handle different game IDs
            switch (gameID) {
                case "1":
                    gameName = "Game 1";
                    requirements = "* OS: Windows 8.1 64-Bit, Windows 8 64-Bit, Windows 7 64-Bit Service Pack 1 \n * Processor: IntelÂ® Coreâ¢ 2 Quad CPU Q6600 2.40 GHz (4 CPUs) or AMD Phenom 9850 Quad-Core Processor (4  &nbsp;&nbsp;&nbsp;CPUs) 2.5 GHz \n* RAM: 4GB \n* Video card: NVIDIAÂ® 9800 GT (1GB), AMD HD 4870 (1GB) \n* DirectX: 10, 11 \n* Sound card: 100% DirectX 10 compatible \n* HDD space: 65GB";
                    description = "GTA gameplay mixes third-person shooting, driving, and cinematic storytelling in detailed environments\n ranging from cityscapes to desert paths. The multiplayer component, GTA Online, has become massively popular,\n too, with its own missions and story beats.";
                    break;
                case "2":
                    gameName = "Game 2";
                    requirements = "* CPU: Intel(R) Core(TM)2 Duo CPU E7500\n* CPU SPEED: Info\n* RAM: 2 GB\n* VIDEO CARD: NVIDIA Geforce GT 220\n* DEDICATED VIDEO RAM: 512 MB\n* PIXEL SHADER: 4.1\n* VERTEX SHADER: 4.1\n* OS: Windows 7 SP1 or newer\n* FREE DISK SPACE: 4 GB\n* SOUND CARD: DirectX compatible";
                    description = "Modern Combat 5: Blackout game is primarily a first person shooter, but missions include controlling turrets on \n boats, helicopters, and even drones.";
                    break;
                
                case "3":
                	gameName= "Game 3";
                	requirements="OS*: Windows 10 64-bit (v.1709 or higher)\n* CPU: Intel Core i3-4340 or AMD FX-6300\n* RAM: 8GB RAM\n* HDD: 246GB HD space\n* Video: NVIDIA GeForce GTX 670 / GeForce GTX 1650 or Radeon HD 7950\n* DirectX: Requires DirectX 12 compatible system\n* Network: Broadband Internet connection\n* Sound Card: DirectX Compatible";
                    description="The game simulates infantry and combined arms warfare of World War II using a modified version of the id Tech 3\n engine. Much of its theme and gameplay is similar to the Medal of Honor series; however, Call of Duty showcases\n multiple viewpoints staged in the American, British, and Soviet theaters of World War II.";	
                	break;
                case "4":
                	gameName= "Game 4";
                	requirements="CPU: Intel Core i3-3210 3.2 GHz / AMD A8-7600 APU 3.1 GHz or equivalent\nCPU SPEED: Info\nRAM: 2 GB\nVIDEO CARD: Integrated: Intel HD Graphics 4000 (Ivy Bridge) or AMD Radeon R5 series (Kaveri line) with OpenGL 4.41Discrete: Nvidia GeForce 400 Series or AMD Radeon HD 7000 series with OpenGL 4.4\nPIXEL SHADER: 5.0\nVERTEX SHADER: 5.0\nOS: Windows 7 and up\nFREE DISK SPACE: At least 1 GB for Game Core and Other Files";
                    description="Minecraft is a game made up of blocks, creatures, and community. You can survive the night or build a work of art-\n the choice is all yours. But if the thought of exploring a vast new world all on your own feels overwhelming,\n then fear not!";	
                	break;
                	
                case "5":
                	gameName= "Game 5";
                	requirements="CPU: Intel(R) Pentium(R) D Dual Core 3.4 GHz or AMD Athlon(TM) 64 x2 3800+\nRAM: 1 GB RAM for Windows XP, 2 GB RAM for Winodws Vista/7\nVIDEO CARD: 3D hardware accelerator card required - 100% DirectX(R) 9.0c-compliant 256 MB video card and drivers (NVIDIA(R) GeForce(R) 6600 GT 256 MB RAM and better chipsets / ATI Radeon(TM) 1600XT 256 MB RAM and better chipsets)\nTOTAL VIDEO RAM: 256 MB\nPIXEL SHADER: 3.0\nVERTEX SHADER: 3.0\nHARDWARE T&L: Yes\nDIRECTX VERSION: DirectX(R) 9.0c (Included)\nOS: Microsoft(R) Windows(R) XP / Vista(R) / 7\nFREE DISK SPACE: 14 GB of free hard drive space\nSOUND CARD: Yes\nDVD-ROM: 100% Windows - compatible 6x speed DVD-ROM drive (600 K/sec sustained transfer rate) and drivers";
                    description="Blur (stylized as blur) or Blur Racerz is a 2010 vehicular combat arcade-style racing video game for Microsoft\n Windows, PlayStation 3 and Xbox 360. It was developed by Bizarre Creations, published by Activision in North\n America and Europe, and published in Japan by Square Enix.";	
                	break; 
                    
                case "6":
                	gameName= "Game 6";
                	requirements="CPU: Core i3-3225 3.3 GHz\nRAM: 4 GB\nVIDEO CARD: Intel HD 4000\nOS: Windows 7/8/10 64-bit";
                    description="Fortnite is a survival game where 100 players fight against each other in player versus player combat to be the last\n one standing. It is a fast-paced, action-packed game, not unlike The Hunger Games, where strategic thinking is a \nmust in order to survive.";	
                	break;                
                    		
                case "7":
                	gameName= "Game 7";
                	requirements="CPU: IntelÂ® Coreâ¢ i5 750 or higher (4 hardware CPU threads\nRAM: 8 GB\nVIDEO CARD: Video card must be 1 GB or more and should be a DirectX 11-compatible with support for Shader Model 5.0\nDEDICATED VIDEO RAM: 1 GB\nPIXEL SHADER: 5.0\nVERTEX SHADER: 5.0\nOS: WindowsÂ® 10\nFREE DISK SPACE: 85 GB";
                    description="Counter-Strike 2 features major technical improvements over Global Offensive, including a move from the Source\n game engine to Source 2, improved graphics and new server architecture. In addition, many maps from Global \nOffensive were updated to use the features of Source 2, with some maps receiving complete overhauls.";	
                	break;                
                    		
                case "8":
                	gameName= "Game 8";
                	requirements="CPU: Intel Core 2 Duo E8400 / AMD Athlon 200GE\nRAM: 4 GB\nVIDEO CARD: Intel HD 4000 / Radeon R5 200\nPIXEL SHADER: 3.0\nVERTEX SHADER: 3.0\nOS: Windows 7/8/10 64-bit";
                    description="Valorant is an online multiplayer computer game, produced by Riot Games. It is a first-person shooter game,\n consisting of two teams of five, where one team attacks and the other defends. Players control characters known\n as 'agents', who all have different abilities to use during gameplay.";	
                	break;    
                    	
                case "9":
                	gameName= "Game 9";
                	requirements="CPU: Core i7-6700 or Ryzen 5 1600\nRAM: 12 GB\nVIDEO CARD: GeForce GTX 1060 6GB or Radeon RX 580 8GB or Arc A380\nDEDICATED VIDEO RAM: 8 GB (6GB NVIDIA)\nPIXEL SHADER: 5.0\nVERTEX SHADER: 5.0\nOS: Windows 10 64-bit\nFREE DISK SPACE: 70 GB";
                    description="Cyberpunk 2077 is an open-world, action-adventure RPG set in Night City, a megalopolis obsessed with power,\n glamour and body modification. Play as V, a cyberpunk mercenary, and take on the most powerful forces of the\n city in a fight for glory and survival.";	
                	break;                
                	
                	
                	
                			
                			
                			
                			
                			
                // Add more cases for other game IDs as needed
                default:
                    // Handle unknown game IDs
                    gameName = "Unknown Game";
                    requirements = "Requirements not available";
                    description = "Description not available";
                    break;
            }
        }

      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Add more content to display detailed information about the selected game -->\r\n");
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
      out.write("	            <li class=\"home\"><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Cart.jsp\">Cart</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Contact.jsp\" onClick=\"alertName()\">Contact us</a></li>\r\n");
      out.write("	          \r\n");
      out.write("            </ul> <!-- /.main_menu -->\r\n");
      out.write("        </div> <!-- /.responsive_menu -->\r\n");
      out.write("    </div> <!-- /responsive_navigation -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"main-sidebar\" class=\"hidden-xs hidden-sm\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"logo\"><a href=\"#\">\r\n");
      out.write("		  <h1>GAME SPOT</h1>\r\n");
      out.write("		</a><br>\r\n");
      out.write("		</div> <!-- /.logo -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"navigation\">\r\n");
      out.write("	        <ul class=\"main-menu\">\r\n");
      out.write("	            <li class=\"home\"><a href=\"index.jsp\" class=\"external\">Home</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Registration.jsp\" class=\"external\">Register</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"login.jsp\" class=\"external\">Login</a></li>\r\n");
      out.write("	            <li class=\"home\"><a href=\"Contact.jsp\" class=\"external\">Contact Us</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("		</div> <!-- /.navigation -->\r\n");
      out.write("\r\n");
      out.write("	</div> <!-- /#main-sidebar -->\r\n");
      out.write("\r\n");
      out.write("	<div id=\"main-content\">\r\n");
      out.write("\r\n");
      out.write("	  <div id=\"templatemo\">\r\n");
      out.write("			<div class=\"main-slider\">\r\n");
      out.write("				\r\n");
      out.write("			<img src=\"images/slide");
      out.print(gameID );
      out.write(".jpg\" height = \"400\" width = \"90%\" style=\"margin:0 6%;\">		\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"welcome-text\">\r\n");
      out.write("						  \r\n");
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
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"section-title\">\r\n");
      out.write("							<h2><b>Description</b></h2>\r\n");
      out.write("						\r\n");
      out.write("						");

					            String[] descriptionLines = description.split("\\n");
					            for (String descriptions : descriptionLines) {
					        
      out.write("\r\n");
      out.write("					            <h3 style=\"color:black;font-size:1.3em;\"><b>");
      out.print( descriptions );
      out.write("</b></h3>\r\n");
      out.write("					        ");

					            }
					        
      out.write("\r\n");
      out.write("					        </div>\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						");
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"section-title\">\r\n");
      out.write("							<h2 ><b>Requirements</b></h2>\r\n");
      out.write("							 ");
      out.write("\r\n");
      out.write("					        ");

					            String[] requirementLines = requirements.split("\\n");
					            for (String requirement : requirementLines) {
					        
      out.write("\r\n");
      out.write("					            <h3 style=\"color:black;font-size:1.3em;\"><b>");
      out.print( requirement );
      out.write("</b></h3>\r\n");
      out.write("					        ");

					            }
					        
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("												");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div> <!-- /.row -->			    <!-- /.row -->\r\n");
      out.write("				<button style=\"margin:0 46%; padding:1% 4%;\" onclick=\"navigateToPage()\">BUY</button>\r\n");
      out.write("			</div> <!-- /#about -->\r\n");
      out.write("			\r\n");
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
      out.write("							<p class=\"copyright\">Copyright Â© 2024 <a href=\"#\">INTERNSHIP Project </a>\r\n");
      out.write("                            </p>\r\n");
      out.write("						</div> <!-- /.col-md-6 -->\r\n");
      out.write("						<div class=\"col-md-6 credits\">\r\n");
      out.write("							\r\n");
      out.write("						</div> <!-- /.col-md-6 -->\r\n");
      out.write("					</div> <!-- /.row -->\r\n");
      out.write("				</div> <!-- /.container-fluid -->\r\n");
      out.write("			</div> <!-- /.bottom-footer -->\r\n");
      out.write("		</div> <!-- /.site-footer -->\r\n");
      out.write("\r\n");
      out.write("	</div> <!-- /#main-content -->\r\n");
      out.write("-->\r\n");
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
      out.write("    <script>\r\n");
      out.write("    // JavaScript function to handle navigation\r\n");
      out.write("    function navigateToPage() {\r\n");
      out.write("        // Replace 'another-page.html' with the actual filename or URL of the page you want to navigate to\r\n");
      out.write("    	var gameIdParameter = 'gameID=' + '");
      out.print( gameID );
      out.write("';\r\n");
      out.write("        window.location.href = 'Cart.jsp?' + gameIdParameter;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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