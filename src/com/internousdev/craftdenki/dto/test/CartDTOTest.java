package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.CartDTO;

public class CartDTOTest {


	@Test
	public void testGetProductId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2() {
		CartDTO dto = new CartDTO();
		int expected = 1;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		CartDTO dto = new CartDTO();
		int expected = 12345678;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}






	@Test
	public void testGetId1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		CartDTO dto = new CartDTO();
		int expected = 1;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		CartDTO dto = new CartDTO();
		int expected = 12345678;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}




	@Test
	public void testGetTotalPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 1;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}

	@Test
	public void testGetTotalPrice3() {
		CartDTO dto = new CartDTO();
		int expected = 12345678;

		dto.setTotalPrice(expected);

		assertEquals(expected, dto.getTotalPrice());
	}







	public void testGetProductName1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName2() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName3() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName4() {
		CartDTO dto = new CartDTO();
		String expected = " 　";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());

	}

	@Test
	public void testGetProductName5() {
		CartDTO dto = new CartDTO();
		String expected = "aaaa";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName6() {
		CartDTO dto = new CartDTO();
		String expected = "AAAA";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName7() {
		CartDTO dto = new CartDTO();
		String expected = "ああああ";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}



	public void testGetProductNameKana1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		CartDTO dto = new CartDTO();
		String expected = " 　";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());

	}

	@Test
	public void testGetProductNameKana5() {
		CartDTO dto = new CartDTO();
		String expected = "aaaa";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		CartDTO dto = new CartDTO();
		String expected = "AAAA";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		CartDTO dto = new CartDTO();
		String expected = "ああああ";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}



	public void testGetImageFilePath1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		CartDTO dto = new CartDTO();
		String expected = " 　";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());

	}

	@Test
	public void testGetImageFilePath5() {
		CartDTO dto = new CartDTO();
		String expected = "aaaa";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath6() {
		CartDTO dto = new CartDTO();
		String expected = "AAAA";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath7() {
		CartDTO dto = new CartDTO();
		String expected = "ああああ";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}




	@Test
	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		int expected = 1;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		int expected = 12345678;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}






	@Test
	public void testGetProductCount1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount2() {
		CartDTO dto = new CartDTO();
		int expected = 1;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}

	@Test
	public void testGetProductCount3() {
		CartDTO dto = new CartDTO();
		int expected = 12345678;

		dto.setProductCount(expected);

		assertEquals(expected, dto.getProductCount());
	}




	public void testGetReleaseCompany1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		CartDTO dto = new CartDTO();
		String expected = " 　";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());

	}

	@Test
	public void testGetReleaseCompany5() {
		CartDTO dto = new CartDTO();
		String expected = "aaaa";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany6() {
		CartDTO dto = new CartDTO();
		String expected = "AAAA";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany7() {
		CartDTO dto = new CartDTO();
		String expected = "ああああ";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}


	public void testGetReleaseDate1() {
		CartDTO dto = new CartDTO();
		String expected = "0";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate2() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate3() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate4() {
		CartDTO dto = new CartDTO();
		String expected = " 　";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());

	}

	@Test
	public void testGetReleaseDate5() {
		CartDTO dto = new CartDTO();
		String expected = "aaaa";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate6() {
		CartDTO dto = new CartDTO();
		String expected = "AAAA";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate7() {
		CartDTO dto = new CartDTO();
		String expected = "ああああ";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}


}
