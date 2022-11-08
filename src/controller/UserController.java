package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/register")
public class UserController extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String str="";
		
		PrintWriter out =response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		str=request.getParameter("operation");
		
//		if(str.equals("Register"))
		
		
			User u=new User (fname,lname,email,pass);
			UserDao db=new UserDao();
			
			if(str==("Register"))
			{
				try {
					int a = db.userDelete(u);
								
					if(a>0)
					{
						out.print("Data inserted");
					}
					else
					{
						out.print("Data not inserted");
					}
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
							
			}
			}
			else 
			{
				out.print("data not found");
			}
			
			
		
		
			
		
//		else if(str.equals("Delete"))
//		{
//			User u=new User (fname,lname,email,pass);
//			UserDao db=new UserDao();
//			
//			try {
//				int a = db.userDelete(u);
//							
//				if(a>0)
//				{
//					out.print("Data Delete");
//				}
//				else
//				{
//					out.print("Data not Delete");
//				}
//				
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
