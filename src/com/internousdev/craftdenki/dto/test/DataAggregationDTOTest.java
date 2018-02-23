package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.DataAggregationDTO;

public class DataAggregationDTOTest {

	@Test
	public void testGetAllAvgPrice() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}

	@Test
	public void testGetAllAvgPrice7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllAvgPrice(expected);

		assertEquals(expected, dto.getAllAvgPrice());
	}





	@Test
	public void testGetAllAvgCost() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}

	@Test
	public void testGetAllAvgCost7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllAvgCost(expected);

		assertEquals(expected, dto.getAllAvgCost());
	}




	@Test
	public void testGetAllTotalCount() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}

	@Test
	public void testGetAllTotalCount7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllTotalCount(expected);

		assertEquals(expected, dto.getAllTotalCount());
	}





	@Test
	public void testGetAllTotalSales() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}

	@Test
	public void testGetAllTotalSales7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllTotalSales(expected);

		assertEquals(expected, dto.getAllTotalSales());
	}





	@Test
	public void testGetAllTotalCost() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}

	@Test
	public void testGetAllTotalCost7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllTotalCost(expected);

		assertEquals(expected, dto.getAllTotalCost());
	}



	@Test
	public void testGetAllTotalProfit() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "0";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit2() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "null";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit3() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit4() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = " ";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit5() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "aaa";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit6() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "AAA";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

	@Test
	public void testGetAllTotalProfit7() {
		DataAggregationDTO dto = new DataAggregationDTO();
		String expected = "あああ";

		dto.setAllTotalProfit(expected);

		assertEquals(expected, dto.getAllTotalProfit());
	}

}
