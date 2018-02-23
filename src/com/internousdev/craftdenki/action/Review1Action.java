package com.internousdev.craftdenki.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Review1Action extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String historyItemNasme;
	private String productName;
	private String productId;
	private String registDate;

	public String execute() {

		session.put("productName", productName);
		session.put("productId", productId);
		session.put("registDate", registDate);

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getHistoryItemNasme() {
		return historyItemNasme;
	}

	public void setHistoryItemNasme(String historyItemNasme) {
		this.historyItemNasme = historyItemNasme;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

}