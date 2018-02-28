<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/productList.css">
<link rel="stylesheet" href="./css/craftdenki.css">
<title>商品詳細画面</title>


<script type="text/javascript">
	function goCartInsertAction() {
		document.getElementById('form').action = "CartInsertAction";
	}

	function goFavoriteAction() {
		document.getElementById('form').action = "FavoriteAction";
	}
</script>

</head>
<body>
	<!-- ヘッダー-->
	<jsp:include page="home2.jsp" />
	<div class="main">
		<h3>商品詳細</h3>
		<div class="DetailsList">
			<div class="detailsList">
				<div class="img">
					<img class="image"
						src="<s:property value='session.d_image_file_path'/>" alt="Photo"
						width="300" height="240">
				</div>
				<table class="detailsTable">
					<tr>
						<td class="nowrap">商品名かな</td>
						<td>:</td>
						<td><s:property value="session.d_product_name_kana" /></td>
					</tr>
					<tr>
						<td class="nowrap">商品名</td>
						<td>:</td>
						<td><s:property value="session.d_product_name" /></td>
					</tr>
					<tr>
						<td class="nowrap">商品詳細</td>
						<td>:</td>
						<td><s:property value="session.d_product_description" /></td>
					</tr>
					<tr>
						<td class="nowrap">価格</td>
						<td>:</td>
						<td>￥<s:property value="session.d_product_price" /> 円
						</td>
					</tr>
					<tr>
						<td class="nowrap">発売日</td>
						<td>:</td>
						<td><s:property value="session.d_release_date" /></td>
					</tr>
					<tr>
						<td class="nowrap">販売会社</td>
						<td>:</td>
						<td><s:property value="session.d_release_company" /></td>
					</tr>
					<tr>
						<td class="nowrap">在庫</td>
						<td>:</td>
						<td><s:property value="session.d_item_stock" /> 個</td>
					</tr>
				</table>
			</div>




			<s:form action="CartAction" id="form" name="form">

				<s:if test="session.d_item_stock > 0">

					<p>&nbsp;</p>

			購入個数
	  		<s:select name="product_count" list="stockList" />			★

				<input type="hidden" name="insertFlg" value="1" />


					<div class=pd-cart>

						<s:token />
						<s:submit value=" カートに入れる" onclick="goCartInsertAction();">
							<s:hidden name="product_id" value="%{session.d_product_id}" />

						</s:submit>
					</div>

				</s:if>
				<s:else>
					<p>在庫がありません。</p>
					<s:hidden name="product_id" value="%{session.d_product_id}" />

				</s:else>
				<br>
				<%--非ログイン時は非表示 --%>
				<s:if test="#session.containsKey('trueID')">
					<div class="favlist">
						<s:submit value=" お気に入りリストに入れる" onclick="goFavoriteAction();">
							<s:hidden name="favoriteInsertFlg" value="1" />
						</s:submit>
					</div>
				</s:if>

			</s:form>
		</div>

		<h3>おすすめ関連商品</h3>

		<ul class="thumbnail clearFix">
			<!-- 表示件数1ページ目 -->


			<s:iterator value="sugestList">
				<a
					href="<s:url action="ProductDetailsAction">
				 <s:param name="product_id" value="%{product_id}" />
 </s:url>">


					<li class="list1">
						<dl>
							<dt>
								<img class="image" src="<s:property value='image_file_path'/>"
									alt="Photo" width="250" height="200">
							</dt>
							<table class="detailsTable">
								<tr>
									<td class="nowrap">商品名かな</td>
									<td>:</td>
									<td><s:property value="product_name_kana" /></td>
								</tr>
								<tr>
									<td class="nowrap">商品名</td>
									<td>:</td>
									<td><s:property value="product_name" /></td>
								</tr>
								<tr>
									<td class="nowrap">価格</td>
									<td>:</td>
									<td>￥<s:property value="price" />円
									</td>
								</tr>
							</table>
							<s:hidden name="product_id" value="%{product_id}" />

						</dl>
				</li>
				</a>
			</s:iterator>
		</ul>

	</div>


	<jsp:include page="footer.jsp" />
</body>
</html>