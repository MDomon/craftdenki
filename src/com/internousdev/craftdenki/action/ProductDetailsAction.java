package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductDetailsDAO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.dto.Review2DTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware {

	// セッション情報取得
	public Map<String, Object> session;

	private String id;

	private String product_id;

	private int product_count;

	private String item_stock;
	private String error;
	private int insertFlg;

	private int price;
	private int category_id;

	// 購入個数リスト
	private List<Integer> stockList = new ArrayList<Integer>();

	// 商品詳細情報｢リスト
	public ProductDTO detail = new ProductDTO();
	public List<ProductDTO> detailsList = new ArrayList<ProductDTO>();

	// お勧めリスト情報
	public List<ProductDTO> sugestList = new ArrayList<ProductDTO>();

	// レビュー情報｢リスト
	public List<Review2DTO> reviewList = new ArrayList<Review2DTO>();

	private ProductDetailsDAO productDetailsDAO = new ProductDetailsDAO();

	public String execute() throws SQLException {

		// String[] productIdList = product_id.split(", ", 0);

		// 商品詳細情報取得メソッド
		try {

			detail = productDetailsDAO.getProductDetailsInfo(product_id);
			if (detail != null) {
				session.put("d_image_file_path", detail.getImage_file_path());
				session.put("d_product_name_kana", detail.getProduct_name_kana());
				session.put("d_product_name", detail.getProduct_name());
				session.put("d_product_description", detail.getProduct_description());
				session.put("d_product_price", detail.getPrice());
				session.put("d_release_date", detail.getRelease_date());
				session.put("d_release_company", detail.getRelease_company());
				session.put("d_item_stock", detail.getItem_stock());
				session.put("d_product_id", detail.getProduct_id());
				session.put("d_product_count", detail.getProduct_count());
				session.put("d_category_id", detail.getCategory_id());
			}else{

				return ERROR;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// おすすめリスト情報取得
		try {
			sugestList = productDetailsDAO
					.getSugestProductInfo(Integer.parseInt((session.get("d_category_id")).toString()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// レビュー情報取得メソッド
		try {

			reviewList = productDetailsDAO.getReviewInfo(session.get("d_product_id").toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 1から在庫数までの選択表示用List
		for (int i = 1; i <= detail.getItem_stock(); i++) {
			stockList.add(i);

		}

		System.out.println(detail);
		System.out.println(session.get("d_category_id"));
		if (session.get("d_category_id").equals("")) {
			return ERROR;
		}

		price = detail.getPrice();

		String result = SUCCESS;
		return result;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public String getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(String item_stock) {
		this.item_stock = item_stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * insertFlgを取得します。
	 *
	 * @return insertFlg
	 */
	public int getInsertFlg() {
		return insertFlg;
	}

	/**
	 * insertFlgを設定します。
	 *
	 * @param insertFlg
	 *            insertFlg
	 */
	public void setInsertFlg(int insertFlg) {
		this.insertFlg = insertFlg;
	}

	public List<Integer> getStockList() {
		return stockList;
	}

	public void setStockList(List<Integer> stockList) {
		this.stockList = stockList;
	}

	public List<ProductDTO> getDetailsList() {
		return detailsList;
	}

	public void setDetailsList(List<ProductDTO> detailsList) {
		this.detailsList = detailsList;
	}

	public ProductDetailsDAO getProductDetailsDAO() {
		return productDetailsDAO;
	}

	public void setProductDetailsDAO(ProductDetailsDAO productDetailsDAO) {
		this.productDetailsDAO = productDetailsDAO;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
