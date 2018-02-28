package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CategoryDAO;
import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ProductRegistCompleteAction extends ActionSupport implements SessionAware {

	private String newProductId; // 新商品ID
	private String newProductName; // 商品名
	private String newProductNameKana; // 商品名かな
	private String newProductDescription; // 商品詳細
	private String newCategoryId; // カテゴリID
	private String newBuyPrice; // 販売価格
	private String newReleaseDate; // 発売年月
	private String newReleaseCompany; // 発売会社
	private String newProductImage; // 画像ファイル名

	private String errorMessage;
	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();
	private ArrayList<String> errorMessageList = new ArrayList<>();
	private String categoryName; // カテゴリ名

	public Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;

		if (session.get("master_flg") == "1") { // 管理者判定
			result = SUCCESS;

			// カテゴリを取得
			getCategory();
			// 入力チェック
			result = productCheck();
			if (result == "checkErr") {
				return result;
			}
			// 商品情報をINSERT
			result = productInsert();

		} else
			errorMessage = "不正なアクセスです。再度ログインをお願いいたします。";
		return result;
	}

	/**
	 * カテゴリリストとカテゴリ名を取得するメソッド
	 */
	private void getCategory() {
		// カテゴリテーブルよりカテゴリリストを取得
		CategoryDAO categoryDAO = new CategoryDAO();
		categoryList = categoryDAO.getCategoryInfo();
		// カテゴリ名を取得
		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getCategoryId().equals(newCategoryId)) {
				this.categoryName = categoryList.get(i).getCategoryName();
			}
		}
	}

	/**
	 * 入力情報をチェックして結果を返すメソッド
	 *
	 * @return result チェックOK→success チェックNG→checkErr
	 * @throws SQLException
	 */
	private String productCheck() throws SQLException {
		String result = SUCCESS;
		ProductListDAO dao = new ProductListDAO();

		InputChecker i = new InputChecker();

		if (dao.existsProductId(newProductId)) {
			errorMessageList.add("入力された商品IDは既に存在します");
			result = "checkErr";
		} else if (!i.newProductIdChk(newProductId).equals("OK")) {
			errorMessageList.add(i.newProductIdChk(newProductId));
			result = "checkErr";
		}

		if (!i.newProductNameChk(newProductName).equals("OK")) {
			errorMessageList.add(i.newProductNameChk(newProductName));
			result = "checkErr";
		}

		if (!i.newProductNameKanaChk(newProductNameKana).equals("OK")) {
			errorMessageList.add(i.newProductNameKanaChk(newProductNameKana));
			result = "checkErr";
		}

		if (!i.newProductDescriptionChk(newProductDescription).equals("OK")) {
			errorMessageList.add(i.newProductDescriptionChk(newProductDescription));
			result = "checkErr";
		}

		if (!i.newCategoryIdChk(newCategoryId).equals("OK")) {
			errorMessageList.add(i.newCategoryIdChk(newCategoryId));
			result = "checkErr";
		}

		if (!i.newBuyPriceChk(newBuyPrice).equals("OK")) {
			errorMessageList.add(i.newBuyPriceChk(newBuyPrice));
			result = "checkErr";
		}

		if (!i.newReleaseDateChk(newReleaseDate).equals("OK")) {
			errorMessageList.add(i.newReleaseDateChk(newReleaseDate));
			result = "checkErr";
		}

		if (!i.newReleaseCompanyChk(newReleaseCompany).equals("OK")) {
			errorMessageList.add(i.newReleaseCompanyChk(newReleaseCompany));
			result = "checkErr";
		}

		if (!i.newProductImageChk(newProductImage).equals("OK")) {
			errorMessageList.add(i.newProductImageChk(newProductImage));
			result = "checkErr";
		}
		return result;
	}

	/**
	 * ProductListDAOクラスのproductRegistを使い、<br/>
	 * 商品情報をUPDATEするメソッド
	 *
	 * @return result
	 * @throws SQLException
	 */
	private String productInsert() throws SQLException {
		String result = SUCCESS;
		ProductListDAO dao = new ProductListDAO();

		// 画像パスを作成
		String newImagePass = "./images/" + newProductImage;

		// product_infoテーブルに登録
		int res = dao.productRegist(newProductId, newProductName, newProductNameKana, newProductDescription,
				Integer.parseInt(newCategoryId), Integer.parseInt(newBuyPrice), newImagePass, newProductImage,
				newReleaseDate, newReleaseCompany);
		if (res == 0) {
			result = ERROR;
			errorMessage = "登録に失敗しました。恐れ入りますが再度登録をお願いいたします。";
		}
		return result;

	}

	// getter,setter
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

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
