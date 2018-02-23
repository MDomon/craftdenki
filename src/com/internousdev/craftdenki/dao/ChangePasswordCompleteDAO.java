package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;


public class ChangePasswordCompleteDAO extends ActionSupport implements SessionAware {
	private DBConnector db = new DBConnector();

	private Connection conn = db.getConnection();

	private DateUtil dateUtil = new DateUtil();
	private String password;
	private String userId;
	private String answer;
	public Map<String,Object> session;


	private String sql = "UPDATE user_info SET password=?, update_date = ? WHERE user_id=? and answer=? ";

	public void updateInfo(String password, String answer,String userId) throws SQLException{

			try{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, dateUtil.getDate());
			ps.setString(3, userId);
			ps.setString(4, answer);

			ps.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}


	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override

	public void setSession(Map<String, Object> session){
		this.session=session;

	}
}
