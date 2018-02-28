<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
	<title>MyPage</title>

	<link href="css/craftdenki.css" rel="stylesheet">

</head>
<body>

	<jsp:include page="home2.jsp" />

	<div class="main">
		<div class="wideBox">

			<h3>マイページ</h3>

			<table class="myPageTable">
				<tr class="myPageTr">
					<th class="myPageTh">氏名(ふりがな)</th>
					<td class="myPageTd">
					<s:property value="session.familyName"/>
					<span style="margin-left:0.3em;" ></span>
					<s:property value="session.firstName"/>
					(<s:property value="session.familyNameKana"/>
					<span style="margin-left:0.3em;" ></span>
					<s:property value="session.firstNameKana"/>)
					</td>

				<tr class="myPageTr">
					<th class="myPageTh">性別</th>
					<td class="myPageTd">
					<s:if test="session.sex==0">男性</s:if>
					<s:if test="session.sex==1">女性</s:if>
					</td>
				</tr>


				<tr class="myPageTr">
					<th class="myPageTh">メールアドレス</th>
					<td class="myPageTd">
					<s:property value="session.mail"/></td>
				</tr>


			</table>


			<div class="myPageButtonBox">
				<s:form action="PurchaseHistoryAction">
					<s:submit value="購入履歴" class="myPageButton history"/>
				</s:form>


				<s:form action="FavoriteAction">
					<s:submit value="お気に入りリスト" class="myPageButton favorite"/>
				</s:form>


				<s:form action="UserInfoChangeAction">
					<s:submit value="ユーザー情報変更" class="myPageButton info"/>
				</s:form>

				<div class="clear"></div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"/>

</body>
</html>