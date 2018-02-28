<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>決済確認画面</title>

<link href="css/craftdenki.css" rel="stylesheet">

<style>

</style>

<script>

</script>

</head>
<body>


	<jsp:include page="home2.jsp" />
	<div class="main">

<div class="empty">


		<h3>決済確認</h3>

		<s:if test="message!=null">
			<h4><s:property value="message"/></h4>
			<p><a href='<s:url action="ProductListAction"/>'>戻る</a></p>
		</s:if>


		<s:else>
<p>&nbsp;&nbsp;</p>

		<div class="buyer"><h5>購入者情報</h5></div>



		<div class="blank">
			<span>お名前:</span>
			<s:property value="session.familyName" />
			<s:property value="session.firstName" />


<br>

			<span>お届け先住所:</span>
			<s:property value="choseAddress" escape="false" />

<br>

			<span>お電話番号:</span>
			<s:property value="choseNumber" escape="false" />
		</div>



<p>&nbsp;&nbsp;</p>
<p>&nbsp;&nbsp;</p>




	<div class="buyeritem"><h5>購入商品情報</h5></div>




		<table>
			<s:iterator value="cartList">
				<div class="ph-box">

					<div class="iFP">
						<img src="<s:property value='imageFilePath'/>" width="auto"
							height="200px">
					</div>
					<s:hidden name="imageFilePath"
						value='<s:property value="imageFilePath"/>' />

					商品名:<span><s:property value="productName" /></span><br>
					<s:hidden name="productName" value="%{productName}" />
					ふりがな:<span><s:property value="productNameKana" /></span><br>
					<s:hidden name="productNameKana" value="%{productNameKana}" />
					金額:<span><s:property value="price" />円</span><br>
					<s:hidden name="price" value="%{price}" />
					個数:<span><s:property value="productCount" />個</span><br>
					<s:hidden name="productCount" value="%{productCount}" />
					発売会社名:
					<s:property value="releaseCompany" />
					<br>
					<s:hidden name="releaseCompany" value="%{releaseCompany}" />
					発売年月日:
					<s:property value="releaseDate" />
					<br>
					<s:hidden name="releaseDate" value="%{releaseDate}" />
					合計金額:
					<s:property value="totalPrice" />
					<br>
					<s:hidden name="totalPrice" value="%{totalPrice}" />

					<p>&nbsp;</p>

				</div>


			</s:iterator>

		</table>








		<div class="cart-price">
			カート合計:
			<s:property value="finalPrice" />
			円<br>
			<s:hidden name="finalPrice" value="%{finalPrice}" />
		</div>

		<br><br><br>


		<div class="left6">

			<s:form action="SettlementCompleteAction">


				<s:token />
				<s:submit value="購入する" />
			</s:form>
		</div>


		<br>

		</s:else>

</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>