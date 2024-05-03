package memorygame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author nouma
 */
public class GameBoard extends javax.swing.JFrame {

//	private int timeElapsed = 0;
//	private javax.swing.JLabel timerLabel;
//	private javax.swing.Timer gameTimer;
    private Timer flipBackTimer; // timer for delay for flippin back when both wrong tiles slected 

    public GameBoard() {
        initComponents();

        flipBackTimer = new Timer(500, (e) -> {
            hideSelectedTile(PrevID_Guess1);
            hideSelectedTile(PrevID_Guess2);
            flipBackTimer.stop();
        });
        getContentPane().setLayout(new BorderLayout());

        // Initialize the timerlable component
//        timerlable = new javax.swing.JTextField();
//        timerlable.setEditable(false);
        // Set the initial text for the timerlable component
        // timerlable.setText("Time: 0 seconds");
        // Set the layout of the game board
        // Add the timerlable component to the top (north) of the game board
        //    getContentPane().add(timerlable, BorderLayout.NORTH);
        // Create and start the game timer
//        Timer gameTimer = new javax.swing.Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                handleTimerTick();
//            }
//        });
//        gameTimer.start();
    }

//    private void handleTimerTick() {
//        int timeElapsed = 0;
//        timeElapsed++;
//        updateTimerLabel();
//
//        // Rest of your timer logic...
//    }
//    // Example method to update the timerlable component
//    private void updateTimerLabel() {
//        String timeElapsed = null;
//        timerlable.setText("Time: " + timeElapsed + " seconds");
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tile11 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        Tile41 = new javax.swing.JButton();
        Tile42 = new javax.swing.JButton();
        Tile43 = new javax.swing.JButton();
        Tile44 = new javax.swing.JButton();
        Tile33 = new javax.swing.JButton();
        Tile34 = new javax.swing.JButton();
        ScoreScreen = new javax.swing.JTextField();
        ScoreScreenLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("4x4 Memory Game");
        setResizable(false);

