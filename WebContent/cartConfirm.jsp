<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Strutsタグ -->
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="ja">

<link href="css/craftdenki.css" rel="stylesheet">



<script type="text/javascript">
	function CartAction() {
		document.getElementById('form').action = "CartAction";
	}
	function SettlementAction() {
		document.getElementById('form').action = "SettlementAction";
	}
</script>



<title>cart画面</title>

<style>
.cart-price {
    float: right;
    font-weight: bold;
    font-size: 18px;
    border-bottom: solid black 1px;
    /* width: auto; */
    margin-right: 320px;
}


.ph:after {
	clear: both;
	content: "";
	display: block;
}

.cart-button {
    float: right;
    margin-top: 20px;
    margin-right: 336px;
}
</style>


</head>
<body>

	<!-- ヘッダー-->
	<jsp:include page="home2.jsp" />

	<div class="main">

	<div class="empty">


		<h3>カート情報</h3>


		<s:if test="nothing == null">
			<h4>ご購入情報はありません。</h4>
		</s:if>
		<s:else>
			<s:form id="form" name="form" action="SettlementAction">
				<h4>カート情報は以下になります。</h4>

				<br>
				<br>
				<div class="ph">
					<table>
						<s:iterator value="cartList">
							<div class="ph-box">

								<div class="ph-check">
									<s:checkbox name="deleteList" value="checked" fieldValue="%{id}" />
								</div>

								<p>&nbsp;</p>

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
								<s:property value="TotalPrice" />
								<br>
								<s:hidden name="totalPrice" value="%{TotalPrice}" />

								<p>&nbsp;</p>

							</div>

							<!--
					<ul class="box23">
						<li class="itemlist23"><div class="iFP"><img src="<s:property value='imageFilePath'/>" width="auto" height="200px"></div></li>
						<s:hidden name="imageFilePath" value="%{imageFilePath}" />

						<li class="itemlist23">商品名:<span><s:property value="productName" /></span></li>
						<s:hidden name="productName" value="%{productName}" />

						<li class="itemlist23">ふりがな:<span><s:property value="productNameKana" /></span></li>
						<s:hidden name="productNameKana" value="%{productNamekana}" />

						<li class="itemlist23">金額:<span><s:property value="price" />円</span></li>
						<s:hidden name="price" value="%{price}" />

						<li class="itemlist23">個数:<span><s:property value="productCount" />個</span></li>
						<s:hidden name="productCount" value="%{productCount}" />

						<li class="itemlist23">発売会社名:<s:property value="releaseCompany" /></li>
						<s:hidden name="releaseCompany" value="%{releaseCompany}" />

						<li class="itemlist23">発売年月日:<s:property value="releaseDate" /></li>
						<s:hidden name="releaseDate" value="%{releaseDate}" />

						<li class="itemlist23">合計金額:<s:property value="totalPrice" /></li>
						<s:hidden name="totalPrice" value="%{totalPrice}" />
					</ul>
-->
						</s:iterator>
					</table>


					<div class="cart-price">
						カート合計:
						<s:property value="session.finalPrice" />
						円<br>
						<s:hidden name="finalPrice" value="%{finalPrice}" />
					</div>
				</div>
						<s:hidden name="cartDeleteFlg" value="1" />
						<s:hidden name="product_count" value="%{product_count}" />


				<div class="cart-button">
					<s:submit value="決済に進む" onclick="SettlementAction();"
						class="button" />
					<s:submit value="削除" onclick="CartAction();" class="button"/>

				</div>
			</s:form>
		</s:else>
		<s:if test="message != null">
			<h3>
				<s:property value="message" />
			</h3>
		</s:if>

		<!-- <p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p> -->
	</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>