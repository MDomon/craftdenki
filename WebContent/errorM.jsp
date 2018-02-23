<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
<title>ERROR画面</title>

</head>
<body class="back-image step1">
	<div class="main">
		<div id="m-title">
			<p>ERROR!!</p>
		</div>
		<!-- メニューバー -->
			<jsp:include page="managerMenu.jsp" />
		<div class="errorMessage">
			<h1>エラーが発生しました。</h1>
				<p><s:property value="errorMessage"/></p>
		</div>
	</div>
</body>
</html>