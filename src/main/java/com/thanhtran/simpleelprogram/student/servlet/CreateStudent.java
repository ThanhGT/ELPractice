/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhtran.simpleelprogram.student.servlet;

import com.thanhtran.simpleelprogram.student.model.Student;
import java.io.IOException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thanh Tran
 */
public class CreateStudent extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // get parameters from form
        String name = request.getParameter("name");
        
        // instantiate an object from the random class
        Random rand = new Random();
        
        // check if student is fullTime or not by randomizing true and false
        boolean isFullTime = rand.nextBoolean();
        
        // instantiate an object of the student class and pass in parameters
        Student student = new Student(name, isFullTime);
        
        // create session
        HttpSession session = request.getSession();
        
        // set parameter to a session
        session.setAttribute("student", student);
        
        // dispatch to jsp page
        RequestDispatcher rd = request.getRequestDispatcher("displayStudent.jsp");
        rd.forward(request, response);
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
       
        doPost(request, response);
    }
    
    
    
    
            
            
}
