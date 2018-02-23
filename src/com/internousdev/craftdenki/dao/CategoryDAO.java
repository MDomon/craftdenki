package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class CategoryDAO {

	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>();

	public List<CategoryDTO> getCategoryInfo() {
		DBConnector db = new DBConnector();

		Connection con = db.getConnection();
		String sql = "SELECT * FROM m_category";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				CategoryDTO dto = new CategoryDTO();
				dto.setId(rs.getString("id"));
				dto.setCategoryId(rs.getString("category_id"));
				dto.setCategoryName(rs.getString("category_name"));
				dto.setCategoryDescription(rs.getString("category_description"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				categoryList.add(dto);
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
		return categoryList;

	}

}
