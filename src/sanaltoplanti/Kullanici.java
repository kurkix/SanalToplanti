/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanaltoplanti;

/**
 *
 * @author Burak
 */
public class Kullanici {
    //Kullanıcının kullanıcı adını belirtiyorum.
    private String KullaniciAdi;
    //Kullanıcının IP sini belirtiyorum.
    private String KullaniciIP;
    //Kullanıcının ismi
    private String isim;
    //Kullanicinin soyismi.
    private String Soyisim;

    //Getter ve Setter metodları.
    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getKullaniciIP() {
        return KullaniciIP;
    }

    public void setKullaniciIP(String KullaniciIP) {
        this.KullaniciIP = KullaniciIP;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }
    
    
}
