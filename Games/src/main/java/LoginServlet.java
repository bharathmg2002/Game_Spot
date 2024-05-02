//Safnaj
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Nothing in Get Method
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	       throws ServletException, IOException {
	           response.setContentType("text/html;charset=UTF-8");
	           PrintWriter out = response.getWriter();
	           
	           User user = new User(); //Creatin Object from User Class
	   		
	   			//user.setUsername(request.getParameter("username"));
	   			//user.setPassword(request.getParameter("password"));
	           
	           String username = request.getParameter("username");	//Getting Value from HTML Field
	           String password = request.getParameter("password");	//getting Value from HTML Field
	           
	           if (username == null || password == null) {
	                out.print("Username & Password Required..!");
	           }
	           
	           if(LoginValidate.checkuser(username, password))	//Validating Login Details with Login validate class
	           {
	        	   HttpSession session = request.getSession();
	               session.setAttribute("username", username);	//Seesion saves user name for Welcome
	               
	               RequestDispatcher rs = request.getRequestDispatcher("Welcome.jsp");	//Redirect Page
	               rs.forward(request, response);
	           
	           }
	           else {
	        	    // If Login Credentials are Wrong Print This.
	        	    out.println("<script type='text/javascript'>");
	        	    out.println("alert('Username or Password Incorrect');");
	        	    out.println("window.location='login.jsp';"); // Redirect back to the login page
	        	    out.println("</script>");
	        	    // You can also use RequestDispatcher to forward to an error page if needed.
	        	    // RequestDispatcher rs = request.getRequestDispatcher("LoginError.jsp");
	        	    // rs.forward(request, response);
	        	}
	}

}
