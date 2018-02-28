<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/craftdenki.css">
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>商品管理画面</title>


<script type="text/javascript">
    function goCheckSupplyAction(){
        document.getElementById('form').action="CheckSupplyAction";
    }

    function goProductHideConfirmAction(){
        document.getElementById('form').action="ProductHideConfirmAction";
    }
</script>

</head>
<body class="back-image step2">
	<div class="main">
		<s:if test="productList != null">
			<div id="m-title">
				<p>商品管理画面</p>
			</div>
			<!-- メニューバー -->
				<jsp:include page="managerMenu.jsp" />
			<div>
				<p class="m-index">商品一覧</p>
				<div class="errorMessage">
					<s:iterator value="errorSupplyMessageList">
						<s:div>
							<s:property />
						</s:div>
					</s:iterator>
				</div>
				<table class="manageTable">
					<s:form id="form" name="form">
						<tr>
							<th>ID</th>
							<th>商品名</th>
							<th>販売価格</th>
							<th>現在の単価</th>
							<th>在庫数</th>
							<th>仕入数</th>
							<th>仕入単価</th>
							<th>商品情報変更</th>
							<th>商品削除</th>
						</tr>
						<s:iterator value="productList">
							<tr>
								<td><s:property value="product_id"/><s:hidden name="product_id" value="%{product_id}"/></td>
								<td><s:property value="product_name"/><s:hidden name="product_name" value="%{product_name}"/></td>
								<td><s:property value="price"/><s:hidden name="price" value="%{price}"/></td>
								<td><s:property value="current_cost"/></td>
								<td><s:property value="item_stock"/><s:hidden name="item_stock" value="%{item_stock}"/></td>
								<td><s:textfield name="supply_count" value="0" class="numberInput"/></td>
								<td><s:textfield name="supply_cost" value="0" class="numberInput"/></td>
								<td><a href="<s:url action="ProductDataChangeAction">
									<s:param name="product_id" value="%{product_id}"/>
									</s:url>">変更画面へ</a>
								</td>
								<td><s:checkbox name="checkList" value="" fieldValue="%{product_id}" /> </td>
							</tr>
						</s:iterator>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td><s:submit value="仕入" onclick="goCheckSupplyAction();"/></td>
								<td></td>
								<td><s:submit value="削除" onclick="goProductHideConfirmAction();"/></td>
							</tr>
					</s:form>
					<s:form action="ProductRestoreAction">
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td><s:submit value="商品の復元" class="button"/></td>
							</tr>
					</s:form>
				</table>
			</div>
		</s:if>
		<s:else>
			<!-- メニューバー -->
				<jsp:include page="managerMenu.jsp" />
		</s:else>
		<p  class="m-index">新商品登録</p>
		<div class="errorMessage">
			<s:iterator value="errorMessageList">
				<s:div>
					<s:property />
				</s:div>
			</s:iterator>
		</div>
		<div class="input-form">
			<s:form action="CheckProductRegistAction">
				<span>新商品ID</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield name="newProductId" value="%{newProductId}" placeholder="半角数字8桁 例)12345678"/>
					<label for="dynamic-label-input">半角数字8桁 例)12345678</label>
				</div>

				<br>

				<span>商品名</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="newProductName" value="%{newProductName}" placeholder="50字以内 例)除脂肪メソッド"/>
					<label for="dynamic-label-input">50字以内 例)除脂肪メソッド</label>
				</div>

				<br>

				<span>商品名かな</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="newProductNameKana" value="%{newProductNameKana}" placeholder="ひらがな 例)じょしぼうめそっど"/>
					<label for="dynamic-label-input">ひらがな 例)じょしぼうめそっど</label>
				</div>

				<br>

				<span>商品詳細</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="newProductDescription" value="%{newProductDescription}" placeholder="250字以内 例)岡田隆先生の著書。ダイエット・減量の入門書!!"/>
					<label for="dynamic-label-input">250字以内 例)岡田隆先生の著書。ダイエット・減量の入門書!!</label>
				</div>

				<br>

				<span>カテゴリID</span>
				<span class="hissu">必須</span>
				<div>
					<s:select name="newCategoryId" list="categoryList" listValue="categoryName" listKey="categoryId" value="newCategoryId">
					</s:select>
				</div>

				<br>

				<span>販売価格</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="newBuyPrice" value="%{newBuyPrice}" placeholder="半角数字 例)1300"/>
					<label for="dynamic-label-input">半角数字 例)1300</label>
				</div>

				<br>

				<span>発売年月</span>
				<div>
					<s:textfield  name="newReleaseDate" value="%{newReleaseDate}" placeholder="yyyy/MM 例)2018年2月は2017/02"/>
					<label for="dynamic-label-input">yyyy/MM 例)2018年2月は2018/02</label>
				</div>

				<br>

				<span>発売会社</span>
				<div>
					<s:textfield  name="newReleaseCompany" value="%{newReleaseCompany}" placeholder="16字以内 例)ベースボール・マガジン社"/>
					<label for="dynamic-label-input">例)ベースボール・マガジン社</label>
				</div>

				<br>

				<span>画像ファイル名</span>
				<span class="hissu">必須</span>
				<div>
					<s:textfield  name="newProductImage" value="%{newProductImage}" placeholder="ファイル名.拡張子例)bazooka"/>
					<label for="dynamic-label-input">ファイル名.拡張子例)bazooka</label>
				</div>

				<br>
				<s:submit value="登録"/>
			</s:form>
		</div>
	</div>
</body>
</html>