/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberComparator;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mserkerof
 */
public class MainJFrame extends javax.swing.JFrame {

        /**
         * Creates new form NewJFrame
         */
        int randomNumber;
        int counter = 0;

        public MainJFrame(int random) {

                randomNumber = random;
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                btnOk = new javax.swing.JButton();
                txtField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
                jLabel1.setText("Number:");

                btnOk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                btnOk.setText("OK");
                btnOk.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOkActionPerformed(evt);
                        }
                });

                txtField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtFieldActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
                jLabel2.setText("Please enter a number from 0 to 100 to compare the computers number!");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(251, 251, 251)
                                                .addComponent(btnOk)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(btnOk)
                                .addContainerGap(39, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

            int inputNumber = Integer.parseInt(txtField.getText());

            if (inputNumber != randomNumber) {
                    if (inputNumber > 0 || inputNumber < 100) {
                            if (inputNumber < randomNumber) {
                                    JOptionPane.showMessageDialog(null, "Please enter a larger number" + "\nYou have " + inputNumber + " entered.");
                                    counter++;
                                    inputNumber = Integer.parseInt(txtField.getText());
                            } else {
                                    JOptionPane.showMessageDialog(null, "Please enter a small number" + "\nYou have " + inputNumber + " entered.");
                                    counter++;
                                    inputNumber = Integer.parseInt(txtField.getText());
                            }
                    } else {
                            counter++;
                            JOptionPane.showMessageDialog(null, "Please enter a small number" + "\nYou have " + inputNumber + " entered.");
                    }
            } else {
                    JOptionPane.showMessageDialog(null, "Perfect! You have won! The correctly number is " + inputNumber + "."
                            + "\nTotal try: " + counter);
            }


    }//GEN-LAST:event_btnOkActionPerformed

    private void txtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldActionPerformed

    }//GEN-LAST:event_txtFieldActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                Random random = new Random();
                int randomNumber = random.nextInt(101);
                JOptionPane.showMessageDialog(null, "Welcome to the Number-game. In this game you will fight against computer. "
                        + "\nComputer will pick a random number between 0 and 100 and you will be try to find it. "
                        + "\nHave fun and good luck!");
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new MainJFrame(randomNumber).setVisible(true);
                        }
                });

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnOk;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JTextField txtField;
        // End of variables declaration//GEN-END:variables
}
