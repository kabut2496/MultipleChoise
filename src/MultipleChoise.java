/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kabut2496
 */
public class MultipleChoise extends javax.swing.JFrame { 
 String ans1,ans2,ans3,ans4,ans5;
      int score;
    /**
     * Creates new form MultipleChoise
     */
    public MultipleChoise() {
        initComponents();
        ans1=inPut1.getText();
        ans2=inPut2.getText();
        ans3=inPut3.getText();
        ans4=inPut4.getText();
        ans4=inPut5.getText();
        
        score=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        theQ1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inPut1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        theQ2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        theQ3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        theQ4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        theQ5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ScoreTotal = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pushMeButton = new javax.swing.JButton();
        inPut2 = new javax.swing.JTextField();
        inPut3 = new javax.swing.JTextField();
        inPut5 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Multiple Choise Quiz");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, 26));

        Q1.setText("Question 1");
        jPanel1.add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        theQ1.setText("Is Karl amazing");
        jPanel1.add(theQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        jLabel4.setText("A.No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 101, -1, -1));

        jLabel5.setText("B.Maybe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 127, -1, -1));

        jLabel6.setText("C.Yes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 152, -1, -1));

        jLabel7.setText("D.Never");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 172, -1, -1));

        inPut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPut1ActionPerformed(evt);
            }
        });
        jPanel1.add(inPut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 121, 32, -1));

        jLabel8.setText("Enter Answer in Box");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        Q2.setText("Question 2");
        jPanel1.add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        theQ2.setText("what is 2+2");
        jPanel1.add(theQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, 20));

        jLabel11.setText("A.4");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel12.setText("B.5");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel13.setText("C.6");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel14.setText("D.7");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 20));

        Q3.setText("Question 3");
        jPanel1.add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        theQ3.setText("What is 3+2");
        jPanel1.add(theQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel17.setText("A.400");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel18.setText("B.600");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel19.setText("C.5");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel20.setText("D.8");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        Q4.setText("Question 4");
        jPanel1.add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        theQ4.setText("What is 600x0");
        jPanel1.add(theQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel23.setText("A.0");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel24.setText("B.7");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel25.setText("C.60");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel26.setText("D.6000");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Q5.setText("Question5");
        jPanel1.add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        theQ5.setText("What is MR.Kaunes Room");
        jPanel1.add(theQ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel29.setText("A.302");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel30.setText("B.203");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel31.setText("C.300");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel32.setText("D.303");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel33.setText("Your Score is: ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));
        jPanel1.add(ScoreTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 120, 70));

        jLabel35.setText("to Get score press Button");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        pushMeButton.setText("Push Me");
        pushMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushMeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pushMeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        inPut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPut2ActionPerformed(evt);
            }
        });
        jPanel1.add(inPut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 120, 40, -1));

        inPut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPut3ActionPerformed(evt);
            }
        });
        jPanel1.add(inPut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 30, -1));

        inPut5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPut5ActionPerformed(evt);
            }
        });
        jPanel1.add(inPut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 30, -1));
        jPanel1.add(input4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 30, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inPut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPut1ActionPerformed
        
    }//GEN-LAST:event_inPut1ActionPerformed

    private void pushMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushMeButtonActionPerformed
        ScoreTotal.setText("your score is"+score);
      if(ans1.equals("c")){
            score++;
        }
        
        if(ans1.equals("C")){
            score++;
        }
        if(ans2.equals("a")){
            score=score+1;
        }
        
        if(ans2.equals("A")){
            score=score+1;
        }
        if((ans3.equals("c"))){
            score=score+1;
        } 
        if((ans3.equals("C"))){
            score++;
        }
        if(ans4.equals("a")){
            score++;
        }
        
        if(ans4.equals("A")){
            score++;
        }
            if(ans5.equals("d")){
            score=score+1;
        }
        
        if(ans5.equals("D")){
            score++;
        }
    }//GEN-LAST:event_pushMeButtonActionPerformed
   
    private void inPut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPut2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPut2ActionPerformed

    private void inPut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPut3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPut3ActionPerformed

    private void inPut5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPut5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inPut5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultipleChoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel ScoreTotal;
    private javax.swing.JTextField inPut1;
    private javax.swing.JTextField inPut2;
    private javax.swing.JTextField inPut3;
    private javax.swing.JTextField inPut5;
    private javax.swing.JTextField input4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pushMeButton;
    private javax.swing.JLabel theQ1;
    private javax.swing.JLabel theQ2;
    private javax.swing.JLabel theQ3;
    private javax.swing.JLabel theQ4;
    private javax.swing.JLabel theQ5;
    // End of variables declaration//GEN-END:variables
}
