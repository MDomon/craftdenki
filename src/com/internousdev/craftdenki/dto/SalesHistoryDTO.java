package com.internousdev.craftdenki.dto;

import java.sql.Date;

public class SalesHistoryDTO {

	/*
	 * purchase_history_infoより取得
	 */
	private int id; //id
	private int productId; //商品ID
	private int price; //購入時販売価格
	private int productCount; //購入数
	private int atCost; //購入時原価
	private Date purchaseDate; //購入日

	/*
	 * product_infoテーブルより取得
	 */
	private String productName; //商品名
	private String productNameKana; //商品名かな
	private int categoryId; //カテゴリID

	/*
	 * m_categoryテーブルより取得
	 */
	private String categoryName; //カテゴリ名

	/*
	 * SELECT文にて演算した値を取得
	 */
	private int totalSales; //price * count
	private int totalCost; //atCost * count
	private int profit; //totalSales - totalCost



	/*
	 * getter,setter
	 */
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public int getAtCost() {
		return atCost;
	}
	public void setAtCost(int atCost) {
		this.atCost = atCost;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
