package com.example.demo;

import java.sql.JDBCType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner  {
  
	@Autowired
	private JdbcTemplate jdbcTemplate ;
  
      
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.CreateUser();
		//this.updateUser();
		
		this.DeleteUser();
		System.out.println("main....");
		
	}

	public void CreateUser()
	{
	String sql = "INSERT INTO HIBERNATE_USER (id,username,password,email,mobile) VALUES(?,?,?,?,?)";
	jdbcTemplate.update(sql,5, "gajendrab","hello","fmail","hekkk");
   System.out.println("User created....");
	}
	public void updateUser()
	{
		
		String sql="UPDATE  HIBERNATE_USER SET USERNAME=? WHERE =? "; 
	     jdbcTemplate.update(sql,"ghanta",1 );
	
	}
	
	public void DeleteUser() {
		String sql =  "Delete FROM  HIBERNATE_USER where ID= ? ";
		jdbcTemplate.update(sql, 1);
		
	}
}
