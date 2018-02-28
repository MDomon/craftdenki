package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CategoryDAO;
import com.internousdev.craftdenki.dao.ProductDetailsDAO;
import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDataChangeCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private String errorMessage;

	private String id; // PK
	private String productId; // 新商品ID
	private String productName; // 商品名
	private String productNameKana; // 商品名かな
	private String productDescription; // 商品詳細
	private String categoryId; // カテゴリID
	private String price; // 販売価格
	private String imageFileName; // 画像ファイル名
	private String releaseDate; // 発売年月
	private String releaseCompany; // 発売会社
	// --------------------------
	// 変数名変換
	private String product_id;
	// --------------------------

	private ArrayList<String> errorMessageList = new ArrayList<>();
	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();
	private String categoryName; // カテゴリ名

	public String execute() throws SQLException {
		String result = ERROR;

		// --------------------------
		// 変数名変換
		product_id = productId;
		// --------------------------

		if (session.get("master_flg") == "1") { // 管理者判定
			result = SUCCESS;

			// 入力情報をチェック
			result = productCheck();
			if (result == "checkErr") {
				getCategory();
				return result;
			}

			// 商品情報をUPDATE
			result = productUpdate();

		} else
			errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		return result;
	}

	public ArrayList<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(ArrayList<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}

	/**
	 * 入力情報をチェックして結果を返すメソッド
	 *
	 * @return result
	 * @throws SQLException
	 */
	private String productCheck() throws SQLException {
		String result = SUCCESS;
		ProductListDAO dao = new ProductListDAO();

		InputChecker i = new InputChecker();

		if (!(session.get("productId").toString().equals(productId)) && dao.existsProductId(productId)) {
			errorMessageList.add("入力された商品IDは既に存在します");
			result = "checkErr";
		} else if (!i.newProductIdChk(productId).equals("OK")) {
			errorMessageList.add(i.newProductIdChk(productId));
			result = "checkErr";
		}

		if (!i.newProductNameChk(productName).equals("OK")) {
			errorMessageList.add(i.newProductNameChk(productName));
			result = "checkErr";
		}

		if (!i.newProductNameKanaChk(productNameKana).equals("OK")) {
			errorMessageList.add(i.newProductNameKanaChk(productNameKana));
			result = "checkErr";
		}

		if (!i.newProductDescriptionChk(productDescription).equals("OK")) {
			errorMessageList.add(i.newProductDescriptionChk(productDescription));
			result = "checkErr";
		}

		if (!i.newCategoryIdChk(categoryId).equals("OK")) {
			errorMessageList.add(i.newCategoryIdChk(categoryId));
			result = "checkErr";
		}

		if (!i.newBuyPriceChk(price).equals("OK")) {
			errorMessageList.add(i.newBuyPriceChk(price));
			result = "checkErr";
		}

		if (!i.newReleaseDateChk(releaseDate).equals("OK")) {
			errorMessageList.add(i.newReleaseDateChk(releaseDate));
			result = "checkErr";
		}

		if (!i.newReleaseCompanyChk(releaseCompany).equals("OK")) {
			errorMessageList.add(i.newReleaseCompanyChk(releaseCompany));
			result = "checkErr";
		}

		if (!i.newProductImageChk(imageFileName).equals("OK")) {
			errorMessageList.add(i.newProductImageChk(imageFileName));
			result = "checkErr";
		}
		return result;
	}

	/**
	 * ProductDetailsDAOクラスのchangeProductDataを使い、<br/>
	 * 商品情報をUPDATEするメソッド
	 *
	 * @return result
	 * @throws SQLException
	 */
	private String productUpdate() throws SQLException {
		String result = SUCCESS;
		ProductDetailsDAO dao = new ProductDetailsDAO();

		// 画像パスを作成
		String imagePass = "./images/" + imageFileName;

		// product_infoテーブルにUPDATE
		int res = dao.changeProductData(id, productId, productName, productNameKana, productDescription, categoryId,
				price, imagePass, imageFileName, releaseDate, releaseCompany);
		if (res == 0) {
			result = ERROR;
			errorMessage = "登録に失敗しました。恐れ入りますが再度登録をお願いいたします。";
		}
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
			if (categoryList.get(i).getCategoryId().equals(categoryId)) {
				this.categoryName = categoryList.get(i).getCategoryName();
			}
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
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

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
