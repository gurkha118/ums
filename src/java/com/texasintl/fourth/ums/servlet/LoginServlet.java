package com.texasintl.fourth.ums.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.texasintl.ums.db.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *`
 * 
 */
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("Username: "+username);
        out.println("Password :"+password);
        
        
        Connection cn = DatabaseConnection.getConnection();
        String sql = "insert into login(username, password) values ('"+username+"', '"+password+"')";
        try {
            Statement stat = cn.createStatement();
            stat.executeUpdate(sql);
            out.print("inserted");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}