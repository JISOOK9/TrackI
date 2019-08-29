package com.koo.tracki.service;

import java.util.Date;
import java.util.List;

import com.koo.tracki.db.RecordDto;


public interface RecordService {
	public List<RecordDto> selectAll();
	public void insertRecord(RecordDto dto);
	public void updateFactorRecord(RecordDto dto);
	public String genRid(String uid, Date date);
	public boolean rcdExist(String rid);
}
