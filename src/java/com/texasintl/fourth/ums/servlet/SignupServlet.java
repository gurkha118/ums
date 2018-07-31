/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.fourth.ums.servlet;

import com.texasintl.ums.db.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class SignupServlet extends HttpServlet {
     public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        String fn = request.getParameter("firstname");
        String ln = request.getParameter("lastname");
        PrintWriter out = response.getWriter();
        out.println("Firstname: "+fn);
        out.println("Lastname :"+ln);
        
        
        Connection cn = DatabaseConnection.getConnection();
        String sql = "insert into signup(firstname, lastname) values ('"+fn+"', '"+ln+"')";
        System.out.println("SQl:"+sql);
        try {
            Statement stat = cn.createStatement();
            stat.executeUpdate(sql);
            out.print("inserted");
             response.sendRedirect("./login.jsp");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
      //  response.sendRedirect("login.jsp");
    }

}


  