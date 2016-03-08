/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Burak
 */
@Entity
@Table(name="Kullanicilar")
public class Kullanicilar {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="KullanicilarID")
    private int KullanicilarID;
    @Column(name="isim")
    private String isim;
    @Column(name="Soyisim")
    private String Soyisim;
    @Column(name="IpAdresi")
    private String IpAdresi;
    @Column(name="KullaniciAdi")
    private String KullaniciAdi;
    @Column(name="Sifre")
    private String Sifre;
    @Column(name="Email")
    private String email;

    public int getKullanicilarID() {
        return KullanicilarID;
    }

    public void setKullanicilarID(int KullanicilarID) {
        this.KullanicilarID = KullanicilarID;
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

    public String getIpAdresi() {
        return IpAdresi;
    }

    public void setIpAdresi(String IpAdresi) {
        this.IpAdresi = IpAdresi;
    }

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
