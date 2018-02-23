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
<title>商品変更画面</title>


</head>
<body class="back-image step3">
	<div class="main">
		<div id="m-title">
			<p>商品変更画面</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<div class="errorMessage">
			<s:iterator value="errorMessageList">
				<s:div>
					<s:property />
				</s:div>
			</s:iterator>
		</div>
		<div class="input-form">
			<s:form action="CheckProductChangeAction" >
				<s:hidden name="id" value="%{id}"/>
				<span>商品ID</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="productId" value="%{productId}" placeholder="半角数字8桁 例)12345678"/>
					<label for="dynamic-label-input">半角数字8桁 例)12345678</label>
				</div>

				<span>商品名</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield name="productName" value="%{productName}" placeholder="50字以内 例)除脂肪メソッド8"/>
					<label for="dynamic-label-input">50字以内 例)除脂肪メソッド</label>
				</div>

				<span>商品名かな</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield name="productNameKana" value="%{productNameKana}" placeholder="ひらがな 例)じょしぼうめそっど"/>
					<label for="dynamic-label-input">ひらがな 例)じょしぼうめそっど</label>
				</div>

				<span>商品詳細</span>
				<div>
					<s:textarea name="productDescription" value="%{productDescription}" placeholder="250字以内 例)岡田隆先生の著書。ダイエット・減量の入門書!!"/>
					<label for="dynamic-label-input">250字以内 例)岡田隆先生の著書。ダイエット・減量の入門書!!</label>
				</div>

				<span>カテゴリID</span>
				<span class="hissu">必須</span>
				<div>
					<s:select name="categoryId" list="categoryList" listValue="categoryName" listKey="categoryId">
					</s:select>
				</div>

				<span>販売価格</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield name="price" value="%{price}" placeholder="半角数字 例)1300"/>
					<label for="dynamic-label-input">半角数字 例)1300</label>
				</div>

				<span>画像ファイル名</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield name="imageFileName" value="%{imageFileName}" placeholder="ファイル名.拡張子 例)bazooka"/>
					<label for="dynamic-label-input">ファイル名.拡張子 例)bazooka</label>
				</div>

				<span>発売年月</span>
				<div>
					<s:textfield name="releaseDate" value="%{releaseDate}" placeholder="yyyy/MM 例)2018年2月は2017/02"/>
					<label for="dynamic-label-input">yyyy/MM 例)2018年2月は2017/02</label>
				</div>

				<span>発売会社</span>
				<div>
					<s:textfield name="releaseCompany" value="%{releaseCompany}" placeholder="16字以内 例)ベースボール・マガジン社"/>
					<label for="dynamic-label-input">16字以内 例)ベースボール・マガジン社</label>
				</div>

				<s:submit value="登録"/>
			</s:form>
		</div>
	</div>
</body>
</html>