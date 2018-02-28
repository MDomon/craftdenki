package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.craftdenki.dto.ProductDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class ItemSearchDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ArrayList<ProductDTO> searchList = new ArrayList<ProductDTO>();

	public ArrayList<ProductDTO> getItemInfo(String searchWord, String category) throws SQLException {

		if (category.equals("1")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 1 AND status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")) {
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
						searchList.add(dto);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		} else if (category.equals("2")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 2 AND status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")) {
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
						searchList.add(dto);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		} else if (category.equals("3")) {
			String sql = "SELECT * FROM product_info WHERE category_id = 3 AND status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")) {
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
						searchList.add(dto);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		} else {

			String sql = "SELECT * FROM product_info WHERE status = 0";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String productName = resultSet.getString("product_name");
					String productNameKana = resultSet.getString("product_name_kana");

					if (productName.matches(".*" + searchWord + ".*")
							|| productNameKana.matches(".*" + searchWord + ".*")) {
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
						searchList.add(dto);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}

		}
		return searchList;

	}

}
