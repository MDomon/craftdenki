<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link href="css/craftdenki.css" rel="stylesheet">

<title>Password確認</title>

<style type="text/css">
.center{
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="home2.jsp" />
	<div class="main">

		<h3>パスワード変更画面</h3>


		<div class="center">
			<p>ログインPASS:</p>
			<s:property value="password" escape="false" />
			<input type="hidden" value="%{password}" /> <input type="hidden"
				value="%{userId}" /> <input type="hidden" value="%{answer}" />



			<s:form action="ChangePasswordCompleteAction">
				<s:submit value="完了" />
			</s:form>

		</div>
		<!--

		02/16 勝手にCSSいじらせていただきました（中途半端でごめんなさい）sano





				<s:form action="ChangePasswordCompleteAction">
					<tr id="box">
						<td>
							<label>ログインPASS：</label>
						</td>
						<td>
							<s:property value="password" escape="false" />
							<input type="hidden" value="%{password}"/>
							<input type="hidden" value="%{userId}"/>
							<input type="hidden" value="%{answer}"/><br>
						</td>
					</tr>

					<tr>
						<td>
							<s:submit value="完了" />
						</td>
					</tr>
				</s:form>

-->
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>