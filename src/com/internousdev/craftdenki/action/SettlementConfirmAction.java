package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CartDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String destination;
	private String choseAddress;
	private String choseNumber;

	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String productCount;
	private String releaseCompany;
	private String releaseDate;
	private String totalPrice;
	private int finalPrice;
	private String message;






	public String execute() throws SQLException {

		session.put("payment", ""); // ユーザー変更画面へのフラグを消している

		if (destination != null) {
			session.put("destination", destination);
		}
		destination = (session.get("destination")).toString();

		if (destination.equals("1")) {

			choseAddress = session.get("userAddress").toString();
			choseNumber = session.get("telNumber").toString();
			System.out.println(choseAddress);
			System.out.println(choseNumber);
		} else if (session.get("destination").toString().equals("2")) {
			choseAddress = session.get("userAddress2").toString();
			choseNumber = session.get("telNumber2").toString();
			System.out.println(choseAddress);
			System.out.println(choseNumber);
		} else if (session.get("destination").toString().equals("3")) {
			choseAddress = session.get("userAddress3").toString();
			choseNumber = session.get("telNumber3").toString();
			System.out.println(choseAddress);
			System.out.println(choseNumber);
		}

		// 購入する商品の情報を持ってくる
		CartDAO cartDAO = new CartDAO();
		String userId = session.get("trueID").toString();
		cartList = cartDAO.getCartInfo(userId);
		int size = cartList.size();
		for (int i = 0; i < size; i++) {
			finalPrice = finalPrice + cartList.get(i).getTotalPrice();
		}
		session.put("cartList", cartList);

		if(cartList.isEmpty()){
			message = "カートの中身がありません。";
		}

		return SUCCESS;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
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

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getChoseAddress() {
		return choseAddress;
	}

	public void setChoseAddress(String choseAddress) {
		this.choseAddress = choseAddress;
	}

	public String getChoseNumber() {
		return choseNumber;
	}

	public void setChoseNumber(String choseNumber) {
		this.choseNumber = choseNumber;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
