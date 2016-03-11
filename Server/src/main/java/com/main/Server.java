/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Burak
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ServerSocket soket=null;
        Socket client=null;
        
        
        try{
        soket = new ServerSocket(5555);
        System.out.println("Sunucu Başlatıldı.");
        //Oda oda= new Oda();
        //oda.setIsim("Oda");
        //oda.setPort("5555");
        }catch(IOException e){
        System.out.println("Sunucu Başlatılamadı.");
        System.exit(1);
        }
        
        try{
        client=soket.accept();
        //Kullanici kullanici=new Kullanici();
        //kullanici.setIPAdresi(client.getLocalAddress().toString());
        //kullanici.setIsim("asasa");
        //kullanici.setSoyisim("dsdsd");
        //kullanici.setKullaniciAdi("cddfd");
        System.out.println("Kullanici bağlandı.");
        }catch(IOException e){
        System.out.println("Hata");
        System.exit(1);
       
        }
        
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
    }
    
}
