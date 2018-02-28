package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CartDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private int product_id;
	private int product_count;
	private long finalPrice;
	private String price;
	private String userId;
	private String insertFlg = "0";
	private Collection<String> deleteList;
	private String cartDeleteFlg;
	private String nothing;
	private int item_stock;
	private String id;
	private String result;

	public String getNothing() {
		return nothing;
	}

	public void setNothing(String nothing) {
		this.nothing = nothing;
	}

	private CartDAO cartDAO = new CartDAO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();


	public String execute() throws SQLException {
		result = ERROR;

		if (session.containsKey("trueID")) {
			this.userId = session.get("trueID").toString();
		} else {
			this.userId = session.get("temp_user_id").toString();
		}

		// --------------------------------------------------------------------------------------------

		if(product_count < 0){
			result = ERROR;
			return result;
		}

		if (insertFlg.equals("1")) {

			CartDTO dto = cartDAO.Info(product_id);

			int i = dto.getItem_stock();


			if (i >= product_count) {

			int a=cartDAO.insertCart(userId, product_id, product_count, Integer.parseInt(price), item_stock);
			if(a>0){
				result=SUCCESS;
			}else{
				result=ERROR;
			}

			} else {
				nothing = "1";
				result = ERROR;
				return result;
			}

			nothing = "1";
		}
		// --------------------------------------------------------------------------------------------

		if (cartDeleteFlg == null) {

			cartList = cartDAO.getCartInfo(userId);
			finalPrice = cartDAO.finalPrice;
			session.put("final"
					+ "Price", finalPrice);
			session.put("cartList", cartList);
			if (cartList.isEmpty()) {
				nothing = null;
			} else {
				nothing = "1";
			}

		} else {
			if (deleteList != null) {

				for (String deleteId : deleteList) {
					int d = Integer.parseInt(deleteId);
					CartDTO stock = cartDAO.deleteSelectCart(d);

					int itemStock = stock.getItem_stock();
					int productCount = stock.getProductCount();
					int productId = stock.getProductId();
					int price = stock.getPrice();
					finalPrice = finalPrice - price;
					session.put("finalPrice", finalPrice);

					int res = cartDAO.deleteUpdateCart(productId, itemStock, productCount);
					if(res>0){
						cartDAO.deleteCart(userId, d);

						cartList = cartDAO.getCartInfo(userId);

						if (cartList.isEmpty()) {
							nothing = null;
						} else {
							nothing = "1";
						}
					}else{
						result=ERROR;
					}
				}
			} else {

				cartList = cartDAO.getCartInfo(userId);

				if (cartList.isEmpty()) {
					nothing = null;
					result = SUCCESS;
					return result;
				} else {
					nothing = "1";
					result = SUCCESS;
					return result;
				}
			}
		}
		result = SUCCESS;
		return result;
	}

	public String getCartDeleteFlg() {
		return cartDeleteFlg;
	}

	public void setCartDeleteFlg(String cartDeleteFlg) {
		this.cartDeleteFlg = cartDeleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public ArrayList<CartDTO> getCartList() {
		return this.cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getInsertFlg() {
		return insertFlg;
	}

	public void setInsertFlg(String insertFlg) {
		this.insertFlg = insertFlg;
	}



	public void setDeleteList(Collection<String> deleteList) {
		this.deleteList = deleteList;
	}

	public long getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(long finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getUserId() {
		return userId;
	}

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}


	public Collection<String> getDeleteList() {
		return deleteList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
