package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;

import com.util.ProjectUtil;

public class UserDao {
	public static void signup(User u)
	{
		
		try
		{
			Connection conn=ProjectUtil.createConnection();
			String sql="insert into user(fname,lname,email,mobile,address,password,usertype)values(?,?,?,?,?,?,?)";
		    PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,u.getFname());
			pst.setString(2,u.getLname());
			pst.setString(3,u.getEmail());
			pst.setString(4,u.getMobile());
			pst.setString(5,u.getAddress());
			pst.setString(6,u.getPassword());
			pst.setString(7,u.getUsertype());
			pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static boolean checkemail(String email)
	{
		boolean falge=false;
		try {
			Connection conn=ProjectUtil.createConnection();
			String sql="select * from user where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,email);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				falge=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return falge;
	}
	
		public static User login(String email) {
		User u=null;
		try {
			Connection conn=ProjectUtil.createConnection();
			String sql="select * from user where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,email);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setUid(rs.getInt("uid"));
				u.setUsertype(rs.getString("usertype"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getString("mobile"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
		public static void changepassword(String email,String password)
		{
			try {
				Connection conn=ProjectUtil.createConnection();
				String sql="update user set password=? where email=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1,password);
				pst.setString(2,email);
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
					
		}
}
