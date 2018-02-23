package com.internousdev.craftdenki.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.internousdev.craftdenki.dao.CategoryDAO;


//DB product_infoのインスタンス

public class ProductDTO {

	private int id;
	private int product_id;
	private int category_id;
	private int price;
	private int item_stock;
	private int current_cost;
	private String product_name;
	private String product_name_kana;
	private String product_description;
	private String image_file_path;
	private String image_file_name;
	private String release_date;
	private String release_company;
	private Date regist_date;
	private Date update_date;
	//仕入用フィールド
	private String product_count;
	private int supplyCount; //仕入数
	private int supplyCost; //仕入原価
	private int supplyCostTotal; //仕入計


	//カテゴリ名
	private String categoryName;


	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setCategoryName(Integer category_id) {
		List<CategoryDTO> categoryList = new ArrayList<>();
		CategoryDAO categoryDAO = new CategoryDAO();
		categoryList =  categoryDAO.getCategoryInfo();

		for(int i = 0; i < categoryList.size(); i++) {
			if(categoryList.get(i).getCategoryId().equals(category_id.toString())) {
				this.categoryName = categoryList.get(i).getCategoryName();
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_name_kana() {
		return product_name_kana;
	}

	public void setProduct_name_kana(String product_name_kana) {
		this.product_name_kana = product_name_kana;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage_file_path() {
		return image_file_path;
	}

	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

	public String getImage_file_name() {
		return image_file_name;
	}

	public void setImage_file_name(String image_file_name) {
		this.image_file_name = image_file_name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getRelease_company() {
		return release_company;
	}

	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}

	public Date getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(Date regist_date) {
		this.regist_date = regist_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public int getCurrent_cost() {
		return current_cost;
	}

	public void setCurrent_cost(int current_cost) {
		this.current_cost = current_cost;
	}

	public int getSupplyCount() {
		return supplyCount;
	}

	public void setSupplyCount(int supplyCount) {
		this.supplyCount = supplyCount;
	}

	public int getSupplyCost() {
		return supplyCost;
	}

	public void setSupplyCost(int supplyCost) {
		this.supplyCost = supplyCost;
	}

	public int getSupplyCostTotal() {
		return supplyCostTotal;
	}

	public void setSupplyCostTotal(int supplyCostTotal) {
		this.supplyCostTotal = supplyCostTotal;
	}

	public String getProduct_count() {
		return product_count;
	}

	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}







}
