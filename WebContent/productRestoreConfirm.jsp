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
<title>商品削除確認画面</title>

</head>
<body class="back-image step3">
	<div class="main">
		<div id="m-title">
			<p>商品復元確認画面</p>
		</div>
		<div>
			<s:form action="ProductRestoreCompleteAction">
				<table class="manageTable">
					<tr>
						<th>商品ID</th>
						<th>商品名</th>
					</tr>
					<s:iterator value="productRestoreList">
						<tr>
							<td><s:property value="product_id"/><s:hidden name="product_id" value="%{product_id}"/></td>
							<td><s:property value="product_name"/></td>
						</tr>
					</s:iterator>
				</table>
				<p class="m-log">以上の商品を復元してもよろしいですか？</p>
				<s:submit value="はい"/>
			</s:form>
			<input type="button" value="いいえ" onClick="history.back()">
		</div>
	</div>
</body>
</html>