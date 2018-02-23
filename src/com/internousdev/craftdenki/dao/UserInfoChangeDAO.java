package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.internousdev.craftdenki.util.DBConnector;


public class UserInfoChangeDAO implements SessionAware {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ArrayList<UserInfoChangeDTO> list_user_info = new ArrayList<UserInfoChangeDTO>();

	public Map<String, Object> session;



///////////////////////////////////////////////////////////////////////////////



	public ArrayList<UserInfoChangeDTO> getUserInfo(String loginid) throws SQLException{

		String sql = "SELECT * FROM user_info WHERE user_id=?";
		String sql2 = "SELECT * FROM destination_info WHERE user_id=?";

		String loginId=loginid;


		//String loginId=(((LoginDTO)session.get("loginUserInfo")).getLoginId()).toString();
		//↑高橋さんからもらうセッションの鍵名を書く
		//System.out.println(((LoginDTO)session.get("loginUserInfo")).getLoginId()+"aaa");
		//System.out.println(loginId+"bbb");

		try{
			PreparedStatement p1 = connection.prepareStatement(sql);
			p1.setString(1,loginId);
			ResultSet r1 = p1.executeQuery();

			PreparedStatement p2 = connection.prepareStatement(sql2);
			p2.setString(1,loginId);
			ResultSet r2 = p2.executeQuery();


			UserInfoChangeDTO  u1 = new UserInfoChangeDTO();

			while(r1.next()){
			u1.setUserId(r1.getString("user_id"));
			u1.setPassword(r1.getString("password"));
			u1.setFamilyName(r1.getString("family_name"));
			u1.setFirstName(r1.getString("first_name"));
			u1.setFamilyNameKana(r1.getString("family_name_kana"));
			u1.setFirstNameKana(r1.getString("first_name_kana"));
			u1.setSex(r1.getInt("sex"));
			u1.setEmail(r1.getString("email"));
			u1.setQuestion(r1.getInt("question"));
			u1.setAnswer(r1.getString("answer"));
			}

			while(r2.next()){
			u1.setUserAddress(r2.getString("user_address"));
			u1.setUserAddress2(r2.getString("user_address2"));
			u1.setUserAddress3(r2.getString("user_address3"));
			u1.setTelNumber(r2.getString("tel_number"));
			u1.setTelNumber2(r2.getString("tel_number2"));
			u1.setTelNumber3(r2.getString("tel_number3"));
			}

			list_user_info.add(u1);

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}

		return list_user_info;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return session;
	}

}
