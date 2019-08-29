package com.koo.tracki.service;

import java.util.List;

import com.koo.tracki.db.RecordDto;

public interface StatisticService {
	public void test();
	public List<RecordDto> collectRecord(String uid);
	public double[] getCorrelation(List<RecordDto> records);
}
