package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class CheckUserIdDAO {
	public UserInfoChangeDTO select(String userId) throws SQLException {
		DBConnector db = new DBConnector();

		Connection conn = db.getConnection();

		UserInfoChangeDTO userInfoChangeDTO = new UserInfoChangeDTO();

		String sql = "SELECT * FROM user_info where user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				userInfoChangeDTO.setUserId(rs.getString("user_id"));
				userInfoChangeDTO.setQuestion(rs.getInt("question"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			conn.close();
		}
		return userInfoChangeDTO;
	}

}
