package com.koo.tracki.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koo.tracki.db.RecordDaoImpl;
import com.koo.tracki.db.RecordDto;

@Service
public class RecordServiceImpl implements RecordService {

	@Autowired
	private RecordDaoImpl dao;
	
	@Override
	public List<RecordDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertRecord(RecordDto dto) {
		dao.insertRecord(dto);

	}
	
	@Override
	public String genRid(String uid, Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String strDate = dateFormat.format(date);

		return uid + '_' + strDate;
	}

	@Override
	public boolean rcdExist(String rid) {
		return dao.rcdExist(rid);
		
	}

	@Override
	public void updateFactorRecord(RecordDto dto) {
		dao.updateFactorRecord(dto);
		
	}
	
	public List<RecordDto> getUserRecord(String uid) {
		return dao.getUserRecord(uid);
	}
	
	
	
}
