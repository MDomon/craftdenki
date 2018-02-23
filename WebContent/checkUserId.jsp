<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link href="css/craftdenki.css" rel="stylesheet">
<link rel="shortcut icon" href="/icons/favicon.ico">
<title>ログインID確認画面</title>



<style type="text/css">
.kageyama {
	text-align: center;
	padding-top:10px;
}

.kageyama2 {
	float: left;
}

.kageyama3 {
	padding-left: 50%;
}
.error{
	color:red;
}
</style>


</head>

<body>
	<jsp:include page="home2.jsp" />
	<div class="main">


		<h3>パスワード変更画面</h3>
		<p>※パスワードを忘れた方はログインIDを入力してください</p>
		<div class="kageyama">
			<s:form action="CheckUserIdAction">
				<table>
					<tr>
						<td><div class="kageyama2">ログインID</div></td>
					</tr>
					<tr>
						<td><div class="error">
						<s:property value="errorMessage" escape="false" /></div>
						</td>
					</tr>
					<tr>
						<td><div class="kageyama2">
								<input type="text" name="userId" />
							</div></td>
					</tr>

				</table>

				<div class="kageyama3">
					<s:submit value="確認" />
				</div>
			</s:form>
		</div>

	</div>
	<!--
			<s:form action="CheckUserIdAction">

				<label>ログインID</label>
				<span><input type="text" name="userId" value="test" /></span>
				<br>


				<s:submit value="確認" />
			</s:form>


-->

	<jsp:include page="footer.jsp" />
</body>
</html>