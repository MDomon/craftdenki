package com.internousdev.craftdenki.dto;

public class SettlementDTO {

	private String familyName;
	private String firstName;
	private String email;
	private String userAddress;
	private String userAddress2;
	private String userAddress3;
	private String telNumber;
	private String telNumber2;
	private String telNumber3;
	private int AtCost;
	private String imageFilePath;



	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserAddress2() {
		return userAddress2;
	}
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}
	public String getUserAddress3() {
		return userAddress3;
	}
	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getTelNumber2() {
		return telNumber2;
	}
	public void setTelNumber2(String telNumber2) {
		this.telNumber2 = telNumber2;
	}
	public String getTelNumber3() {
		return telNumber3;
	}
	public void setTelNumber3(String telNumber3) {
		this.telNumber3 = telNumber3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAtCost(int AtCost) {
		this.AtCost = AtCost;
	}

	public int getAtCost(){
		return AtCost;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}




}
