package kr.ac.kopo.member.vo;

import javax.validation.constraints.NotEmpty;

public class MemberVO {
	@NotEmpty(message="아이디를 입력해주세요")
	private String id;
	@NotEmpty(message="비밀번호를 입력해주세요")
	private String password;
	@NotEmpty(message="이름을 입력해주세요")
	private String name;
	
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MemberVO(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
	

}
