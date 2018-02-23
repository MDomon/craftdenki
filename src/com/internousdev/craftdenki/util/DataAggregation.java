package com.internousdev.craftdenki.util;

import java.util.List;

import com.internousdev.craftdenki.dto.DataAggregationDTO;
import com.internousdev.craftdenki.dto.SalesHistoryDTO;

public class DataAggregation {
	double allAvgPrice = 0; //全平均販売価格
	double allAvgCost = 0; //全平均単価
	double allTotalCount = 0; //全販売数合計
	double allTotalSales = 0; //全販売数合計
	double allTotalCost = 0; //全原価合計
	double allTotalProfit = 0; //全利益合計

	/**
	 * コンストラクタ
	 */
	DataAggregation(){
	}
	/**
	 * コンストラクタ
	 * @param salesHistoryList
	 */
	public DataAggregation(List<SalesHistoryDTO> salesHistoryList){
		for(SalesHistoryDTO dto: salesHistoryList) {
			allTotalCount += dto.getProductCount();
			allTotalSales += dto.getTotalSales();
			allTotalCost += dto.getTotalCost();
		}
		allTotalProfit = allTotalSales - allTotalCost;
		allAvgPrice = allTotalSales / allTotalCount;
		allAvgCost = allTotalCost / allTotalCount;
	}

	/**
	 *
	 * @return DataAggregationDTO
	 */
	public DataAggregationDTO dataAggregation(){
		DataAggregationDTO dto = new DataAggregationDTO();
		dto.setAllAvgPrice(String.format("%1$,3.2f", allAvgPrice));
		dto.setAllAvgCost(String.format("%1$,3.2f", allAvgCost));
		dto.setAllTotalCount(String.format("%,.0f", allTotalCount));
		dto.setAllTotalSales(String.format("%,.0f", allTotalSales));
		dto.setAllTotalCost(String.format("%,.0f", allTotalCost));
		dto.setAllTotalProfit(String.format("%,.0f", allTotalProfit));

		return dto;
	}
}
