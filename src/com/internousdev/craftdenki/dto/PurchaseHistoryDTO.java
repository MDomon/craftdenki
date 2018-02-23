package com.internousdev.craftdenki.dto;

public class PurchaseHistoryDTO {

	// 商品名
	private String productName;

	// ふりがな
	private String productNameKana;

	// 商品画像
	private String imageFileName;

	private String imageFilePath;

	// 値段
	private int price;

	// 個数
	private int count;

	// 発売会社名
	private String releaseCompany;

	private String productId;

	// 発売年月日
	private String releaseDate;

	private String id;

	private String productcount;

	private String registDate;








	// 商品名
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	// ふりがな
	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	// 商品画像




	// 値段
	public int getPrice() {
		return price;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 個数
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 発売会社名
	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	// 発売年月日
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return 	productId;
		}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	public String getRegistDate() {
		return 	registDate;
		}

	public void setProductCount(String productcount) {
		this.productcount = productcount;
	}

	public String getProductCount() {
		return 	productcount;
		}





}
