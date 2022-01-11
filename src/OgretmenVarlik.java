
public class OgretmenVarlik extends Kisi {
   /* aşağıdaki özellikler Kisi sınıfından kalıtım yoluyla alındı
//private int OgretmenID;
    //private int TC;
   // private String IsimSoyisim;
   // private String Cinsiyet;
    */
    private String Brans;
    private int Maas;
	private int OgretmenID;
	private int TC;
	private String IsimSoyisim;
	private String Cinsiyet;

    public OgretmenVarlik() {
    }
    //int ID, int TC, String IsimSoyisim, String Cinsiyet
    public OgretmenVarlik(int OgretmenID, int TC, String IsimSoyisim, String Cinsiyet, String Brans, int Maas) {
        super(OgretmenID,TC,IsimSoyisim,Cinsiyet);
        //this.OgretmenID = OgretmenID;
        //this.TC = TC;
        //this.IsimSoyisim = IsimSoyisim;
        //this.Cinsiyet = Cinsiyet;
        
        this.Brans = Brans;
        this.Maas = Maas;
        
      
    }

 
   /*
public int getOgretmenID() {
        return OgretmenID;
    }

    public void setOgretmenID(int OgretmenID) {
        this.OgretmenID = OgretmenID;
        
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }
*/
   /* public String getIsimSoyisim() {
        return IsimSoyisim;
    }

    public void setIsimSoyisim(String IsimSoyisim) {
        this.IsimSoyisim = IsimSoyisim;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }
*/
    public String getBrans() {
        return Brans;
    }

    public void setBrans(String Brans) {
        this.Brans = Brans;
    }

    public int getMaas() {
        return Maas;
    }

    public void setMaas(int Maas) {
        this.Maas = Maas;
    }

	public int getOgretmenID() {
		return this.OgretmenID;
	}

	public void setOgretmenID(int OgretmenID) {
		this.OgretmenID = OgretmenID;
	}

	public int getTC() {
		return this.TC;
	}

	public void setTC(int TC) {
		this.TC = TC;
	}

	public String getIsimSoyisim() {
		return this.IsimSoyisim;
	}

	public void setIsimSoyisim(String IsimSoyisim) {
		this.IsimSoyisim = IsimSoyisim;
	}

	public String getCinsiyet() {
		return this.Cinsiyet;
	}

	public void setCinsiyet(String Cinsiyet) {
		this.Cinsiyet = Cinsiyet;
	}

  
    
    
}
