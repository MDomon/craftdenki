package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.craftdenki.dto.CartDTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class CartDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private int res;
	public int finalPrice = 0;
	private int totalItem_stock;
	private int totalItem_stock2;

	// カート情報取得メソッド
	public ArrayList<CartDTO> getCartInfo(String user_id) throws SQLException {
		ArrayList<CartDTO> cartDTO = new ArrayList<CartDTO>();

		String sql = "SELECT pi.item_stock as item_stock, ci.id as id,ci.product_id as product_id, pi.product_name as product_name, pi.product_name_kana as product_name_kana, pi.image_file_path as image_file_path, pi.price as price, ci.product_count as product_count, pi.release_company as release_company, pi.release_date as release_date, ci.total_price as total_price FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.user_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				CartDTO dto = new CartDTO();
				dto.setItem_stock(resultSet.getInt("item_stock"));
				dto.setId(resultSet.getInt("id"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setProductCount(resultSet.getInt("product_count"));
				dto.setReleaseCompany(resultSet.getString("release_company"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setTotalPrice(resultSet.getInt("total_price"));

				finalPrice += (resultSet.getInt("total_price"));
				dto.setFinalPrice(finalPrice);

				cartDTO.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cartDTO;
	}

	// カート情報削除メソッド
	public int deleteCart(String user_id, int id) throws SQLException {

		String sql = "DELETE FROM cart_info WHERE user_id = ? AND id = ?";

		PreparedStatement ps;
		try {
			res = 0;
			ps = connection.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	// カート情報削除メソッド(IDの引数無し)
		public int deleteCart(String user_id)  {

			res=0;
			return res;
		}


	// カート情報削除時の在庫数と商品数を取得
	public CartDTO deleteSelectCart(int id) throws SQLException {
		String sql = "SELECT pi.product_id as product_id,pi.item_stock as item_stock,ci.product_count as product_count,pi.price as price FROM cart_info as ci LEFT JOIN product_info as pi ON ci.product_id = pi.product_id WHERE ci.id = ?";

		CartDTO dto = new CartDTO();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				dto.setItem_stock(resultSet.getInt("item_stock"));
				dto.setProductCount(resultSet.getInt("product_count"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setPrice(resultSet.getInt("price"));
				System.out.println(resultSet.getInt("item_stock"));
				System.out.println(resultSet.getInt("product_count"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(dto + "dkjafm;ncvn");
		return dto;
	}

	// カート情報削除時に在庫数を元に戻す
	public void deleteUpdateCart(int id, int item_stock, int product_count) throws SQLException {

		String update2 = "UPDATE product_info SET item_stock = ? WHERE product_id = ?";
		totalItem_stock2 = item_stock + product_count;
		System.out.println(item_stock);
		System.out.println(product_count);
		System.out.println(totalItem_stock2);

		try {

			PreparedStatement ps2 = connection.prepareStatement(update2);
			ps2.setInt(1, totalItem_stock2);
			ps2.setInt(2, id);
			ps2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public CartDTO Info(int product_id) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		CartDTO dto = new CartDTO();

		String confirm = " SELECT item_stock FROM product_info where product_id = ?";

		try {
			PreparedStatement ps3 = connection.prepareStatement(confirm);
			ps3.setInt(1, product_id);

			ResultSet rs = ps3.executeQuery();

			if (rs.next()) {
				dto.setItem_stock(rs.getInt("item_stock"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	// カートテーブルにInsertメソッド
	public void insertCart(String userId, int product_id, int product_count, int price, int item_stock)
			throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int totalPrice = product_count * price;
		totalItem_stock = item_stock - product_count;

		String insert = "INSERT INTO cart_info (user_id,product_id,product_count,price,regist_date,update_date,total_price) VALUES(?,?,?,?,?,?,?)";
		String update1 = "UPDATE product_info SET item_stock = ? WHERE product_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1, userId);
			ps.setInt(2, product_id);
			ps.setInt(3, product_count);
			ps.setInt(4, price);
			ps.setString(5, dateUtil.getDate());
			ps.setString(6, dateUtil.getDate());
			ps.setInt(7, totalPrice);

			ps.execute();

			PreparedStatement ps2 = connection.prepareStatement(update1);
			ps2.setInt(1, totalItem_stock);
			ps2.setInt(2, product_id);
			ps2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}