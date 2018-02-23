package com.internousdev.craftdenki.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.Review2DAO;
import com.opensymphony.xwork2.ActionSupport;

public class Review2Action extends ActionSupport implements SessionAware {

	private Review2DAO dao = new Review2DAO();
	public Map<String, Object> session;
	private String review;
	private String evaluationCount;

	public String execute() {

		String productId = session.get("productId").toString();
		String userId = session.get("trueID").toString();
		String registDate = session.get("registDate").toString();

		dao.getReviewInfo(userId,productId,registDate,review,evaluationCount);

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getEvaluationCount() {
		return evaluationCount;
	}

	public void setEvaluationCount(String evaluationCount) {
		this.evaluationCount = evaluationCount;
	}
}
