package com.internousdev.craftdenki.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.struts2.interceptor.SessionAware;

public class RandomTokenizer implements SessionAware{
    private static int TOKEN_LENGTH = 16;  //16*2=32バイト
    private Map<String,Object> session;

	public String getRandomToken(){
		byte token[] = new byte[TOKEN_LENGTH];
	        StringBuffer buf = new StringBuffer();
	        SecureRandom random = null;
	        String tokenString = null;

	        try {
	            random = SecureRandom.getInstance("SHA1PRNG");
	            random.nextBytes(token);

	            for(int i = 0; i < token.length; i++) {
	                buf.append(String.format("%02x", token[i]));
	            }
	            tokenString = buf.toString();

	            System.out.println("String.format： " + tokenString);
	            System.out.println("DatatypeConverter： " + DatatypeConverter.printHexBinary(token));
	        } catch(NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return DatatypeConverter.printHexBinary(token);

	}


	public boolean checkToken(Map<String,Object> session){
		String token=null;
		String nextToken=null;

		if(session.containsKey("nextToken")){
			token=String.valueOf(session.get("token"));
			nextToken=String.valueOf(session.get("nextToken"));
			System.out.println("TOKEN       :" + token);
			System.out.println("NEXTTOKEN   :" + nextToken);
			if(token.equals(nextToken)){
				return true;
			}
		}else{
			RandomTokenizer t = new RandomTokenizer();
			token=t.getRandomToken();
			System.out.println("TOKEN       :" + token);
			System.out.println("NEXTTOKEN   :" + nextToken);
			session.put("token", token);
			return false;
		}

		
		
//		
//		System.out.println(String.valueOf(session.get("token")));
//		if((String.valueOf(session.get("token"))==null)){
//			RandomTokenizer t = new RandomTokenizer();
//			nextToken=t.getRandomToken();
//			session.put("token", token);
//			session.put("nextToken",nextToken);
//		}
//
//		token=String.valueOf(session.get("token"));
//		nextToken=String.valueOf(session.get("nextToken"));
//
//
//		if(token!=nextToken){
//			RandomTokenizer t = new RandomTokenizer();
//			nextToken=t.getRandomToken();
//			session.put("token", token);
//			session.put("nextToken",nextToken);
//			return false;
//		}else{
//			return true;
//		}
		return false;
	}


	public static int getTOKEN_LENGTH() {
		return TOKEN_LENGTH;
	}


	public static void setTOKEN_LENGTH(int tOKEN_LENGTH) {
		TOKEN_LENGTH = tOKEN_LENGTH;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
