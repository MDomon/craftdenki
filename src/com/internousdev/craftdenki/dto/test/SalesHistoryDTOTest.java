package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;

import org.junit.Test;

import com.internousdev.craftdenki.dto.SalesHistoryDTO;

public class SalesHistoryDTOTest {


	@Test
	public void testGetProductId1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}




	@Test
	public void testGetPrice1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}




	@Test
	public void testGetProductCount1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}




	@Test
	public void testGetAtCost1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}

	@Test
	public void testGetAtCost2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}

	@Test
	public void testGetAtCost3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}


	@Test
	public void testGetPurchaseDate1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		Date expected = null;

		dto.setPurchaseDate(expected);

		assertEquals(expected, dto.getPurchaseDate());
	}

	@Test
	public void testGetPurchaseDate2() throws ParseException {

		SalesHistoryDTO dto = new SalesHistoryDTO();
		 Date sqlDate= Date.valueOf("2017-03-02");

		 Date expected = sqlDate;



		dto.setPurchaseDate(expected);

		assertEquals(expected, dto.getPurchaseDate());
	}




	@Test
	public void testGetProductName1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "0";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = null;

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName4() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = " 　";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName5() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "aaaa";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName6() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "AAAA";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName7() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "ああああ";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}





	@Test
	public void testGetProductNameKana1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = null;

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = " 　";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana5() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "aaaa";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "AAAA";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "ああああ";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}





	@Test
	public void testGetCategoryId1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}




	@Test
	public void testGetCategoryName1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = null;

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName4() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = " 　";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName5() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "aaaa";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName6() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "AAAA";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName7() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		String expected = "ああああ";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}





	@Test
	public void testGetTotalSales1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setTotalSales(expected);

		assertEquals(expected, dto.getTotalSales());
	}

	@Test
	public void testGetTotalSales2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setTotalSales(expected);

		assertEquals(expected, dto.getTotalSales());
	}

	@Test
	public void testGetTotalSales3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setTotalSales(expected);

		assertEquals(expected, dto.getTotalSales());
	}





	@Test
	public void testGetTotalCost1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setTotalCost(expected);

		assertEquals(expected, dto.getTotalCost());
	}

	@Test
	public void testGetTotalCost2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setTotalCost(expected);

		assertEquals(expected, dto.getTotalCost());
	}

	@Test
	public void testGetTotalCost3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setTotalCost(expected);

		assertEquals(expected, dto.getTotalCost());
	}






	@Test
	public void testGetProfit1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setProfit(expected);

		assertEquals(expected, dto.getProfit());
	}

	@Test
	public void testGetProfit2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setProfit(expected);

		assertEquals(expected, dto.getProfit());
	}

	@Test
	public void testGetProfit3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setProfit(expected);

		assertEquals(expected, dto.getProfit());
	}





	@Test
	public void testGetId1() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 1;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		SalesHistoryDTO dto = new SalesHistoryDTO();
		int expected = 12345678;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

}
