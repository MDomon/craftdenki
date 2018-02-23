package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductRestoreAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String errorMessage;

	private ProductListDAO productListDAO = new ProductListDAO();
	private ArrayList<ProductDTO> productList = new ArrayList<>();

	public String execute() throws SQLException{
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;
			productList = productListDAO.getProductHideInfo();
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
	public ProductListDAO getProductListDAO() {
		return productListDAO;
	}
	public void setProductListDAO(ProductListDAO productListDAO) {
		this.productListDAO = productListDAO;
	}
	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}
}

