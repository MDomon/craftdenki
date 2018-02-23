package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.craftdenki.util.DBConnector;
import com.internousdev.craftdenki.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();

	private String sql1="INSERT INTO user_info (user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,question,answer,regist_date)"
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	private String sql2="INSERT INTO destination_info(user_id,user_address,tel_number) VALUES(?,?,?)";

	public void createUser(String userid,String pass,String familyname,String firstname,String familynamekana,String firstnamekana,int sex,String email,int secretquestion,String secretanswer,String address,String tel) throws SQLException{

		try {
			PreparedStatement preparedStatement1=connection.prepareStatement(sql1);
			preparedStatement1.setString(1,userid);
			preparedStatement1.setString(2, pass);
			preparedStatement1.setString(3,familyname);
			preparedStatement1.setString(4, firstname);
			preparedStatement1.setString(5, familynamekana);
			preparedStatement1.setString(6, firstnamekana);
			preparedStatement1.setInt(7, sex);
			preparedStatement1.setString(8, email);
			preparedStatement1.setInt(9, secretquestion);
			preparedStatement1.setString(10,secretanswer);
			preparedStatement1.setString(11,dateUtil.getDate());

			preparedStatement1.execute();

			PreparedStatement preparedStatement2=connection.prepareStatement(sql2);
			preparedStatement2.setString(1,userid);
			preparedStatement2.setString(2, address);
			preparedStatement2.setString(3, tel);

			preparedStatement2.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}

}