package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String username = "student_user";
        String password = "java123";
        try {

            Connection connection =
                    DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
