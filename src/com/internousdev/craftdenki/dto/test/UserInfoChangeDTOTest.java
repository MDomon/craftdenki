package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.UserInfoChangeDTO;

public class UserInfoChangeDTOTest {




	@Test
	public void testGetUserId1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());

	}

	@Test
	public void testGetUserId5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}













	@Test
	public void testGetPassword1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());

	}

	@Test
	public void testGetPassword5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}














	@Test
	public void testGetFamilyName1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());

	}

	@Test
	public void testGetFamilyName5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}
















	@Test
	public void testGetFirstName1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());

	}

	@Test
	public void testGetFirstName5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}















	@Test
	public void testGetFamilyNameKana1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());

	}

	@Test
	public void testGetFamilyNameKana5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

















	@Test
	public void testGetFirstNameKana1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());

	}

	@Test
	public void testGetFirstNameKana5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}













	@Test
	public void testGetSex1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 0;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 1;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 12345678;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}
















	@Test
	public void testGetEmail1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());

	}

	@Test
	public void testGetEmail5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}













	@Test
	public void testGetQuestion1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 0;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}

	@Test
	public void testGetQuestion2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 1;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}

	@Test
	public void testGetQuestion3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		int expected = 12345678;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}















	@Test
	public void testGetAnswer1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());

	}

	@Test
	public void testGetAnswer5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}















	@Test
	public void testGetUserId21() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId22() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId23() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId24() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());

	}

	@Test
	public void testGetUserId25() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId26() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId27() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}













	@Test
	public void testGetUserAddress1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());

	}

	@Test
	public void testGetUserAddress5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}












	@Test
	public void testGetUserAddress21() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress22() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress23() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress24() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());

	}

	@Test
	public void testGetUserAddress25() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress26() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress27() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}














	@Test
	public void testGetUserAddress31() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress32() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress33() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress34() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());

	}

	@Test
	public void testGetUserAddress35() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress36() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress37() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}















	@Test
	public void testGetTelNumber1() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());

	}

	@Test
	public void testGetTelNumber5() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}














	@Test
	public void testGetTelNumber21() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber22() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber23() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber24() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());

	}

	@Test
	public void testGetTelNumber25() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber26() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber27() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}













	@Test
	public void testGetTelNumber31() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "0";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber32() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = null;

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber33() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber34() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = " 　";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());

	}

	@Test
	public void testGetTelNumber35() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "aaaa";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber36() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "AAAA";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber37() {
		UserInfoChangeDTO dto = new UserInfoChangeDTO();
		String expected = "ああああ";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

}
