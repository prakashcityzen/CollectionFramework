package com.java4.com.java4.com.java4.services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by Pravat Kiran Timsina on 6/18/2017.
 */
public class DbConnection {
    private static Connection connection=null;

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/4pmclass";
        String user = "root";
        String password = "1234";

        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
                return connection;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            return connection;
        }
        return null;
    }
}