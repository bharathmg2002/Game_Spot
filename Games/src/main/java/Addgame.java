//-----------IT17045940
//-----------Dias A.M.A.P.
//-----------G-1.2


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Addgame")
public class Addgame extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Addgame() {
		super();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);

		String GameName = request.getParameter("GameName");
		String Price = request.getParameter("Price");
		String Size = request.getParameter("Size");
		/*
		 * String Requirements = request.getParameter("Requirements"); String
		 * Description = request.getParameter("Description");
		 */

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite", "root", "");
			Statement ps = (Statement) conn.createStatement();

			String sql = "insert into game(GameName , Price , Size ) values ('"+GameName+"','"+Price
					+"','"+Size+"')";

			int i = ps.executeUpdate(sql);
			
			if(i > 0)
			{
				System.out.print("Record Added Successfully");
				response.sendRedirect("displayGameHistory.jsp") ;
			}
			else
			{
				System.out.print("There is a problem in updating Record.");
			}
			}
			catch(SQLException | ClassNotFoundException sql)
			{
			request.setAttribute("error", sql);//session
			System.out.println(sql);
			}

	}

}



