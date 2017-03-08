/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import Service.Service;
import bean.PatientBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sukhpreet
 */
public class PatientRegistration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        System.out.println("name: "+name);
        String email = request.getParameter("email");
         String gender = request.getParameter("gender");
        System.out.println("Gender:"+gender);
        String a = request.getParameter("age");
        System.out.println(" age " + a);
        int age = Integer.parseInt(a);
        System.out.println("parsed age " + age);
        String address = request.getParameter("address");
       
        PatientBean p = new PatientBean();
        p.setName(name);
        p.setEmail(email);
        p.setAge(age);
        p.setGender(gender);
        p.setAddress(address);
        
        
        Service obj = new Service();
        
        int i = obj.insertPatient(p);
        if (i>0)
            {
                response.sendRedirect("PatientRegistration2.jsp?e=");
                
            }
            else
            {
                String message="Please re-enter your details !";
                response.sendRedirect("PatientRegistration1.jsp?e="+message);
            }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
