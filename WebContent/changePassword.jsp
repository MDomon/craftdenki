<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<script src="js/jquery-1.8.2.min.js"></script>
<script src="js/jquery.validationEngine.js"></script>
<script src="js/jquery.validationEngine-ja.js"></script>
<link rel="stylesheet" href="css/validationEngine.jquery.css">
<link href="css/craftdenki.css" rel="stylesheet">

<script>
	$(function() {
		jQuery("#form_1").validationEngine();
	});
</script>
<style type="text/css">
.form {
	margin-top: 40px;
	margin-left:23%;
	width: 450px;
	height: 350px;
	border: 1px solid black;
	text-align: right;
	padding-top: 10px;

}

input[type="text"], input[type="password"] {
	width: 250px;
	padding: 5px;
	margin: 5px;
	border-radius: 3px;
}

.q {
	border-bottom: 1px solid black;
	text-align: left;
	margin-top: 10px;
	margin-bottom: 10px;

}

.error {
	color: red;
	float:right;

}

.kageyama4{
	float:left;
}

.kageyama5{
	padding-top:10px;

}
</style>

<title>changePassword画面</title>
</head>
<body>
	<jsp:include page="home2.jsp" />

	<div class="main">

		<h3>パスワード変更画面</h3>


		<div class="form">

			<s:form id="form_1" action="ChangePasswordConfirmAction">
				<table>
					<tr>
						<td>
							<div class="q">
								秘密の質問
								<s:property value="questionMessage" />
							</div>
						</td>
					</tr>

					<tr>
						<td>
							<div class="error">
							<s:property value="errorMessage" escape="false" />
							</div>
						</td>
					</tr>

					<tr>
						<td><div class="kageyama4">答え</div></td>
					</tr>

					<tr>
						<td><input type="text" name="answer" value=""
							class="validate[required]"></td>
					</tr>

					<tr>
						<td><div class="kageyama4">ログインPASS</div></td>
					</tr>

					<tr>
						<td><input type="password" name="password" id="pass" value=""
							class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber]]" /></td>
					</tr>

					<tr>
						<td><div class="kageyama4">確認用</div></td>
					</tr>

					<tr>
						<td><input type="password" name="checkPassword" id="pass2"
							value=""
							class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber],equals[pass]]" /></td>
					</tr>

					<tr>
						<td></td>
						<td><div class="kageyama5">
								<s:submit class="button" value="変更" />
							</div></td>
					</tr>

				</table>
			</s:form>
		</div>

		<!-- 		<div class="form">
			<div class="error">
				<s:property value="errorMessage" escape="false" />
			</div>
			<s:form id="form_1" action="ChangePasswordConfirmAction">

				<div class="q">
					<label>秘密の質問:</label>
					<s:property value="questionMessage" />
					<br>
				</div>
				<label>答え:</label>
				<input type="text" name="answer" value="" class="validate[required]">
				<br>

				<label>ログインPASS:</label>
				<input type="password" name="password" id="pass" value=""
					class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber]]" />
				<br>

				<label>確認用:</label>
				<input type="password" name="checkPassword" id="pass2" value=""
					class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber],equals[pass]]" />
				<br>

				<s:submit class="button" value="変更" />
			</s:form>

		</div>
-->
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>