
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SearchServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String reason = request.getParameter("reason");
		
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite","root","");
			PreparedStatement stmt = con.prepareStatement("insert into leftusers values(?,?)");
			stmt.setString(1, username);
			stmt.setString(2, reason);
		
			int k = stmt.executeUpdate();
			
			
			
			if (k>0) {
				   out.println("Your Order Placed Successfully..!");
	               //RequestDispatcher rs = request.getRequestDispatcher("invoice.jsp");	//Redirect Page
	               //rs.forward(request, response);
			}
		}catch (Exception e) {
			System.out.println(e);
		} 
	}
}


