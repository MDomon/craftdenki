package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.LoginDAO;
import com.internousdev.craftdenki.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String mail;
	private String secretQuestion;
	private String secretAnswer;
	private String address;
	private String tel;
	public Map<String, Object> session;
	private String result;
	private int i;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	private LoginDAO dao = new LoginDAO();


	public String execute() throws SQLException {

		i=userCreateCompleteDAO.createUser(session.get("loginUserId").toString(), session.get("loginPassword").toString(),
				session.get("familyName").toString(), session.get("firstName").toString(),
				session.get("familyNameKana").toString(), session.get("firstNameKana").toString(),
				Integer.parseInt((session.get("sex")).toString()), session.get("mail").toString(),
				Integer.parseInt((session.get("secretQuestion")).toString()), session.get("secretAnswer").toString(),
				session.get("address").toString(), session.get("tel").toString());

		if(i>1){

			result = SUCCESS;

		}else{

			result= ERROR;
		}


		/** ユーザー登録完了後ログイン状態にする為セッションにユーザーIDを格納 **/

		session.put("trueID", session.get("loginUserId").toString());

		/** 仮ユーザーIDでカートに商品を入れていた場合カート情報を引き継ぐ **/

		if (session.get("status") == ("settlement")) {
			session.put("IDerror", ""); // 使ってないかも
			session.put("Passerror", ""); // 使ってないかも
			session.put("status", "");
			dao.cartInfo(session.get("temp_user_id").toString(),session.get("loginUserId").toString());
			result="settlement";

		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

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

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
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

	public String getSecretQuestion() {
		return secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}
}
