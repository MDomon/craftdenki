package com.internousdev.craftdenki.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.SettlementDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.internousdev.craftdenki.dto.SettlementDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementAction extends ActionSupport implements SessionAware {

	private String userId; // getDestinationInfoの引数に入れるuserId
							// sessionのtrueIdで持ってこれる？

	private String familyName;
	private String firstName;
	private String email;
	private String userAddress;
	private String userAddress2;
	private String userAddress3;
	private String telNumber;
	private String telNumber2;
	private String telNumber3;

	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String productCount;
	private String releaseCompany;
	private String releaseDate;
	private String totalPrice;
	private int finalPrice;

	private SettlementDAO settlementDAO = new SettlementDAO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private SettlementDTO dto = new SettlementDTO();

	private Map<String, Object> session;

	@SuppressWarnings("unchecked")
	public String execute() {

		session.put("payment", "payment");// ((userInfoChangeから帰ってくるためのフラグ,))

		System.out.println(session.get("trueID"));

		if (session.containsKey("trueID")) {

			userId = session.get("trueID").toString();
			System.out.println(userId);

			dto = settlementDAO.getDestinationInfo(userId);

			familyName = dto.getFamilyName();
			firstName = dto.getFirstName();
			email = dto.getEmail();
			userAddress = dto.getUserAddress();
			userAddress2 = dto.getUserAddress2();
			userAddress3 = dto.getUserAddress3();

			telNumber = dto.getTelNumber();
			telNumber2 = dto.getTelNumber2();
			telNumber3 = dto.getTelNumber3();

			session.put("userId", userId);
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("email", email);
			session.put("userAddress", userAddress);
			session.put("userAddress2", userAddress2);
			session.put("userAddress3", userAddress3);
			session.put("telNumber", telNumber);
			session.put("telNumber2", telNumber2);
			session.put("telNumber3", telNumber3);

			// 購入する商品の情報を持ってくる
			cartList = (ArrayList<CartDTO>) session.get("cartList");

			if (cartList.isEmpty()) {

				return ERROR;

			} else {

				for (int i = 0; i < cartList.size(); i++) {
					finalPrice = finalPrice + cartList.get(i).getTotalPrice();
				}
			}
			return SUCCESS;

		} else { // ログインされていない場合決済の画面から飛ばしたというマーキングしてlogin画面に飛ばす

			session.put("status", "settlement"); // login画面から帰ってくるためのフラグ
			return "login";
		}

	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getUserAddress3() {
		return userAddress3;
	}

	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getTelNumber2() {
		return telNumber2;
	}

	public void setTelNumber2(String telNumber2) {
		this.telNumber2 = telNumber2;
	}

	public String getTelNumber3() {
		return telNumber3;
	}

	public void setTelNumber3(String telNumber3) {
		this.telNumber3 = telNumber3;
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

	public SettlementDAO getSettlementDAO() {
		return settlementDAO;
	}

	public void setSettlementDAO(SettlementDAO settlementDAO) {
		this.settlementDAO = settlementDAO;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public SettlementDTO getDto() {
		return dto;
	}

	public void setDto(SettlementDTO dto) {
		this.dto = dto;
	}

}
