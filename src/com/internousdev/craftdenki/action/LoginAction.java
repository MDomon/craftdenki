package com.internousdev.craftdenki.action;

import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.LoginDAO;
import com.internousdev.craftdenki.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private LoginDAO dao = new LoginDAO();
	private LoginDTO dto = new LoginDTO();
	private String result;
	private String loginId = "a";
	private String loginPassword = "a";
	private String IDerrormsg;
	private String Passerrormsg;
	private int i;

	public String execute() {

		session.put("unknown", "");
		session.put("IDerror", "");
		session.put("Passerror", "");

		result = ERROR;

		// IDについて
		Pattern p1 = Pattern.compile("^[0-9a-zA-Z]*$");
		Matcher m1 = p1.matcher(loginId);

		if (m1.find() == false) {
			String IDerrormsg = "IDは半角英数字で入力してください";
			this.IDerrormsg = IDerrormsg;
		}

		int length1 = loginId.getBytes().length;
		if (length1 < 1) { // 最小文字数よりも少なかった場合
			String IDerrormsg = "IDは半角1文字以上8文字以内で入力してください";
			this.IDerrormsg = IDerrormsg;

		} else if (length1 > 8) { // 最大文字数よりも多かった場合
			String IDerrormsg = "IDは半角1文字以上8文字以内で入力してください";
			this.IDerrormsg = IDerrormsg;

		} else if (length1 == 0) { // 文字数が0だった場合
			String IDerrormsg = "IDを入力してください";
			this.IDerrormsg = IDerrormsg;

		}

		// Passについて
		Pattern p2 = Pattern.compile("^[0-9a-zA-Z]*$");
		Matcher m2 = p2.matcher(loginPassword);

		if (m2.find() == false) {
			String Passerrormsg = "パスワードは半角英数字で入力してください";
			this.Passerrormsg = Passerrormsg;
		}

		int length2 = loginPassword.getBytes().length;
		if (length2 < 1) { // 最小文字数よりも少なかった場合
			String Passerrormsg = "パスワードは半角1文字以上16文字以内で入力してください";
			this.Passerrormsg = Passerrormsg;
		} else if (length2 > 16) { // 最大文字数よりも多かった場合
			String Passerrormsg = "パスワードは半角1文字以上16文字以内で入力してください";
			this.Passerrormsg = Passerrormsg;
		} else if (length2 == 0) { // 文字数が0だった場合
			String Passerrormsg = "パスワードを入力してください";
			this.Passerrormsg = Passerrormsg;
		}

		dto = dao.loginUserInfo(loginId, loginPassword);

		System.out.println(dto.getLoginId());
		System.out.println(dto.getLoginPass());

		if (session.containsKey("status")) {
		} else {
			session.put("status", "");
		}

		if (!(session.containsKey("temp_user_id"))) {
			Random rnd = new Random();
			session.put("temp_user_id", rnd);

		}

		System.out.println(dto.getLoginId());
		System.out.println(dto.getLoginPass());

		if (IDerrormsg == null) {
			if (Passerrormsg == null) {
				if ((dto.getLoginId()).equals("craft")) {
					if ((dto.getLoginPass()).equals("denki")) {
						session.put("master_flg", "1");
						session.put("IDerror", "");
						session.put("Passerror", "");
						result = "master";
						return result;
					}

				} else if (dto.getLoginId().equals(loginId)) {
					if (dto.getLoginPass().equals(loginPassword)) {
						System.out.println("aaa");
						session.put("trueID", loginId);
						session.put("loginId", dto.getLoginId()); // 使ってないかも
						session.put("loginPass", dto.getLoginPass());
						session.put("firstName", dto.getFirstName());
						session.put("familyName", dto.getFamilyName());
						session.put("familyNameKana", dto.getFamilyNamekana());
						session.put("firstNameKana", dto.getFirstNamekana());
						session.put("sex", dto.getSex());
						session.put("mail", dto.getMail());

						if (session.get("status") == ("settlement")) {
							session.put("IDerror", ""); // 使ってないかも
							session.put("Passerror", ""); // 使ってないかも
							session.put("status", "");
							i = dao.cartInfo(session.get("temp_user_id").toString(), dto.getLoginId());

							if (i >= 0) {
								result = "settlement";
								return result;
							}
						} else if (session.get("status") == ("mypage")) {
							session.put("IDerror", "");
							session.put("Passerror", "");
							session.put("status", "");

							i = dao.cartInfo(session.get("temp_user_id").toString(), dto.getLoginId());

							if (i >= 0) {
								result = "myPage";
								return result;
							}

						} else {
							System.out.println("ssss");
							session.put("IDerror", "");
							session.put("Passerror", "");
							i = dao.cartInfo(session.get("temp_user_id").toString(), dto.getLoginId());
							if (i >= 0) {
								result = "myPage";
								return result;
							}
						}

					}
				} else if (dto.getLoginId().equals("noID")) {
					if (dto.getLoginPass().equals("noPASS")) {
						session.put("unknown", "入力されたIDもしくはパスワードが異なります");
						result = ERROR;
						return result;
					}
				}
			}
		}
		session.put("IDerror", this.IDerrormsg);
		session.put("Passerror", this.Passerrormsg);
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
