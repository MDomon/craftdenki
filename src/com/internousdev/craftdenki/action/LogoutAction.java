package com.internousdev.craftdenki.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {

		session.clear();

		Random rnd = new Random();
		session.put("temp_user_id", rnd);
		System.out.println("ランダム" + rnd + " = ランダムID");

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
