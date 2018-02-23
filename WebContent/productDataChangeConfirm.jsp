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
<title>商品情報変更確認画面</title>


</head>
<body class="back-image step4">
	<div class="main">
		<div id="m-title">
			<p>商品情報変更確認画面</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<div class="m-log">
			<s:form action="ProductDataChangeCompleteAction">

							<s:hidden name="id" value="%{id}"/>

							<br>新商品ID　　　　:　
							<span><s:property value="productId" /></span>
							<s:hidden name="productId" value="%{productId}"/>

							<br>
							<br>
							<br>商品名　　　　　:　
							<span><s:property value="productName" /></span>
							<s:hidden name="productName" value="%{productName}" />

							<br>
							<br>
							<br>商品名かな　　　:　
							<span><s:property value="productNameKana" /></span>
							<s:hidden name="productNameKana" value="%{productNameKana}" />

							<br>
							<br>
							<br> 商品詳細　　　　:　
							<span><s:property value="productDescription" /></span>
							<s:hidden name="productDescription" value="%{productDescription}" />

							<br>
							<br>
							<br> カテゴリID　　　:　
							<span><s:property value="categoryName" /></span>
							<s:hidden name="categoryId" value="%{categoryId}" />

							<br>
							<br>
							<br> 販売価格　　　　:　
							<span><s:property value="price" /></span>
							<s:hidden name="price" value="%{price}" />

							<br>
							<br>
							<br> 発売年月　　　　:　
							<span><s:property value="releaseDate" /></span>
							<s:hidden name="releaseDate" value="%{releaseDate}" />

							<br>
							<br>
							<br> 発売会社　　　　:　
							<span><s:property value="releaseCompany" /></span>
							<s:hidden name="releaseCompany" value="%{releaseCompany}" />

							<br>
							<br>
							<br> 画像ファイル名　:　
							<span><s:property value="imageFileName" /></span>
							<s:hidden name="imageFileName" value="%{imageFileName}" />

							<p>以上でよろしいですか？</p>
							<s:submit value="はい"/>
			</s:form>
				<input type="button" value="いいえ" onClick="history.back()">
				<br>
		</div>

	</div>
</body>
</html>