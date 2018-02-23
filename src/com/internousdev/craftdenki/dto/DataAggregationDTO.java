package com.internousdev.craftdenki.dto;

public class DataAggregationDTO {

	String allAvgPrice;    //全平均販売価格
	String allAvgCost;     //全平均単価
	String allTotalCount;  //全販売数合計
	String allTotalSales;  //全販売数合計
	String allTotalCost;   //全原価合計
	String allTotalProfit; //全利益合計


	public String getAllAvgPrice() {
		return allAvgPrice;
	}
	public void setAllAvgPrice(String allAvgPrice) {
		this.allAvgPrice = allAvgPrice;
	}
	public String getAllAvgCost() {
		return allAvgCost;
	}
	public void setAllAvgCost(String allAvgCost) {
		this.allAvgCost = allAvgCost;
	}
	public String getAllTotalCount() {
		return allTotalCount;
	}
	public void setAllTotalCount(String allTotalCount) {
		this.allTotalCount = allTotalCount;
	}
	public String getAllTotalSales() {
		return allTotalSales;
	}
	public void setAllTotalSales(String allTotalSales) {
		this.allTotalSales = allTotalSales;
	}
	public String getAllTotalCost() {
		return allTotalCost;
	}
	public void setAllTotalCost(String allTotalCost) {
		this.allTotalCost = allTotalCost;
	}
	public String getAllTotalProfit() {
		return allTotalProfit;
	}
	public void setAllTotalProfit(String allTotalProfit) {
		this.allTotalProfit = allTotalProfit;
	}

}
