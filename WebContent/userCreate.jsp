<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="css/craftdenki.css" rel="stylesheet">
<!--<link href="css/userInfoChange.css" rel="stylesheet">-->
<!--<link href="css/nakajima.css" rel="stylesheet">-->


<!--<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/jquery.validationEngine.js"></script>
<script src="js/jquery.validationEngine-ja.js"></script>
<script src="js/jquery.autoKana.js"></script>
<link rel="stylesheet" href="css/validationEngine.jquery.css">
<script>
	$(function() {
		$.fn.autoKana('#familyName', '#familyNameKana');
		$.fn.autoKana('#firstName', '#firstNameKana');
	});
	$(function() {
		jQuery("#form_1").validationEngine();
	});
</script>
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>-->
<title>新規登録</title>
<style>
.aka{
	color:red;
	}

.hissuaka{
	color:red;
	text-align:center;
	}
</style>
</head>
<body>
<jsp:include page="home2.jsp"/>
<div class="main">
<div class="wideBox">
<h3>ユーザー登録</h3>

<ol class="stepBar">
<li class="visited"><span>1</span><br>必要事項の入力</li>
<li><span>2</span><br>入力内容の確認</li>
<li><span>3</span><br>登録完了</li>
</ol>
				<s:iterator value="errMsgList">
					<div class="hissuaka"><s:property /></div>
				</s:iterator>
