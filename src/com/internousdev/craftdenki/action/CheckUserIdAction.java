package com.internousdev.craftdenki.action;



import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.craftdenki.dao.CheckUserIdDAO;
import com.internousdev.craftdenki.dto.UserInfoChangeDTO;
import com.opensymphony.xwork2.ActionSupport;


public class CheckUserIdAction extends ActionSupport implements SessionAware{

	private String userId;
	public Map<String, Object> session;
	private String questionMessage;
	private String errorMessage;


	public String execute() throws SQLException{
		String result = ERROR;
		CheckUserIdDAO checkUserIdDAO = new CheckUserIdDAO();
		UserInfoChangeDTO userInfoChangeDTO = new UserInfoChangeDTO();

		userInfoChangeDTO=checkUserIdDAO.select(userId);

		if (userInfoChangeDTO.getQuestion() == 1) {
			questionMessage ="嫌いな食べ物は？";
		} else if (userInfoChangeDTO.getQuestion() == 2) {
			questionMessage ="母の旧姓は？";
		} else {
			questionMessage ="好きな動物は？";
		}

		if(!(userId.equals(userInfoChangeDTO.getUserId()))){
			errorMessage ="ユーザーIDが間違っています！";
			result =ERROR;

		}

		if(userId.equals(userInfoChangeDTO.getUserId())){
				result =SUCCESS;

		}
		session.put("userId", userId);
		return result;

	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getQuestionMessage(){
		return questionMessage;
	}
	public void setQuestionMessage(String questionMessage){
		this.questionMessage = questionMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
}
