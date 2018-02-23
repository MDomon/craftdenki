package com.internousdev.craftdenki.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {




		if(!(session.containsKey("trueID"))){
			System.out.println("本ログインしていない");
			if(!(session.containsKey("temp_user_id"))){
				System.out.println("仮持ってない");
				Random rnd = new Random();
				session.put("temp_user_id", rnd);
				System.out.println("ランダム" + rnd + " = ランダムID");
				System.out.println("仮ユーザーID発行");

			}else{
				System.out.println("仮ユーザーIDでログイン");
			}
		}else{
			System.out.println("本ユーザーでログインしています");
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
