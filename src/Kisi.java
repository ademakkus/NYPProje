/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mypc
 */
public class Kisi {
    private int ID;
    private int TC;
    private String IsimSoyisim;
    private String Cinsiyet;

    public Kisi() {
    }

    public Kisi(int ID, int TC, String IsimSoyisim, String Cinsiyet) {
        this.ID = ID;
        this.TC = TC;
        this.IsimSoyisim = IsimSoyisim;
        this.Cinsiyet = Cinsiyet;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the TC
     */
    public int getTC() {
        return TC;
    }

    /**
     * @param TC the TC to set
     */
    public void setTC(int TC) {
        this.TC = TC;
    }

    /**
     * @return the IsimSoyisim
     */
    public String getIsimSoyisim() {
        return IsimSoyisim;
    }

    /**
     * @param IsimSoyisim the IsimSoyisim to set
     */
    public void setIsimSoyisim(String IsimSoyisim) {
        this.IsimSoyisim = IsimSoyisim;
    }

    /**
     * @return the Cinsiyet
     */
    public String getCinsiyet() {
        return Cinsiyet;
    }

    /**
     * @param Cinsiyet the Cinsiyet to set
     */
    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }
}
