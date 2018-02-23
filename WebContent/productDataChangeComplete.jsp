<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/craftdenki.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>商品情報変更</title>


</head>
<body class="back-image step5">
	<div class="main">
		<div id="m-title">
			<p>商品情報変更完了画面</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<div class="m-log">
			商品情報を変更しました
			<s:form action="ProductDetailsAction">
				<s:hidden name="product_id" value="%{product_id}"/>
				<s:submit value="確認"/>
			</s:form>
		</div>
	</div>
</body>
</html>