package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.craftdenki.dto.LoginDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class LoginDAO {

	private LoginDTO dto = new LoginDTO();
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public LoginDTO loginUserInfo(String loginId, String loginPassword) {

		String sql = "select*from user_info where user_id = ? and password = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				dto.setLoginId(rs.getString("user_id"));
				dto.setLoginPass(rs.getString("password"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFamilyNamekana(rs.getString("family_name_kana"));
				dto.setFirstNamekana(rs.getString("first_name_kana"));
				dto.setSex(rs.getString("sex"));
				dto.setMail(rs.getString("email"));
			} else {
				dto.setLoginId("noID");
				dto.setLoginPass("noPASS");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dto;
	}

	public void cartInfo(String tempUserId, String loginId) {

		String sql = "update cart_info set user_id= ? where user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginId);
			ps.setString(2, tempUserId);

			int rs = ps.executeUpdate();
			if (rs >= 0) {
				System.out.println(rs + "件更新しました");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
