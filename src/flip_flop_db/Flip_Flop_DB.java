/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flip_flop_db;

import java.awt.EventQueue;
//import java.sql.*;

/**
 *
 * @author nouma
 */

// This is main file from where login Frame is called

public class Flip_Flop_DB {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
            
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(GameBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login_Frame().setVisible(true);
            }
            
        });


// THIS CODE WAS WRITTEN FOR TESTING "CINNECTION WITH DB"  
// THIS CODE WAS WRITTEN FOR TESTING "CINNECTION WITH DB"
// THIS CODE WAS WRITTEN FOR TESTING "CINNECTION WITH DB" 

       // Connection conn = null;
      //  Statement stmt = null;
       // try{

            //STEP 2: Load Drivers
            //STEP 3: Define Connection URL
            //STEP 4: Open a connection mentioning driver name and database location
//            System.out.println("Connecting to database...");
			//conn=DriverManager.getConnection("jdbc:ucanaccess:////D:\\Code\\myDB.accdb");
              
       //       conn=DriverManager.getConnection("jdbc:ucanaccess://D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/my_DB_game.accdb");

            //STEP 4: Get a statement object so that you'll be able to execute queries on DBMS
           // System.out.println("Creating statement...");
      //      stmt = conn.createStatement();

			//STEP 5: Write and execute a query and get result in ResultSet
                        
// this is just for checking connection                        
//            String sql;
//
//            sql = "SELECT * FROM user_table";
//            //STEP 6: Extract data from result set
//            try (ResultSet rs = stmt.executeQuery(sql)) {
//                //STEP 6: Extract data from result set
//                while (rs.next()) {
//                    //Retrieve by column name/you can retrieve by column index as well
//                    int id  = rs.getInt("id");
//                    String name = rs.getString("username");
//                    //String address = rs.getString("address");
//                    
//                    //Display values
////                    System.out.println("ID: " + id);
////                    System.out.println("NAME: " + name);
//                    //System.out.println(", ADDRESS: " + address);
//                }
//                //STEP 7: Execute some DML query i.e. Update/Delete/Insert
//                //stmt.executeUpdate("INSERT INTO Student(name) values('bilal')");
//                //stmt.executeUpdate("Delete from Student where name='Usama'");
//                //STEP 8: Clean-up environment
//            }
//            stmt.close();
//            conn.close();

//        }catch(SQLException se){
//            //Handle errors for JDBC
//            se.printStackTrace();
//        }catch(Exception e){
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        }finally{
//            //finally block used to close resources
//            try{
//                if(stmt!=null)
//                    stmt.close();
//            }catch(SQLException se2){
//            }// nothing we can do
//            try{
//                if(conn!=null)
//                    conn.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }//end finally try
//        }//end try
       
    }//end main
    


        
}
    

