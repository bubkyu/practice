package kr.iei.hotel.user.controller;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.iei.hotel.user.model.dao.MemberDao;
import kr.iei.hotel.user.model.service.MemberService;
import kr.iei.hotel.user.model.vo.MemberVO;


public class MemberController {
	
	@Autowired
	private MemberService mService;
	
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	// 암호화 처리 후 로그인
	@RequestMapping("/login")	// 로그인할때 form action="/login"
	public String loginMember(MemberVO m, HttpSession session, Model model) {
		
		MemberVO memberEmail = mService.loginMember(m); //아이디 가지고 찾은 회원
		
		// loginUser -> 모든 컬럼에 대한 값 과 암호화비밀번호
		if(memberEmail != null && bcryptPasswordEncoder.matches(m.getMemberPassword(), memberEmail.getMemberPassword())) {
			session.setAttribute("memberEmail", memberEmail);
			session.setAttribute("alertMsg", memberEmail.getMemberName() + " 환영합니다.");
			return "redirect:/";
		}else {
			model.addAttribute("errorMsg", "로그인 실패");
			return ""; // 어디로보낼까?
		}
		
	}
	
	// 로그아웃
	@RequestMapping("logout.me")
	public String logoutMember(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	// 회원가입
	@RequestMapping("signUp")
	public String signUp() {
		return "member/signUp";
	}
	
	// 회원가입 요청 
	@RequestMapping("/memberSignUp")
	public String insertMember(MemberVO m, HttpSession session, Model model) {
		
		System.out.println("안호화전 : " + m.getMemberPassword());
		
		// 암호화문만들기
		String encPassword = bcryptPasswordEncoder.encode(m.getMemberPassword());
		System.out.println("암호화 후: " + encPassword);	
		
		m.setMemberPassword(encPassword);// setter 를 통해 암호문 담기
		
		int result = mService.insertMember(m);
		if(result > 0) {
			session.setAttribute("alertMsg", "성공적으로 회원가입");
			return "redirect:/";
		}else {
			model.addAttribute("errorMsg","회원가입실패");
			return "";
		}
		
	
	}
	// 회원정보업데이트.
	@RequestMapping("myPage")
	public String myPage() {
		return "myPage/updateMember";
	}
	
	// 회원정보수정
	@RequestMapping("update.me")
	public String updateMember(MemberVO m, HttpSession session, Model model) {
		
		int result = mService.updateMember(m);
		
		if(result > 0) {
			session.setAttribute("loginUser", mService.loginMember(m));
			session.setAttribute("alertMsg", "성공적으로 정보 변경");
			return "redirect:myPage";
		}else {
			model.addAttribute("errorMsg", "수정 실패");
			return "redirect:myPage";
		}
	}
	
	@RequestMapping("delete.me")
	public String deleteMember(String memberPassword, HttpSession session, Model model) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		// session 안에 암호화비밀번호
		
		if(bcryptPasswordEncoder.matches(memberPassword, loginUser.getMemberPassword())){
			
			int result = mService.deleteMember(loginUser.getMemberEmail());
			if(result > 0) {
				session.removeAttribute("loginUser");
				session.setAttribute("alertMsg", "성공적으로 탈퇴. 그동안 이용해줘서 감사");
				
				return "redirect:/";
			}else {
				model.addAttribute("errorMsg", "회원탈퇴실패");
				return "redirect:/";
			}
		}else {
			session.setAttribute("alertMsg", "비밀번호가틀림");
			return "redirect:myPage";
		}
	}
	
	// 아이디 중복체크
	@ResponseBody
	@RequestMapping("emailCheck.me")
	public String emailCheck(String memberEmail) {
		
		int count = mService.emailCheck(memberEmail);
		
		if( count > 0) {
			return  "fail";
		}else {
			return "success";
		}
	}
	
}












