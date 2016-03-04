/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanaltoplanti;

import sanaltoplanti.Kullanici;

/**
 *
 * @author Burak
 */
public class Oda {
    //Açılacak odanın ismi.
    private String Oda_ismi;
    //Açılacak odanın portu.
    private String OdaPort;
    //Kullanıcılar
    private Kullanici kisi1;
    private Kullanici kisi2;
    private Kullanici kisi3;
    private Kullanici kisi4;

    //Getter ve Setter metodları.
    public String getOda_ismi() {
        return Oda_ismi;
    }

    public void setOda_ismi(String Oda_ismi) {
        this.Oda_ismi = Oda_ismi;
    }

    public String getOdaPort() {
        return OdaPort;
    }

    public void setOdaPort(String OdaPort) {
        this.OdaPort = OdaPort;
    }

    public Kullanici getKisi1() {
        return kisi1;
    }

    public void setKisi1(Kullanici kisi1) {
        this.kisi1 = kisi1;
    }

    public Kullanici getKisi2() {
        return kisi2;
    }

    public void setKisi2(Kullanici kisi2) {
        this.kisi2 = kisi2;
    }

    public Kullanici getKisi3() {
        return kisi3;
    }

    public void setKisi3(Kullanici kisi3) {
        this.kisi3 = kisi3;
    }

    public Kullanici getKisi4() {
        return kisi4;
    }

    public void setKisi4(Kullanici kisi4) {
        this.kisi4 = kisi4;
    }
    
    
}
