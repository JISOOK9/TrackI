package com.koo.tracki.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RecordDaoImpl implements RecordDao {

	@Autowired
	private SqlSession sqlSession;
	private static final String NAMESPACE="com.koo.tracki.db.RecordMapper";
	
	@Override
	public void insertRecord(RecordDto dto) {
		sqlSession.insert(NAMESPACE + ".insertRecord", dto);
	}

	
	@Override
	public void updateFactorRecord(RecordDto dto) {
		sqlSession.update(NAMESPACE + ".updateFactorRecord", dto);
		
	}

	@Override
	public void updateRecord(RecordDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRecord(String did) {
		// TODO Auto-generated method stub

	}

	@Override
	public RecordDto getRecord(String did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rcdExist(String rid) {	
		return sqlSession.selectOne(NAMESPACE + ".checkExist", rid);
	}
	
	@Override
	public List<RecordDto> getUserRecord(String uid) {
		System.out.println("debugging record");
		
		return sqlSession.selectList(NAMESPACE + ".selectUserRecords", uid);
	}
}
