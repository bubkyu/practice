package kr.iei.hotel.user.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.iei.hotel.user.model.vo.MemberVO;

@Repository
public class MemberDao {
	
	// 로그인
	public MemberVO loginMember(SqlSessionTemplate sqlSession, MemberVO m) {
		
		return sqlSession.selectOne("memberMapper.loginMember", m);
	}
	
	// 회원가입
	public int insertMember(SqlSessionTemplate sqlSession, MemberVO m) {
		return sqlSession.insert("memberMapper.insertMember", m);
	}
	
	// 정보수정
	public int updateMember(SqlSessionTemplate sqlSession, MemberVO m) {
		return sqlSession.update("memberMapper.updateMember", m);
	}
	
	// 회원삭제
	public int deleteMember(SqlSessionTemplate sqlSession, String memberEmail) {
		return sqlSession.update("memberMapper.delteMember", memberEmail);
	}
	
	// 아이디체크
	public int emailCheck(SqlSessionTemplate sqlSession, String memberEmail) {
		
		return sqlSession.selectOne("memberMapper.memberEmail", memberEmail);
	}

}
