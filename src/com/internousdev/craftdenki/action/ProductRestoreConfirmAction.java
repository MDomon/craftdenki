package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductRestoreConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String errorMessage;

	/*
	 * checkした行の商品IDが入ったCollection 受け取り用
	 */
	private List<String> checkList;
	/*
	 * checkした行の商品IDと商品名が入ったCollection 渡す用
	 */
	private List<ProductDTO> productRestoreList = new ArrayList<>();

	public String execute() throws SQLException {
		String result = ERROR;

		if (session.get("master_flg") == "1") { // 管理者判定
			result = SUCCESS;

			// checkListがnullならerrorM.jspへ
			if (checkList == null) {
				errorMessage = "削除する商品がチェックされていません。再度処理をお願いいたします。";
				result = ERROR;
				return result;
			}

			// 商品一覧を取得
			ProductListDAO productListDAO = new ProductListDAO();
			List<ProductDTO> productList = new ArrayList<>();
			productList = productListDAO.getProductHideInfo();

			// チェックした商品IDとその商品名のproductDTOをproductHideListに格納
			for (ProductDTO dto : productList) {
				for (String productId : checkList) {
					if (dto.getProduct_id() == Integer.parseInt(productId)) {
						ProductDTO hideDto = new ProductDTO();
						hideDto.setProduct_id(Integer.parseInt(productId));
						hideDto.setProduct_name(dto.getProduct_name());
						productRestoreList.add(hideDto);
					}
				}
			}

		} else
			errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(List<String> checkList) {
		this.checkList = checkList;
	}

	public List<ProductDTO> getProductRestoreList() {
		return productRestoreList;
	}

	public void setProductRestoreList(List<ProductDTO> productRestoreList) {
		this.productRestoreList = productRestoreList;
	}
}
