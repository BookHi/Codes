package com.bookhi.entity;

import java.sql.Timestamp;

public class User {
	private String userid;
	private String username;
	private String pwd;
	private String nickname;
	private String city;
	private Timestamp lasttime = new Timestamp(System.currentTimeMillis());
	private Timestamp registertime;
	private String phone;
	private String email;
	private Boolean isValid;
	private String lastLoginIp;
	public User() {
		
	}
	public User(String username,String pwd) {
		this.username=username;
		this.pwd=pwd;
	}
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public Timestamp getLasttime() {
		return lasttime;
	}

	public void setLasttime(Timestamp lasttime) {
		this.lasttime = lasttime;
	}
	public Timestamp getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Timestamp registertime) {
		this.registertime = registertime;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	
}
