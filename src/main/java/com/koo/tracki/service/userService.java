package com.koo.tracki.service;

import java.util.List;

import com.koo.tracki.db.UserDto;

public interface userService {
	public List<UserDto> selectAll();
	public void insertUser(UserDto dto);
	public String login(UserDto dto);
}
