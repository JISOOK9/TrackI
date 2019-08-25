package com.koo.tracki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koo.tracki.db.UserDaoImpl;
import com.koo.tracki.db.UserDto;

@Service
public class userRegServiceImpl implements userService {
	
	@Autowired
	private UserDaoImpl dao;

	@Override
	public List<UserDto> selectAll() {
		return null;
	}

	@Override
	public void insertUser(UserDto dto) {
		dao.insertUser(dto);
		
	}

	@Override
	public String login(UserDto dto) {
		return dao.selectUserWpw(dto.getUid(), dto.getPw());
		
	}
	
}
