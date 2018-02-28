package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.dto.SettlementDTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class SettlementCompleteDAO {

	private DateUtil dateUtil = new DateUtil();
	private SettlementDTO dto = new SettlementDTO();
	private int res = 0;
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ProductDTO pDTO = new ProductDTO();

	// atCostを持ってくる
	public SettlementDTO getCurrentCost(int productId) throws SQLException {

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

	public ProductDTO productConfirm(int productId) {

		String sql = "select status from product_info where product_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, productId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				pDTO.setStatus(rs.getInt("status"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pDTO;
	}

	// 商品購入履歴テーブルにインサート
	public int insertPurchaseHistory(String userId, int productId, int productCount, int price, int atCost,
			String imageFilePath) throws SQLException {
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
			res = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return res;

	}

	// カートの情報を削除
	public int deleteCartInfo(String userId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "DELETE FROM cart_info WHERE user_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return res;
	}
	
	// カートの情報を削除
		public int deleteCartInfo2(String userId) throws SQLException {
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();
			String sql = "DELETE FROM cart_info WHERE user_id = ? AND status='0'";

			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setString(1, userId);

				res = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

			return res;
		}

}
