package com.internousdev.craftdenki.util;

public class InputChecker {

/*---------------------------------------------------------------------------------------------------------------------
 * 新商品登録の入力チェック
 * --------------------------------------------------------------------------------------------------------------------
 */
	//商品ID
	public String newProductIdChk(String newProductId){
		String result = "OK";
		System.out.println(newProductId);

		if(newProductId == null || newProductId.equals("")){
			result = "商品IDを入力してください。";
		}else if(!newProductId.matches("\\d{8}")){
			result = "商品IDは半角数字8桁で入力してください。";
		}
		return result;
	}
	//商品名
	public String newProductNameChk(String newProductName) {
		String result = "OK";

		if (newProductName == null || newProductName.equals("")) {
			result = "商品名を入力してください。";
		} else if (newProductName.length() > 50) {
			result = "商品名は50文字以下で入力してください。";
		} else if (!newProductName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ\\n\\r!?！？、。,.-ー・ ]+$")) {
			result = "商品名は半角英語、漢字、ひらがな、カタカナで入力してください。";
		}

		return result;
	}

	//商品名かな
	public String newProductNameKanaChk(String newProductNameKana) {
		String result = "OK";

		if (newProductNameKana == null || newProductNameKana.equals("")) {
			result = "商品名かなを入力してください。";
		} else if (newProductNameKana.length() > 50) {
			result = "商品名かなは50文字以下で入力してください。";
		} else if (!newProductNameKana.matches("^[ぁ-ん!?！？ー ]+$")) {
				result = "商品名かなはひらがなで入力してください。";
		}

		return result;
	}

	//商品詳細
	public String newProductDescriptionChk(String newProductDescription) {
		String result = "OK";

		if (!newProductDescription.equals("") && newProductDescription.length() > 255) {
			result = "商品詳細は255文字以下で入力してください。";
		} else if (!newProductDescription.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ\\n\\r!?！？、。,.-ー・「」｢｣『』 ]+$")) {
				result = "商品詳細は半角英語、漢字、ひらがな、カタカナで入力してください。";
		}

		return result;
	}

	//カテゴリID
	public String newCategoryIdChk(String newCategoryId) {
		String result = "OK";

		if (newCategoryId == null || newCategoryId.equals("")) {
			result = "カテゴリIDを選択してください。";
		}

		return result;
	}

	//販売価格
	public String newBuyPriceChk(String newBuyPrice) {
		String result = "OK";

		if (newBuyPrice == null || newBuyPrice.equals("")) {
			result = "販売価格を入力してください。";
		} else if (!newBuyPrice.matches("^[0-9, ]+$")) {
			result = "販売価格は半角数字で入力してください。";
		} /*else if(!newBuyPrice.matches("\\d{1,8}")){
			result = "取り扱い出来ない金額です。";
		}*/

		return result;
	}

	//発売年月
	public String newReleaseDateChk(String newReleaseDate) {
		String result = "OK";

		if (!newReleaseDate.equals("") && !newReleaseDate.matches("[012]\\d{3}/0[1-9]|[012]\\d{3}/1[0-2]")) {
			result = "発売年月はyyyy/MMの形式で入力してください。";
		}

		return result;
	}

	//発売会社
	public String newReleaseCompanyChk(String newReleaseCompany) {
		String result = "OK";

		if (!newReleaseCompany.equals("") && newReleaseCompany.length() > 16) {
			result = "発売会社は16文字以下で入力してください。" + newReleaseCompany;
		} else if (!newReleaseCompany.equals("") && !newReleaseCompany.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ\\n\\r!?！？、。,.-ー]+$")) {
			result = "発売会社は半角英語、漢字、ひらがな、カタカナで入力してください。";
	}

		return result;
	}

	//画像ファイル名
	public String newProductImageChk(String newProductImage) {
		String result = "OK";

		if (!newProductImage.equals("") && !newProductImage.matches("\\w+.(jpeg|jpg|tiff|png|gif|bmp)$")) {
			result = "画像ファイル名(半角英数,_).拡張子(jpeg,jpg,tiff,png,gif,bmp)の形式で入力してください。";

			/*
			 * 画像ファイルが既にアップロード済みか判定できれば、、、
			 */
		}

		return result;
	}


	/*---------------------------------------------------------------------------------------------------------------------
	 * 仕入の入力チェック
	 * --------------------------------------------------------------------------------------------------------------------
	 */

	//仕入数
	public String supplyCountChk(String supplyCount) {
		String result ="OK";

		if(supplyCount == null) {
			result = "仕入数が入力されておりません。再度処理をお願いいたします。";
		} else if (supplyCount.contains(", ,")) {
			result = "仕入数に入力されていない欄があります。全ての欄に0以上の数字を入力してください。";
		} else if (!supplyCount.matches("^[0-9, ]+$")) {
			result = "仕入数は半角数字で入力してください。";
		}
		return result;
	}

	//仕入単価
	public String supplyCostChk(String supplyCost) {
		String result ="OK";

		if(supplyCost == null) {
			result = "仕入単価が入力されておりません。再度処理をお願いいたします。";
		} else if (supplyCost.contains(", ,")) {
			result = "仕入単価に入力されていない欄があります。全ての欄に0以上の数字を入力してください。";
		} else if (!supplyCost.matches("^[0-9, ]+$")) {
			result = "仕入単価は半角数字で入力してください。";
		}
		return result;
	}
}

