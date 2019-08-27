package com.koo.tracki.db;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FactorDaoImpl implements FactorDao {

	@Autowired
	private SqlSession sqlSession;
	private static final String NAMESPACE="com.koo.tracki.db.FactorMapper";
	
	@Override
	public void updateFactors(FactorDto dto) {
		sqlSession.update(NAMESPACE + ".updateFactors", dto);
		return;
	}

	@Override
	public FactorDto getFactors(String uid) {
		return sqlSession.selectOne(NAMESPACE + ".selectFactors", uid);
	}

}
