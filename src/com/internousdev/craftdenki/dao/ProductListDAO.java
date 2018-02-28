package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class ProductListDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	// 商品リスト情報の取得
	// ユーザーに表示するリスト
	public ArrayList<ProductDTO> getProductInfo() throws SQLException {
		ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

		String sql = "SELECT * FROM product_info WHERE status = 0 ORDER BY Product_id ASC";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				ProductDTO dto = new ProductDTO();

				dto.setId(resultSet.getInt("id"));
				dto.setProduct_id(resultSet.getInt("product_id"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
				dto.setProduct_description(resultSet.getString("product_description"));
				dto.setCategory_id(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));
				dto.setImage_file_name(resultSet.getString("image_file_name"));
				dto.setRelease_date(resultSet.getString("release_date"));
				dto.setRelease_company(resultSet.getString("release_company"));
				dto.setRegist_date(resultSet.getDate("regist_date"));
				dto.setUpdate_date(resultSet.getDate("update_date"));
				dto.setItem_stock(resultSet.getInt("item_stock"));
				dto.setCurrent_cost(resultSet.getInt("current_cost"));
				productList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productList;
	}

	// 商品リスト情報の取得
	// ユーザーに非表示のリスト
	public ArrayList<ProductDTO> getProductHideInfo() throws SQLException {
		ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

		String sql = "SELECT * FROM product_info WHERE status = 1 ORDER BY Product_id ASC";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				ProductDTO dto = new ProductDTO();

				dto.setId(resultSet.getInt("id"));
				dto.setProduct_id(resultSet.getInt("product_id"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
				dto.setProduct_description(resultSet.getString("product_description"));
				dto.setCategory_id(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));
				dto.setImage_file_name(resultSet.getString("image_file_name"));
				dto.setRelease_date(resultSet.getString("release_date"));
				dto.setRelease_company(resultSet.getString("release_company"));
				dto.setRegist_date(resultSet.getDate("regist_date"));
				dto.setUpdate_date(resultSet.getDate("update_date"));
				dto.setItem_stock(resultSet.getInt("item_stock"));
				dto.setCurrent_cost(resultSet.getInt("current_cost"));
				productList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productList;
	}

	// 商品IDが既に存在しているかチェック
	public boolean existsProductId(String productId) throws SQLException {
		boolean result = false;

		String sql = "SELECT * FROM product_info WHERE product_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				result = true;

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			connection.close();

		}
		return result;
	}

	// 新商品を登録

	public int productRegist(String product_id, String product_name, String product_name_kana,
			String product_description, Integer category_id, Integer price, String image_file_path,
			String image_file_name, String release_date, String release_company) throws SQLException {

		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO product_info (" + "product_id," + "product_name," + "product_name_kana,"
				+ "product_description," + "category_id," + "price," + "image_file_path," + "image_file_name,"
				+ "release_date," + "release_company," + "regist_date) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		int res = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product_id);
			preparedStatement.setString(2, product_name);
			preparedStatement.setString(3, product_name_kana);
			preparedStatement.setString(4, product_description);
			preparedStatement.setInt(5, category_id);
			preparedStatement.setInt(6, price);
			preparedStatement.setString(7, image_file_path);
			preparedStatement.setString(8, image_file_name);
			preparedStatement.setString(9, release_date);
			preparedStatement.setString(10, release_company);
			preparedStatement.setString(11, dateUtil.getDate());

			res = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}
}
