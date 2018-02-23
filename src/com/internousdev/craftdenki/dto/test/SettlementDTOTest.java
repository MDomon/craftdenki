package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.SettlementDTO;

public class SettlementDTOTest {



	@Test
	public void testGetFamilyName1() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}





	@Test
	public void testGetUserAddress1() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress2a() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress3a() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress4() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress5() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress6() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress7() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}




	@Test
	public void testGetUserAddress21() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress22() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress23() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress24() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress25() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress26() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress27() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}



	@Test
	public void testGetUserAddress31() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress32() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress33() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress34() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress35() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress36() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress37() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}



	@Test
	public void testGetTelNumber1() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber2a() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber3a() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber5() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}



	@Test
	public void testGetTelNumber21() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber22() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber23() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber24() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber25() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber26() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber27() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}



	@Test
	public void testGetTelNumber31() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber32() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber33() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber34() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber35() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber36() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber37() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}




	@Test
	public void testGetEmail1() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail5() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}




	public void testGetAtCost1() {
		SettlementDTO dto = new SettlementDTO();
		int expected = 0;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}

	@Test
	public void testGetAtCost2() {
		SettlementDTO dto = new SettlementDTO();
		int expected = 1;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}

	@Test
	public void testGetAtCost3() {
		SettlementDTO dto = new SettlementDTO();
		int expected = 12345678;

		dto.setAtCost(expected);

		assertEquals(expected, dto.getAtCost());
	}



	@Test
	public void testGetImageFilePath1() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "0";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "null";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		SettlementDTO dto = new SettlementDTO();
		String expected = " 　";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath5() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "aaa";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath6() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "AAA";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath7() {
		SettlementDTO dto = new SettlementDTO();
		String expected = "あああ";

		dto.setImageFilePath(expected);

		assertEquals(expected, dto.getImageFilePath());
	}

}
