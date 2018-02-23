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
<title>仕入確認画面</title>

</head>
<body class="back-image step4">
	<div class="main">
		<div id="m-title">
			<p>仕入確認画面</p>
		</div>
		<!-- メニューバー -->
				<jsp:include page="managerMenu.jsp" />
		<div>
			<s:if test="supplyList.size() == 0">
				<p class="errorMessage">仕入情報がありません。</p>
			</s:if>
			<s:else>
				<s:form action="SupplyCompleteAction">
					<table class="manageTable">
						<tr>
							<th>ID</th>
							<th>商品名</th>
							<th>販売価格</th>
							<th>在庫数</th>
							<th>仕入数</th>
							<th>仕入原価</th>
							<th>仕入原価計</th>
						</tr>
						<s:iterator value="supplyList">
							<tr>
								<td><span><s:property value="product_id"/><s:hidden name="product_id" value="%{product_id}"/></span></td>
								<td><span><s:property value="product_name"/></span></td>
								<td><span><s:property value="price"/></span></td>
								<td><span><s:property value="item_stock"/></span></td>
								<td><span><s:property value="supplyCount"/><s:hidden name="supplyCount" value="%{supplyCount}"/></span></td>
								<td><span><s:property value="supplyCost"/><s:hidden name="supplyCost" value="%{supplyCost}"/></span></td>
								<td><span><s:property value="supplyCostTotal"/></span></td>
							</tr>
						</s:iterator>
					</table>
					<p class="m-log">仕入値合計<s:property value="supplyCostAllTotal"/>円
					<p class="m-log">以上でよろしいですか？</p>
					<!-- tokenタグ -->
  					  <s:token/>
					<s:submit value="はい"/>
				</s:form>
				<s:form action="ProductManageAction">
					<s:submit value="いいえ" />
				</s:form>
			</s:else>
		</div>
	</div>
</body>
</html>