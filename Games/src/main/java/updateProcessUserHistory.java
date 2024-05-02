//-----------IT17045940
//-----------Dias A.M.A.P.
//-----------G-1.2

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateProcessUserHistory")
public class updateProcessUserHistory extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public updateProcessUserHistory() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/gamingsite";
        String user = "root";
        String psw = "";

        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        PrintWriter out = response.getWriter();

        if (username != null) {
            Connection con = null;
            PreparedStatement ps = null;
            try {
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, psw);

                // Use a parameterized query to avoid SQL injection
                String sql = "UPDATE users SET name=?, mobile=?, email=?, country=? WHERE username=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, mobile);
                ps.setString(3, email);
                ps.setString(4, country);
                ps.setString(5, username);

                int i = ps.executeUpdate();
                if (i > 0) {
                    out.print("Record Updated Successfully");
                    response.sendRedirect("displayUserHistory.jsp");
                } else {
                    out.print("There is a problem in updating Record.");
                }
            } catch (SQLException | ClassNotFoundException sqlException) {
                request.setAttribute("error", sqlException);
                out.println(sqlException);
            } finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
