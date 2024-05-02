//-----------IT17045940
//-----------Dias A.M.A.P.
//-----------G-1.2


import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteGame")
public class DeleteGame extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DeleteGame() {
        super();
    }

    @Override
    public void destroy() {
        try {
            // Deregister the JDBC driver to prevent memory leaks
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();
                DriverManager.deregisterDriver(driver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        super.destroy();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests here (if needed)
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String GameID = request.getParameter("GameID");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite?autoReconnect=true&useSSL=true", "root", "");
             Statement preparedStatement = conn.createStatement()) {

            String sql = "delete from game where GameID=" + GameID;

            int i = preparedStatement.executeUpdate(sql);
            if (i > 0)
                response.sendRedirect("displayGameHistory.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
