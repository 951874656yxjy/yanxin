package org.fkit.ebuy.domain;

import java.util.List;

public class User {
	//private Integer id;
	private String loginname;
	private String password;
	private String username;
	private String email;
	private String phonenumber;
//	 
	 public User(String loginname, String password, String username,String email, String phonenumber) {
		 this.loginname = loginname; 
		 this.password = password;
		 this.username = username;
		 this.email = email;
		 this.phonenumber = phonenumber;
	 }
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [ loginname=" + loginname + ", password="
				+ password + ", username=" + username + ",email=" + email + ",phonenumber=" + phonenumber +"]";
	}

//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}







}
