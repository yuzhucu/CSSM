package com.cssm.common.pojo ;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int userId;
	
	@NotEmpty(message = "用户名不能为空")
	private String userName;
	
	@Length(min=6 ,max= 20 ,message = "密码长度不符合标准")
	private String passWord;
	
	@Email(message = "邮箱格式不对")
	private String email;
	
	private int gender;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", gender=" + gender + "]";
	}

	public User(int userId, String userName, String passWord, String email, int gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.gender = gender;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}