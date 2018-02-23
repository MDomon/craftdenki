package com.internousdev.craftdenki.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.craftdenki.dto.LoginDTO;

public class LoginDTOTest {

	@Test
	public void testGetLoginId1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());

	}

	@Test
	public void testGetLoginId5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}

	@Test
	public void testGetLoginId7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setLoginId(expected);

		assertEquals(expected, dto.getLoginId());
	}













	@Test
	public void testGetLoginPass1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}

	@Test
	public void testGetLoginPass7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setLoginPass(expected);

		assertEquals(expected, dto.getLoginPass());
	}












	@Test
	public void testGetFirstName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setFirstName(expected);

		assertEquals(expected, dto.getFirstName());
	}















	@Test
	public void testGetFamilyName1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setFamilyName(expected);

		assertEquals(expected, dto.getFamilyName());
	}














	@Test
	public void testGetFamilyNamekana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}

	@Test
	public void testGetFamilyNamekana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setFamilyNamekana(expected);

		assertEquals(expected, dto.getFamilyNamekana());
	}














	@Test
	public void testGetFirstNamekana1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}

	@Test
	public void testGetFirstNamekana7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setFirstNamekana(expected);

		assertEquals(expected, dto.getFirstNamekana());
	}























	@Test
	public void testGetSex1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}

	@Test
	public void testGetSex7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setSex(expected);

		assertEquals(expected, dto.getSex());
	}















	@Test
	public void testGetMail1() {
		LoginDTO dto = new LoginDTO();
		String expected = "0";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail2() {
		LoginDTO dto = new LoginDTO();
		String expected = null;

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail3() {
		LoginDTO dto = new LoginDTO();
		String expected = "";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail4() {
		LoginDTO dto = new LoginDTO();
		String expected = " 　";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail5() {
		LoginDTO dto = new LoginDTO();
		String expected = "aaaa";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail6() {
		LoginDTO dto = new LoginDTO();
		String expected = "AAAA";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}

	@Test
	public void testGetMail7() {
		LoginDTO dto = new LoginDTO();
		String expected = "ああああ";

		dto.setMail(expected);

		assertEquals(expected, dto.getMail());
	}


}
