import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteRegisteredUser")
public class DeleteRegisteredUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DeleteRegisteredUser() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userID = request.getParameter("UserID");
        deleteRecord(userID, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userID = request.getParameter("UserID");
        deleteRecord(userID, response);
    }

    private void deleteRecord(String userID, HttpServletResponse response) throws IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite?autoReconnect=true&useSSL=false", "root", "");

            String sql = "DELETE FROM users WHERE username = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, userID);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    // Redirect to the same page or another page after successful deletion
                    response.sendRedirect("displayUserHistory.jsp");
                } else {
                    // Handle case where no rows were deleted
                    response.getWriter().println("User not found or deletion unsuccessful");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error occurred during user deletion: " + e.getMessage());
        }
    }
}
