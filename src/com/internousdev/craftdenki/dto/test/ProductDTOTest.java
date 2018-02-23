package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.craftdenki.dto.ProductDTO;

public class ProductDTOTest {



	public void testGetCategoryName1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());

	}

	@Test
	public void testGetCategoryName5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}















	@Test
	public void testGetId1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}













	@Test
	public void testGetProduct_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}

	@Test
	public void testGetProduct_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}

	@Test
	public void testGetProduct_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}













	@Test
	public void testGetProduct_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());

	}

	@Test
	public void testGetProduct_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}

	@Test
	public void testGetProduct_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setProduct_name(expected);

		assertEquals(expected, dto.getProduct_name());
	}
















	@Test
	public void testGetProduct_name_kana1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());

	}

	@Test
	public void testGetProduct_name_kana5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setProduct_name_kana(expected);

		assertEquals(expected, dto.getProduct_name_kana());
	}





















	@Test
	public void testGetProduct_description1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}

	@Test
	public void testGetProduct_description2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}

	@Test
	public void testGetProduct_description3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}

	@Test
	public void testGetProduct_description4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());

	}

	@Test
	public void testGetProduct_description5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}

	@Test
	public void testGetProduct_description6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}

	@Test
	public void testGetProduct_description7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setProduct_description(expected);

		assertEquals(expected, dto.getProduct_description());
	}














	@Test
	public void testGetCategory_id1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setCategory_id(expected);

		assertEquals(expected, dto.getCategory_id());
	}

	@Test
	public void testGetCategory_id2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setCategory_id(expected);

		assertEquals(expected, dto.getCategory_id());
	}

	@Test
	public void testGetCategory_id3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setCategory_id(expected);

		assertEquals(expected, dto.getCategory_id());
	}
















	@Test
	public void testGetPrice1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}















	@Test
	public void testGetImage_file_path1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());

	}

	@Test
	public void testGetImage_file_path5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setImage_file_path(expected);

		assertEquals(expected, dto.getImage_file_path());
	}















	@Test
	public void testGetImage_file_name1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}

	@Test
	public void testGetImage_file_name2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}

	@Test
	public void testGetImage_file_name3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}

	@Test
	public void testGetImage_file_name4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());

	}

	@Test
	public void testGetImage_file_name5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}

	@Test
	public void testGetImage_file_name6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}

	@Test
	public void testGetImage_file_name7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setImage_file_name(expected);

		assertEquals(expected, dto.getImage_file_name());
	}





















	@Test
	public void testGetRelease_date1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}

	@Test
	public void testGetRelease_date2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}

	@Test
	public void testGetRelease_date3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}

	@Test
	public void testGetRelease_date4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());

	}

	@Test
	public void testGetRelease_date5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}

	@Test
	public void testGetRelease_date6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}

	@Test
	public void testGetRelease_date7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setRelease_date(expected);

		assertEquals(expected, dto.getRelease_date());
	}


















	@Test
	public void testGetRelease_company1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());

	}

	@Test
	public void testGetRelease_company5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}

	@Test
	public void testGetRelease_company7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setRelease_company(expected);

		assertEquals(expected, dto.getRelease_company());
	}












	@Test
	public void testGetRegist_date1() {
		ProductDTO dto = new ProductDTO();
		Date expected = null;

		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}

	@Test
	public void testGetRegist_date2() throws ParseException {

		ProductDTO dto = new ProductDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String dateStr = "2018/02/20 14:10:30";
		Date formatDate = sdf.parse(dateStr);

		Date expected = formatDate;
		dto.setRegist_date(expected);

		assertEquals(expected, dto.getRegist_date());
	}












	@Test
	public void testGetUpdate_date1() {
		ProductDTO dto = new ProductDTO();
		Date expected = null;

		dto.setUpdate_date(expected);

		assertEquals(expected, dto.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date2() throws ParseException {

		ProductDTO dto = new ProductDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String dateStr = "2018/02/20 14:10:30";
		Date formatDate = sdf.parse(dateStr);

		Date expected = formatDate;
		dto.setUpdate_date(expected);

		assertEquals(expected, dto.getUpdate_date());
	}

















	@Test
	public void testGetItem_stock1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setItem_stock(expected);

		assertEquals(expected, dto.getItem_stock());
	}

	@Test
	public void testGetItem_stock2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setItem_stock(expected);

		assertEquals(expected, dto.getItem_stock());
	}

	@Test
	public void testGetItem_stock3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setItem_stock(expected);

		assertEquals(expected, dto.getItem_stock());
	}









	@Test
	public void testGetCurrent_cost1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setCurrent_cost(expected);

		assertEquals(expected, dto.getCurrent_cost());
	}

	@Test
	public void testGetCurrent_cost2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setCurrent_cost(expected);

		assertEquals(expected, dto.getCurrent_cost());
	}

	@Test
	public void testGetCurrent_cost3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setCurrent_cost(expected);

		assertEquals(expected, dto.getCurrent_cost());
	}












	@Test
	public void testGetSupplyCount1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setSupplyCount(expected);

		assertEquals(expected, dto.getSupplyCount());
	}

	@Test
	public void testGetSupplyCount2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setSupplyCount(expected);

		assertEquals(expected, dto.getSupplyCount());
	}

	@Test
	public void testGetSupplyCount3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setSupplyCount(expected);

		assertEquals(expected, dto.getSupplyCount());
	}













	@Test
	public void testGetSupplyCost1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setSupplyCost(expected);

		assertEquals(expected, dto.getSupplyCost());
	}

	@Test
	public void testGetSupplyCost2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setSupplyCost(expected);

		assertEquals(expected, dto.getSupplyCost());
	}

	@Test
	public void testGetSupplyCost3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setSupplyCost(expected);

		assertEquals(expected, dto.getSupplyCost());
	}









	@Test
	public void testGetSupplyCostTotal1() {
		ProductDTO dto = new ProductDTO();
		int expected = 0;

		dto.setSupplyCostTotal(expected);

		assertEquals(expected, dto.getSupplyCostTotal());
	}

	@Test
	public void testGetSupplyCostTotal2() {
		ProductDTO dto = new ProductDTO();
		int expected = 1;

		dto.setSupplyCostTotal(expected);

		assertEquals(expected, dto.getSupplyCostTotal());
	}

	@Test
	public void testGetSupplyCostTotal3() {
		ProductDTO dto = new ProductDTO();
		int expected = 12345678;

		dto.setSupplyCostTotal(expected);

		assertEquals(expected, dto.getSupplyCostTotal());
	}

















	@Test
	public void testGetProduct_count1() {
		ProductDTO dto = new ProductDTO();
		String expected = "0";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count2() {
		ProductDTO dto = new ProductDTO();
		String expected = null;

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count3() {
		ProductDTO dto = new ProductDTO();
		String expected = "";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count4() {
		ProductDTO dto = new ProductDTO();
		String expected = " 　";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());

	}

	@Test
	public void testGetProduct_count5() {
		ProductDTO dto = new ProductDTO();
		String expected = "aaaa";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count6() {
		ProductDTO dto = new ProductDTO();
		String expected = "AAAA";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}

	@Test
	public void testGetProduct_count7() {
		ProductDTO dto = new ProductDTO();
		String expected = "ああああ";

		dto.setProduct_count(expected);

		assertEquals(expected, dto.getProduct_count());
	}


}
