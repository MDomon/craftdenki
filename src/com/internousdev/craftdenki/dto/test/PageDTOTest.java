package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.PageDTO;

public class PageDTOTest {

	@Test
	public void testGetPageCount1() {
		PageDTO dto = new PageDTO();
		int expected = 0;

		dto.setPageCount(expected);

		assertEquals(expected, dto.getPageCount());
	}

	@Test
	public void testGetPageCount2() {
		PageDTO dto = new PageDTO();
		int expected = 1;

		dto.setPageCount(expected);

		assertEquals(expected, dto.getPageCount());
	}

	@Test
	public void testGetPageCount3() {
		PageDTO dto = new PageDTO();
		int expected = 12345678;

		dto.setPageCount(expected);

		assertEquals(expected, dto.getPageCount());
	}
}
