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
<title>管理者Home画面</title>


</head>
<body>
	<div class="main">
			<div id="m-home">
				<s:if test="session.master_flg != '1'">
					<s:form action="LogoutAction">
						<s:submit value="ログアウト"/>
					</s:form>
				</s:if>
				<s:else>
					<s:form action="GoLoginAction">
						<s:submit value="ログイン"/>
					</s:form>
				</s:else>
				<s:form action="StartAction">
					<s:submit value="ユーザー画面"/>
				</s:form>
				<s:form action="SalesManageAction">
					<s:submit value="売上管理"/>
				</s:form>
				<s:form action="ProductManageAction">
					<s:submit value="商品管理"/>
				</s:form>
				<s:form action="GoManagerHomeAction">
					<s:submit value="管理者Home"/>
				</s:form>
			</div>
	</div>

</body>
</html>