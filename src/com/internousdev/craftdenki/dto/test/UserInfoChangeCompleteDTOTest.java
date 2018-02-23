package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.UserInfoChangeCompleteDTO;

public class UserInfoChangeCompleteDTOTest {





	@Test
	public void testGetUserId1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());

	}

	@Test
	public void testGetUserId5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}

	@Test
	public void testGetUserId7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setUserId(expected);

		assertEquals(expected, dto.getUserId());
	}













	@Test
	public void testGetPassword1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());

	}

	@Test
	public void testGetPassword5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}

	@Test
	public void testGetPassword7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setPassword(expected);

		assertEquals(expected, dto.getPassword());
	}














	@Test
	public void testGetFamilyName1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());

	}

	@Test
	public void testGetFamilyName5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}
















	@Test
	public void testGetFirstName1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());

	}

	@Test
	public void testGetFirstName5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}















	@Test
	public void testGetFamilyNameKana1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());

	}

	@Test
	public void testGetFamilyNameKana5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setFamilyNameKana(expected);

		assertEquals(expected, dto.getFamilyNameKana());
	}

















	@Test
	public void testGetFirstNameKana1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());

	}

	@Test
	public void testGetFirstNameKana5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setFirstNameKana(expected);

		assertEquals(expected, dto.getFirstNameKana());
	}













	@Test
	public void testGetSex1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 0;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 1;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 12345678;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}
















	@Test
	public void testGetEmail1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());

	}

	@Test
	public void testGetEmail5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}

	@Test
	public void testGetEmail7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setEmail(expected);

		assertEquals(expected, dto.getEmail());
	}













	@Test
	public void testGetQuestion1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 0;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}

	@Test
	public void testGetQuestion2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 1;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}

	@Test
	public void testGetQuestion3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		int expected = 12345678;

		dto.setQuestion(expected);

		assertEquals(expected, dto.getQuestion());
	}















	@Test
	public void testGetAnswer1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());

	}

	@Test
	public void testGetAnswer5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}

	@Test
	public void testGetAnswer7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setAnswer(expected);

		assertEquals(expected, dto.getAnswer());
	}















	@Test
	public void testGetUserId21() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId22() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId23() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId24() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());

	}

	@Test
	public void testGetUserId25() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId26() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}

	@Test
	public void testGetUserId27() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setUserId2(expected);

		assertEquals(expected, dto.getUserId2());
	}













	@Test
	public void testGetUserAddress1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());

	}

	@Test
	public void testGetUserAddress5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}

	@Test
	public void testGetUserAddress7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setUserAddress(expected);

		assertEquals(expected, dto.getUserAddress());
	}












	@Test
	public void testGetUserAddress21() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress22() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress23() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress24() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());

	}

	@Test
	public void testGetUserAddress25() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress26() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}

	@Test
	public void testGetUserAddress27() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setUserAddress2(expected);

		assertEquals(expected, dto.getUserAddress2());
	}














	@Test
	public void testGetUserAddress31() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress32() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress33() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress34() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());

	}

	@Test
	public void testGetUserAddress35() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress36() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}

	@Test
	public void testGetUserAddress37() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setUserAddress3(expected);

		assertEquals(expected, dto.getUserAddress3());
	}















	@Test
	public void testGetTelNumber1() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());

	}

	@Test
	public void testGetTelNumber5() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setTelNumber(expected);

		assertEquals(expected, dto.getTelNumber());
	}














	@Test
	public void testGetTelNumber21() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber22() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber23() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber24() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());

	}

	@Test
	public void testGetTelNumber25() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber26() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}

	@Test
	public void testGetTelNumber27() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setTelNumber2(expected);

		assertEquals(expected, dto.getTelNumber2());
	}













	@Test
	public void testGetTelNumber31() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "0";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber32() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = null;

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber33() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber34() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = " 　";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());

	}

	@Test
	public void testGetTelNumber35() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "aaaa";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber36() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "AAAA";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

	@Test
	public void testGetTelNumber37() {
		UserInfoChangeCompleteDTO dto = new UserInfoChangeCompleteDTO();
		String expected = "ああああ";

		dto.setTelNumber3(expected);

		assertEquals(expected, dto.getTelNumber3());
	}

}
