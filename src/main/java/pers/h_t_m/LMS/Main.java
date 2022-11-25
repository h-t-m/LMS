package pers.h_t_m.LMS;

import java.sql.*;

//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        String url = "jdbc:mysql://localhost:3306/LMS";
//        String username = "root";
//        String password = "root";
//
//        Connection connection = DriverManager.getConnection(url,username,password);
//        Statement statement = connection.createStatement();
//
//        String sql = "select * from users";
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("username"));
//        }
//
//        resultSet.close();
//
//        statement.close();
//        connection.close();
//    }
//}