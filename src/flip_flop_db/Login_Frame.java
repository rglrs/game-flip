/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flip_flop_db;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import memorygame.GameBoard;

/**
 *
 * @author nouma
 */
public class Login_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Login_Frame
     */
    public Login_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_name_textfield = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        user_name_label = new javax.swing.JLabel();
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pass_label = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pass_textfield = new javax.swing.JPasswordField();
        singup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user_name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_name_textfieldActionPerformed(evt);
            }
        });

        login_button.setText("Login");
        login_button.setFont(new java.awt.Font("Dialog", 0, 18));

        login_button.setBackground(Color.BLACK);
        login_button.setForeground(Color.RED); // Set text color to white
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        user_name_label.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        user_name_label.setText("Username");
        user_name_label.setFont(new java.awt.Font("Dialog", 0, 18));

        pass_label.setFont(new java.awt.Font("Dialog", 0, 18));
        pass_label.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        pass_label.setText("Password");

        cancel.setText("Cancel");
        cancel.setFont(new java.awt.Font("Dialog", 0, 18));

        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.RED); // Set text color to white
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Frame");

        singup.setText("SingUp");
        singup.setBackground(Color.BLACK);
        singup.setForeground(Color.RED);

        singup.setFont(new java.awt.Font("Dialog", 0, 18));
        singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(login_button, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addComponent(singup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pass_label, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(user_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name_label)
                    .addComponent(user_name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label)
                    .addComponent(pass_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_button)
                    .addComponent(singup))
                .addGap(27, 27, 27)
                .addComponent(cancel)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_name_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_name_textfieldActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        String username = user_name_textfield.getText();
        String password = pass_textfield.getText();

        if (authenticateUser(username, password)) {
            // User authenticated, proceed to the game board or next step
            // For example, you can open the game board frame here
            dispose(); // Close the login frame

            GameBoard gameFrame = new GameBoard();
            gameFrame.setVisible(true);
        } else {
            // Invalid credentials, show error message or take appropriate action
            JOptionPane.showMessageDialog(Login_Frame.this,
                    "Invalid username or password",
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE);
            user_name_textfield.setText("");  // Clear the username field
            pass_textfield.setText("");       // Clear the password field
        }

    }//GEN-LAST:event_login_buttonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void singupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupActionPerformed
        // TODO add your handling code here:
        // Open the SignUp_Frame
        SignUp_Frame signUpFrame = new SignUp_Frame();
        signUpFrame.setVisible(true);
        dispose(); // Close the current Login_Frame

    }//GEN-LAST:event_singupActionPerformed

    private boolean authenticateUser(String username, String password) {
        // Perform authentication against the database
        java.sql.Connection conn = null;
        java.sql.Statement stmt = null;
        ResultSet rs = null;
        try {
            // absolute path
            //  conn = DriverManager.getConnection("jdbc:ucanaccess://D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/my_DB_game.accdb");

            //relative path
            String dbFilePath = "src/my_DB_game.accdb";
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbFilePath);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user_table WHERE username = '" + username + "' AND password = '" + password + "'";
            rs = stmt.executeQuery(sql);

            return rs.next(); // Return true if a row is found (i.e., valid credentials)
        } catch (SQLException e) {
            //   e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                //  e.printStackTrace();
            }
        }

        return false; // Return false if any exception occurs
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField pass_textfield;
    private javax.swing.JButton singup;
    private javax.swing.JLabel user_name_label;
    private javax.swing.JTextField user_name_textfield;
    // End of variables declaration//GEN-END:variables
}
