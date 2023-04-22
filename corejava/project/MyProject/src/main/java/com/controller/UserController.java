package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Cart;
import com.bean.User;
import com.bean.wishlist;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishlistDao;
import com.service.Services;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String action=request.getParameter("action");
     
     
     if (action.equalsIgnoreCase("sign up"))
     {
    	 
    	 Boolean flag=UserDao.checkemail(request.getParameter("email"));
    	 		if (flag==true) 
    	 		{
    	 			request.setAttribute("msg","Email Already Registered");
    	 			request.getRequestDispatcher("signup.jsp").forward(request, response);
    	 		}
    	 		else
    	 		{
    	 			if(request.getParameter("password").equals(request.getParameter("cpassword")))
    	 			{
    	               User u=new User();
    	               u.setUsertype(request.getParameter("usertype"));
    	               u.setFname(request.getParameter("fname"));
    	               u.setLname(request.getParameter("lname"));
    	               u.setEmail(request.getParameter("email"));
    	               u.setMobile(request.getParameter("mobile"));
    	               u.setAddress(request.getParameter("address"));
    	               u.setPassword(request.getParameter("password"));
    	               UserDao.signup(u);
    	               request.setAttribute("msg","User Sign Up Sucessfully");
    	               request.getRequestDispatcher("signup.jsp").forward(request, response);
    	 			}
    	 			else
    	 			{
    			 	request.setAttribute("msg","Password & Confirm Password Does Not Match");
    			 	request.getRequestDispatcher("signup.jsp").forward(request, response);
    	 			}
    	}
     }
     else if (action.equalsIgnoreCase("login")) 
     {
    	 User u=UserDao.login(request.getParameter("email"));
    	
		if(u==null)
		{
			request.setAttribute("msg","Email Not Registered");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else
		{
			if (u.getPassword().equals(request.getParameter("password"))) {
				HttpSession session=request.getSession();
				session.setAttribute("u", u);
				if(u.getUsertype().equals("buyer"))
				{
					List<wishlist> list=WishlistDao.getWishlistByUser(u.getUid());
					 int wishlist_count=list.size();
					 session.setAttribute("wishlist_count", wishlist_count);
					 
					 List<Cart> list1=CartDao.getCartByUser(u.getUid());
					 int cart_count=list1.size();
					 session.setAttribute("cart_count", cart_count);
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				else
				{
					request.getRequestDispatcher("seller-index.jsp").forward(request, response);
				}
				
				
			} else {
				request.setAttribute("msg","Incorrect Password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			
				}
		
		 
     		}
     			else if(action.equalsIgnoreCase("change password"))
     				{
     				HttpSession session=request.getSession();
     				User u=(User) session.getAttribute("u");
     				if(u.getPassword().equals(request.getParameter("old_password")))
     				{
     					if(!u.getPassword().equals(request.getParameter("new_password")))
     					{
     						if(request.getParameter("new_password").equals(request.getParameter("cnew_password")))
     						{
     							 UserDao.changepassword(u.getEmail(),request.getParameter("new_password"));
     							 request.setAttribute("msg","Password Changed Sucessfully");
     		    				 request.getRequestDispatcher("logout.jsp").forward(request, response);
     						}
     						else
     						{
     							request.setAttribute("msg","New Password & Confirm Password Does Not Match");
     		    				 request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
     						}
     					}
     					else
     					{
     						request.setAttribute("msg","New Password Could Not Be Same As Old Password");
     						 request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
     					}
     				}
     				else
     				{
     					request.setAttribute("msg"," Old Password Does Not Match");
						 request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
     				}
     					}
     			else if(action.equalsIgnoreCase("send otp"))
     			{
     				boolean flag=UserDao.checkemail(request.getParameter("email"));
     				if(flag==true)
     				{
     					Random t = new Random();
     			    	int minRange = 1000, maxRange= 9999;
     		        	int otp = t.nextInt(maxRange - minRange) + minRange;
     		        	Services.sendMail(request.getParameter("email"), otp);
     		        	request.setAttribute("email", request.getParameter("email"));
     		        	request.setAttribute("otp", otp);
     		        	request.getRequestDispatcher("otp.jsp").forward(request, response);
     				}
     				else
     				{
     					request.setAttribute("msg","Email Not Registered");
     					request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
     				}
     				
     			}
     			else if(action.equalsIgnoreCase("verify otp"))
     			{
     				String email=request.getParameter("email");
     				int otp=Integer.parseInt(request.getParameter("otp"));
     				int uotp=Integer.parseInt(request.getParameter("uotp"));
     				if(otp==uotp)
     				{
     					request.setAttribute("email",email);
     					request.getRequestDispatcher("new-password.jsp").forward(request, response);
     				}
     				else
     				{
     					request.setAttribute("msg","Invalid otp");
     					request.setAttribute("otp",otp);
     					request.setAttribute("email",email); 
     					request.getRequestDispatcher("otp.jsp").forward(request, response);
     				}
     			}
     
     			else if(action.equalsIgnoreCase("update password"))
     			{
     				String email=request.getParameter("email");
     				String new_password=request.getParameter("new_password");
     				String cnew_password=request.getParameter("cnew_password");
     			
        		if(new_password.equals(cnew_password))
        		{
        			UserDao.changepassword(email, cnew_password);
        			request.setAttribute("msg","Password Updated Sucessfully");
        			request.getRequestDispatcher("login.jsp").forward(request, response);
        		}
        		else
        		{
        			request.setAttribute("msg","New password & Confirm New Password Does Not Match");
        			request.setAttribute("email",email);
        			request.getRequestDispatcher("new-password.jsp").forward(request, response);
        		}
     			}	
     	}
}
	
	



     
	
	
	


