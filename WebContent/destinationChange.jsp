<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>





<%--
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	--%>






<meta charset="utf-8">

<title>DestinationChange画面</title>

<style type="text/css">
.errorColor {
	color: red;
}

.left6 {
	margin-left: 65%;
}

.small {
	font-size: 12px;
	margin-left: 75%;
}


</style>





<%--
	<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
	<script src="js/jquery-1.8.2.min.js"></script>
	<script src="js/jquery.validationEngine.js"></script>
	<script src="js/jquery.validationEngine-ja.js"></script>
	<script src="js/jquery.autoKana.js"></script>
	<link rel="stylesheet" href="css/validationEngine.jquery.css">

	<script>
	$(function() {
		$.fn.autoKana('#familyName', '#familyNameKana');
		$.fn.autoKana('#firstName', '#firstNameKana');
	});
	</script>
	<script>
	$(function() {
		jQuery("#form_1").validationEngine();
	});
	</script>

	<script type="text/javascript">
		function nextField(i, n, m) {
 		if (i.value.length >= m) {
 	 	  i.form.elements[n].focus();
 		 }
		}
	</script>

	--%>






<link href="css/craftdenki.css" rel="stylesheet">
<link href="css/nakajima.css" rel="stylesheet">
<link href="css/userInfoChange.css" rel="stylesheet">

</head>
<body>

	<jsp:include page="home2.jsp" />



	<div class="main">
		<div class="wideBox">

			<h3>お届け先変更、追加ページ</h3>

			<br>
			<s:form id="form_1" action="DestinationChangeAction">



				<s:iterator value="list_user_info">

					<table class="userCreateTable">



						<tr class="userCreateTr">
							<th class="userCreateTh">住所１<em class="userCreateEm">必須</em></th>
							<td><s:textfield name="userAddress" size="60"
									value="%{userAddress}" class="validate[required]" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号１<em class="userCreateEm">必須</em></th>
							<td><s:textfield name="telNumber" value="%{telNumber}"
									class="validate[required]" /></td>
						</tr>




						<tr class="userCreateTr">
							<th class="userCreateTh">住所２</th>
							<td><s:textfield name="userAddress2" size="60"
									value="%{userAddress2}" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号２</th>
							<td><s:textfield name="telNumber2" value="%{telNumber2}" />
							</td>
						</tr>




						<tr class="userCreateTr">
							<th class="userCreateTh">住所３</th>
							<td><s:textfield name="userAddress3" size="60"
									value="%{userAddress3}" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号３</th>
							<td><s:textfield name="telNumber3" value="%{telNumber3}" />
							</td>
						</tr>






					</table>


					<div class="small">
						<span>※最大3件まで</span>
					</div>

					<div class="left6">
						<s:submit value="変更" />
					</div>


				</s:iterator>


			</s:form>

		</div>
	</div>
	<jsp:include page="footer.jsp" />


</body>
</html>