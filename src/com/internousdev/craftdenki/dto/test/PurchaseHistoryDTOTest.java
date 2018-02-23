package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.PurchaseHistoryDTO;



public class PurchaseHistoryDTOTest {

	@Test
	public void testGetProductName1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}





	@Test
	public void testGetProductNameKana() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}




	@Test
	public void testGetPrice() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 1;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 123456789;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}




	@Test
	public void testGetImageFileName() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}





	@Test
	public void testGetImageFilePath() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}





	@Test
	public void testGetCount() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setCount(expected);

		assertEquals(expected, dto.getCount());
	}

	@Test
	public void testGetCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 1;

		dto.setCount(expected);

		assertEquals(expected, dto.getCount());
	}

	@Test
	public void testGetCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 123456789;

		dto.setCount(expected);

		assertEquals(expected, dto.getCount());
	}





	@Test
	public void testGetReleaseCompany() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}




	@Test
	public void testGetReleaseDate() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}





	@Test
	public void testGetId() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}



	@Test
	public void testGetProductId() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}





	@Test
	public void testGetRegistDate() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}

	@Test
	public void testGetRegistDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setRegistDate(expected);

		assertEquals(expected, dto.getRegistDate());
	}



	@Test
	public void testGetProductCount() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "aaa";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "AAA";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あああ";

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}
}
