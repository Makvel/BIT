/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WelcomePage.java
 *
 * Created on Apr 1, 2017, 1:12:27 PM
 */

package Advanced;

import Advanced.*;
//import Training.coo;


/**
 *
 * @author hcs
 */
public class WelcomePage extends javax.swing.JFrame {

    /** Creates new form  */
    public WelcomePage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jButton1.setText("jButton1");

        jToggleButton1.setText("jToggleButton1");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nyala", 3, 36));
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("ኢ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 57, 28, 39);

        jLabel3.setFont(new java.awt.Font("Nyala", 3, 36));
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("ት");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(116, 78, 24, 31);

        jLabel4.setFont(new java.awt.Font("Nyala", 3, 36));
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("ዮ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 57, 23, 39);

        jLabel5.setFont(new java.awt.Font("Nyala", 3, 36));
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("ጊዜ ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(197, 45, 57, 44);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 11, 98, 49);

        jLabel9.setFont(new java.awt.Font("Nyala", 3, 24));
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("መቁጠሪያ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 70, 80, 27);

        jButton2.setFont(new java.awt.Font("Nyala", 3, 36));
        jButton2.setForeground(new java.awt.Color(204, 0, 204));
        jButton2.setText("በዐላት ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(116, 120, 217, 41);

        jButton4.setFont(new java.awt.Font("Nyala", 3, 36));
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("ጌዜ መለወጫ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed1(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 210, 220, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/ab.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 520, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //cool ui=new cool();

    }//GEN-LAST:event_jButton4ActionPerformed
*/
    private void jButton4ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed1
     opl o=new opl();
     o.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed1

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         holiday ho=new holiday();
         ho.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
