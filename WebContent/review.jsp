<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="Review2Action">
		<table>
			<tr>
				<td><s:property value="session.productName" /></td>
			</tr>
			<tr>
				<td><s:textarea name="review" rows="10" cols="60"></s:textarea></td>
			</tr>
			<tr>
				<td>☆： <select name="evaluationCount">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
				</select></td>
			</tr>
			<tr>
				<td><s:submit value="レビュー" /></td>
			</tr>
		</table>
	</s:form>

</body>

</html>