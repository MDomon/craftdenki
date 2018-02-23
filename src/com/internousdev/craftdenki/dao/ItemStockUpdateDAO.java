package com.internousdev.craftdenki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.craftdenki.util.DBConnector;

public class ItemStockUpdateDAO {


	/**
	 * 共用
	 */
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	/**
	 * SQL
	 */
	//購入時
	private String purchaseSQL = "UPDATE product_info "
								+ "SET item_stock = item_stock - ? "
								+ "WHERE product_id = ?";



	//仕入時
	private String supplySQL = "UPDATE product_info SET "
								+ "item_stock = item_stock + ? ,"
								+ "current_cost = (current_cost * item_stock + ? * ?) / (item_stock + ?) "
								+ "WHERE product_id = ?";


	/**
	 * 購入用メソッド
	 * 現在の在庫から引数(count)を引いてUPDATEします
	 * 購入数と商品IDを
	 * 引数としてください。
	 * update出来なければ、falseを返します。
	 */
	public boolean itemStockUpdate(int count ,int productId) throws SQLException{
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(purchaseSQL);
			preparedStatement.setInt(1,count);
			preparedStatement.setInt(2, productId);
			int res = preparedStatement.executeUpdate();
			if(res == 0){
				return false;
			}
		} catch(Exception e){
		e.printStackTrace();
		} finally{
			connection.close();
		}

		return true;
	}



	/**
	 * 仕入用メソッド
	 * 現在の在庫に引数(count)を足してUPDATEします。
	 * (現在の原価計 + 仕入原価計) / (現在の在庫数 + 仕入数)にて、新しい平均原価をUPDATEします。
	 * 購入数と仕入原価と商品IDを
	 * 引数としてください。
	 * update出来なければ、falseを返します。
	 */
	public boolean itemStockUpdate(int supplyCount, int supplyCost, int productId) throws SQLException {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(supplySQL);
			preparedStatement.setInt(1, supplyCount);
			preparedStatement.setInt(2, supplyCost);
			preparedStatement.setInt(3, supplyCount);
			preparedStatement.setInt(4, supplyCount);
			preparedStatement.setInt(5, productId);
			int res = preparedStatement.executeUpdate();
			if (res == 0) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return true;
	}
}

