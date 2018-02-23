package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;


public class DestinationChangeDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();



	private String sql = "UPDATE user_info SET update_date = ? "
			+ "WHERE user_id = ?";

	private String sql2 = "UPDATE destination_info SET user_address = ?, user_address2 = ?, user_address3 = ?, tel_number = ?, tel_number2 = ?, tel_number3 = ? "
			+ "WHERE user_id = ?";

			/*
			 * 	↑のsqlで行をWHEREで指定するために、userIDを使いたいからやっぱりユーザーＩＤも
			 * セッションに格納しておく   午後に修正する
			 */
	/////////////////////////////////////////////////////////////

	public void destinationChange(String userId,String userAddress,String userAddress2,String userAddress3,String telNumber,String telNumber2,String telNumber3) throws SQLException{

			try{
				PreparedStatement p1=connection.prepareStatement(sql);


				p1.setString(1,dateUtil.getDate());
				p1.setString(2, userId);

				p1.execute();

				PreparedStatement p2=connection.prepareStatement(sql2);

				p2.setString(1, userAddress);
				p2.setString(2, userAddress2);
				p2.setString(3, userAddress3);
				p2.setString(4, telNumber);
				p2.setString(5, telNumber2);
				p2.setString(6, telNumber3);
				p2.setString(7, userId);

				p2.execute();

			}catch(Exception e){
				e.printStackTrace();
			}finally{
				connection.close();
			}

	}



}
