package projekitm;

public class HOME extends javax.swing.JFrame {
    public HOME() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bPersegiPanjang = new javax.swing.JButton();
        bPersegi = new javax.swing.JButton();
        bLingkaran = new javax.swing.JButton();
        bSegitiga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("APLIKASI BANGUN DATAR");

        bPersegiPanjang.setText("PERSEGI PANJANG");
        bPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiPanjangActionPerformed(evt);
            }
        });

        bPersegi.setText("PERSEGI");
        bPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiActionPerformed(evt);
            }
        });

        bLingkaran.setText("LINGKARAN");
        bLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLingkaranActionPerformed(evt);
            }
        });

        bSegitiga.setText("SEGITIGA");
        bSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegitigaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bPersegiPanjang)
                    .addComponent(bPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(bPersegi)
                .addGap(18, 18, 18)
                .addComponent(bLingkaran)
                .addGap(18, 18, 18)
                .addComponent(bSegitiga)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiPanjangActionPerformed
        // TODO add your handling code here:
        new PersegiPanjang().setVisible(true);
    }//GEN-LAST:event_bPersegiPanjangActionPerformed

    private void bPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiActionPerformed
        // TODO add your handling code here:
     new Persegi().setVisible(true);
    }//GEN-LAST:event_bPersegiActionPerformed

    private void bLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLingkaranActionPerformed
        // TODO add your handling code here:
        new Lingkaran().setVisible(true);
    }//GEN-LAST:event_bLingkaranActionPerformed

    private void bSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegitigaActionPerformed
        new SegiTiga().setVisible(true);
    }//GEN-LAST:event_bSegitigaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLingkaran;
    private javax.swing.JButton bPersegi;
    private javax.swing.JButton bPersegiPanjang;
    private javax.swing.JButton bSegitiga;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
