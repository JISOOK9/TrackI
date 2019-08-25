package com.koo.tracki.db;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
public class UserDto {

	private String uid;
	private String pw;
	private String email;
	private String nick;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bdate;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	@Override
	public String toString() {
		return "MemDto [uid=" + uid + ", pw=" + pw + ", email=" + email + ", nick=" + nick + ", gender=" + gender
				+ ", bdate=" + bdate + "]";
	}
	
	
	
}
