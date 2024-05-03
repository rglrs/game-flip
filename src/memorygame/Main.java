//package memorygame;
//
//import java.awt.EventQueue;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//
///**
// *
// * @author nouma
// */
//
//// this file was created before enabaling data base connection for working of game board frame
//
//
//public class Main {
//
//    public static void main(String[] args) {
//        /* Set the look and feel */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            //java.util.logging.Logger.getLogger(GameBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        /* Create and display the form */
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                GameBoard board = new GameBoard();
//                board.setVisible(true);
//                
//
//            }
//        });
//        
//    }
//}
