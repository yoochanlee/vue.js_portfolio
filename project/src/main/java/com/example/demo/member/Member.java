package com.example.demo.member;

public class Member {
	int m_idx;
	String m_id;
	String m_name;
	String m_pwd;
	int m_grade;
	String m_email;
	String m_phone;
	String m_addr;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int m_idx, String m_id, String m_name, String m_pwd, int m_grade, String m_email, String m_phone,
			String m_addr) {
		super();
		this.m_idx = m_idx;
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_pwd = m_pwd;
		this.m_grade = m_grade;
		this.m_email = m_email;
		this.m_phone = m_phone;
		this.m_addr = m_addr;
	}

	public int getM_idx() {
		return m_idx;
	}

	public void setM_idx(int m_idx) {
		this.m_idx = m_idx;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_pwd() {
		return m_pwd;
	}

	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}

	public int getM_grade() {
		return m_grade;
	}

	public void setM_grade(int m_grade) {
		this.m_grade = m_grade;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_addr() {
		return m_addr;
	}

	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}

}
