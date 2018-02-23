package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.craftdenki.dto.PurchaseHistoryDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class PurchaseHistoryDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId) throws SQLException {

		ArrayList<PurchaseHistoryDTO> purchaseHistoryList = new ArrayList<PurchaseHistoryDTO>();

		String sql = "SELECT phi.id as id,pi.product_id as product_id,phi.product_count as product_count,phi.regist_date as regist_date,phi.price as price,pi.image_file_name as image_file_name,pi.image_file_path as image_file_path,pi.product_name as product_name,pi.product_name_kana as product_name_kana,pi.release_company as release_company,pi.release_date as release_date FROM purchase_history_info as phi LEFT JOIN product_info as pi ON phi.product_id = pi.product_id WHERE phi.user_id = ? and phi.status = 0";

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();

				dto.setId(rs.getString("id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setCount(rs.getInt("product_count"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setProductId(rs.getString("product_id"));
				dto.setRegistDate(rs.getString("regist_date"));

				System.out.println("PurchaseHistoryDAO---------");
				System.out.println(dto.getId());
				System.out.println(dto.getProductName());
				System.out.println(dto.getProductNameKana());
				System.out.println(dto.getImageFileName());
				System.out.println(dto.getImageFilePath());
				System.out.println(dto.getPrice());
				System.out.println(dto.getCount());
				System.out.println(dto.getReleaseCompany());
				System.out.println(dto.getReleaseDate());
				System.out.println(dto.getProductId());
				System.out.println(dto.getRegistDate());
				System.out.println("----------------------------");


				System.out.println(rs.getString("product_count"));

				purchaseHistoryList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return purchaseHistoryList;
	}

	public int deleteHistoryInfo(String id) {
		String sql = "update purchase_history_info set status = 1 where id =?";
		PreparedStatement ps;
		int result = 0;

		System.out.println("ccc");
		System.out.println(id);
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,id);

			result = ps.executeUpdate();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
