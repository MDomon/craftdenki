<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<!--<link href="css/userInfoChange.css" rel="stylesheet">-->
<!--<link href="css/nakajima.css" rel="stylesheet">-->
<link href="css/craftdenki.css" rel="stylesheet">

<script>

</script>

<meta charset="utf-8">
<title>確認画面</title>
<style type="text/css">

</style>
</head>
<body>
<jsp:include page="home2.jsp"/>
<div class="main">
<div class="wideBox">

<h3>ユーザー登録</h3>
<ol class="stepBar">
<li class="visited"><span>1</span><br>必要事項の入力</li>
<li class="visited"><span>2</span><br>入力内容の確認</li>
<li><span>3</span><br>登録完了</li>
</ol>
<p>登録する内容は以下でよろしいですか?</p>

<table class="userCreateTable">

		<tr class="userCreateTr">
			<th class="userCreateTh">ユーザーID</th>
			<td><s:property value="loginUserId" /></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">パスワード</th>
			<td><s:property value="loginPassCon"/></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">お名前(かな)</th>
			<td><s:property value="familyNameKana"/>　<s:property value="firstNameKana"/></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">お名前</th>
			<td><s:property value="familyName"/>　<s:property value="firstName"/></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">性別</th>
			<td><s:if test="sex==0">男</s:if>
	 			<s:if test="sex==1">女</s:if>
	 		</td>
	 	</tr>
	 	<tr class="userCreateTr">
	 		<th class="userCreateTh">メールアドレス</th>
	 		<td><s:property value="mail" /></td>
	 	</tr>
	 	<tr class="userCreateTr">
			<th class="userCreateTh">秘密の質問</th>
			<td><s:if test="secretQuestion==1">嫌いな食べ物は？</s:if>
				<s:if test="secretQuestion==2">母親の旧姓は？</s:if>
				<s:if test="secretQuestion==3">好きな動物は？</s:if>
			</td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">答え</th>
			<td><s:property value="secretAnswer" /></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">郵便番号</th>
			<td>〒<s:property value="yuubin1"/>-<s:property value="yuubin4"/></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">住所</th>
			<td><s:property value="address" /></td>
		</tr>
		<tr class="userCreateTr">
			<th class="userCreateTh">電話番号</th>
			<td><s:property value="tel" /></td>
		</tr>

</table>
	<s:form action="UserCreateCompleteAction" >
		<s:submit value="登録する" class="userCreateButton"/>
	</s:form>

<s:form action="UserCreateAction">
<input type="hidden" name="loginUserId" value="<s:property value="loginUserId" />"/>
<input type="hidden" name="loginPassword" value="<s:property value="loginPassword" />">
<input type="hidden" name="familyName" value="<s:property value="familyName" />">
<input type="hidden" name="firstName" value="<s:property value="firstName" />">
<input type="hidden" name="familyNameKana" value="<s:property value="familyNameKana" />">
<input type="hidden" name="firstNameKana" value="<s:property value="firstNameKana" />">
<input type="hidden" name="sex" value="<s:property value="sex" />">
<input type="hidden" name="mail" value="<s:property value="mail" />">
<input type="hidden" name="secretQuestion" value="<s:property value="secretQuestion" />">
<input type="hidden" name="secretAnswer" value="<s:property value="secretAnswer" />">
<input type="hidden" name="yuubin1" value="<s:property value="yuubin1" />">
<input type="hidden" name="yuubin4" value="<s:property value="yuubin4" />">
<input type="hidden" name="address" value="<s:property value="address" />">
<input type="hidden" name="tel" value="<s:property value="tel" />">
<s:submit value="戻る" class="userCreateButton"/>
</s:form>
</div>
</div>
<jsp:include page="footer.jsp"/>

</body>
</html>