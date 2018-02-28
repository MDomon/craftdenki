package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.dto.Review2DTO;
import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class ProductDetailsDAO {

	// 商品詳細情報取得(単体)
	public ProductDTO getProductDetailsInfo(String product_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ProductDTO productDTO = new ProductDTO();
		String sql = "SELECT * FROM product_info where product_id=? AND status = 0";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				productDTO.setId(resultSet.getInt("id"));
				productDTO.setProduct_id(resultSet.getInt("product_id"));
				productDTO.setProduct_name(resultSet.getString("product_name"));
				productDTO.setProduct_name_kana(resultSet.getString("product_name_kana"));
				productDTO.setProduct_description(resultSet.getString("product_description"));
				productDTO.setCategory_id(resultSet.getInt("category_id"));
				productDTO.setPrice(resultSet.getInt("price"));
				productDTO.setImage_file_path(resultSet.getString("image_file_path"));
				productDTO.setImage_file_name(resultSet.getString("image_file_name"));
				productDTO.setRelease_date(resultSet.getString("release_date"));
				productDTO.setRelease_company(resultSet.getString("release_company"));
				productDTO.setRegist_date(resultSet.getDate("regist_date"));
				productDTO.setUpdate_date(resultSet.getDate("update_date"));
				productDTO.setItem_stock(resultSet.getInt("item_stock"));
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return productDTO;
	}

	// 商品詳細情報取得
	public List<ProductDTO> getProductDetailsInfoList(String[] productIdList) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<ProductDTO> detailsList = new ArrayList<ProductDTO>();
		for (int i = 0; i < productIdList.length; i++) {

			String sql = "SELECT * FROM product_info where product_id = ? AND status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, String.valueOf(productIdList[i]));

				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					ProductDTO productDTO = new ProductDTO();

					productDTO.setId(resultSet.getInt("id"));
					productDTO.setProduct_id(resultSet.getInt("product_id"));
					productDTO.setProduct_name(resultSet.getString("product_name"));
					productDTO.setProduct_name_kana(resultSet.getString("product_name_kana"));
					productDTO.setProduct_description(resultSet.getString("product_description"));
					productDTO.setCategory_id(resultSet.getInt("category_id"));
					productDTO.setPrice(resultSet.getInt("price"));
					productDTO.setImage_file_path(resultSet.getString("image_file_path"));
					productDTO.setImage_file_name(resultSet.getString("image_file_name"));
					productDTO.setRelease_date(resultSet.getString("release_date"));
					productDTO.setRelease_company(resultSet.getString("release_company"));
					productDTO.setRegist_date(resultSet.getDate("regist_date"));
					productDTO.setUpdate_date(resultSet.getDate("update_date"));
					productDTO.setItem_stock(resultSet.getInt("item_stock"));

					detailsList.add(productDTO);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return detailsList;
	}

	// おすすめ商品リスト
	public ArrayList<ProductDTO> getSugestProductInfo(int category_id) throws SQLException {
		ArrayList<ProductDTO> sugestList = new ArrayList<ProductDTO>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM product_info WHERE status = 0 AND category_id = ? ORDER BY RAND() LIMIT 3 ";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, category_id);

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
				sugestList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return sugestList;
	}

	// レビュー情報取得
	public ArrayList<Review2DTO> getReviewInfo(String product_id) throws SQLException {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ArrayList<Review2DTO> reviewList = new ArrayList<Review2DTO>();

		String sql = "SELECT * FROM review_info JOIN product_info ON review_info.product_id = product_info.product_id where review_info.product_id=? ORDER BY buy_item_date DESC";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, product_id);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Review2DTO review2DTO = new Review2DTO();

				review2DTO.setUser_id(resultSet.getString("user_id"));
				review2DTO.setProduct_id(resultSet.getInt("product_id"));
				review2DTO.setReview_id(resultSet.getString("review_id"));
				review2DTO.setBuy_item_date(resultSet.getDate("buy_item_date"));
				review2DTO.setEvaluation_count(resultSet.getInt("evaluation_count"));

				reviewList.add(review2DTO);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return reviewList;
	}

	// 商品情報UPDATE
	public int changeProductData(String id, String productId, String productName, String productNameKana,
			String productDescription, String categoryId, String price, String ImagePass, String imageFileName,
			String releaseDate, String releaseCompany) throws SQLException {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		int res = 0;

		DateUtil dateUtil = new DateUtil();

		String sql = "UPDATE  product_info SET " + "product_id = ? , " + "product_name = ? , "
				+ "product_name_kana = ? , " + "product_description = ? , " + "category_id = ? , " + "price = ? , "
				+ "image_file_path = ? , " + "image_file_name = ? , " + "release_date = ? , " + "release_company = ? , "
				+ "update_date = ? " + "WHERE id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, productId);
			preparedStatement.setString(2, productName);
			preparedStatement.setString(3, productNameKana);
			preparedStatement.setString(4, productDescription);
			preparedStatement.setString(5, categoryId);
			preparedStatement.setString(6, price);
			preparedStatement.setString(7, ImagePass);
			preparedStatement.setString(8, imageFileName);
			preparedStatement.setString(9, releaseDate);
			preparedStatement.setString(10, releaseCompany);
			preparedStatement.setString(11, dateUtil.getDate());
			preparedStatement.setString(12, id);

			res = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}

	// 商品情報表示⇔非表示切り替え
	public int productRestoreHide(String productId) throws SQLException {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		int res = 0;

		String sql = "UPDATE product_info SET " + "status = 1 - status " + "WHERE product_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, productId);

			res = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}

}
