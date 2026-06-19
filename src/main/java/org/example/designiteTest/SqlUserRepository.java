package org.example.designiteTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SqlUserRepository {

    // Hardcodierte Verbindungsdaten (Magic Strings)
    private static final String URL = "jdbc:mysql://localhost:3306/shop";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "admin123";

    // SQL per String-Konkatenation -> klassische SQL-Injection
    public List<String> findUsersByName(String name) {
        List<String> result = new ArrayList<>();
        String query = "SELECT * FROM users WHERE name = '" + name + "'";

        try {
            Connection connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                result.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            // Leerer Catch-Block (Empty Catch Block Smell)
        }

        return result;
    }

    // Lange Methode mit verschachtelten Bedingungen und Magic Numbers
    public void updateUser(int id, String name, String email, int age, boolean active) {
        String sql = "UPDATE users SET ";

        if (name != null && !name.isEmpty()) {
            sql = sql + "name = '" + name + "', ";
        }
        if (email != null && !email.isEmpty()) {
            sql = sql + "email = '" + email + "', ";
        }
        if (age > 0 && age < 150) {
            sql = sql + "age = " + age + ", ";
        }
        if (active) {
            sql = sql + "active = 1 ";
        } else {
            sql = sql + "active = 0 ";
        }

        sql = sql + " WHERE id = " + id;

        try {
            Connection connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();
        } catch (SQLException e) {
            System.out.println("Update failed");
        }
    }

    // Ungefilterte DELETE-Anweisung
    public void deleteUser(String id) {
        String sql = "DELETE FROM users WHERE id = " + id;
        try {
            Connection connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
        }
    }
}
