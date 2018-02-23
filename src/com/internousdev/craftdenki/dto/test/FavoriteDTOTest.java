package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.FavoriteDTO;


public class FavoriteDTOTest {

	@Test
	public void testGetProductName1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}


	@Test
	public void testGetProductName3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}

	@Test
	public void testGetProductName4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}


	@Test
	public void testGetProductName5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}


	@Test
	public void testGetProductName6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}


	@Test
	public void testGetProductName7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setProductName(expected);

		assertEquals(expected, dto.getProductName());
	}


	@Test
	public void testGetProductNameKana1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setProductNameKana(expected);

		assertEquals(expected, dto.getProductNameKana());
	}

	@Test
	public void testGetImageFilePath1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFileName1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}
	@Test
	public void testGetImageFileName6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetImageFileName7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setImageFileName(expected);

		assertEquals(expected, dto.getImageFileName());
	}

	@Test
	public void testGetPrice1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetPrice7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	@Test
	public void testGetReleaseCompany1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setReleaseCompany(expected);

		assertEquals(expected, dto.getReleaseCompany());
	}

	@Test
	public void testGetReleaseDate1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setReleaseDate(expected);

		assertEquals(expected, dto.getReleaseDate());
	}

	@Test
	public void testGetProductId1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetProductId7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setProductId(expected);

		assertEquals(expected, dto.getProductId());
	}

	@Test
	public void testGetId1() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "0";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = null;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = " 　";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId5() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "aaaa";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId6() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "AAAA";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId7() {
		FavoriteDTO dto = new FavoriteDTO();
		String expected = "ああああ";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

}
