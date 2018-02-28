<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>UserInfoChangeConfirm画面</title>

<style type="text/css">
</style>

<link href="css/craftdenki.css" rel="stylesheet">

</head>
<body>

	<jsp:include page="home2.jsp" />
	<div class="main">
		<div class="wideBox">

			<h3>入力内容確認画面</h3>


			<ol class="stepBar">
				<li class="visited"><span>1</span><br>必要事項の入力</li>
				<li class="visited"><span>2</span><br>入力内容の確認</li>
				<li><span>3</span><br>変更完了</li>
			</ol>



			<p>下記内容でユーザー情報を変更します、よろしいですか？</p>
			<br>

			<s:form action="UserInfoChangeCompleteAction">

				<table class="userCreateTable">

					<tr class="userCreateTr">
						<th class="userCreateTh">ユーザーID</th>
						<td><s:property value="session.t_userId" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">新パスワード</th>
						<td><s:property value="session.t_password" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">お名前</th>
						<td><s:property value="session.t_familyName" /> <span
							style="margin-left: 1em;"></span> <s:property
								value="session.t_firstName" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">ふりがな</th>
						<td><s:property value="session.t_familyNameKana" /> <span
							style="margin-left: 1em;"></span> <s:property
								value="session.t_firstNameKana" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">性別</th>
						<td><s:if test="session.t_sex==0">男</s:if> <s:if
								test="session.t_sex==1">女</s:if></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">メールアドレス</th>
						<td><s:property value="session.t_email" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">秘密の質問</th>
						<td><s:if test="session.t_question==1">嫌いな食べ物は？</s:if> <s:if
								test="session.t_question==2">母親の旧姓は？</s:if> <s:if
								test="session.t_question==3">好きな動物は？</s:if></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">答え</th>
						<td><s:property value="session.t_answer" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">住所１</th>
						<td><s:property value="session.t_userAddress" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">住所２</th>
						<td><s:property value="session.t_userAddress2" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">住所３</th>
						<td><s:property value="session.t_userAddress3" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">電話番号１</th>
						<td><s:property value="session.t_telNumber" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">電話番号２</th>
						<td><s:property value="session.t_telNumber2" /></td>
					</tr>

					<tr class="userCreateTr">
						<th class="userCreateTh">電話番号３</th>
						<td><s:property value="session.t_telNumber3" /></td>
					</tr>

				</table>

				<br>
				<s:submit value="変更する" class="userCreateButton" />

			</s:form>
			<br> <input type="button" class="userCreateButton"
				value="ユーザー情報変更画面に戻る" onclick="history.back()" />

		</div>
	</div>
	<jsp:include page="footer.jsp" />

</body>
</html>