package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductDetailsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDataChangeCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String errorMessage;

	private String id; //PK
	private String productId; //新商品ID
	private String productName; //商品名
	private String productNameKana; //商品名かな
	private String productDescription; //商品詳細
	private String categoryId; //カテゴリID
	private String price; //販売価格
	private String imageFileName; //画像ファイル名
	private String releaseDate; //発売年月
	private String releaseCompany; //発売会社
	//--------------------------
	//変数名変換
	private String product_id;
	//--------------------------

	public String execute() throws SQLException{
		String result = ERROR;

		//--------------------------
		//変数名変換
		product_id = productId;
		//--------------------------

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;

			ProductDetailsDAO dao = new ProductDetailsDAO();

			//画像パスを作成
			String imagePass = "./images/" + imageFileName;

			//product_infoテーブルにUPDATE
			int res = dao.changeProductData(
					id,
					productId,
					productName,
					productNameKana,
					productDescription,
					categoryId,
					price,
					imagePass,
					imageFileName,
					releaseDate,
					releaseCompany);
			if(res == 0){
				result = ERROR;
				errorMessage = "登録に失敗しました。恐れ入りますが再度登録をお願いいたします。";
			}
		}else errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		return result;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
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
	public Map<String, Object> getSession() {
		return session;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
}
