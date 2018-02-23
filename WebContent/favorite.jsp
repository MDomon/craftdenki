<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/craftdenki.css" rel="stylesheet">


<title>Insert title here</title>

<script>
	function myCheck() {
		var flag = false;
		for (var i = 0; i < document.form1.fruits.length - 1; i++) {
			if (document.form1.fruits[i].checked) {
				flag = true;
				alert(document.form1.fruits[i].value + "が選択されました。");
			}
		}
		if (!flag) {
			alert("項目が選択されていません。");
		}
	}
</script>
<style type="text/css">








</style>


</head>
<body>
<jsp:include page="home2.jsp" />

<div class="main">

	<div class="empty">

	<h3>お気に入りリスト</h3>

	<s:if test="favoriteList.size()==0">
		<h4>お気に入りはありません。</h4>
	</s:if>


	<s:if test="favoriteList.size() > 0">
		<h4>お気に入り情報は以下になります。</h4>
		<p>&nbsp;&nbsp;</p>

	<s:form id="form" name="form" action="FavoriteAction">
		<table border="0" cellspacing="0">

			<s:iterator value="favoriteList">

			<div class="ph-box">



				<div class="ph-check">
					<s:checkbox name="checkList" value="1"
							fieldValue="%{productId}" />
				</div>

<br><br>

					<div class="iFP"><img src="<s:property value='imageFilePath'/>" width="auto" height="200px"></div>
						<s:hidden name="imageFilePath" value='<s:property value="imageFilePath"/>' />



					<s:hidden name="imageFilePath" value='<s:property value="imageFilePath"/>' />
					商品名:<span><s:property value="productName" /></span><br>

					金額:<span><s:property value="price" /></span><br>
					<s:hidden name="price" value="%{price}" />

					発売会社名:<span><s:property value="releaseCompany" /></span><br>
					<s:hidden name="releaseCompany" value="%{releaseCompany}" />

					発売年月日:<span><s:property value="releaseDate" /></span><br>
					<s:hidden name="id" value="%{id}"/>

					<s:hidden name="releaseDate" value="%{releaseDate}" />
					<s:hidden name="productId" value="%{productId}" />

	<p>&nbsp;</p>
	<p>&nbsp;</p>
<p>&nbsp;</p>

					</div>
			</s:iterator>




			<div class="delete23">
				<s:submit value="削除"/>
						<s:hidden name="deleteFlg" value="1" />
					</div>


		</table>
	</s:form>

</s:if>

</div>
</div>









<jsp:include page="footer.jsp"/>
</body>
</html>