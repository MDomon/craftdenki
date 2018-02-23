package com.internousdev.craftdenki.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.UserInfoChangeDAO;
import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationChange0Action extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String result;

	private ArrayList<UserInfoChangeDTO> list_user_info = new ArrayList<UserInfoChangeDTO>();

	private UserInfoChangeDAO userInfoChangeDAO = new UserInfoChangeDAO();

	public String execute() throws SQLException{

		/*
		 * ↓セッションからログインしている「ユーザーID」を格納して、DAOのメソッドの引数にしてる
		 */
		String loginid = session.get("trueID").toString();
		list_user_info = userInfoChangeDAO.getUserInfo(loginid);



		Iterator<UserInfoChangeDTO> iterator = list_user_info.iterator();

		if (!(iterator.hasNext())) {

			list_user_info = null;
		}



		result = SUCCESS;

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public UserInfoChangeDAO userInfoChangeDAO(){
		return userInfoChangeDAO;
	}
	public void setUserInfoChangeDAO(UserInfoChangeDAO userInfoChangeDAO){
		this.userInfoChangeDAO = userInfoChangeDAO;
	}

	public ArrayList<UserInfoChangeDTO> getList_user_info(){
		return list_user_info;
	}
	public void setList_user_info(ArrayList<UserInfoChangeDTO> list_user_info){
		this.list_user_info = list_user_info;
	}


}
