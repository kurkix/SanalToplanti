/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlet;

import com.Model.Kullanicilar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Burak
 */
public class KaydolServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String isim = request.getParameter("isim");
        String soyisim = request.getParameter("soyisim");
        String Kullaniciadi = request.getParameter("kullaniciadi");
        String Sifre = request.getParameter("sifre");
        String email = request.getParameter("email");
        String SifreTekrari = request.getParameter("sifretekrar");
        
        if(SifreTekrari.equals(Sifre)){
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Kullanicilar.class);
        config.configure("hibernate1.cfg.xml");
        
        new SchemaExport(config).create(true, true);
        
                
        SessionFactory factory=config.buildSessionFactory();
        Session session= factory.getCurrentSession();
        
        session.beginTransaction();
        
        Kullanicilar kullanici= new Kullanicilar();
        //kullanici.setKullanicilarID(1);
        kullanici.setIsim(isim);
        kullanici.setSoyisim(soyisim);
        kullanici.setEmail(email);
        kullanici.setKullaniciAdi(Kullaniciadi);
        kullanici.setSifre(Sifre);
        kullanici.setIpAdresi(" ");
        
        session.save(kullanici);
        session.getTransaction().commit();
        response.sendRedirect("index.jsp");
        
        }else{
        response.sendRedirect("basarisiz.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
 
}
