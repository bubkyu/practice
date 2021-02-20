package kr.iei.hotel.user.model.service;

import kr.iei.hotel.user.model.vo.MemberVO;

public interface MemberService {
	
	// 로그인
	MemberVO loginMember(MemberVO m);
		
	
	// 회원가입
	int insertMember(MemberVO m);
	
	// 회원정보
	int updateMember(MemberVO m);
	
	// 회원탈퇴용서비스
	int deleteMember(String memberEmail);

	// 아이디 체크
	int emailCheck(String memberEmail);
	
	
}
