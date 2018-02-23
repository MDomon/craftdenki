package com.internousdev.craftdenki.util;

public interface ErrorMessageList {

/*-------------------------------------------------------
 *          商品登録用エラーメッセージフィールド
 *-------------------------------------------------------
 */
	String productIdError =""; //新商品ID
	String productNameError =""; //商品名
	String productNameKanaError =""; //商品名かな
	String productDescriptionError =""; //商品詳細
	String categoryIdError =""; //カテゴリID
	String buyPriceError =""; //販売価格
	String releaseDateError =""; //発売年月
	String releaseCompanyError =""; //発売会社
	String productImageError =""; //画像ファイル名

	/*-------------------------------------------------------
	 *          仕入用エラーメッセージフィールド
	 *-------------------------------------------------------
	 */
	String supplyNullError ="";
	String supplyCountError ="";
	String supplyCostError ="";

}