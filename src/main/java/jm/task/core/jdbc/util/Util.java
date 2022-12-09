package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    //JDBC
    final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    final static String USERNAME = "root";
    final static String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection problems \n");
            e.printStackTrace();
            return null;
        }
    }
}



