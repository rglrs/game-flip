package flip_flop_db;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Flip_Flop_DB {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        EventQueue.invokeLater(() -> new Login_Frame().setVisible(true));

        // Database connection setup
        Connection conn = null;
        Statement stmt = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Define Connection URL
            String url = "jdbc:mysql://localhost:3306/flip"; // Replace with your database name
            String user = "root"; // Replace with your MySQL username
            String password = ""; // Replace with your MySQL password

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, password);

            // Get a statement object to execute queries
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Execute a query
            String sql = "SELECT * FROM user_table";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("username");

                // Display values
                System.out.println("ID: " + id);
                System.out.println("NAME: " + name);
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally block to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
