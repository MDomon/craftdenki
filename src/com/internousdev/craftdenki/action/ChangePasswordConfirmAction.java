package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ChangePasswordConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordConfirmAction extends ActionSupport implements SessionAware {

	private ChangePasswordConfirmDAO dao = new ChangePasswordConfirmDAO();
	private String answer;
	private String password;
	private String checkPassword;
	public Map<String, Object> session;
	private String errorMessage;
	private String result;

	public String execute() throws SQLException {

		if (!(dao.checkAnswer2(answer, (String) (session.get("userId"))))) {

			result = ERROR;
			errorMessage = "答えが違います";

		} else {

			session.put("password", password);
			session.put("answer", answer);

			result = SUCCESS;
		}

		return result;

	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckPassword() {
		return checkPassword;
	}

	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
