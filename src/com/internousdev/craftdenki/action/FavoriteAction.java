package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.FavoriteDAO;
import com.internousdev.craftdenki.dto.FavoriteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class FavoriteAction extends ActionSupport implements SessionAware {

	private List<FavoriteDTO> favoriteList = new ArrayList<FavoriteDTO>();
	private Map<String, Object> session;
	private List<String> checkList;
	private String deleteFlg = "0";
	private String favoriteInsertFlg ="0" ;
	private String test = "test";
	private String message;
	private String product_id;
	private String userId;
	private String result;





	public String execute() throws SQLException {
		FavoriteDAO dao = new FavoriteDAO();
		int count = 0;

		session.put("none", null);

		System.out.println("---------------------1-------------------------");
		System.out.println(checkList);


	//削除ボタンを押していない時点
		if (deleteFlg == "0") {
			if (session.containsKey("trueID")) {
				userId = session.get("trueID").toString();
				favoriteList = dao.getFavoriteInfo(userId);
				for(FavoriteDTO dto: favoriteList){
					System.out.println(dto.getProductId());
				}
				System.out.println("---------------------2-------------------------");
			} else {
				userId = session.get("temp_user_id").toString();
				System.out.println("---------------------3-------------------------");
			}
		}





		//ログイン後お気に入り登録したら,
		if (favoriteInsertFlg != "0") {
			dao.insertFavorite(userId, product_id);
			System.out.println("asd"+favoriteList);
			favoriteInsertFlg = null;
			userId = session.get("trueID").toString();
			favoriteList = dao.getFavoriteInfo(userId);
			result = SUCCESS;
			System.out.println("---------------------4-------------------------");
			return result;
		}  else if (deleteFlg.equals("1")) {    //削除ボタンを押したあと
			//checkListがnullじゃないとき
			if (checkList != null) {
				System.out.println("---------------------5-------------------------");
				System.out.println("ちぇっくりすと");
				for (String deleteId : checkList) {
					count += dao.deleteFavoriteInfo(deleteId, session.get("trueID").toString());
					System.out.println("aaa");
					System.out.println("削除された件数 ：" + count);
					deleteFlg = null;
					userId = session.get("trueID").toString();
					favoriteList = dao.getFavoriteInfo(userId);
					result = SUCCESS;
					System.out.println("---------------------6-------------------------");
					System.out.println(deleteId);
				}
			}  //checkListがnullのとき
			else {
				System.out.println("---------------------7-------------------------");
				result = SUCCESS;
				return result;
			}
		} //ログイン後お気に入り登録していなければ
		else {
			System.out.println("---------------------8-------------------------");
			result = SUCCESS;
			return result;
		}
		return result;
	}





	public List<FavoriteDTO> getFavoriteList() {
		return favoriteList;
	}





	public void setFavoriteList(List<FavoriteDTO> favoriteList) {
		this.favoriteList = favoriteList;
	}





	public Map<String, Object> getSession() {
		return session;
	}





	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





	public List<String> getCheckList() {
		return checkList;
	}





	public void setCheckList(List<String> checkList) {
		this.checkList = checkList;
	}





	public String getDeleteFlg() {
		return deleteFlg;
	}





	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}





	public String getFavoriteInsertFlg() {
		return favoriteInsertFlg;
	}





	public void setFavoriteInsertFlg(String favoriteInsertFlg) {
		this.favoriteInsertFlg = favoriteInsertFlg;
	}





	public String getTest() {
		return test;
	}





	public void setTest(String test) {
		this.test = test;
	}





	public String getMessage() {
		return message;
	}





	public void setMessage(String message) {
		this.message = message;
	}





	public String getProduct_id() {
		return product_id;
	}





	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}





	public String getUserId() {
		return userId;
	}





	public void setUserId(String userId) {
		this.userId = userId;
	}





	public String getResult() {
		return result;
	}





	public void setResult(String result) {
		this.result = result;
	}

}










