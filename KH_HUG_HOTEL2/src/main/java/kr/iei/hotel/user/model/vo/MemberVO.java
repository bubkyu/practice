package kr.iei.hotel.user.model.vo;

import java.util.Date;

import lombok.Data;


public class MemberVO {
	
	private Long memberId;			// 회원일련번호
	private String gradeName;		// 회원등급
	private Date memberReg;			// 가입일자
	private Date memberUnReg;		// 탈퇴일자
	private Date memberPwChange;	// 비밀번호변경기준일
	private int memberAgree;		// 회원동의
	private int memberRole;			// 권한
	private String memberEmail;		// 이메일(아이디)
	private String memberName;		// 이름
	private String memberNick;		// 회원닉네임
	private String memberPhone;		// 회원전화번호
	private int memberGender;		// 회원성별
	private String memberPassword;	// 비밀번호
	private Date memberBirth;		// 생일
	
	
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public Date getMemberReg() {
		return memberReg;
	}
	public void setMemberReg(Date memberReg) {
		this.memberReg = memberReg;
	}
	public Date getMemberUnReg() {
		return memberUnReg;
	}
	public void setMemberUnReg(Date memberUnReg) {
		this.memberUnReg = memberUnReg;
	}
	public Date getMemberPwChange() {
		return memberPwChange;
	}
	public void setMemberPwChange(Date memberPwChange) {
		this.memberPwChange = memberPwChange;
	}
	public int getMemberAgree() {
		return memberAgree;
	}
	public void setMemberAgree(int memberAgree) {
		this.memberAgree = memberAgree;
	}
	public int getMemberRole() {
		return memberRole;
	}
	public void setMemberRole(int memberRole) {
		this.memberRole = memberRole;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(int memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", gradeName=" + gradeName + ", memberReg=" + memberReg
				+ ", memberUnReg=" + memberUnReg + ", memberPwChange=" + memberPwChange + ", memberAgree=" + memberAgree
				+ ", memberRole=" + memberRole + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ ", memberNick=" + memberNick + ", memberPhone=" + memberPhone + ", memberGender=" + memberGender
				+ ", memberPassword=" + memberPassword + ", memberBirth=" + memberBirth + "]";
	}
	
	
	
	

}
