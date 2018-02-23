package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.craftdenki.dto.SettlementDTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class SettlementCompleteDAO {

	private DateUtil dateUtil = new DateUtil();
	private SettlementDTO dto = new SettlementDTO();

	// atCostを持ってくる
	public SettlementDTO getCurrentCost(int productId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT current_cost FROM product_info WHERE product_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setAtCost(rs.getInt("current_cost"));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return dto;
	}



	// 商品購入履歴テーブルにインサート
	public void insertPurchaseHistory(String userId, int productId, int productCount, int price, int atCost, String  imageFilePath)
			throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "INSERT INTO purchase_history_info(user_id,product_id,product_count,price,at_cost,regist_date,image_file_path) VALUES(?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setInt(3, productCount);
			ps.setInt(4, price);
			ps.setInt(5, atCost);
			ps.setString(6, dateUtil.getDate());
			ps.setString(7, imageFilePath);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

	// カートの情報を削除
	public void deleteCartInfo(String userId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "DELETE FROM cart_info WHERE user_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
