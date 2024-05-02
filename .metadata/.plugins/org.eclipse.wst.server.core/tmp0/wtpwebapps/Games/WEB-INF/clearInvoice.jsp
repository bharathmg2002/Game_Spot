<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Clear Invoice</title>
</head>
<body>
    <%
    try {
        // Establish database connection and clear the invoice data
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamingsite?autoReconnect=true&useSSL=false", "root", "");
        Statement statement = connection.createStatement();
        String clearSql = "DELETE FROM cart";
        statement.executeUpdate(clearSql);
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>
