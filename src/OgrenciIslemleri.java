
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class OgrenciIslemleri extends OgrenciVarlik implements IOgrenciIslemleri1,IOgrenciIslemleri2{
    Connection connection;
    ResultSet resultSet;
    PreparedStatement statement;

    public OgrenciIslemleri() {
        connection=JavaConnect.ConnecrDb();
    }

    
    @Override
    public void ekle(OgrenciVarlik ogrenciVarlik) {
                OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
        String sql="insert into Ogrenci(OgrenciID,TC,IsimSoyisim,Cinsiyet,Kayit) values (?,?,?,?,?)";
        try{
            statement=connection.prepareStatement(sql);
           // statement.setInt(1,ogrenciVarlik.getOgrenciID());
            statement.setInt(1,ogrenciVarlik.getID());
            statement.setInt(2,ogrenciVarlik.getTC());
            statement.setString(3,ogrenciVarlik.getIsimSoyisim());
            statement.setString(4, ogrenciVarlik.getCinsiyet());
            statement.setString(5,ogrenciVarlik.getKayit());
            statement.execute();
            
           
            //ImageIcon icon=new ImageIcon("src/images/binary-code.png");
            ImageIcon icon=new ImageIcon( new ImageIcon("src/images/binary-code.png").getImage().getScaledInstance(50, 50,10));
           
           
            JOptionPane.showMessageDialog(null, "Yeni öğrenci oluşturuldu.","Öğrenci Ekleme",JOptionPane.INFORMATION_MESSAGE,icon);
            
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }

  
    @Override
    public void Sil(OgrenciVarlik ogrenciVarlik) {
        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
           String sql="DELETE FROM Ogrenci WHERE OgrenciID = ?";
       try{
            
            
          statement=connection.prepareStatement(sql);
         // statement.setInt(1,ogrenciVarlik.getOgrenciID());
          statement.setInt(1,ogrenciVarlik.getID());
           statement.executeUpdate();
          JOptionPane.showMessageDialog(null,"Silme işlemi başarılı");
 
          
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }

    @Override
    public void Listele(OgrenciVarlik ogrenciVarlik) {
        throw new UnsupportedOperationException("Listelemede hata var."); 
    }

    @Override
    public void Ara(OgrenciVarlik ogrenciVarlik) {
        throw new UnsupportedOperationException("Desteklenmeyen operasyon."); 
    }

    @Override
    public void guncelle(OgrenciVarlik ogrenciVarlik) {
       String sql="update Ogrenci set "
                +"TC ='"+ogrenciVarlik.getTC()+"',"
               +"IsimSoyisim ='"+ogrenciVarlik.getIsimSoyisim()+"',"
               +"Cinsiyet= '"+ogrenciVarlik.getCinsiyet()+"',"
               +"Kayit='"+ogrenciVarlik.getKayit()+"'"
              // +"where OgrenciID = "+ogrenciVarlik.getOgrenciID();
       +"where OgrenciID = "+ogrenciVarlik.getID();
       
        try {
       
         statement=connection.prepareStatement(sql);
        statement.execute();
         JOptionPane.showMessageDialog(null, "Öğrenci güncellendi.");
         
     } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e); 
     }
    }

    
}
