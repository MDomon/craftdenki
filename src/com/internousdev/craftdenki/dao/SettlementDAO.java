package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.craftdenki.dto.SettlementDTO;
import com.internousdev.craftdenki.util.DBConnector;

public class SettlementDAO {



	private DBConnector dbConnector = new DBConnector();

	private SettlementDTO dto = new SettlementDTO();

	private Connection connection = dbConnector.getConnection();



	public SettlementDTO getDestinationInfo(String userId){

		String sql = "SELECT family_name,first_name,email,user_address,user_address2,user_address3,tel_number,tel_number2,tel_number3 FROM destination_info JOIN user_info ON destination_info.user_id = user_info.user_id WHERE user_info.user_id =? ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();


			while(resultSet.next()){

				dto.setFamilyName(resultSet.getString("family_name"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setEmail(resultSet.getString("email"));
				dto.setUserAddress(resultSet.getString("user_address"));
				dto.setUserAddress2(resultSet.getString("user_address2"));
				dto.setUserAddress3(resultSet.getString("user_address3"));
				dto.setTelNumber(resultSet.getString("tel_number"));
				dto.setTelNumber2(resultSet.getString("tel_number2"));
				dto.setTelNumber3(resultSet.getString("tel_number3"));


			}

		}catch(SQLException e){
			e.printStackTrace();

		}

		return dto;


	}

}
