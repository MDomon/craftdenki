package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CategoryDAO;
import com.internousdev.craftdenki.dao.ProductDetailsDAO;
import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDataChangeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	//--------------------------
	//変数名変換
	private String product_id;
	//--------------------------
	private String errorMessage;
	private int id;
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int price;
	private String imageFileName;
	private String releaseDate;
	private String releaseCompany;


	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();


	public String execute() throws SQLException{
		String result = ERROR;

		//--------------------------
		//変数名変換
		productId = product_id;
		//--------------------------


		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;

			//カテゴリテーブルよりカテゴリリストを取得
			CategoryDAO categoryDAO = new CategoryDAO();
			categoryList = categoryDAO.getCategoryInfo();

			//変更前の商品IDをセッションに保存
			session.put("productId", productId);

			//変更する商品IDの商品情報DTOを商品情報テーブルより取得
			ProductDetailsDAO dao = new ProductDetailsDAO();
			ProductDTO dto = dao.getProductDetailsInfo(productId);
			//取得したDTOより、以下情報をフィールド変数に代入
			//ID,商品名、商品名かな、商品詳細、カテゴリID、販売価格、画像名、発売日、発売会社
			id = dto.getId();
			productName = dto.getProduct_name();
			productNameKana = dto.getProduct_name_kana();
			productDescription = dto.getProduct_description();
			categoryId = dto.getCategory_id();
			price = dto.getPrice();
			imageFileName = dto.getImage_file_name();
			releaseDate = dto.getRelease_date();
			releaseCompany = dto.getRelease_company();

		}else {
			errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		}
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


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
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


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getImageFileName() {
		return imageFileName;
	}


	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getReleaseCompany() {
		return releaseCompany;
	}


	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}


	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}


	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

}