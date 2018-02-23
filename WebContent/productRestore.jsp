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
<title>削除商品復元画面</title>


</head>
<body class="back-image step3">
	<div class="main">
		<div id="m-title">
			<p>削除商品復元画面</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<span class="m-index">
			削除商品一覧
		</span>
		<div>
			<div class="errorMessage">
				<s:iterator value="errorSupplyMessageList">
					<s:div>
						<s:property />
					</s:div>
				</s:iterator>
			</div>
			<s:form action="ProductRestoreConfirmAction">
				<table class="manageTable">
					<tr>
						<th>ID</th>
						<th>商品名</th>
						<th>販売価格</th>
						<th>現在の単価</th>
						<th>在庫数</th>
						<th>商品詳細</th>
						<th>商品復元</th>
					</tr>
					<s:iterator value="productList">
						<tr>
							<td><span><s:property value="product_id"/></span></td>
							<td><span><s:property value="product_name"/></span></td>
							<td><span><s:property value="price"/></span></td>
							<td><span><s:property value="current_cost"/></span></td>
							<td><span><s:property value="item_stock"/></span></td>
							<td><span><s:property value="product_description"/></span></td>
							<td><span><s:checkbox name="checkList" value="" fieldValue="%{product_id}" /></span></td>
						</tr>
					</s:iterator>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td><s:submit value="復元"/></td>
						</tr>
				</table>
			</s:form>
		</div>
	</div>
</body>
</html>