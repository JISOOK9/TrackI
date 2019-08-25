package com.koo.tracki.db;

public interface UserDao {
	public void insertUser(UserDto dto);
	public UserDto selectUser(String uid);
	public String selectUserWpw(String uid, String pw);
}