        Tile11.setEnabled(false);
        Tile11.setFocusable(false);
        Tile11.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile11.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile11.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile11ActionPerformed(evt);
            }
        });

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });

        Tile41.setEnabled(false);
        Tile41.setFocusable(false);
        Tile41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile41ActionPerformed(evt);
            }
        });

        Tile42.setEnabled(false);
        Tile42.setFocusable(false);
        Tile42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile42ActionPerformed(evt);
            }
        });

        Tile43.setEnabled(false);
        Tile43.setFocusable(false);
        Tile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile43ActionPerformed(evt);
            }
        });

        Tile44.setEnabled(false);
        Tile44.setFocusable(false);
        Tile44.setVerifyInputWhenFocusTarget(false);
        Tile44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile44ActionPerformed(evt);
            }
        });

        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });

        Tile34.setEnabled(false);
        Tile34.setFocusable(false);
        Tile34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile34ActionPerformed(evt);
            }
        });

        ScoreScreen.setEditable(false);
        ScoreScreen.setBackground(new java.awt.Color(204, 204, 255));
        ScoreScreen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ScoreScreen.setText("0");
        ScoreScreen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ScoreScreen.setEnabled(false);
        ScoreScreen.setFocusable(false);

        ScoreScreenLabel.setFont(new java.awt.Font("FreeSerif", 1, 18)); // NOI18N
        ScoreScreenLabel.setText("SCORE:");

        startGameButton.setText("PLAY");
        startGameButton.setFont(new java.awt.Font("Dialog", 0, 18));
        startGameButton.setBackground(Color.BLACK);
        startGameButton.setForeground(Color.RED); // Set text color to white
        setTitle("FLIP FLOP GAME -- NOUMAN");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("QUIT");
        QuitButton.setFont(new java.awt.Font("Dialog", 0, 18));

        QuitButton.setBackground(Color.BLACK);
        QuitButton.setForeground(Color.RED);
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");
        resetButton.setFont(new java.awt.Font("Dialog", 0, 18));
        resetButton.setBackground(Color.BLACK);
        resetButton.setForeground(Color.RED); // Set text color to red
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setText("Flip Flop Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Tile41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tile21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tile31, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(Tile11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Tile32, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(Tile22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(ScoreScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(resetButton)))
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(startGameButton)
                        .addGap(25, 25, 25)
                        .addComponent(QuitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreScreen)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed

        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;

        ScoreScreen.setText(Integer.toString(score));

        //Re-Enable the buttons.
        Tile11.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        Tile33.setEnabled(true);
        Tile34.setEnabled(true);
        Tile41.setEnabled(true);
        Tile42.setEnabled(true);
        Tile43.setEnabled(true);
        Tile44.setEnabled(true);

        //Set the icons to be Blank.
        wipeBoard();

        //generate random #'s and assign them to shapes as IDs.
        tileControl.shuffle_tiles();

        //let the user see the board for a second.  Then they match by memory.
        flashShapes();
    }//GEN-LAST:event_startGameButtonActionPerformed

    //Tile 1,1 | ID 0 - Press
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile11ActionPerformed

    //Tile 1,2 | ID 1 - Press
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    //Tile 1,3 | ID 2 - Press
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    //Tile 1,4 | ID 3 - Press
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    //Tile 2,1 | ID 4 - Press
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    //Tile 2,2 | ID 5 - Press
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 6 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    //Tile 2,4 | ID 7 - Press
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    //Tile 3,1 | ID 8 - Press
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    //Tile 3,2 | ID 9 - Press
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    //Tile 3,3 | ID 10 - Press
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 10;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile33ActionPerformed

    //Tile 3,4 | ID 11 - Press
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 11;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile34ActionPerformed

    //Tile 4,1 | ID 12 - Press
    private void Tile41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile41ActionPerformed
        int ID = 12;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile41ActionPerformed

    //Tile 4,2 | ID 13 - Press
    private void Tile42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile42ActionPerformed
        int ID = 13;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile42ActionPerformed

    //Tile 4,3 | ID 14 - Press
    private void Tile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile43ActionPerformed
        int ID = 14;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile43ActionPerformed

    //Tile 4,4 | ID 15 - Press
    private void Tile44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile44ActionPerformed
        int ID = 15;
        int type;

        type = tileControl.get_type_of_tile(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile44ActionPerformed

    //Quit Button, Reset the board as if it had never been opened, and close it.  doesn't quit program.
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed

        System.exit(0);
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        wipeBoard();
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        sScore = "0";
        ScoreScreen.setText(sScore);

        buttonEnabledSwitch(false, 0);
        buttonEnabledSwitch(false, 1);
        buttonEnabledSwitch(false, 2);
        buttonEnabledSwitch(false, 3);
        buttonEnabledSwitch(false, 4);
        buttonEnabledSwitch(false, 5);
        buttonEnabledSwitch(false, 6);
        buttonEnabledSwitch(false, 7);
        buttonEnabledSwitch(false, 8);
        buttonEnabledSwitch(false, 9);
        buttonEnabledSwitch(false, 10);
        buttonEnabledSwitch(false, 11);
        buttonEnabledSwitch(false, 12);
        buttonEnabledSwitch(false, 13);
        buttonEnabledSwitch(false, 14);
        buttonEnabledSwitch(false, 15);
    }//GEN-LAST:event_resetButtonActionPerformed

    //===================================OTHER DEFINED SUBROUTINES==================================
    // will display an icon on the button based on the shape_code that the button asks for prior to calling this sub.
    private void showTileShape(int ID, int type) {
        //first define an array list filled with imageicons for tiles. their index is = to their shape code.
        //so to read from it, just pass type to this ArrayList to get the right icon/shape.
        ArrayList<ImageIcon> shapes = new ArrayList();
        shapes.add(cat);
        shapes.add(cow);
        shapes.add(frog);
        shapes.add(dog);
        shapes.add(elephant);
        shapes.add(sparrow);
        shapes.add(hen);
        shapes.add(dolphin);

        //now based on the ID passed, the tile at that case will search the array using type, and set the icon to the one it matches.
        switch (ID) {
            case 0:
                Tile11.setIcon(shapes.get(type));
                break;
            case 1:
                Tile12.setIcon(shapes.get(type));
                break;
            case 2:
                Tile13.setIcon(shapes.get(type));
                break;
            case 3:
                Tile14.setIcon(shapes.get(type));
                break;
            case 4:
                Tile21.setIcon(shapes.get(type));
                break;
            case 5:
                Tile22.setIcon(shapes.get(type));
                break;
            case 6:
                Tile23.setIcon(shapes.get(type));
                break;
            case 7:
                Tile24.setIcon(shapes.get(type));
                break;
            case 8:
                Tile31.setIcon(shapes.get(type));
                break;
            case 9:
                Tile32.setIcon(shapes.get(type));
                break;
            case 10:
                Tile33.setIcon(shapes.get(type));
                break;
            case 11:
                Tile34.setIcon(shapes.get(type));
                break;
            case 12:
                Tile41.setIcon(shapes.get(type));
                break;
            case 13:
                Tile42.setIcon(shapes.get(type));
                break;
            case 14:
                Tile43.setIcon(shapes.get(type));
                break;
            case 15:
                Tile44.setIcon(shapes.get(type));
                break;
        }
    }

    //Sets the icons to all of the buttons to BlankTile.png. Doesn't reset the actual game.
    private void wipeBoard() {
        Tile11.setIcon(Blank);
        Tile12.setIcon(Blank);
        Tile13.setIcon(Blank);
        Tile14.setIcon(Blank);
        Tile21.setIcon(Blank);
        Tile22.setIcon(Blank);
        Tile23.setIcon(Blank);
        Tile24.setIcon(Blank);
        Tile31.setIcon(Blank);
        Tile32.setIcon(Blank);
        Tile33.setIcon(Blank);
        Tile34.setIcon(Blank);
        Tile41.setIcon(Blank);
        Tile42.setIcon(Blank);
        Tile43.setIcon(Blank);
        Tile44.setIcon(Blank);
    }

    //do the 2 buttons chosen have matching shapes?
    private boolean testMatch(int type1, int type2) {
        boolean same = false;

        if (type1 == type2) {
            same = true;
        }

        return same;
    }

    //Hide the shape and set icon to blank a particular button/Tile.
    private void hideSelectedTile(int ID) {
        switch (ID) {
            case 0:
                Tile11.setIcon(Blank);
                break;
            case 1:
                Tile12.setIcon(Blank);
                break;
            case 2:
                Tile13.setIcon(Blank);
                break;
            case 3:
                Tile14.setIcon(Blank);
                break;
            case 4:
                Tile21.setIcon(Blank);
                break;
            case 5:
                Tile22.setIcon(Blank);
                break;
            case 6:
                Tile23.setIcon(Blank);
                break;
            case 7:
                Tile24.setIcon(Blank);
                break;
            case 8:
                Tile31.setIcon(Blank);
                break;
            case 9:
                Tile32.setIcon(Blank);
                break;
            case 10:
                Tile33.setIcon(Blank);
                break;
            case 11:
                Tile34.setIcon(Blank);
                break;
            case 12:
                Tile41.setIcon(Blank);
                break;
            case 13:
                Tile42.setIcon(Blank);
                break;
            case 14:
                Tile43.setIcon(Blank);
                break;
            case 15:
                Tile44.setIcon(Blank);
                break;
        }
    }

    //enable or disable a button. (enable when it's blank [again], & disable when a shape is showing.)
    private void buttonEnabledSwitch(boolean state, int ID) {
        switch (ID) {
            case 0:
                Tile11.setEnabled(state);
                break;
            case 1:
                Tile12.setEnabled(state);
                break;
            case 2:
                Tile13.setEnabled(state);
                break;
            case 3:
                Tile14.setEnabled(state);
                break;
            case 4:
                Tile21.setEnabled(state);
                break;
            case 5:
                Tile22.setEnabled(state);
                break;
            case 6:
                Tile23.setEnabled(state);
                break;
            case 7:
                Tile24.setEnabled(state);
                break;
            case 8:
                Tile31.setEnabled(state);
                break;
            case 9:
                Tile32.setEnabled(state);
                break;
            case 10:
                Tile33.setEnabled(state);
                break;
            case 11:
                Tile34.setEnabled(state);
                break;
            case 12:
                Tile41.setEnabled(state);
                break;
            case 13:
                Tile42.setEnabled(state);
                break;
            case 14:
                Tile43.setEnabled(state);
                break;
            case 15:
                Tile44.setEnabled(state);
                break;
        }
    }

    //Check for a win or loss - if all buttons are pressed and tellin user rank
    private void checkEndGame() {

        if (!Tile11.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled()
                && !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled()
                && !Tile31.isEnabled() && !Tile32.isEnabled() && !Tile33.isEnabled() && !Tile34.isEnabled()
                && !Tile41.isEnabled() && !Tile42.isEnabled() && !Tile43.isEnabled() && !Tile44.isEnabled()) {

//        FILE HANDLING IMPLEMENTED
//        FILE HANDLING IMPLEMENTED
//        FILE HANDLING IMPLEMENTED
            // Step 1: Read existing scores from the file
            List<Integer> scores = new ArrayList<>();
            //Absolute path
           // String filePath = "D:\\Uni\\Sem\\6th sem\\Web\\Project Flip Flop\\Flip Flop With DB\\Flip_Flop_DB\\src\\memorygame\\scores.txt";
            //Relative path
             String filePath = System.getProperty("user.dir") + "/src/memorygame/scores.txt";

            try (Scanner scanner = new Scanner(new File(filePath))) {
                while (scanner.hasNextInt()) {
                    scores.add(scanner.nextInt());
                }
            } catch (FileNotFoundException e) {
                //  e.printStackTrace();
            }

            // Step 2: Add the user's score to the list
            scores.add(score);

            // Step 3: Sort the scores in increasing order
            // Step 3: Sort the scores in descending order
            Collections.sort(scores, Collections.reverseOrder());

            // Step 4: Write the sorted scores back to the file
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                for (int s : scores) {
                    writer.println(s);
                }
            } catch (IOException e) {
                //   e.printStackTrace();
            }

            // Step 5: Determine the user's rank
            int userRank = scores.indexOf(score) + 1;

            // Step 6: Display the appropriate message to the user with their rank
            String message;
            if (score > 0) {
                message = String.format("""
                    Congratulations!
                    You Win!
                    Your final score: %d
                    Your rank among all players: %d
                    """, score, userRank);
            } else {
                message = String.format("""
                    You Lose!
                    Your score is %d
                    Try again!
                    Your rank among all players: %d
                    """, score, userRank);
            }

            JOptionPane.showMessageDialog(rootPane, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //every tile that is pressed on the board uses this in order to make decisions in the game.
    private void buttonPress(int ID, int type) {
        if (count == 0) {

//gameTimer.start();
            showTileShape(ID, type);
            ID_Guess1 = ID;
            type_Guess1 = type;
            count++;

            // clear the 2 wrong tiles 
            if (!match) {
                hideSelectedTile(PrevID_Guess1);
                hideSelectedTile(PrevID_Guess2);
            }

        } else if (count == 1) {

            showTileShape(ID, type);
            ID_Guess2 = ID;
            type_Guess2 = type;
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;

            //before matching test if the same tile was pressed twice.  that's cheating.
            if (ID_Guess1 == ID_Guess2) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "You cannot pick the same tile twice.\n",
                        "Invalid Move", WIDTH, null
                );
                hideSelectedTile(ID_Guess1);
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                buttonEnabledSwitch(true, ID_Guess1);
            } else {
                match = testMatch(type_Guess1, type_Guess2);

                if (!match) {

                    score = score - 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                    //hideSelectedTile(PrevID_Guess1);
                    flipBackTimer.start(); // Start the timer to delay hiding the tiles

                } else {

                    score = score + 10;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);

                    checkEndGame();
                }

            }
            count = 0;
        }
    }

    //Shows the shapes to the player for a small duration of time, then trturns the buttons to blank again.
    private void flashShapes() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 15; i++) {
                        int type = tileControl.get_type_of_tile(i);
                        showTileShape(i, type);
                    }
                    Thread.sleep(2000);

                    wipeBoard();

                } catch (InterruptedException ex) {
                    Logger.getLogger(GameBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        thread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QuitButton;
    private javax.swing.JTextField ScoreScreen;
    private javax.swing.JLabel ScoreScreenLabel;
    private javax.swing.JButton Tile11;
    private javax.swing.JButton Tile12;
    private javax.swing.JButton Tile13;
    private javax.swing.JButton Tile14;
    private javax.swing.JButton Tile21;
    private javax.swing.JButton Tile22;
    private javax.swing.JButton Tile23;
    private javax.swing.JButton Tile24;
    private javax.swing.JButton Tile31;
    private javax.swing.JButton Tile32;
    private javax.swing.JButton Tile33;
    private javax.swing.JButton Tile34;
    private javax.swing.JButton Tile41;
    private javax.swing.JButton Tile42;
    private javax.swing.JButton Tile43;
    private javax.swing.JButton Tile44;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
    TileControl tileControl = new TileControl();
//Absolute paths
//    ImageIcon cat = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/cat.png");
//    ImageIcon cow = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/dog.png");
//    ImageIcon frog = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/frog.png");
//    ImageIcon dog = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/elephant.png");
//    ImageIcon elephant = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/dolphin.png");
//    ImageIcon sparrow = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/hen.png");
//    ImageIcon hen = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/sparrow.png");
//    ImageIcon dolphin = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/cow.png");
//    ImageIcon Blank = new javax.swing.ImageIcon("D:/Uni/Sem/6th sem/Web/Project Flip Flop/Flip Flop With DB/Flip_Flop_DB/src/memorygame/images/balnk.png");

    //Relative path
ImageIcon cat = new ImageIcon(getClass().getResource("/memorygame/images/cat.png"));
ImageIcon cow = new ImageIcon(getClass().getResource("/memorygame/images/dog.png"));
ImageIcon frog = new ImageIcon(getClass().getResource("/memorygame/images/frog.png"));
ImageIcon dog = new ImageIcon(getClass().getResource("/memorygame/images/elephant.png"));
ImageIcon elephant = new ImageIcon(getClass().getResource("/memorygame/images/dolphin.png"));
ImageIcon sparrow = new ImageIcon(getClass().getResource("/memorygame/images/hen.png"));
ImageIcon hen = new ImageIcon(getClass().getResource("/memorygame/images/sparrow.png"));
ImageIcon dolphin = new ImageIcon(getClass().getResource("/memorygame/images/cow.png"));

ImageIcon Blank = new ImageIcon(getClass().getResource("/memorygame/images/blank.png"));

    int count = 0;                              //0 for first tile flipped, 1 for second. 
    int ID_Guess1 = 100, ID_Guess2 = 100;       //the locations 
    int type_Guess1, type_Guess2;               //the ShapeCodes for the 2 guesses.   
    boolean match;                              //catches the result from testMatch sub.
    int score;                                  //saves the player's score
    String sScore;
    int PrevID_Guess1;                          //these 2 are used to store the 2 tiles from 
    int PrevID_Guess2;                          //return to blanks when a new matching has started.

}
