package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CategoryDAO;
import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.util.ErrorMessageList;
import com.internousdev.craftdenki.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CheckProductRegistAction extends ActionSupport implements SessionAware, ErrorMessageList {
	private String newProductId; //新商品ID
	private String newProductName; //商品名
	private String newProductNameKana; //商品名かな
	private String newProductDescription; //商品詳細
	private String newCategoryId; //カテゴリID
	private String newBuyPrice; //販売価格
	private String newReleaseDate; //発売年月
	private String newReleaseCompany; //発売会社
	private String newProductImage; //画像ファイル名
	private String categoryName; //カテゴリ名

	private ArrayList<String> errorMessageList = new ArrayList<>();
	private Map<String, Object> session;
	private String errorMessage;
	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();



	public String execute() throws SQLException {
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;

			//カテゴリテーブルよりカテゴリリストを取得
			CategoryDAO categoryDAO = new CategoryDAO();
			categoryList = categoryDAO.getCategoryInfo();
			//カテゴリ名を取得
			for(int i = 0; i < categoryList.size(); i++) {
				if(categoryList.get(i).getCategoryId().equals(newCategoryId)) {
					this.categoryName = categoryList.get(i).getCategoryName();
				}
			}


			ProductListDAO dao = new ProductListDAO();

			InputChecker i = new InputChecker();

			if(dao.existsProductId(newProductId)){
				errorMessageList.add("入力された商品IDは既に存在します");
				result = "error1";
			}else if (!i.newProductIdChk(newProductId).equals("OK")) {
				errorMessageList.add(i.newProductIdChk(newProductId));
				result = "error1";
			}

			if (!i.newProductNameChk(newProductName).equals("OK")) {
				errorMessageList.add(i.newProductNameChk(newProductName));
				result = "error1";
			}

			if (!i.newProductNameKanaChk(newProductNameKana).equals("OK")) {
				errorMessageList.add(i.newProductNameKanaChk(newProductNameKana));
				result = "error1";
			}

			if (!i.newProductDescriptionChk(newProductDescription).equals("OK")) {
				errorMessageList.add(i.newProductDescriptionChk(newProductDescription));
				result = "error1";
			}

			if (!i.newCategoryIdChk(newCategoryId).equals("OK")) {
				errorMessageList.add(i.newCategoryIdChk(newCategoryId));
				result = "error1";
			}

			if (!i.newBuyPriceChk(newBuyPrice).equals("OK")) {
				errorMessageList.add(i.newBuyPriceChk(newBuyPrice));
				result = "error1";
			}

			if (!i.newReleaseDateChk(newReleaseDate).equals("OK")) {
				errorMessageList.add(i.newReleaseDateChk(newReleaseDate));
				result = "error1";
			}

			if (!i.newReleaseCompanyChk(newReleaseCompany).equals("OK")) {
				errorMessageList.add(i.newReleaseCompanyChk(newReleaseCompany));
				result = "error1";
			}

			if (!i.newProductImageChk(newProductImage).equals("OK")) {
				errorMessageList.add(i.newProductImageChk(newProductImage));
				result = "error1";
			}

		}else errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
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



	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}



	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}



	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getNewCategoryId() {
		return newCategoryId;
	}


	public void setNewCategoryId(String newCategoryId) {
		this.newCategoryId = newCategoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}


	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}



}
