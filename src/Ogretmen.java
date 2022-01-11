
import java.awt.Image;
import java.awt.Toolkit;


public class Ogretmen extends javax.swing.JFrame {

   Image icon = Toolkit.getDefaultToolkit().getImage("src/images/teaching.png");
    public Ogretmen() {
        super("ÖGRETMEN İSLEMLERİ EKRANI");
        super.setIconImage(icon);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Ogretmen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Guncelle = new javax.swing.JButton();
        Btn_Ara = new javax.swing.JButton();
        Btn_Sil = new javax.swing.JButton();
        Btn_Ekle = new javax.swing.JButton();
        Btn_Listele = new javax.swing.JButton();
        Btn_Geri = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÖGRETMEN İŞLEM EKRANI");
        setLocation(new java.awt.Point(300, 200));

        Pnl_Ogretmen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ÖĞRETMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 0, 102))); // NOI18N

        Btn_Guncelle.setBackground(new java.awt.Color(51, 105, 30));
        Btn_Guncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Guncelle.setForeground(new java.awt.Color(241, 248, 233));
        Btn_Guncelle.setText("GÜNCELLE");
        Btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuncelleActionPerformed(evt);
            }
        });

        Btn_Ara.setBackground(new java.awt.Color(255, 109, 0));
        Btn_Ara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ara.setForeground(new java.awt.Color(255, 243, 224));
        Btn_Ara.setText("ARA");
        Btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AraActionPerformed(evt);
            }
        });

        Btn_Sil.setBackground(new java.awt.Color(69, 39, 160));
        Btn_Sil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Sil.setForeground(new java.awt.Color(237, 231, 246));
        Btn_Sil.setText("SİL");
        Btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SilActionPerformed(evt);
            }
        });

        Btn_Ekle.setBackground(new java.awt.Color(38, 50, 56));
        Btn_Ekle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ekle.setForeground(new java.awt.Color(236, 239, 241));
        Btn_Ekle.setText("EKLE");
        Btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EkleActionPerformed(evt);
            }
        });

        Btn_Listele.setBackground(new java.awt.Color(62, 39, 35));
        Btn_Listele.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Listele.setForeground(new java.awt.Color(239, 235, 233));
        Btn_Listele.setText("LİSTELE");
        Btn_Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ListeleActionPerformed(evt);
            }
        });

        Btn_Geri.setBackground(new java.awt.Color(183, 28, 28));
        Btn_Geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Geri.setForeground(new java.awt.Color(255, 235, 238));
        Btn_Geri.setText("GERİ");
        Btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_OgretmenLayout = new javax.swing.GroupLayout(Pnl_Ogretmen);
        Pnl_Ogretmen.setLayout(Pnl_OgretmenLayout);
        Pnl_OgretmenLayout.setHorizontalGroup(
            Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                .addGroup(Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Btn_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Listele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        Pnl_OgretmenLayout.setVerticalGroup(
            Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                .addGroup(Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                        .addComponent(Btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Pnl_OgretmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(167, 167, 167)
                                .addComponent(Btn_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pnl_OgretmenLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Btn_Listele, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Pnl_Ogretmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Ogretmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed
       
        setVisible(false);
        OgretmenEkle ob=new OgretmenEkle();
        ob.setVisible(true);
        
       
    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void Btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GeriActionPerformed
       
          setVisible(false);
        Anasayfa ob=new Anasayfa();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GeriActionPerformed

    private void Btn_ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ListeleActionPerformed
       
          setVisible(false);
        OgretmenListele ob=new OgretmenListele();
        ob.setVisible(true);
        
    }//GEN-LAST:event_Btn_ListeleActionPerformed

    private void Btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AraActionPerformed
        setVisible(false);
        OgretmenAra ob=new OgretmenAra();
        ob.setVisible(true);
                           
    }//GEN-LAST:event_Btn_AraActionPerformed

    private void Btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuncelleActionPerformed
         setVisible(false);
        OgretmenGuncelle ob=new OgretmenGuncelle();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GuncelleActionPerformed

    private void Btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SilActionPerformed
       
          setVisible(false);
        OgretmenSil ob=new OgretmenSil();
        ob.setVisible(true);
        
    }//GEN-LAST:event_Btn_SilActionPerformed

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
            java.util.logging.Logger.getLogger(Ogretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ogretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ogretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ogretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogretmen().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ara;
    private javax.swing.JButton Btn_Ekle;
    private javax.swing.JButton Btn_Geri;
    private javax.swing.JButton Btn_Guncelle;
    private javax.swing.JButton Btn_Listele;
    private javax.swing.JButton Btn_Sil;
    private javax.swing.JPanel Pnl_Ogretmen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
