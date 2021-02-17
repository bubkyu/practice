package kr.iei.hotel.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.iei.hotel.user.model.service.UserService;
import kr.iei.hotel.user.model.vo.User;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("login.me")
	public ModelAndView loginUser(User u, HttpSession session, ModelAndView mv) {
		User loginUser = userService.loginUser(u);
		
		if(loginUser == null) {
			mv.addObject("errorMsg","로그인 실패");
			
		}else {
			session.setAttribute("loginUser", loginUser);
			session.setAttribute("alertMsg", loginUser.getMemberNick() + "님 환영합니다.");
			
		}
		
		return mv;
		
	}
	
	@RequestMapping("update.me")
	public String updateUser(User u, HttpSession session, Model model) {
		
		int result = userService.updateUser(u);
		
		if(result > 0) {
			session.setAttribute("loginUser", userService.loginUser(u));
			session.setAttribute("alertMsg", "성공적으로 정보 변경 되었습니다.");
			return "redirect:myPage";
		}else {
			model.addAttribute("errorMsg", "수정 실패했습니다.");
			return "redirect:myPage";
			
		}
		
		
	}

}