<s:form id="form_1" action="UserCreateConfirmAction">
<table class="userCreateTable">
	<tr class="userCreateTr">
		<th class="userCreateTh">ユーザーID<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" name="loginUserId"  value='<s:property value="loginUserId"/>' class="validate[required,minSize[1],maxSize[8],custom[onlyLetterNumber]]" data-prompt-position="centerRight:0,-50"/>

				<s:iterator value="errMsgListId">

					<div class="aka"><s:property /></div>

				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">パスワード<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="password" name="loginPassword"  class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber]]" data-prompt-position="centerRight:0,-50"/>
				<s:iterator value="errMsgListPass">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">お名前<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" id="familyName" name="familyName"  value='<s:property value="familyName"/>' class="validate[required,minSize[1],maxSize[16]]" data-prompt-position="centerRight:0,-50"/>(姓)　
				<input type="text" id="firstName" name="firstName" value='<s:property value="firstName"/>' class="validate[required,minSize[1],maxSize[16]]"data-prompt-position="centerRight:0,-50"/>(名)

				<s:iterator value="errMsgListName">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">ふりがな<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" id="familyNameKana" name="familyNameKana" value='<s:property value="familyNameKana"/>' class="validate[required,minSize[1],maxSize[16],custom[furigana]]" data-prompt-position="centerRight:0,-50"/>(せい)
    			<input type="text" id="firstNameKana" name="firstNameKana" value='<s:property value="firstNameKana"/>' class="validate[required,minSize[1],maxSize[16],custom[furigana]]"data-prompt-position="centerRight:0,-50"/>(めい)

    			<s:iterator value="errMsgListKana">
					<div class="aka"><s:property /></div>
				</s:iterator>
    		</td>
    </tr>

    <tr class="userCreateTr">
    	<th class="userCreateTh">性別<em class="userCreateEm">※</em></th>
    		<td class="userCreateTd">　
			<s:if test="sex==0">
				<input type="radio" name="sex" value="0" checked class="validate[required,custom[sex]]"data-prompt-position="centerRight:0,-50">男
    			<input type="radio" name="sex" value="1">女
			</s:if>
			<s:elseif test="sex==1">
				<input type="radio" name="sex" value="0" class="validate[required,custom[sex]]"data-prompt-position="centerRight:0,-50">男
    	 	<input type="radio" name="sex" value="1" checked>女
			</s:elseif>
			<s:else>
				<input type="radio" name="sex" value="0" class="validate[required,custom[sex]]" data-prompt-position="centerRight:0,-50">男
    			<input type="radio" name="sex" value="1" >女
			</s:else>
			<s:iterator value="errMsgListSex"><div class="aka"><s:property /></div></s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">メールアドレス<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="email" name="mail" value='<s:property value="mail"/>' class="validate[required,minSize[14],maxSize[32],custom[email]]"data-prompt-position="centerRight:0,-50"/>
				<s:iterator value="errMsgListMail">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">秘密の質問<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　
			<s:if test="secretQuestion==1">
				<select name="secretQuestion" id="secretQuestion" class="validate[required,custom[question]]"data-prompt-position="centerRight:0,-50" >
					<option value="">選択してください</option>
					<option value="1" selected>嫌いな食べ物は？</option>
					<option value="2">母親の旧姓は？</option>
					<option value="3">好きな動物は？</option>
				</select>
			</s:if>
			<s:elseif test="secretQuestion==2">
				<select name="secretQuestion" id="secretQuestion" class="validate[required,custom[question]]"data-prompt-position="centerRight:0,-50">
					<option value="">選択してください</option>
					<option value="1" >嫌いな食べ物は？</option>
					<option value="2" selected>母親の旧姓は？</option>
					<option value="3">好きな動物は？</option>
			</select>
			</s:elseif>
			<s:elseif test="secretQuestion==3">
				<select name="secretQuestion" id="secretQuestion" class="validate[required,custom[question]]"data-prompt-position="centerRight:0,-50">
					<option value="">選択してください</option>
					<option value="1">嫌いな食べ物は？</option>
					<option value="2">母親の旧姓は？</option>
					<option value="3" selected>好きな動物は？</option>
				</select>
			</s:elseif>
			<s:else>
				<select name="secretQuestion" id="secretQuestion" class="validate[required,custom[question]]"data-prompt-position="centerRight:0,-50">
						<option value="">選択してください</option>
						<option value="1">嫌いな食べ物は？</option>
						<option value="2">母親の旧姓は？</option>
						<option value="3">好きな動物は？</option>
				</select>
			</s:else>
			<s:iterator value="errMsgListQuestion">
				<div class="aka"><s:property /></div>
			</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">答え<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" name="secretAnswer" value='<s:property value="secretAnswer"/>' class="validate[required,minSize[1],maxSize[16]]"data-prompt-position="centerRight:0,-50">
				<s:iterator value="errMsgListAnswer">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">郵便番号(任意)</th>
			<td class="userCreateTd">〒<input type="text" name="yuubin1" value='<s:property value="yuubin1"/>' size="4" maxlength="3" onkeyup="nextField(this, 'yuubin4', 3)" class="validate[custom[number]">-<input type="text" name="yuubin4" value='<s:property value="yuubin4"/>' size="4" maxlength="4" onKeyUp="AjaxZip3.zip2addr('yuubin1','yuubin4','address','address');" class="validate[custom[number]]"data-prompt-position="centerRight:0,-50">
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">住所<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" name="address" value='<s:property value="address"/>' size="50" class="validate[required,minSize[10],maxSize[50]]"data-prompt-position="centerRight:0,-50">
				<s:iterator value="errMsgListAddress">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

	<tr class="userCreateTr">
		<th class="userCreateTh">電話番号<em class="userCreateEm">※</em></th>
			<td class="userCreateTd">　<input type="text" name="tel" value='<s:property value="tel" />'  class="validate[required,minSize[10],maxSize[13],custom[phone]]" data-prompt-position="centerRight:0,-50">
				<s:iterator value="errMsgListTel">
					<div class="aka"><s:property /></div>
				</s:iterator>
			</td>
	</tr>

</table>
<div class="place">
		<s:submit value="確認画面へ進む" class="userCreateButton" />
</div>
	</s:form>
<div class="place">
	<s:form action="GoLoginAction">
		<s:submit value="戻る" class="userCreateButton"/>
	</s:form>
</div>
</div>
</div>
<jsp:include page="footer.jsp"/>

</body>
</html>