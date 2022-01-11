
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class OturumAc extends javax.swing.JFrame {
Image icon = Toolkit.getDefaultToolkit().getImage("src/images/login.png");


    
    public OturumAc() {
        super.setIconImage(icon);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_OturumAc = new javax.swing.JPanel();
        Txt_KullaniciAdi = new javax.swing.JTextField();
        Txt_Sifre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Btn_OturumAc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oturum Açma");
        setBackground(new java.awt.Color(0, 204, 204));
        setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(38, 50, 56));
        setLocation(new java.awt.Point(400, 200));

        Pnl_OturumAc.setBackground(new java.awt.Color(0, 102, 102));
        Pnl_OturumAc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 4), "Oturum Aç", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        Pnl_OturumAc.setForeground(new java.awt.Color(204, 255, 255));

        Txt_KullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_KullaniciAdi.setText("Admin");

        Txt_Sifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_Sifre.setText("Admin");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1- Güz Dönemi/Nesne Yönelimli Programlama/proje/OkulOtomasyonu/src/images/user_name_login.png"))); // NOI18N

        Btn_OturumAc.setBackground(new java.awt.Color(0, 96, 100));
        Btn_OturumAc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_OturumAc.setForeground(new java.awt.Color(178, 223, 219));
        Btn_OturumAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_32.png"))); // NOI18N
        Btn_OturumAc.setText("Oturum Aç");
        Btn_OturumAc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Btn_OturumAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OturumAcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Şifre");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_login.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_128.png"))); // NOI18N

        javax.swing.GroupLayout Pnl_OturumAcLayout = new javax.swing.GroupLayout(Pnl_OturumAc);
        Pnl_OturumAc.setLayout(Pnl_OturumAcLayout);
        Pnl_OturumAcLayout.setHorizontalGroup(
            Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_OturumAc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                        .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32))
                            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                                .addComponent(Txt_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                                .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_OturumAcLayout.setVerticalGroup(
            Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Txt_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_OturumAcLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Pnl_OturumAcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_OturumAcLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)))
                .addComponent(Btn_OturumAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Pnl_OturumAc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pnl_OturumAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_OturumAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OturumAcActionPerformed
        String İsim= Txt_KullaniciAdi.getText();
        String Sifre=Txt_Sifre.getText();

        if(İsim.equals("Admin")&& Sifre.equals("Admin")){

           Hosgeldiniz H=new Hosgeldiniz();
            H.setUpHosgeldiniz();
           H.setVisible(true);
           dispose();

        }
        else{
           
          ImageIcon icon=new ImageIcon( new ImageIcon("src/images/error.png").getImage().getScaledInstance(64, 64,10));
          JOptionPane.showMessageDialog(Btn_OturumAc, "Kullanıcı adı veya şifre yanlış.","Hatalı Giriş",JOptionPane.ERROR_MESSAGE,icon);
           //JOptionPane.showMessageDialog(null, "Yeni öğretmen oluşturuldu.","Öğretmen Ekleme",JOptionPane.INFORMATION_MESSAGE,icon);
                   }
    }//GEN-LAST:event_Btn_OturumAcActionPerformed

    
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
            java.util.logging.Logger.getLogger(OturumAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OturumAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OturumAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OturumAc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OturumAc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_OturumAc;
    private javax.swing.JPanel Pnl_OturumAc;
    private javax.swing.JTextField Txt_KullaniciAdi;
    private javax.swing.JPasswordField Txt_Sifre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


}
