package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.craftdenki.dto.SalesHistoryDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class SalesHistoryDAO {

	/*
	 * 共用
	 */
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<SalesHistoryDTO> salesHistoryList = new ArrayList<>();

	/*
	 * SQL 全リスト取得
	 */
	String salesAllSQL = "SELECT " + "phi.id id," + "phi.product_id product_id," + "phi.price price,"
			+ "phi.product_count product_count," + "phi.at_cost at_cost," + "phi.regist_date purchase_date,"
			+ "pi.product_name," + "pi.product_name_kana," + "pi.category_id," + "mc.category_name,"
			+ "phi.price * phi.product_count total_sales," + "phi.at_cost * phi.product_count total_cost,"
			+ "(phi.price - phi.at_cost) * phi.product_count profit " + "FROM " + "purchase_history_info phi "
			+ "LEFT JOIN " + "product_info pi " + "ON " + "phi.product_id = pi.product_id " + "LEFT JOIN "
			+ "m_category mc " + "ON " + "pi.category_id = mc.category_id " + "ORDER BY " + "purchase_date DESC";

	/*
	 * 全売上取得メソッド
	 */
	public List<SalesHistoryDTO> salesAllList() {

		try {
			PreparedStatement ps = con.prepareStatement(salesAllSQL);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				SalesHistoryDTO dto = new SalesHistoryDTO();

				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setAtCost(rs.getInt("at_cost"));
				dto.setPurchaseDate(rs.getDate("purchase_date"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setCategoryName(rs.getString("category_name"));
				dto.setTotalSales(rs.getInt("total_sales"));
				dto.setTotalCost(rs.getInt("total_cost"));
				dto.setProfit(rs.getInt("profit"));

				salesHistoryList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return salesHistoryList;
	}

}
