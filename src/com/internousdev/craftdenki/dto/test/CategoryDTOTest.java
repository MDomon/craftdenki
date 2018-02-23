package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.CategoryDTO;


public class CategoryDTOTest {

	@Test
	public void testGetId1() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}


	@Test
	public void testGetId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}



	@Test
	public void testGetCategoryId() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}
	@Test
	public void testGetCategoryId2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
		}

	@Test
	public void testGetCategoryId3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}

	@Test
	public void testGetCategoryId7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setCategoryId(expected);

		assertEquals(expected, dto.getCategoryId());
	}





	@Test
	public void testGetCategoryName() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}
	@Test
	public void testGetCategoryName2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}

	@Test
	public void testGetCategoryName7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setCategoryName(expected);

		assertEquals(expected, dto.getCategoryName());
	}




	@Test
	public void testGetCategoryDescription() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}
	@Test
	public void testGetCategoryDescription2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}

	@Test
	public void testGetCategoryDescription7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setCategoryDescription(expected);

		assertEquals(expected, dto.getCategoryDescription());
	}






	@Test
	public void testGetInsertDate() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}
	@Test
	public void testGetInsertDate2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}

	@Test
	public void testGetInsertDate7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setInsertDate(expected);

		assertEquals(expected, dto.getInsertDate());
	}





	@Test
	public void testGetUpdateDate() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "0";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}
	@Test
	public void testGetUpdateDate2() {
		CategoryDTO dto = new CategoryDTO();
		String expected = null;

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate3() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate4() {
		CategoryDTO dto = new CategoryDTO();
		String expected = " ";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate5() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "aaa";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate6() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "AAA";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate7() {
		CategoryDTO dto = new CategoryDTO();
		String expected = "あああ";

		dto.setUpdateDate(expected);

		assertEquals(expected, dto.getUpdateDate());
	}

}
