package com.internousdev.craftdenki.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoManagerHomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String errorMessage;

	public String execute(){
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;
		}else errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
