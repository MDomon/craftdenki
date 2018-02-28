package com.internousdev.craftdenki.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {

		if (!(session.containsKey("trueID"))) {

			if (!(session.containsKey("temp_user_id"))) {
				Random rnd = new Random();
				session.put("temp_user_id", rnd);
			}
		}
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
