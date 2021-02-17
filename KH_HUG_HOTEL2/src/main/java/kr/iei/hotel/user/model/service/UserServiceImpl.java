package kr.iei.hotel.user.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.iei.hotel.user.model.dao.UserDAO;
import kr.iei.hotel.user.model.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private UserDAO uDao;
	
	@Override
	public User loginUser(User u) {
		
		return uDao.loginUser(sqlSession, u);
		
	}

	@Override
	public int updateUser(User u) {
		
		return uDao.updateUser(sqlSession, u);
	}
	
	

}
