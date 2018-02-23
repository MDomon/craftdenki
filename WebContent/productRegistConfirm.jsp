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
<title>新商品登録確認画面</title>

</head>
<body class="back-image step3">
	<div class="main">
		<div id="m-title">
			<p>新商品登録確認画面</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<div class="m-log">
			<s:form action="ProductRegistCompleteAction" theme="simple">
						<div>

							<br>新商品ID　　　　:　
							<s:property value="newProductId" />
							<s:hidden name="newProductId" value="%{newProductId}" />

							<br>
							<br>
							<br>商品名　　　　　:　
							<s:property value="newProductName" />
							<s:hidden name="newProductName" value="%{newProductName}" />

							<br>
							<br>
							<br>商品名かな　　　:　
							<s:property value="newProductNameKana" />
							<s:hidden name="newProductNameKana" value="%{newProductNameKana}" />

							<br>
							<br>
							<br> 商品詳細　　　　:　
							<s:property value="newProductDescription" />
							<s:hidden name="newProductDescription" value="%{newProductDescription}" />

							<br>
							<br>
							<br> カテゴリID　　　:　
							<s:property value="categoryName" />
							<s:hidden name="newCategoryId" value="%{newCategoryId}" />

							<br>
							<br>
							<br> 販売価格　　　　:　
							<s:property value="newBuyPrice" />
							<s:hidden name="newBuyPrice" value="%{newBuyPrice}" />

							<br>
							<br>
							<br> 発売年月　　　　:　
							<s:property value="newReleaseDate" />
							<s:hidden name="newReleaseDate" value="%{newReleaseDate}" />

							<br>
							<br>
							<br> 発売会社　　　　:　
							<s:property value="newReleaseCompany" />
							<s:hidden name="newReleaseCompany" value="%{newReleaseCompany}" />

							<br>
							<br>
							<br> 画像ファイル名　:　
							<s:property value="newProductImage" />
							<s:hidden name="newProductImage" value="%{newProductImage}" />

							<p>以上でよろしいですか？</p>
							<s:submit value="はい"/>
						</div>
			</s:form>
							<input type="button" value="いいえ" onClick="history.back()">
							<br>
						</div>

		</div>
</body>
</html>