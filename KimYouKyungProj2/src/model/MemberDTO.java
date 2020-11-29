package model;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String gender;	
	private String addr;
	private String tel;
	private String email;
	private Date regidate;
	
	public MemberDTO() {}
	public MemberDTO(String id, String pwd, String name, int age,String gender, String addr, String tel, String email, Date regidate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
		this.tel = tel;
		this.email = email;
		this.regidate = regidate;
	}


	//게터/세터
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return String.format("ID : %s, PW : %s, 이름 : %s, 나이 : %s , 주소 : %s, 휴대폰번호 : %s, 이메일 : %s", id, pwd,name, age, addr, tel, email);
		//return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", addr=" + addr + ", tel="
		//		+ tel + ", email=" + email + "]";
	}
	
	
}
