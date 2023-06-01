package com.roll6.kishanSirJdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping("/select")  
    public String index(){  
		try (Connection con = DriverManager
				  .getConnection("jdbc:mysql://localhost:3306/hello", "ecommerceapp", "ecommerceapp")) {
			Statement statement = con.createStatement();
			statement.executeUpdate("create table Temp (col1 char(5), col2 char(5))");
//			ResultSet resultSet = statement.executeQuery("");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getString(1));
//				
//			}
				   
		}catch (Exception e) {
			return e.getLocalizedMessage();
		}
		return "hello";
		
	}
}
