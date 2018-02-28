package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoChangeCompleteDAO extends ActionSupport {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "UPDATE user_info SET password = ?, family_name = ?, first_name = ?, family_name_kana = ?, first_name_kana = ?, sex = ?, email = ?, question = ?, answer = ?, update_date = ? "
			+ "WHERE user_id = ?";

	private String sql2 = "UPDATE destination_info SET user_address = ?, user_address2 = ?, user_address3 = ?, tel_number = ?, tel_number2 = ?, tel_number3 = ? "
			+ "WHERE user_id = ?";

	private int count;

	public int infoChange(String userId, String password, String familyName, String firstName, String familyNameKana,
			String firstNameKana, int sex, String email, int question, String answer, String userAddress,
			String userAddress2, String userAddress3, String telNumber, String telNumber2, String telNumber3)
			throws SQLException {

		try {

			PreparedStatement p1 = connection.prepareStatement(sql);

			p1.setString(1, password);
			p1.setString(2, familyName);
			p1.setString(3, firstName);
			p1.setString(4, familyNameKana);
			p1.setString(5, firstNameKana);
			p1.setInt(6, sex);
			p1.setString(7, email);
			p1.setInt(8, question);
			p1.setString(9, answer);
			p1.setString(10, dateUtil.getDate());
			p1.setString(11, userId);

			count=p1.executeUpdate();

			PreparedStatement p2 = connection.prepareStatement(sql2);

			p2.setString(1, userAddress);
			p2.setString(2, userAddress2);
			p2.setString(3, userAddress3);
			p2.setString(4, telNumber);
			p2.setString(5, telNumber2);
			p2.setString(6, telNumber3);
			p2.setString(7, userId);

			count=count+p2.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return count;
	}

}
