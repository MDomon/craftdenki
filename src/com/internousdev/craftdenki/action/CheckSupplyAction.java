package com.internousdev.craftdenki.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CheckSupplyAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	/*productManage.jspの仕入機能の表より、
	 * 「商品ID」「商品名」「販売価格」「在庫」「仕入数(入力した)」の文字列(「, 」区切り)
	 */
	private String product_id; //商品ID
	private String product_name; //商品名
	private String price; //販売価格
	private String item_stock; //在庫
	private String supply_count; //仕入数
	private String supply_cost; //仕入原価

	private int supplyCostAllTotal; //仕入値合計

	private String errorMessage;
	private ArrayList<String> errorSupplyMessageList = new ArrayList<>();
	/*
	 * supplyConfirm.jspにて表示用
	 * 兼
	 * SupplyCompleteActionにてUPDATE用
	 */
	private List<ProductDTO> supplyList = new ArrayList<ProductDTO>();
	private ArrayList<ProductDTO> productList = new ArrayList<>();



	public String execute(){
		String result = ERROR;

		productList = (ArrayList<ProductDTO>) session.get("productList");

		InputChecker ch = new InputChecker();
		//仕入入力チェック
		if(!ch.supplyCountChk(supply_count).equals("OK")) {
			errorSupplyMessageList.add(ch.supplyCountChk(supply_count));
		}
		//仕入単価入力チェック
		if(!ch.supplyCostChk(supply_cost).equals("OK")) {
			errorSupplyMessageList.add(ch.supplyCostChk(supply_cost));
		}
		//入力エラーがあればproductManage.jspへ
		if(!errorSupplyMessageList.isEmpty()) {
			result = "error1";
			return result;
		}

		//入力情報

		/*フィールドの文字列を
		 * 「, 」(コンマ半角スペース)で区切って
		 * String配列を作成
		 */
		String[] productIdList = product_id.split(", ",0);
		String[] productNameList = product_name.split(", ",0);
		String[] priceList = price.split(", ",0);
		String[] itemStockList = item_stock.split(", ",0);
		String[] supplyCountList = supply_count.split(", ",0);
		String[] supplyCostList = supply_cost.split(", ",0);



		if(true){      //管理者判定


				//supplyListに格納していきます
				for(int i = 0; i < productIdList.length; i++){
					//仕入数が0なら格納しない
					if(supplyCountList[i].trim().equals("0")){
						continue;
					} else{
					ProductDTO dto = new ProductDTO();
					dto.setProduct_id(Integer.parseInt(productIdList[i]));
					dto.setProduct_name(productNameList[i]);
					dto.setPrice(Integer.parseInt(priceList[i]));
					dto.setItem_stock(Integer.parseInt(itemStockList[i]));
					dto.setSupplyCount(Integer.parseInt(supplyCountList[i]));
					dto.setSupplyCost(Integer.parseInt(supplyCostList[i]));
					dto.setSupplyCostTotal(Integer.parseInt(supplyCostList[i]) * Integer.parseInt(supplyCountList[i]));


					supplyList.add(dto);
					}
				}

				for(int i = 0; i < supplyList.size(); i++){
					supplyCostAllTotal += supplyList.get(i).getSupplyCostTotal();
				}

				result = SUCCESS;

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



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getItem_stock() {
		return item_stock;
	}



	public void setItem_stock(String item_stock) {
		this.item_stock = item_stock;
	}





	public String getSupply_count() {
		return supply_count;
	}



	public void setSupply_count(String supply_count) {
		this.supply_count = supply_count;
	}



	public String getSupply_cost() {
		return supply_cost;
	}



	public void setSupply_cost(String supply_cost) {
		this.supply_cost = supply_cost;
	}



	public String getErrorMessage() {
		return errorMessage;
	}



	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	public List<ProductDTO> getSupplyList() {
		return supplyList;
	}



	public void setSupplyList(List<ProductDTO> supplyList) {
		this.supplyList = supplyList;
	}



	public int getSupplyCostAllTotal() {
		return supplyCostAllTotal;
	}



	public void setSupplyCostAllTotal(int supplyCostAllTotal) {
		this.supplyCostAllTotal = supplyCostAllTotal;
	}



	public ArrayList<String> getErrorSupplyMessageList() {
		return errorSupplyMessageList;
	}



	public void setErrorSupplyMessageList(ArrayList<String> errorSupplyMessageList) {
		this.errorSupplyMessageList = errorSupplyMessageList;
	}



	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}



	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}




}
