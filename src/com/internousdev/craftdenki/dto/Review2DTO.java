package com.internousdev.craftdenki.dto;

import java.util.Date;

public class Review2DTO {

	private int id;
	private int product_id;
	private int evaluation_count;
	private String user_id;
	private String review_id;
	private Date buy_item_date;


	/**
	 * idを取得します。
	 * @return id
	 */
	public int getId() {
	    return id;
	}
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(int id) {
	    this.id = id;
	}
	/**
	 * product_idを取得します。
	 * @return product_id
	 */
	public int getProduct_id() {
	    return product_id;
	}
	/**
	 * product_idを設定します。
	 * @param product_id product_id
	 */
	public void setProduct_id(int product_id) {
	    this.product_id = product_id;
	}
	/**
	 * evaluation_countを取得します。
	 * @return evaluation_count
	 */
	public int getEvaluation_count() {
	    return evaluation_count;
	}
	/**
	 * evaluation_countを設定します。
	 * @param evaluation_count evaluation_count
	 */
	public void setEvaluation_count(int evaluation_count) {
	    this.evaluation_count = evaluation_count;
	}
	/**
	 * user_idを取得します。
	 * @return user_id
	 */
	public String getUser_id() {
	    return user_id;
	}
	/**
	 * user_idを設定します。
	 * @param user_id user_id
	 */
	public void setUser_id(String user_id) {
	    this.user_id = user_id;
	}
	/**
	 * review_idを取得します。
	 * @return review_id
	 */
	public String getReview_id() {
	    return review_id;
	}
	/**
	 * review_idを設定します。
	 * @param review_id review_id
	 */
	public void setReview_id(String review_id) {
	    this.review_id = review_id;
	}
	/**
	 * buy_item_dateを取得します。
	 * @return buy_item_date
	 */
	public Date getBuy_item_date() {
	    return buy_item_date;
	}
	/**
	 * buy_item_dateを設定します。
	 * @param buy_item_date buy_item_date
	 */
	public void setBuy_item_date(Date buy_item_date) {
	    this.buy_item_date = buy_item_date;
	}



}
