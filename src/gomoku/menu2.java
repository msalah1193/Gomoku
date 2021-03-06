/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

/**
 *
 * @author kito
 */
public class menu2 extends javax.swing.JFrame {

    /**
     * Creates new form menu2
     */
    Sound track;
    public menu2() {
        initComponents();
        track = new Sound();
        track.sound("/gomoku/soundtracks/2.wav");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multi = new javax.swing.JLabel();
        single = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gomoku");
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(null);

        multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/multi.png"))); // NOI18N
        multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiMouseClicked(evt);
            }
        });
        getContentPane().add(multi);
        multi.setBounds(100, 330, 420, 50);

        single.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/single.png"))); // NOI18N
        single.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singleMouseClicked(evt);
            }
        });
        getContentPane().add(single);
        single.setBounds(100, 220, 430, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/back2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseClicked
        setVisible(false);
        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Game s = new Game(p1,p2);
        s.type = 1;
        menu3 N = new menu3();
        N.setGame(s);
        track.end();
        N.setVisible(true);
    }//GEN-LAST:event_singleMouseClicked

    private void multiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiMouseClicked
        setVisible(false);
        Player p1 = new Player(1);
        Player p2 = new Player(1);
        Game s = new Game(p1,p2);
        s.type = 2;
        board N = new board();
        N.setGame(s);
        track.end();
        N.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_multiMouseClicked

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
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel multi;
    private javax.swing.JLabel single;
    // End of variables declaration//GEN-END:variables
}
