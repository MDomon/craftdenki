package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.UserInfoChangeCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoChangeCompleteAction extends ActionSupport implements SessionAware {
	String result;
	public Map<String, Object> session;
	private UserInfoChangeCompleteDAO DAO = new UserInfoChangeCompleteDAO();
	private int count;

	public String execute() throws SQLException {

		/*
		 * ここで必須じゃないデータの中身がNULLかどうか判別する
		 *
		 */

		String userAddress2 = session.get("t_userAddress2").toString();
		String userAddress3 = session.get("t_userAddress3").toString();
		String telNumber2 = session.get("t_telNumber2").toString();
		String telNumber3 = session.get("t_telNumber3").toString();

		if (userAddress2.equals("")) {
			userAddress2 = null;
		}

		if (userAddress3.equals("")) {
			userAddress3 = null;
		}

		if (telNumber2.equals("")) {
			telNumber2 = null;
		}

		if (telNumber3.equals("")) {
			telNumber3 = null;
		}

		count=DAO.infoChange(session.get("t_userId").toString(), session.get("t_password").toString(),
				session.get("t_familyName").toString(), session.get("t_firstName").toString(),
				session.get("t_familyNameKana").toString(), session.get("t_firstNameKana").toString(),
				Integer.parseInt((session.get("t_sex")).toString()), session.get("t_email").toString(),
				Integer.parseInt((session.get("t_question")).toString()), session.get("t_answer").toString(),
				session.get("t_userAddress").toString(), userAddress2, userAddress3,
				session.get("t_telNumber").toString(), telNumber2, telNumber3);


		//マイページで表示する情報を最新バージョンに更新する
		session.put("familyName",session.get("t_familyName").toString());
		session.put("firstName",session.get("t_firstName").toString());
		session.put("familyNameKana",session.get("t_familyNameKana").toString());
		session.put("firstNameKana",session.get("t_firstNameKana").toString());
		session.put("sex",Integer.parseInt((session.get("t_sex")).toString()));
		session.put("mail",session.get("t_email").toString());


		if(count>=1){

		result = SUCCESS;
		}else{
		result = ERROR;
		}

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

}
