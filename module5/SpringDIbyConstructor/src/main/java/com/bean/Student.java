package com.bean;

public class Student {

	private int sid;
	private String fname,lname,email;
	
	public Student(int sid, String fname, String lname, String email) {
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	public String toString() {
		return "SID: "+sid+"\nFIRST NAME :"+fname+"\nLAST NAME: "+lname+"\nEMAIL: "+email;
	}
	
	
}
