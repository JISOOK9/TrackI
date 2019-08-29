package com.koo.tracki.db;

import java.util.List;

public interface RecordDao {
	public void insertRecord(RecordDto dto);
	public void updateFactorRecord(RecordDto dto);
	public void updateRecord(RecordDto dto);
	public void deleteRecord(String rid);
	public RecordDto getRecord(String rid);
	public boolean rcdExist(String rid);
	public List<RecordDto> getUserRecord(String uid);
}
