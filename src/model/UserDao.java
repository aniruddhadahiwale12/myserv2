package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UserDao {
	
	String driver="com.mysql.jdbc.Driver";
	String database="myjdbc";
	String url="jdbc:mysql://localhost:3307/"+database;
	String uname="root";
	String upass="";
	String str="";
	
	Connection con;
	
	Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		 con = DriverManager.getConnection(url,uname,upass);
		 
		 
		 return con;
	}
	
	
	
//	
//	public int userRegister(User u) throws ClassNotFoundException, SQLException
//	{
//		
//		String sql="insert into user_tbl (fname, lname, email, password) values(?,?,?,?)";
//		con=getConnection();
//		PreparedStatement ps=con.prepareStatement(sql);
//		ps.setString(1, u.getFname());
//		ps.setString(2, u.getLname());
//		ps.setString(3, u.getEmail());
//		ps.setString(4, u.getPassword());
//		
//		int x = ps.executeUpdate();
//		con.close();
//		return x;
//	}
	
	public int userDelete(User u) throws ClassNotFoundException, SQLException
	{
		
//		String sql="insert into user_tbl (fname, lname, email, password) values(?,?,?,?)";
		String sql="delete from user_tbl where email = ?";
		con=getConnection();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, u.getEmail());
//		ps.setString(2, u.getLname());
//		ps.setString(3, u.getEmail());
//		ps.setString(4, u.getPassword());
		
		int x = ps.executeUpdate();
		con.close();
		return x;
	}
	
	
	
	
	
	

}
