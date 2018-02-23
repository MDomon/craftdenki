package com.internousdev.craftdenki.util;


/**
 * 計算用のクラス
 */
public class Calculate {

	/**
	 * 仕入時に移動平均法にて平均単価を算出
	 * @param currentCost
	 * @param itemStock
	 * @param supplyCost
	 * @param supplyCount
	 * @return
	 */
	public int costAverage(
					int currentCost, //現在の原価
					int itemStock,   //現在の在庫
					int supplyCost,  //仕入原価
					int supplyCount  //仕入数
					){
		int newCost = (currentCost + supplyCost) / (itemStock + supplyCount);
		return newCost;
	}
}
