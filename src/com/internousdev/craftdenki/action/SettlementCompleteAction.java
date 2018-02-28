package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CartDAO;
import com.internousdev.craftdenki.dao.SettlementCompleteDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.dto.SettlementDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String userId;
	private int productId;
	private int productCount;
	private int price;
	private int atCost;
	private String imageFilePath;
	private int res1;
	private int res2;

	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private SettlementCompleteDAO settlementCompleteDAO = new SettlementCompleteDAO();

	public String execute() throws SQLException {




			userId = session.get("trueID").toString();
			CartDAO cartDAO = new CartDAO();
			cartList = cartDAO.getCartInfo(userId);







			//カートに商品が入っているか確認

			if(cartList.isEmpty()){
				return ERROR;
			}





			// 購入時、商品購入履歴テーブルにインサート
			// 引数(String userId,int productId,int productCount,int price,int
			// atCost,String imageFilePath)
			for (int i = 0; i < cartList.size(); i++) {
				int productId = cartList.get(i).getProductId();

				ProductDTO PDTO = settlementCompleteDAO.productConfirm(productId);

				int status = PDTO.getStatus();

				System.out.println(productId + "   +   " + status);

				if (status == 0) {

				SettlementDTO dto = settlementCompleteDAO.getCurrentCost(cartList.get(i).getProductId());
				int atCost = dto.getAtCost();
				res1 = settlementCompleteDAO.insertPurchaseHistory(userId, cartList.get(i).getProductId(),
						cartList.get(i).getProductCount(), cartList.get(i).getPrice(), atCost, getImageFilePath());

				}

			}
			// カートの情報を削除
			res2 = settlementCompleteDAO.deleteCartInfo(userId);


			if (res1 < 1 || res2 < 1) {  //インサート、デリートともに成功しているかの確認
				return ERROR;
			}


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
