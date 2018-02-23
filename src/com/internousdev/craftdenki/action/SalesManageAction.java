package com.internousdev.craftdenki.action;

import static com.internousdev.craftdenki.util.DateUtil.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CategoryDAO;
import com.internousdev.craftdenki.dao.SalesHistoryDAO;
import com.internousdev.craftdenki.dto.CategoryDTO;
import com.internousdev.craftdenki.dto.DataAggregationDTO;
import com.internousdev.craftdenki.dto.SalesHistoryDTO;
import com.internousdev.craftdenki.util.DataAggregation;
import com.opensymphony.xwork2.ActionSupport;

public class SalesManageAction  extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private List<Integer> yearList = new ArrayList<>(); //年リスト
	private List<String> monthDayList = new ArrayList<>(); //月日リスト
	private List<SalesHistoryDTO> salesHistoryList = new ArrayList<>();//売上一覧
	private List<CategoryDTO> categoryList = new ArrayList<CategoryDTO>(); //カテゴリリスト
	private String categoryId; //カテゴリID
	/*
	 * 集計
	 */
	private String allAvgPrice; //全平均販売価格
	private String allAvgCost; //全平均単価
	private String allTotalCount; //全販売数合計
	private String allTotalSales; //全売上合計
	private String allTotalCost; //全原価合計
	private String allTotalProfit; //全利益合計
	private List<Long> categorySalesList = new ArrayList<>(); //カテゴリ毎売上リスト
	private List<Long> categoryProfitList = new ArrayList<>(); //カテゴリ毎利益リスト
	private List<Long> productSalesList = new ArrayList<>(); //商品毎売上リスト
	private List<Long> productProfitList = new ArrayList<>(); //商品毎利益リスト
	private List<String> productNametList = new ArrayList<>(); //対象カテゴリの商品名リスト
	/*
	 * 検索条件
	 */
	private boolean searchFlg; //検索フラグ
	private String saleStartY; //購入年Start
	private String saleStartMD; //購入月日Start
	private String saleEndY; //購入年End
	private String saleEndMD; //購入月日End



	private String errorMessage;

	public String execute(){
		String result = ERROR;

		if(session.get("master_flg") == "1"){      //管理者判定
			result = SUCCESS;
			/**---------------------------
			 * 検索未実行(ページ遷移一回目)
			 * ---------------------------
			 */
			if(!searchFlg) {
				//購入日絞り込み用の年リストを取得
					yearList = createYearList();
				//購入日絞り込み用の月日リストを取得
					monthDayList = createMonthDayList();
				//カテゴリテーブルよりカテゴリリストを取得
					CategoryDAO categoryDAO = new CategoryDAO();
					categoryList = categoryDAO.getCategoryInfo();
				//Listにid:"0",名:"すべてのカテゴリ"を追加
					CategoryDTO all = new CategoryDTO();
					all.setCategoryId("0");
					all.setCategoryName("すべてのカテゴリ");
					categoryList.add(0,all);
					session.put("categoryList", categoryList);
				//selectの初期値を設定
					saleEndMD = "03/31";

				//売上一覧を取得
					SalesHistoryDAO salesHistoryDAO = new SalesHistoryDAO();
					salesHistoryList = salesHistoryDAO.salesAllList();
					session.put("salesHistoryList", salesHistoryList);

				//集計
					DataAggregation da = new DataAggregation(salesHistoryList);
					DataAggregationDTO dataDto = da.dataAggregation();

					allAvgPrice = dataDto.getAllAvgPrice();
					allAvgCost = dataDto.getAllTotalCost();
					allTotalCount = dataDto.getAllTotalCount();
					allTotalSales = dataDto.getAllTotalSales();
					allTotalCost = dataDto.getAllTotalCost();
					allTotalProfit = dataDto.getAllTotalProfit();


					//カテゴリごとの売上・利益リスト用意
						for(int i = 1; i <= categoryList.size(); i++) {
							categorySalesList.add(0L);
							categoryProfitList.add(0L);
						}
					//カテゴリごとの売上・利益集計
						for(SalesHistoryDTO dto: salesHistoryList) {
							for(int i = 1; i <= categoryList.size(); i++) {
								if(dto.getCategoryId() == i) {
									categorySalesList.set(i - 1, categorySalesList.get(i-1) + dto.getTotalSales());
									categoryProfitList.set(i - 1, categoryProfitList.get(i-1) + dto.getProfit());
									continue;
								}
							}

						}

			}else{
			/**------------------------------
			 * 検索実行後(ページ遷移二回目以降)
			 * ------------------------------
			 */
				//購入日絞り込み用の年リストを取得
					yearList = createYearList();
				//購入日絞り込み用の月日リストを取得
					monthDayList = createMonthDayList();
				//カテゴリリストを取得
					categoryList = (List<CategoryDTO>) session.get("categoryList");
				//売上一覧を取得
					salesHistoryList = (List<SalesHistoryDTO>) session.get("salesHistoryList");
				//購入日をDate型で作成
					LocalDate str = string2LocalDate(saleStartY,saleStartMD);
					LocalDate end = string2LocalDate(saleEndY, saleEndMD);


				//絞り込み条件に合致するSalesHistoryDTOを格納するListを作成
					List<SalesHistoryDTO> localSalesHistoryList = new ArrayList<>();
				//絞り込み開始
					for(SalesHistoryDTO dto: salesHistoryList) {
					//DTOの購入日時をjava.sql.Date→LocalDateに変換
						LocalDate target = sqlDate2LocalDate(dto.getPurchaseDate());
					//DTOの購入日時が絞り込み期間内にあればtrue
						if(target.compareTo(str) >= 0 && target.compareTo(end) <= 0) {
							if(categoryId.equals("0") || dto.getCategoryId() == Integer.parseInt(categoryId)){
								localSalesHistoryList.add(dto);
							}
						}
					}
				//表示用のリストに絞り込み後のリストを代入
					salesHistoryList = localSalesHistoryList;

					//集計
					DataAggregation da = new DataAggregation(salesHistoryList);
					DataAggregationDTO dataDto = da.dataAggregation();

					allAvgPrice = dataDto.getAllAvgPrice();
					allAvgCost = dataDto.getAllTotalCost();
					allTotalCount = dataDto.getAllTotalCount();
					allTotalSales = dataDto.getAllTotalSales();
					allTotalCost = dataDto.getAllTotalCost();
					allTotalProfit = dataDto.getAllTotalProfit();


					if(categoryId.equals("0")) {
						//カテゴリごとの売上・利益リスト用意
						for(int i = 1; i <= categoryList.size(); i++) {
							categorySalesList.add(0L);
							categoryProfitList.add(0L);
						}
						//カテゴリごとの売上・利益集計
						for(SalesHistoryDTO dto: salesHistoryList) {
							for(int i = 1; i <= categoryList.size(); i++) {
								if(dto.getCategoryId() == i) {
									categorySalesList.set(i - 1, categorySalesList.get(i-1) + dto.getTotalSales());
									categoryProfitList.set(i - 1, categoryProfitList.get(i-1) + dto.getProfit());
									continue;
								}
							}
						}
					} else {
						//対象カテゴリの商品名リストを作成
						Set<String> productNameSet = new HashSet<>();
						for(SalesHistoryDTO dto: salesHistoryList) {
							if(dto.getCategoryId() == Integer.parseInt(categoryId)){
								//Setに商品名を格納(重複なしのコレクション)
								productNameSet.add(dto.getProductName());
								}
							}
						productNametList = new ArrayList<String>(productNameSet);

						//商品ごとの売上・利益リスト用意
						for(int i = 1; i <= productNametList.size(); i++) {
							productSalesList.add(0L);
							productProfitList.add(0L);
						}
						//商品ごとの売上・利益集計
						for(SalesHistoryDTO dto: salesHistoryList) {
							if(dto.getCategoryId() == Integer.parseInt(categoryId)){
								for(int i = 0; i < productNametList.size(); i++) {
									if(dto.getProductName() == productNametList.get(i)) {
										productNametList.set(i, productNametList.get(i) + dto.getTotalSales());
										productNametList.set(i, productNametList.get(i) + dto.getProfit());
										continue;
									}
								}
							}
						}
					}
			}
		}else errorMessage = "不正なアクセスです。もう一度ログインをお願いいたします。";
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<Integer> getYearList() {
		return yearList;
	}

	public void setYearList(List<Integer> yearList) {
		this.yearList = yearList;
	}

	public List<String> getMonthDayList() {
		return monthDayList;
	}

	public void setMonthDayList(List<String> monthDayList) {
		this.monthDayList = monthDayList;
	}

	public List<SalesHistoryDTO> getSalesHistoryList() {
		return salesHistoryList;
	}

	public void setSalesHistoryList(List<SalesHistoryDTO> salesHistoryList) {
		this.salesHistoryList = salesHistoryList;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

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

	public List<Long> getCategorySalesList() {
		return categorySalesList;
	}

	public void setCategorySalesList(List<Long> categorySalesList) {
		this.categorySalesList = categorySalesList;
	}

	public List<Long> getCategoryProfitList() {
		return categoryProfitList;
	}

	public void setCategoryProfitList(List<Long> categoryProfitList) {
		this.categoryProfitList = categoryProfitList;
	}

	public List<Long> getProductSalesList() {
		return productSalesList;
	}

	public void setProductSalesList(List<Long> productSalesList) {
		this.productSalesList = productSalesList;
	}

	public List<Long> getProductProfitList() {
		return productProfitList;
	}

	public void setProductProfitList(List<Long> productProfitList) {
		this.productProfitList = productProfitList;
	}

	public List<String> getProductNametList() {
		return productNametList;
	}

	public void setProductNametList(List<String> productNametList) {
		this.productNametList = productNametList;
	}

	public boolean isSearchFlg() {
		return searchFlg;
	}

	public void setSearchFlg(boolean searchFlg) {
		this.searchFlg = searchFlg;
	}

	public String getSaleStartY() {
		return saleStartY;
	}

	public void setSaleStartY(String saleStartY) {
		this.saleStartY = saleStartY;
	}

	public String getSaleStartMD() {
		return saleStartMD;
	}

	public void setSaleStartMD(String saleStartMD) {
		this.saleStartMD = saleStartMD;
	}

	public String getSaleEndY() {
		return saleEndY;
	}

	public void setSaleEndY(String saleEndY) {
		this.saleEndY = saleEndY;
	}

	public String getSaleEndMD() {
		return saleEndMD;
	}

	public void setSaleEndMD(String saleEndMD) {
		this.saleEndMD = saleEndMD;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
