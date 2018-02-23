package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductListDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductRegistCompleteAction extends ActionSupport implements SessionAware{

	private String newProductId; //新商品ID
	private String newProductName; //商品名
	private String newProductNameKana; //商品名かな
	private String newProductDescription; //商品詳細
	private String newCategoryId; //カテゴリID
	private String newBuyPrice; //販売価格
	private String newReleaseDate; //発売年月
	private String newReleaseCompany; //発売会社
	private String newProductImage; //画像ファイル名

	private String errorMessage;

	public Map<String,Object> session;

	public String execute() throws SQLException{
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;
			ProductListDAO dao = new ProductListDAO();

			//画像パスを作成
			String newImagePass = "./images/" + newProductImage;

			//product_infoテーブルに登録
			int res= dao.productRegist(newProductId,
							  newProductName,
							  newProductNameKana,
							  newProductDescription,
							  Integer.parseInt(newCategoryId),
							  Integer.parseInt(newBuyPrice),
							  newImagePass,
							  newProductImage,
							  newReleaseDate,
							  newReleaseCompany);
			if(res == 0){
				result = ERROR;
				errorMessage = "登録に失敗しました。恐れ入りますが再度登録をお願いいたします。";
			}
		} else errorMessage = "不正なアクセスです。再度ログインをお願いいたします。";
		return result;
	}

	//getter,setter
	public String getNewProductId() {
		return newProductId;
	}
	public void setNewProductId(String newProductId) {
		this.newProductId = newProductId;
	}
	public String getNewProductName() {
		return newProductName;
	}
	public void setNewProductName(String newProductName) {
		this.newProductName = newProductName;
	}
	public String getNewProductNameKana() {
		return newProductNameKana;
	}
	public void setNewProductNameKana(String newProductNameKana) {
		this.newProductNameKana = newProductNameKana;
	}
	public String getNewProductDescription() {
		return newProductDescription;
	}
	public void setNewProductDescription(String newProductDescription) {
		this.newProductDescription = newProductDescription;
	}
	public String getNewCategoryId() {
		return newCategoryId;
	}
	public void setNewCategoryId(String newCategoryId) {
		this.newCategoryId = newCategoryId;
	}
	public String getNewBuyPrice() {
		return newBuyPrice;
	}
	public void setNewBuyPrice(String newBuyPrice) {
		this.newBuyPrice = newBuyPrice;
	}
	public String getNewReleaseDate() {
		return newReleaseDate;
	}
	public void setNewReleaseDate(String newReleaseDate) {
		this.newReleaseDate = newReleaseDate;
	}
	public String getNewReleaseCompany() {
		return newReleaseCompany;
	}
	public void setNewReleaseCompany(String newReleaseCompany) {
		this.newReleaseCompany = newReleaseCompany;
	}
	public String getNewProductImage() {
		return newProductImage;
	}
	public void setNewProductImage(String newProductImage) {
		this.newProductImage = newProductImage;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
