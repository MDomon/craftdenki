package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.UserInfoChangeDAO;
import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoChangeConfirmAction extends ActionSupport implements SessionAware{

	/*
	 * 	↓「ユーザー情報変更画面から送られた入力情報を格納するフィールド」
	 */
	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	private int question;
	private String answer;
	private String userAddress;
	private String userAddress2;
	private String userAddress3;
	private String telNumber;
	private String telNumber2;
	private String telNumber3;

	private String result;

	public Map<String, Object> session;

	private String errorMessage;

	private ArrayList<UserInfoChangeDTO> list_user_info = new ArrayList<UserInfoChangeDTO>();

	private UserInfoChangeDAO userInfoChangeDAO = new UserInfoChangeDAO();


	//使わないけどコンソールのエラー消すために定義して、ゲッターセッターも作る
		private String yuubin1;
		private String yuubin2;
		private String yuubin3;
		private String yuubin4;
		private String yuubin5;
		private String yuubin6;
	//

	public String execute() throws SQLException{

		/*
		 * 必須データがＮＵＬＬだった場合等のエラー処理がまだ書けてない
		 * 必須じゃないデータのテキストボックスが空の場合はデーターベースにNULLを書き込む
		 */

		if(!(password.equals("")) && !(familyName.equals("")) && !(firstName.equals("")) &&
				 !(familyNameKana.equals("")) && !(firstNameKana.equals("")) && !(email.equals("")) &&
				 !(answer.equals("")) && !(userAddress.equals("")) && !(telNumber.equals(""))){

			//jspから受け取ったフィールドの文字数が仕様に引っかかってないかチェック
			if(
					((password.length()>=1) && (password.length()<=16))&&
					((familyName.length()>=1) && (familyName.length()<=16))&&
					((firstName.length()>=1) && (firstName.length()<=16))&&
					((familyNameKana.length()>=1) && (familyNameKana.length()<=16))&&
					((firstNameKana.length()>=1) && (firstNameKana.length()<=16))&&
					((email.length()>=14) && (email.length()<=32))&&
					((answer.length()>=1) && (answer.length()<=16))
				)
			{

				//UserInfoChangeCompleteDAOで行指定するためのセッション
				session.put("t_userId", userId);
				//必須データ
				session.put("t_password", password);
				session.put("t_familyName", familyName);
				session.put("t_firstName", firstName);
				session.put("t_familyNameKana", familyNameKana);
				session.put("t_firstNameKana", firstNameKana);
				session.put("t_sex", sex);
				session.put("t_email", email);
				session.put("t_question", question);
				session.put("t_answer", answer);
				session.put("t_userAddress", userAddress);
				session.put("t_telNumber", telNumber);

				//
				session.put("t_userAddress2", userAddress2);
				session.put("t_userAddress3", userAddress3);
				session.put("t_telNumber2", telNumber2);
				session.put("t_telNumber3", telNumber3);
				//

				result=SUCCESS;
			}
			else{
				setErrorMessage("文字数が規定値範囲外です！！");

				String loginid = session.get("trueID").toString();
				list_user_info = userInfoChangeDAO.getUserInfo(loginid);

				Iterator<UserInfoChangeDTO> iterator = list_user_info.iterator();

				if (!(iterator.hasNext())) {list_user_info = null;}

				result=ERROR;

			}

		}else{

			setErrorMessage("必須項目の記入が抜けています！！");

			String loginid = session.get("trueID").toString();
			list_user_info = userInfoChangeDAO.getUserInfo(loginid);

			Iterator<UserInfoChangeDTO> iterator = list_user_info.iterator();

			if (!(iterator.hasNext())) {list_user_info = null;}

			result=ERROR;
		}

		///////////////////////////////////////////////////////////////////////
		/*性別、秘密の質問でイレギュラーな数値を入れられた場合はじく*/

		/*if(!(sex==0||sex==1)){
			setErrorMe



			現状、保留



		}
			result=ERROR;*/




		////////////////////////////////////////////////////////////////////////

		return result;
	}




	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return  familyName;
	}

	public void setFamilyName(String  familyName) {
		this. familyName =  familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public int getSex(){
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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


	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public UserInfoChangeDAO userInfoChangeDAO(){
		return userInfoChangeDAO;
	}
	public void setUserInfoChangeDAO(UserInfoChangeDAO userInfoChangeDAO){
		this.userInfoChangeDAO = userInfoChangeDAO;
	}

	public ArrayList<UserInfoChangeDTO> getList_user_info(){
		return list_user_info;
	}
	public void setList_user_info(ArrayList<UserInfoChangeDTO> list_user_info){
		this.list_user_info = list_user_info;
	}


///////////////////////////////////////////////////////////////////////////////////////////

	public String getYuubin1() {
		return yuubin1;
	}

	public void setYuubin1(String yuubin1) {
		this.yuubin1 = yuubin1;
	}

	public String getYuubin2() {
		return yuubin2;
	}

	public void setYuubin2(String yuubin2) {
		this.yuubin2 = yuubin2;
	}

	public String getYuubin3() {
		return yuubin3;
	}

	public void setYuubin3(String yuubin3) {
		this.yuubin3 = yuubin3;
	}

	public String getYuubin4() {
		return yuubin4;
	}

	public void setYuubin4(String yuubin4) {
		this.yuubin4 = yuubin4;
	}

	public String getYuubin5() {
		return yuubin5;
	}

	public void setYuubin5(String yuubin5) {
		this.yuubin5 = yuubin5;
	}

	public String getYuubin6() {
		return yuubin6;
	}

	public void setYuubin6(String yuubin6) {
		this.yuubin6 = yuubin6;
	}

	///////////////////////////////////////////////////////////////

}
