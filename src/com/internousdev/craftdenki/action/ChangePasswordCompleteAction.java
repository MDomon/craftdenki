package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ChangePasswordCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String result;

	private ChangePasswordCompleteDAO changePasswordCompleteDAO = new ChangePasswordCompleteDAO();

	public String execute() throws SQLException {

		int b=changePasswordCompleteDAO.updateInfo(session.get("password").toString(), session.get("answer").toString(),
				session.get("userId").toString());
			if(b>0){
				result=SUCCESS;
			}else{
				result=ERROR;
			}

		return result;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSssion() {
		return this.session;
	}
}
