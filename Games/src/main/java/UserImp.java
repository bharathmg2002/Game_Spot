////Ishan
//
//import java.sql.*;
//
//public class UserImp{
//
//	 Connection connection;
//	 Statement statement;
//	
//	public void RegisUser(User user) throws ClassNotFoundException, SQLException{
//
//		String name= user.getName();
//		String username=user.getUsername();
//		String mobile=user.getMobile();
//		String email=user.getEmail();
//		String country=user.getcountry();
//		String password=user.getPassword();
//		String cpassword=user.getcPassword();
//		
//		connection = DBconnection.getDBConnection();
//		connection.setAutoCommit(false);
//		statement = connection.createStatement();
//		
////		String addUser="INSERT INTO `users` VALUES('"+name+"','"+username+"','"+mobile+"','"+email+"','"+country+"','"+password+"','"+cpassword+"')";
////		
////		statement.executeUpdate(addUser);
//		String addUser = "INSERT INTO `users` VALUES(?, ?, ?, ?, ?, ?, ?)";
//		PreparedStatement preparedStatement = connection.prepareStatement(addUser);
//		preparedStatement.setString(1, name);
//		preparedStatement.setString(2, username);
//		preparedStatement.setString(3, mobile);
//		preparedStatement.setString(4, email);
//		preparedStatement.setString(5, country);
//		preparedStatement.setString(6, password);
//		preparedStatement.setString(7, cpassword);
//
//		preparedStatement.executeUpdate();
//
//		
//	}
//}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserImp {

    Connection connection;
    PreparedStatement preparedStatement;

    public void RegisUser(User user) throws ClassNotFoundException, SQLException {

        String name = user.getName();
        String username = user.getUsername();
        String mobile = user.getMobile();
        String email = user.getEmail();
        String country = user.getcountry();
        String password = user.getPassword();
        String cpassword = user.getcPassword();

        try {
            connection = DBconnection.getDBConnection();
            connection.setAutoCommit(false);

            String addUser = "INSERT INTO `users` (`name`, `username`, `mobile`, `email`, `country`, `password`, `cpassword`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(addUser);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, mobile);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, country);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, cpassword);

            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback();
            }
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
