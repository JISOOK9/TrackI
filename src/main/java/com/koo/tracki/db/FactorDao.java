package com.koo.tracki.db;

public interface FactorDao {
	public void updateFactors(FactorDto dto);
	public FactorDto getFactors(String uid);
}
