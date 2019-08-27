package com.koo.tracki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koo.tracki.db.FactorDaoImpl;
import com.koo.tracki.db.FactorDto;
import com.koo.tracki.db.UserDaoImpl;

@Service
public class FactorServiceImpl implements FactorService {
	@Autowired
	private FactorDaoImpl dao;
	
	@Override
	public void addFactors(FactorDto dto) {
			dao.updateFactors(dto);

	}

}
