package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.ProductDetailsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductHideCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private String errorMessage;

	private String product_id; //商品ID

	public String execute() throws SQLException{
		String result = ERROR;



		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;

			//「, 」区切りの文字列からString配列へ
			String[] productIdList = product_id.split(", ",0);

			ProductDetailsDAO dao = new ProductDetailsDAO();
			int res = 0;
			//productIdが一致する商品を非表示にする
			for(String productId : productIdList) {
				res = dao.productRestoreHide(productId);
				//処理できなかったらerrorM.jspへ
				if(res == 0) {
					errorMessage = "処理できなかった商品があります。お手数ですが再度処理をお願いいたします。";
					result = ERROR;
				}
			}

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
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
}