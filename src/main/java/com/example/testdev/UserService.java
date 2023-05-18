package com.example.testdev;

import java.sql.*;

public class UserService {
    private Connection connection;

    public synchronized Connection connection() throws ClassNotFoundException, SQLException {
       try{
           if (connection == null){
               String jdbcURL = "jdbc:mysql://localhost:3306/test";
               String dbUser = "root";
               String dbPassword = "";

               Class.forName("com.mysql.jdbc.Driver");
               return DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
           }
       } catch (Exception e){
           System.out.println(e);
       }
       return connection;
    }

    public User checkLogin(String email, String password) throws SQLException,
            ClassNotFoundException {
        User user = null;
        try {
            Connection connection = connection();
            String sql = "SELECT * FROM users WHERE email = ? and password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                user = new User();
//            user.se(result.getString("fullname"));
//            user.setEmail(email);
            }

            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }

        return user;
    }
}
