package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.PurchaseHistoryDAO;
import com.internousdev.craftdenki.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private List<PurchaseHistoryDTO> purchaseHistoryList = new ArrayList<PurchaseHistoryDTO>();
	private String userId;

	private Collection<String> checkList;
	private String product_id;
	private String reviewFlg;
	private String message;
	// private String imageFilePath;

	private String imageFilePath;
	private String productName;
	private String productNameKana;
	private String price;
	private String count;
	private String releaseCompany;
	private String deleteFlg;

	public String execute() throws SQLException {
		String result = ERROR;




		PurchaseHistoryDAO dao = new PurchaseHistoryDAO();

		if (deleteFlg == null) {
			message = null;

			String userId = session.get("trueID").toString();
			purchaseHistoryList = dao.getPurchaseHistory(userId);
			// if (purchaseHistoryList.equals("[]")) {
			//
			// }
			return SUCCESS;
		} else if(session.containsKey("trueID")){

			if (deleteFlg.equals("1")) {
				message = null;
				if (!(checkList == null)) {
					for (String deleteId : checkList) {
						dao.deleteHistoryInfo(deleteId);
					}

					result = "delete";
				}
				PurchaseHistoryDAO dao1 = new PurchaseHistoryDAO();
				String userId = session.get("trueID").toString();
				purchaseHistoryList = dao1.getPurchaseHistory(userId);
				result = "delete";
				return result;
			}

			if (reviewFlg == "1") {
				result = "review";
				return result;
			}
		}else{
			result=ERROR;
		}

		return result;
	}








	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<PurchaseHistoryDTO> getPurchaseHistoryList() {
		return purchaseHistoryList;
	}

	public void setPurchaseHistoryList(List<PurchaseHistoryDTO> purchaseHistoryList) {
		this.purchaseHistoryList = purchaseHistoryList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getReviewFlg() {
		return reviewFlg;
	}

	public void setReviewFlg(String reviewFlg) {
		this.reviewFlg = reviewFlg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
