package kr.iei.hotel.user.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.iei.hotel.user.model.dao.MemberDao;
import kr.iei.hotel.user.model.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDao mDao;

	@Override
	public MemberVO loginMember(MemberVO m) {
		
		return mDao.loginMember(sqlSession, m);
	}

	@Override
	public int insertMember(MemberVO m) {
		
		int result = mDao.insertMember(sqlSession, m);
		return result;
	}

	@Override
	public int updateMember(MemberVO m) {
				
		return mDao.updateMember(sqlSession, m);
	}

	@Override
	public int deleteMember(String memberEmail) {
		
		return mDao.deleteMember(sqlSession, memberEmail);
	}

	@Override
	public int emailCheck(String memberEmail) {
		return mDao.emailCheck(sqlSession, memberEmail);
	}
}
