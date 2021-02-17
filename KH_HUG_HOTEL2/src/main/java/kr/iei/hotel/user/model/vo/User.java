package kr.iei.hotel.user.model.vo;

public class User {
	
	private String gradeName;	// 회원등급
	private int memberReg; 		// 가입일자
	private int memberUnreg;	// 탈퇴일자
	private int memberPwChage;	// 비밀번호변경기준일
	private String memberAgree;	//마케팅수신동의
	
	private String memberMail;	//이메일(아이디)
	private String memberNick;	// 닉네임
	private int memberPhone;	// 전화번호
	private String memberGender;// 성별
	private int memberPassword;	// 비밀번호
	private int memberBirth;	// 생년월일
	
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public int getMemberReg() {
		return memberReg;
	}
	public void setMemberReg(int memberReg) {
		this.memberReg = memberReg;
	}
	public int getMemberUnreg() {
		return memberUnreg;
	}
	public void setMemberUnreg(int memberUnreg) {
		this.memberUnreg = memberUnreg;
	}
	public int getMemberPwChage() {
		return memberPwChage;
	}
	public void setMemberPwChage(int memberPwChage) {
		this.memberPwChage = memberPwChage;
	}
	public String getMemberAgree() {
		return memberAgree;
	}
	public void setMemberAgree(String memberAgree) {
		this.memberAgree = memberAgree;
	}
	public String getMemberMail() {
		return memberMail;
	}
	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public int getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public int getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(int memberPassword) {
		this.memberPassword = memberPassword;
	}
	public int getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(int memberBirth) {
		this.memberBirth = memberBirth;
	}
	@Override
	public String toString() {
		return "User [gradeName=" + gradeName + ", memberReg=" + memberReg + ", memberUnreg=" + memberUnreg
				+ ", memberPwChage=" + memberPwChage + ", memberAgree=" + memberAgree + ", memberMail=" + memberMail
				+ ", memberNick=" + memberNick + ", memberPhone=" + memberPhone + ", memberGender=" + memberGender
				+ ", memberPassword=" + memberPassword + ", memberBirth=" + memberBirth + "]";
	}
	
	
	

}
