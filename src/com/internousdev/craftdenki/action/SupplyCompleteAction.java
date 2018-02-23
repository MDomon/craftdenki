package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ItemStockUpdateDAO;
import com.internousdev.craftdenki.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SupplyCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String product_id; //商品ID
	private String supplyCount; //仕入数
	private String supplyCost; //仕入原価

	private List<ProductDTO> supplyList = new ArrayList<ProductDTO>();
	private String errorMessage;




	public String execute() throws SQLException{
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定

			result = SUCCESS;

			/*フィールドの文字列を
			 * 「, 」(コンマ半角スペース)で区切って
			 * String配列を作成
			 */
			String[] productIdList = product_id.split(", ",0);
			String[] supplyCountList = supplyCount.split(", ",0);
			String[] supplyCostList = supplyCost.split(", ",0);

			//supplyListに格納していきます
			for(int i = 0; i < productIdList.length; i++){
				//仕入数が0なら格納しない
				if(supplyCountList[i].trim().equals("0")){
					continue;
				} else{
				ProductDTO dto = new ProductDTO();
				dto.setProduct_id(Integer.parseInt(productIdList[i]));
				dto.setSupplyCount(Integer.parseInt(supplyCountList[i]));
				dto.setSupplyCost(Integer.parseInt(supplyCostList[i]));
				supplyList.add(dto);
				}
			}

			//product_infoテーブルのitem_stockをupdate
			for(int in = 0; in < supplyList.size(); in++){


				ItemStockUpdateDAO dao = new ItemStockUpdateDAO();
				boolean res = dao.itemStockUpdate(
								supplyList.get(in).getSupplyCount(),
								supplyList.get(in).getSupplyCost(),
								supplyList.get(in).getProduct_id()
								);

				//update出来なかった商品があれば、errorM.jspへ遷移
				if(!res){
					result = ERROR;
					errorMessage = "仕入処理が出来なかった商品があります。恐れ入りますが、在庫数の確認をお願いいたします。";
				}
			}

		} else errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";

		return result;
	}


	//getter,setter
	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public List<ProductDTO> getSupplyList() {
		return supplyList;
	}



	public void setSupplyList(List<ProductDTO> supplyList) {
		this.supplyList = supplyList;
	}



	public String getErrorMessage() {
		return errorMessage;
	}



	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getSupplyCount() {
		return supplyCount;
	}


	public void setSupplyCount(String supplyCount) {
		this.supplyCount = supplyCount;
	}


	public String getSupplyCost() {
		return supplyCost;
	}


	public void setSupplyCost(String supplyCost) {
		this.supplyCost = supplyCost;
	}



}
