
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class OgrenciSil extends javax.swing.JFrame {
 Connection conn;
ResultSet rs;
PreparedStatement pst;
OgrenciIslemleri ogrenciIslemleri;
  Image icon = Toolkit.getDefaultToolkit().getImage("src/images/ogrenci_islemleri_128.png");
        
    public OgrenciSil() { 
        super("ÖGRENCİ SİLME İSLEMİ EKRANI");
        super.setIconImage(icon);
        initComponents();
        ogrenciIslemleri = new OgrenciIslemleri();
        conn=JavaConnect.ConnecrDb();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_OgrenciSil = new javax.swing.JPanel();
        OgrenciID = new javax.swing.JTextField();
        ogr_TC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ogr_Kayit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ogr_IsimSoyisim = new javax.swing.JTextField();
        Btn_Geri = new javax.swing.JButton();
        Btn_Ara = new javax.swing.JButton();
        Cinsiyet = new javax.swing.JTextField();
        Btn_Sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        Pnl_OgrenciSil.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Öğrenci Sil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 102))); // NOI18N

        jLabel5.setText("Kayıt Tarihi");

        jLabel4.setText("Cinsiyet");

        jLabel1.setText("OgrencicID");

        jLabel2.setText("TC");

        jLabel3.setText("İsim Soyisim");

        Btn_Geri.setText("GERİ");
        Btn_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GeriActionPerformed(evt);
            }
        });

        Btn_Ara.setText("ARA");
        Btn_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AraActionPerformed(evt);
            }
        });

        Btn_Sil.setText("SİL");
        Btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_OgrenciSilLayout = new javax.swing.GroupLayout(Pnl_OgrenciSil);
        Pnl_OgrenciSil.setLayout(Pnl_OgrenciSilLayout);
        Pnl_OgrenciSilLayout.setHorizontalGroup(
            Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                        .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_OgrenciSilLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(57, 57, 57)
                                .addComponent(ogr_Kayit))
                            .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                                .addComponent(Btn_Geri)
                                .addGap(71, 71, 71)
                                .addComponent(Btn_Sil)))
                        .addGap(56, 56, 56)
                        .addComponent(Btn_Ara))
                    .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                        .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                                .addComponent(Cinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addGap(123, 123, 123))
                            .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                                .addComponent(ogr_IsimSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                        .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(62, 62, 62)
                        .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OgrenciID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogr_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        Pnl_OgrenciSilLayout.setVerticalGroup(
            Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OgrenciSilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(OgrenciID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Ara))
                .addGap(18, 18, 18)
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ogr_TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ogr_IsimSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(ogr_Kayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(Pnl_OgrenciSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Geri)
                    .addComponent(Btn_Sil))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_OgrenciSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_OgrenciSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GeriActionPerformed
        setVisible(false);
        Ogrenci ob=new Ogrenci();
        ob.setVisible(true);
    }//GEN-LAST:event_Btn_GeriActionPerformed

    private void Btn_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AraActionPerformed
        String sql="select * from Ogrenci where OgrenciID=?";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,OgrenciID.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("TC");
                ogr_TC.setText(add1);
                String add2=rs.getString("IsimSoyisim");
                ogr_IsimSoyisim.setText(add2);
                String add3=rs.getString("Cinsiyet");
                Cinsiyet.setText(add3);
                String add4=rs.getString("Kayit");
                ogr_Kayit.setText(add4);

                rs.close();
                pst.close();

            }
            else
            {
                JOptionPane.showMessageDialog(null, "ogrenci bulunamadı");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }

            catch(Exception e){
            }
        }
    }//GEN-LAST:event_Btn_AraActionPerformed

    private void Btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SilActionPerformed
     
OgrenciVarlik ogrenciVarlik = new OgrenciVarlik(
         Integer.parseInt(OgrenciID.getText()),
            Integer.parseInt(ogr_TC.getText()),
            ogr_IsimSoyisim.getText(),
            (String) Cinsiyet.getText(),
          ogr_Kayit.getText()
         
        );
         ogrenciIslemleri.Sil(ogrenciVarlik);
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
            java.util.logging.Logger.getLogger(OgrenciSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ara;
    private javax.swing.JButton Btn_Geri;
    private javax.swing.JButton Btn_Sil;
    private javax.swing.JTextField Cinsiyet;
    private javax.swing.JTextField OgrenciID;
    private javax.swing.JPanel Pnl_OgrenciSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField ogr_IsimSoyisim;
    private javax.swing.JTextField ogr_Kayit;
    private javax.swing.JTextField ogr_TC;
    // End of variables declaration//GEN-END:variables
}
