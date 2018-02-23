package com.internousdev.craftdenki.dto;

public class LoginDTO {

	private String LoginId = "0";
	private String LoginPass = "0";
	private String firstName;
	private String familyName;
	private String familyNamekana;
	private String firstNamekana;
	private String sex;
	private String mail;
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getLoginPass() {
		return LoginPass;
	}
	public void setLoginPass(String loginPass) {
		LoginPass = loginPass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFamilyNamekana() {
		return familyNamekana;
	}
	public void setFamilyNamekana(String familyNamekana) {
		this.familyNamekana = familyNamekana;
	}
	public String getFirstNamekana() {
		return firstNamekana;
	}
	public void setFirstNamekana(String firstNamekana) {
		this.firstNamekana = firstNamekana;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


}
