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



<meta http-equiv="refresh"
	content="3;URL=<s:url action='GoMyPageAction' />">



<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>UserInfoChangeComplete画面</title>

<style type="text/css">
</style>

<link href="css/craftdenki.css" rel="stylesheet">


</head>
<body>

	<jsp:include page="home2.jsp" />
	<div class="main">
		<div class="wideBox">

			<h3>変更完了</h3>

			<ol class="stepBar">
				<li class="visited"><span>1</span><br>必要事項の入力</li>
				<li class="visited"><span>2</span><br>入力内容の確認</li>
				<li class="visited"><span>3</span><br>変更完了</li>
			</ol>

			ユーザー情報を変更しました。３秒後に自動的にマイページ画面に切り替わります。<br> 自動で切り替わらない場合は <a
				href='<s:url action="GoMyPageAction"/>'>こちら</a>

		</div>
	</div>
	<jsp:include page="footer.jsp" />

</body>
</html>