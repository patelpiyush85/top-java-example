package com.bean;

public class Student {
     
	private int sid;
	private String fname,lname,email;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void init()
	{
		System.out.println("Spring Initilization");
	}
	public void destroy()
	{
		System.out.println("Spring Destroyed");
	}
}
