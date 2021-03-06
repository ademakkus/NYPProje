
import java.awt.Image;
import java.awt.Toolkit;


public class Ders extends javax.swing.JFrame {

   Image icon = Toolkit.getDefaultToolkit().getImage("src/images/books.png");
        
    public Ders() { 
        //Image icon = Toolkit.getDefaultToolkit().getImage("src/images/books.png");
        super("DERS İSLEMLERİ EKRANI");
        super.setIconImage(icon);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Ders = new javax.swing.JPanel();
        Btn_Ekle = new javax.swing.JButton();
        Btn_Listele = new javax.swing.JButton();
        Btn_Guncelle = new javax.swing.JButton();
        Btn_Sil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_Ara = new javax.swing.JButton();
        Btn_Geri = new javax.swing.JButton();
        Lbl_Ders = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        setLocation(new java.awt.Point(250, 150));

        Pnl_Ders.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 102))); // NOI18N

        Btn_Ekle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ekle.setText("EKLE");
        Btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EkleActionPerformed(evt);
            }
        });

        Btn_Listele.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Listele.setText("LİSTELE");
        Btn_Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ListeleActionPerformed(evt);
            }
        });

        Btn_Guncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Guncelle.setText("GÜNCELLE");
        Btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuncelleActionPerformed(evt);
            }
        });

        Btn_Sil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Sil.setText("SİL");
        Btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SilActionPerformed(evt);
            }
        });

        Btn_Ara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Ara.setText("ARA");
        Btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AraActionPerformed(evt);
            }
        });

        Btn_Geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_Geri.setText("<< GERİ");
        Btn_Geri.setToolTipText("Önceki menüye git.");
        Btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GeriActionPerformed(evt);
            }
        });

        Lbl_Ders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ders.jpg"))); // NOI18N

        javax.swing.GroupLayout Pnl_DersLayout = new javax.swing.GroupLayout(Pnl_Ders);
        Pnl_Ders.setLayout(Pnl_DersLayout);
        Pnl_DersLayout.setHorizontalGroup(
            Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DersLayout.createSequentialGroup()
                .addGroup(Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_DersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(Pnl_DersLayout.createSequentialGroup()
                        .addGroup(Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_DersLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(Btn_Geri))
                            .addGroup(Pnl_DersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lbl_Ders, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Ara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(Btn_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        Pnl_DersLayout.setVerticalGroup(
            Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DersLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(Pnl_DersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_DersLayout.createSequentialGroup()
                        .addComponent(Btn_Ekle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Listele, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_DersLayout.createSequentialGroup()
                        .addComponent(Lbl_Ders, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Geri)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Pnl_Ders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Pnl_Ders, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Pnl_Ders.getAccessibleContext().setAccessibleName("DERS İ�?LEMLERİ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed
        setVisible(false);
        DersEkle ob=new DersEkle();
        ob.setVisible(true);       
    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void Btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AraActionPerformed
        
        setVisible(false);
        DersAra ob=new DersAra();
        ob.setVisible(true); 
    }//GEN-LAST:event_Btn_AraActionPerformed

    private void Btn_ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ListeleActionPerformed
         setVisible(false);
        DersListele ob=new DersListele();
        ob.setVisible(true); 
    }//GEN-LAST:event_Btn_ListeleActionPerformed

    private void Btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuncelleActionPerformed
 setVisible(false);
        DersGuncelle ob=new DersGuncelle();
        ob.setVisible(true);        
    }//GEN-LAST:event_Btn_GuncelleActionPerformed

    private void Btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SilActionPerformed
         setVisible(false);
        DersSil ob=new DersSil();
        ob.setVisible(true); 
    }//GEN-LAST:event_Btn_SilActionPerformed

    private void Btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GeriActionPerformed
        
           setVisible(false);
        Anasayfa ob=new Anasayfa();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GeriActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ders().setVisible(true);
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
    private javax.swing.JLabel Lbl_Ders;
    private javax.swing.JPanel Pnl_Ders;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
