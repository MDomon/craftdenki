<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<link href="css/craftdenki.css" rel="stylesheet">


<script type="text/javascript">
	function goPurchaseHistoryAction() {
		document.getElementById('form').action = "PurchaseHistoryAction";
	}
	function goReview1Action() {
		document.getElementById('form').action = "Review1Action";
	}
</script>

<title>購入履歴</title>
</head>
<body>
<jsp:include page="home2.jsp" />


	<div class="main">

		<div class= empty>


	<h3>購入商品一覧</h3>
	<!-- purchaseHistoryListの中身が0の場合、購入履歴は無し -->
	<s:if test="purchaseHistoryList.size()==0">
		<h4>購入履歴はありません。</h4>
	</s:if>



	<!-- purchaseHistoryListの中身が0の場合、購入履歴は無し -->
	<s:if test="purchaseHistoryList.size() > 0">
		<h4>購入情報は以下になります。</h4>

		<p>&nbsp;&nbsp;</p>


		<s:form id="form" name="form" action="PurchaseHistoryAction">
			<s:iterator value="purchaseHistoryList">


			<div class="ph-box">

				<div class="ph-check">
					<s:checkbox name="checkList" value="checked" fieldValue="%{id}" />
				</div>

					<div class="iFP"><img src="<s:property value='imageFilePath'/>" width="auto" height="200px"></div>
						<s:hidden name="imageFilePath" value='<s:property value="imageFilePath"/>' />




						商品名:<span><s:property value="productName" /></span><br>
						<s:hidden name="productName" value="%{productName}" />
						ふりがな:<span><s:property value="productNameKana" /></span><br>
						<s:hidden name="productNameKana" value="%{productNameKana}" />
						金額:<span><s:property value="price" />円</span><br>
						<s:hidden name="price" value="%{price}" />
						個数:<span><s:property value="count" />個</span><br>
						<s:hidden name="count" value="%{count}" />
						発売会社名:<s:property value="releaseCompany" /><br>
						<s:hidden name="releaseCompany" value="%{releaseCompany}" />
						発売年月日:<s:property value="releaseDate" /><br>
						<s:hidden name="releaseDate" value="%{releaseDate}" />


					<p>&nbsp;</p>

			</div>

				</s:iterator>


				<div class="delete23">
			<s:hidden name="deleteFlg" value="1"/>
			<s:submit onclick="goPurchaseHistoryAction();" value="削除"/>
				</div>

		</s:form>

	</s:if>

</div>
	</div>


<jsp:include page="footer.jsp"/>
</body>
</html>