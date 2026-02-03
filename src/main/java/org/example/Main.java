package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try (Connection conn = DB.getConnection()) {
            System.out.println("Connected to database!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM book");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("author") + " | " +
                                rs.getInt("published_year")
                );
            }
            //WRITE (INSERT)
            stmt.executeUpdate(""" 
            INSERT INTO book (title, author, isbn, published_year, available_copies)
            VALUES ('New Book', 'Test Author', '9999999999999', 2024, 1)
""");
            System.out.println("Inserted 1 new book!");

//UPDATE
            stmt.executeUpdate("""
    UPDATE book
    SET available_copies = 10
    WHERE isbn = '9999999999999'
""");
            System.out.println("Updated copies for new book!");

//DELETE
            stmt.executeUpdate("""
    DELETE FROM book
    WHERE isbn = '9999999999999'
""");
            System.out.println("Deleted new book!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}