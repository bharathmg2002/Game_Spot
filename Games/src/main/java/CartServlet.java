//Shashikala

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CartServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username"); // Retrieve username from the session
        
        PrintWriter out = response.getWriter();
        out.println("Username from session: " + username); // Print username for debugging

        
        
        String gamename = request.getParameter("gamename");
        String payment = request.getParameter("payment");
        String cnum = request.getParameter("cnum");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into cart values(?,?,?,?)");
            stmt.setString(1, username);
            stmt.setString(2, "Minecraft");
            stmt.setString(3, payment);
            stmt.setString(4, cnum);

            int k = stmt.executeUpdate();

            if (k > 0) {
                out.println("Your Order Placed Successfully..!");
                RequestDispatcher rs = request.getRequestDispatcher("invoice.jsp"); // Redirect Page
                rs.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}