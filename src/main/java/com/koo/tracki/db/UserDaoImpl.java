package com.koo.tracki.db;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;
	private static final String NAMESPACE="com.koo.tracki.db.UserMapper";
	
	@Override
	public void insertUser(UserDto dto) {
		sqlSession.insert(NAMESPACE + ".insertUser", dto);

	}

	@Override
	public UserDto selectUser(String uid) {
		return sqlSession.selectOne(NAMESPACE + ".selectUser", uid);
	}

	@Override
	public String selectUserWpw(String uid, String pw) {
		Map<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("uid", uid);
		paramMap.put("pw", pw);
		return sqlSession.selectOne(NAMESPACE + ".selectUserWpw", paramMap);
	}

}
