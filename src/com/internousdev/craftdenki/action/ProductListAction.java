package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductListDAO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.util.ProductListChange;
import com.opensymphony.xwork2.ActionSupport;



public class ProductListAction extends ActionSupport implements SessionAware{

	//セッション情報取得
	public Map<String, Object> session;

	//商品情報取得
	private ProductListDAO productListDAO = new ProductListDAO();

	//商品情報格納
	public ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	//productListを9個ごとに格納したList
	private ArrayList<ArrayList<ProductDTO>> trueList = new ArrayList<>();

	private int pageSelect;

	private int pageCount;

	private List<Integer> pageList = new ArrayList<>();



	public String execute() throws SQLException{

		/**
		 * 確認
		 */
		System.out.println("pageSelect");
		System.out.println(pageSelect);

		//商品情報取得メソッド
		productList = productListDAO.getProductInfo();

		Iterator<ProductDTO> iterator = productList.iterator();
		if(!(iterator.hasNext())){
			productList = null;
		}

		//productListを9個ごとに格納
		ProductListChange change = new ProductListChange();
		trueList = change.productListChange(productList);

		for(int i = 0; i < trueList.size(); i++){
			pageList.add(i + 1);
		}

		//ページ表示の確認

		for(ArrayList<ProductDTO> array: trueList){
			for(ProductDTO dto: array){
				System.out.println(dto.getId());
			}
		}

		for(int i = 0; i < trueList.size(); i++){
			if(i == pageSelect){
				productList = trueList.get(i);
				break;
			}
		}




		String result = SUCCESS;
		return result;

	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	public Map<String, Object> getSession(){
		return session;
	}


	public ProductListDAO getProductListDAO(){
		return productListDAO;
	}
	public void setProductListDAO(ProductListDAO productListDAO){
		this.productListDAO = productListDAO;
	}

	public ArrayList<ProductDTO> getProductList(){
		return productList;
	}
	public void setProductList(ArrayList<ProductDTO> productList){
		this.productList = productList;
	}

	public ArrayList<ArrayList<ProductDTO>> getTrueList() {
		return trueList;
	}

	public void setTrueList(ArrayList<ArrayList<ProductDTO>> trueList) {
		this.trueList = trueList;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}



}
