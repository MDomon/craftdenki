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
	private int finalPrice;
	private String price;
	private String userId;
	private String insertFlg = "0";
	private Collection<Integer> deleteList;
	private String cartDeleteFlg;
	private String nothing;
	private int item_stock;
	private String id;
	private String result;

	private CartDAO cartDAO = new CartDAO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private CartDTO stock;

	public String execute() throws SQLException {

		result = ERROR;
		System.out.println("a-");
		if (session.containsKey("trueID")) {
			userId = session.get("trueID").toString();
			System.out.println("b-");
		} else {
			userId = session.get("temp_user_id").toString();
			System.out.println("c-");
		}
		cartList = cartDAO.getCartInfo(userId);
		System.out.println(userId + "2oooo");
		System.out.println("d-");

		// --------------------------------------------------------------------------------------------

		if (insertFlg.equals("1")) {
			System.out.println("e-");

			CartDTO dto = cartDAO.Info(product_id);

			int i = dto.getItem_stock();

			System.out.println(i);
			System.out.println(product_count);

			if (i >= product_count) {
				System.out.println("f-");

				cartDAO.insertCart(userId, product_id, product_count, Integer.parseInt(price), item_stock);
			} else {
				nothing = "1";
				System.out.println("g-");

				result = ERROR;
				return result;
			}
			System.out.println("h-");

			nothing = "1";
		}
		// --------------------------------------------------------------------------------------------
		if (cartDeleteFlg == null) {
			System.out.println("i-");

			cartList = cartDAO.getCartInfo(userId);
			System.out.println(cartList + "ddddd");
			finalPrice = cartDAO.finalPrice;
			session.put("finalPrice", finalPrice);
			session.put("cartList", cartList);

			if (cartList.isEmpty()) {
				System.out.println("j-");

				nothing = null;
			} else {
				System.out.println("k-");

				nothing = "1";
				System.out.println(nothing + "ppppppp");

			}

		} else {
			if (deleteList != null) {
				System.out.println("l-");

				for (int deleteId : deleteList) {

					CartDTO stock = cartDAO.deleteSelectCart(deleteId);
					System.out.println(deleteId + "111");
					System.out.println(stock + "a");

					int itemStock = stock.getItem_stock();
					int productCount = stock.getProductCount();
					int productId = stock.getProductId();
					int price = stock.getPrice();

					finalPrice = finalPrice - price;
					session.put("finalPrice", finalPrice);

					System.out.println(itemStock + "b");
					System.out.println(productCount + "c");

					cartDAO.deleteUpdateCart(productId, itemStock, productCount);

					cartDAO.deleteCart(userId, deleteId);

				}
				cartList = cartDAO.getCartInfo(userId);

				if (cartList.isEmpty()) {
					System.out.println("m-");

					nothing = null;
				} else {
					System.out.println("n-");

					nothing = "notNull";
				}
			} else {
				if (cartList.isEmpty()) {
					System.out.println("p-");

					nothing = null;
					result = SUCCESS;
					return result;
				} else {
					System.out.println("q-");

					nothing = "notNull";
					result = SUCCESS;
					return result;
				}
			}
		}
		System.out.println("r-");

		System.out.println(nothing + "*******");

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

	public Collection<Integer> getDelete() {
		return deleteList;
	}

	public void setDelete(Collection<Integer> deleteList) {
		this.deleteList = deleteList;
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

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public Collection<Integer> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(Collection<Integer> deleteList) {
		this.deleteList = deleteList;
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

	public String getNothing() {
		return nothing;
	}

	public void setNothing(String nothing) {
		this.nothing = nothing;
	}

}
