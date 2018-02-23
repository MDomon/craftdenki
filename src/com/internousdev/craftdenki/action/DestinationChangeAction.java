package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.DestinationChangeDAO;
import com.opensymphony.xwork2.ActionSupport;


public class DestinationChangeAction extends ActionSupport implements SessionAware{

	public Map<String, Object>session;

	private String userId;
	private String userAddress;
	private String userAddress2;
	private String userAddress3;
	private String telNumber;
	private String telNumber2;
	private String telNumber3;

	private DestinationChangeDAO destinationChangeDAO = new DestinationChangeDAO();




	public String execute() throws SQLException{

		session.put("payment","");

		userId = session.get("trueID").toString();



		if(userAddress.equals("")){
			 userAddress=null;
		 }

		if(userAddress2.equals("")){
			 userAddress2=null;
		 }

		 if(userAddress3.equals("")){
			 userAddress3=null;
		 }


		 if(telNumber.equals("")){
			 telNumber=null;
		 }

		 if(telNumber2.equals("")){
			 telNumber2=null;
		 }

		 if(telNumber3.equals("")){
			 telNumber3=null;
		 }


		destinationChangeDAO.destinationChange(userId,userAddress,userAddress2,userAddress3,telNumber,telNumber2,telNumber3);


		return SUCCESS;



	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
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




	public Map<String, Object> getSession() {
		return session;
	}




	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
