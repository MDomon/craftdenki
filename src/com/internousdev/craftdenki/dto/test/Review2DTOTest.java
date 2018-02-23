package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.craftdenki.dto.Review2DTO;
import com.internousdev.craftdenki.util.DateUtil;

public class Review2DTOTest {

	DateUtil util = new DateUtil();

	@Test
	public void testGetId1() {
		Review2DTO dto = new Review2DTO();
		int expected = 0;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId2() {
		Review2DTO dto = new Review2DTO();
		int expected = 1;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetId3() {
		Review2DTO dto = new Review2DTO();
		int expected = 12345678;

		dto.setId(expected);

		assertEquals(expected, dto.getId());
	}

	@Test
	public void testGetProduct_id1() {
		Review2DTO dto = new Review2DTO();
		int expected = 0;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}

	@Test
	public void testGetProduct_id2() {
		Review2DTO dto = new Review2DTO();
		int expected = 1;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}

	@Test
	public void testGetProduct_id3() {
		Review2DTO dto = new Review2DTO();
		int expected = 12345678;

		dto.setProduct_id(expected);

		assertEquals(expected, dto.getProduct_id());
	}

	@Test
	public void testGetEvaluation_count1() {
		Review2DTO dto = new Review2DTO();
		int expected = 0;

		dto.setEvaluation_count(expected);

		assertEquals(expected, dto.getEvaluation_count());
	}

	@Test
	public void testGetEvaluation_count2() {
		Review2DTO dto = new Review2DTO();
		int expected = 1;

		dto.setEvaluation_count(expected);

		assertEquals(expected, dto.getEvaluation_count());
	}

	@Test
	public void testGetEvaluation_count3() {
		Review2DTO dto = new Review2DTO();
		int expected = 12345678;

		dto.setEvaluation_count(expected);

		assertEquals(expected, dto.getEvaluation_count());
	}

	public void testGetUser_id1() {
		Review2DTO dto = new Review2DTO();
		String expected = "0";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id2() {
		Review2DTO dto = new Review2DTO();
		String expected = null;

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id3() {
		Review2DTO dto = new Review2DTO();
		String expected = "";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id4() {
		Review2DTO dto = new Review2DTO();
		String expected = " 　";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());

	}

	@Test
	public void testGetUser_id5() {
		Review2DTO dto = new Review2DTO();
		String expected = "aaaa";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id6() {
		Review2DTO dto = new Review2DTO();
		String expected = "AAAA";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	@Test
	public void testGetUser_id7() {
		Review2DTO dto = new Review2DTO();
		String expected = "ああああ";

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	public void testGetReview_id1() {
		Review2DTO dto = new Review2DTO();
		String expected = "0";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetReview_id2() {
		Review2DTO dto = new Review2DTO();
		String expected = null;

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetReview_id3() {
		Review2DTO dto = new Review2DTO();
		String expected = "";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetReview_id4() {
		Review2DTO dto = new Review2DTO();
		String expected = " 　";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());

	}

	@Test
	public void testGetReview_id5() {
		Review2DTO dto = new Review2DTO();
		String expected = "aaaa";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetReview_id6() {
		Review2DTO dto = new Review2DTO();
		String expected = "AAAA";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetReview_id7() {
		Review2DTO dto = new Review2DTO();
		String expected = "ああああ";

		dto.setReview_id(expected);

		assertEquals(expected, dto.getReview_id());
	}

	@Test
	public void testGetBuy_item_date1() {
		Review2DTO dto = new Review2DTO();
		Date expected = null;

		dto.setBuy_item_date(expected);

		assertEquals(expected, dto.getBuy_item_date());
	}

	@Test
	public void testGetBuy_item_date2() throws ParseException {

		Review2DTO dto = new Review2DTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String dateStr = "2018/02/20 14:10:30";
		Date formatDate = sdf.parse(dateStr);

		Date expected = formatDate;
		dto.setBuy_item_date(expected);

		assertEquals(expected, dto.getBuy_item_date());
	}

}
