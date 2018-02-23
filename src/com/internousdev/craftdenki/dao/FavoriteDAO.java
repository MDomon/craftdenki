package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.craftdenki.dto.FavoriteDTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class FavoriteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	public ArrayList<FavoriteDTO> getFavoriteInfo(String loginId) throws SQLException {
		ArrayList<FavoriteDTO> favoriteDTO = new ArrayList<FavoriteDTO>();
		String sql = "SELECT "
						+ "pi.id as id, "
						+ "pi.product_id as product_id,"
						+ "pi.product_name as product_name,"
						+ "pi.product_name_kana as product_name_kana,"
						+ "pi.image_file_path as image_file_path,"
						+ "pi.image_file_name as image_file_name,"
						+ "pi.price as price,"
						+ "pi.release_company as release_company,"
						+ "pi.release_date as release_date "
					+ "FROM "
						+ "product_info as pi "
					+ "JOIN favorite_info as fi "
					+ "ON fi.product_id = pi.product_id "
					+ "WHERE fi.user_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, loginId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				FavoriteDTO dto = new FavoriteDTO();
				dto.setProductId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setPrice(rs.getString("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				favoriteDTO.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return favoriteDTO;
	}

	public int deleteFavoriteInfo(String product_id, String userid) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		String sql = "delete from favorite_info where user_id = ? and product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, product_id);

			count = ps.executeUpdate();
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	// カートテーブルにInsertメソッド
	public void insertFavorite(String user_id, String product_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String insert = "INSERT INTO "
						+ "favorite_info ("
						+ "user_id,"
						+ "product_id,"
						+ "regist_date) "
						+ "VALUES(?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1, user_id);
			ps.setString(2, product_id);
			ps.setString(3, dateUtil.getDate());

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
