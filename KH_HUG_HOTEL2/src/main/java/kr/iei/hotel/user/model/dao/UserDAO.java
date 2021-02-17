package kr.iei.hotel.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.iei.hotel.user.model.vo.User;

@Repository
public class UserDAO {
	
	public User loginUser(SqlSessionTemplate sqlSession, User u) {
		
		return sqlSession.selectOne("userMapper.loginUser", u);
	}
	
	public int updateUser(SqlSessionTemplate sqlSession, User u) {
		return sqlSession.update("userMapper.updateUser", u);
		
	}


}
