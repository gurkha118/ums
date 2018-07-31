/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.ums.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DatabaseConnection {
	public static Connection getConnection(){
	  Connection cn=null;
	  try
	  {
		  Class.forName("com.mysql.jdbc.Driver");//loading the driver
		  cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");
		  System.out.println("Connected");
		  return cn;
	  }
	  catch(Exception e){
		  System.out.println("Exception:"+e.getMessage());
		  e.printStackTrace();//To trace further info of exception
	  }
	  return null; 	  
	}
	public static void main(String[] args){
		getConnection();
	}
} 

