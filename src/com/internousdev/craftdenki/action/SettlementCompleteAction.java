package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.SettlementCompleteDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.internousdev.craftdenki.dto.SettlementDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();



	private SettlementCompleteDAO settlementCompleteDAO = new SettlementCompleteDAO();

	private String userId;
	private int productId;
	private int productCount;
	private int price;
	private int atCost;
	private String imageFilePath;







	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {

		cartList = (ArrayList<CartDTO>) session.get("cartList");
		userId = session.get("trueID").toString();

		System.out.println(userId + "ユーザーID");

//		System.out.println("在庫を減らします");
//		 購入時、perchase_infoの在庫を減らす
//		for (int i = 0; i < cartList.size(); i++) {
//			ItemStockUpdateDAO dao = new ItemStockUpdateDAO();
//			dao.itemStockUpdate(cartList.get(i).getProductCount(), cartList.get(i).getProductId());
//		}
//		System.out.println("在庫完了");

		// atCostをproduct_infoテーブルから持ってくる
		// for(int i=0; i<cartList.size(); i++){
		// SettlementDTO dto =
		// settlementCompleteDAO.getCurrentCost(cartList.get(i).getProductId());
		// int atCost = dto.getAtCost();
		// System.out.println(atCost + "atCostです");
		// }

		System.out.println("履歴に追加します");
		// 購入時、商品購入履歴テーブルにインサート
		// 引数String userId,int productId,int productCount,int price,int atCost
		for (int i = 0; i < cartList.size(); i++) {
			SettlementDTO dto = settlementCompleteDAO.getCurrentCost(cartList.get(i).getProductId());
			int atCost = dto.getAtCost();
			System.out.println(atCost + "atCostです");
			settlementCompleteDAO.insertPurchaseHistory(userId, cartList.get(i).getProductId(),
					cartList.get(i).getProductCount(), cartList.get(i).getPrice(), atCost, getImageFilePath());
		}
		System.out.println("履歴完了");

		System.out.println("カート情報を削除");
		// カートの情報を削除
		settlementCompleteDAO.deleteCartInfo(userId);
		System.out.println("delete完了");

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public SettlementCompleteDAO getSettlementCompleteDAO() {
		return settlementCompleteDAO;
	}

	public void setSettlementCompleteDAO(SettlementCompleteDAO settlementCompleteDAO) {
		this.settlementCompleteDAO = settlementCompleteDAO;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAtCost() {
		return atCost;
	}

	public void setAtCost(int atCost) {
		this.atCost = atCost;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

}
