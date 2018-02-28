package com.internousdev.craftdenki.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoMyPageAction extends ActionSupport implements SessionAware {

	private String result;

	private Map<String, Object> session;

	public String execute() {

		session.put("payment", "");

		if (session.containsKey("trueID")) {
			result = SUCCESS;
		} else {
			session.put("status", "mypage");
			result = ERROR;
		}

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}
