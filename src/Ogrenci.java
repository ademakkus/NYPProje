
import java.awt.Image;
import java.awt.Toolkit;
 

public class Ogrenci extends javax.swing.JFrame {
Image icon = Toolkit.getDefaultToolkit().getImage("src/images/ogrenci_islemleri_128.png");
    public Ogrenci() {
        //Image icon = Toolkit.getDefaultToolkit().getImage("src/images/ogrenci_islemleri_128.png");
         super("ÖGRENCİ İSLEMLERİ EKRANI");
        super.setIconImage(icon);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Ogrenci = new javax.swing.JPanel();
        Btn_Guncelle = new javax.swing.JButton();
        Btn_Ara = new javax.swing.JButton();
        Btn_Listele = new javax.swing.JButton();
        Btn_Sil = new javax.swing.JButton();
        Btn_Ekle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Geri = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÖGRENCİ İŞLEMLERİ EKRANI");
        setLocation(new java.awt.Point(300, 200));

        Pnl_Ogrenci.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ÖĞRENCİ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 0, 102))); // NOI18N

        Btn_Guncelle.setBackground(new java.awt.Color(27, 94, 32));
        Btn_Guncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Guncelle.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Guncelle.setText("GÜNCELLE");
        Btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuncelleActionPerformed(evt);
            }
        });

        Btn_Ara.setBackground(new java.awt.Color(130, 119, 23));
        Btn_Ara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ara.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ara.setText("ARA");
        Btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AraActionPerformed(evt);
            }
        });

        Btn_Listele.setBackground(new java.awt.Color(191, 54, 12));
        Btn_Listele.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Listele.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Listele.setText("LİSTELE");
        Btn_Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ListeleActionPerformed(evt);
            }
        });

        Btn_Sil.setBackground(new java.awt.Color(183, 28, 28));
        Btn_Sil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Sil.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Sil.setText("SİL");
        Btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SilActionPerformed(evt);
            }
        });

        Btn_Ekle.setBackground(new java.awt.Color(62, 39, 35));
        Btn_Ekle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ekle.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ekle.setText("EKLE");
        Btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EkleActionPerformed(evt);
            }
        });

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Btn_Geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Geri.setText("GERİ");
        Btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_OgrenciLayout = new javax.swing.GroupLayout(Pnl_Ogrenci);
        Pnl_Ogrenci.setLayout(Pnl_OgrenciLayout);
        Pnl_OgrenciLayout.setHorizontalGroup(
            Pnl_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgrenciLayout.createSequentialGroup()
                .addGroup(Pnl_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_OgrenciLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_Geri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117)
                .addGroup(Pnl_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        Pnl_OgrenciLayout.setVerticalGroup(
            Pnl_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgrenciLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pnl_OgrenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_OgrenciLayout.createSequentialGroup()
                        .addComponent(Btn_Geri)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(Pnl_OgrenciLayout.createSequentialGroup()
                .addComponent(Btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Listele, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Ogrenci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Ogrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 255, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed
        setVisible(false);
        OgrenciEkle ob=new OgrenciEkle();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void Btn_ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ListeleActionPerformed
            setVisible(false);
        OgrenciListele ob=new OgrenciListele();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_ListeleActionPerformed

    private void Btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GeriActionPerformed
        setVisible(false);
        Anasayfa ob=new Anasayfa();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GeriActionPerformed

    private void Btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AraActionPerformed
        setVisible(false);
        OgrenciAra ob=new OgrenciAra();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_AraActionPerformed

    private void Btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuncelleActionPerformed
        setVisible(false);
        OgrenciGuncelle ob=new OgrenciGuncelle();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GuncelleActionPerformed

    private void Btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SilActionPerformed
        setVisible(false);
        OgrenciSil ob=new OgrenciSil();
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
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogrenci().setVisible(true);
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
    private javax.swing.JPanel Pnl_Ogrenci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
