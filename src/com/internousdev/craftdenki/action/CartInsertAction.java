package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CartDAO;
import com.internousdev.craftdenki.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private int product_id;
	private int product_count;
	private long finalPrice;
	private String price;
	private String userId;
	private String insertFlg = "0";
	private String nothing;
	private int item_stock;
	private String id;
	private String result;

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

		if (product_count < 0) {
			result = ERROR;
			return result;
		}

		if (insertFlg.equals("1")) {

			cartList = cartDAO.getCartInfo(userId);
			finalPrice = cartDAO.finalPrice;
			System.out.println(finalPrice);

			CartDTO dto = cartDAO.Info(product_id);

			int i = dto.getItem_stock();

			int itemStock = dto.getItem_stock();
			int Price = dto.getPrice();

			System.out.println(itemStock);
			System.out.println(Price);

			if (i >= product_count) {

				int a=cartDAO.insertCart(userId, product_id, product_count, Price, itemStock);
				if(a>0){
					result=SUCCESS;
				}
			} else {
				nothing = "1";
				result = ERROR;
				return result;
			}

			nothing = "1";
		}
		// --------------------------------------------------------------------------------------------

		cartList = cartDAO.getCartInfo(userId);
		finalPrice = cartDAO.finalPrice;
		session.put("finalPrice", finalPrice);
		session.put("cartList", cartList);
		if (cartList.isEmpty()) {
			nothing = null;
		} else {
			nothing = "1";
		}

		result = SUCCESS;
		return result;
	}

	public String getNothing() {
		return nothing;
	}

	public void setNothing(String nothing) {
		this.nothing = nothing;
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
