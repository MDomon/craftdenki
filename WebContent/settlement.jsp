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
<title>住所選択</title>

<link href="css/craftdenki.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">



<style>

</style>

</head>
<body>
	<jsp:include page="home2.jsp" />

	<div class="main">

<div class="empty">

		<h3>お届け先選択</h3>

		<p>&nbsp;&nbsp;</p>

		<div class="sm-info">
			<i class="far fa-user fa-fw"> </i>
			<span> お名前 </span>
			<s:property value="familyName" />
			<s:property value="firstName" />

<br>

			<i class="far fa-envelope fa-fw"> </i>
			<span> メールアドレス </span>
			<s:property value="email" />

<br>




		<i class="fas fa-map-marker-alt fa-fw"> </i>お届け先</div>

		<s:form action="SettlementConfirmAction">

			<div class="left1">
				<div class="address">
				<s:if test="userAddress != null">
					<div class="radio">
						<input type="radio" name="destination" value="1" checked>
						<span><s:property value="userAddress" /></span>
					</div>
					<div class="phone">
						<span> <s:property value="telNumber" /></span>
					</div>
				</s:if>
				</div>


				<s:if test="userAddress2 != null">
				<div class="address">
					<div class="radio">
						<input type="radio" name="destination" value="2"> <span><s:property
								value="userAddress2" /></span>
					</div>
					<div class="phone">
						<span> <s:property value="telNumber2" /></span>
					</div>
					</div>
				</s:if>



				<s:if test="userAddress3 != null">
				<div class="address">
					<div class="radio">
						<input type="radio" name="destination" value="3"> <span><s:property
								value="userAddress3" /></span>
					</div>
					<div class="phone">
						<span> <s:property value="telNumber3" /></span>
					</div>
				</div>
				</s:if>

				</div>






			<div class="changeinfo">
				<span>宛先の住所を変更、追加するには<a
					href='<s:url action="DestinationChange0Action"/>'>こちら</a></span>
			</div>


			<br>
			<div class="sm-next">
				<s:submit value="次へ" />
			</div>
		</s:form>


		<br>

</div>

	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>