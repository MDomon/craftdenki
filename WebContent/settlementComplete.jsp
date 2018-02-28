<%@ page language="java" contentType="text/html; charset=UTF8"
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
<meta http-equiv="refresh"
	content="3;URL=<s:url action='StartAction' />">
<title>決済完了画面</title>

<link href="css/craftdenki.css" rel="stylesheet">
<style>
</style>

</head>
<body>
	<jsp:include page="home2.jsp" />

	<div class="main">

<div class="empty">


		<h3>購入完了画面</h3>

		<div class="center">

			<h2>購入が完了しました。3秒後に自動でHome画面に戻ります。</h2>
			<span>自動で切り替わらない場合には<a href='<s:url action="StartAction"/>'>こちら</a></span>
		</div>

</div>

	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>