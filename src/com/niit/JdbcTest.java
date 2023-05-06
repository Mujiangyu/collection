package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","niit1234");

        String sql = "drop table goods";

        Statement statement = connection.createStatement();

        statement.executeUpdate(sql);





    }
}
