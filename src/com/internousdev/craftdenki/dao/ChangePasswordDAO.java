package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.internousdev.craftdenki.util.DBConnector;



public class ChangePasswordDAO {

	private UserInfoChangeDTO userInfoChangeDTO = new UserInfoChangeDTO();
	public Map<String, Object> session;
	private DBConnector db = new DBConnector();
	private Connection conn = db.getConnection();
	private boolean  result=false;


	public UserInfoChangeDTO checkAnswer(String answer) throws SQLException{
		try{
			String sql ="select * from user_info where answer=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, answer);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				userInfoChangeDTO.setAnswer(rs.getString("answer"));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return userInfoChangeDTO;
	}




	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}
