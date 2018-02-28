<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">

	<title>UserInfoChange画面</title>

	<style type="text/css">	.errorColor{color:red;}</style>
	<link href="css/craftdenki.css" rel="stylesheet">

</head>
<body>

	<jsp:include page="home2.jsp"/>



	<div class="main">
		<div class="wideBox">

			<h3>ユーザー情報変更ページ</h3>

			<ol class="stepBar">
				<li class="visited"><span>1</span><br>必要事項の入力</li>
				<li><span>2</span><br>入力内容の確認</li>
				<li><span>3</span><br>変更完了</li>
			</ol>


			<br>
			<s:form id="form_1" action="UserInfoChangeConfirmAction">
				<div class="errorColor">
					<s:if test="errorMessage!=hoge">
						<s:property value="errorMessage" escape="false" />
					</s:if>
				</div>

				<s:iterator value="list_user_info">

					<table class="userCreateTable">

						<tr class="userCreateTr">
							<th class="userCreateTh">ユーザーID<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield readonly="true"
									name="userId" value="%{userId}"
									class="validate[required,minSize[1],maxSize[8]]" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">新パスワード<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:password name="password"
									value="%{password}"
									class="validate[required,minSize[1],maxSize[16],custom[onlyLetterNumber]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">お名前<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="familyName"
									id="familyName" value="%{familyName}"
									class="validate[required,minSize[1],maxSize[16]]"
									data-prompt-position="centerRight:0,-50" />(姓) <s:textfield
									name="firstName" id="firstName" value="%{firstName}"
									class="validate[required,minSize[1],maxSize[16]]"
									data-prompt-position="centerRight:0,-50" />(名)</td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">ふりがな<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="familyNameKana"
									id="familyNameKana" value="%{familyNameKana}"
									class="validate[required,minSize[1],maxSize[16]],custom[furigana]"
									data-prompt-position="centerRight:0,-50" />(せい) <s:textfield
									name="firstNameKana" id="firstNameKana"
									value="%{firstNameKana}"
									class="validate[required,minSize[1],maxSize[16],custom[furigana]]"
									data-prompt-position="centerRight:0,-50" />(めい)</td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">性別<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:radio list="#{0:'男', 1:'女'}"
									name="sex" value="sex" class="validate[custom[sex]]"
									data-prompt-position="centerRight:0,-50"></s:radio></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">メールアドレス<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="email"
									value="%{email}" size="40"
									class="validate[required,email,minSize[14],maxSize[32],custom[email]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">秘密の質問<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:select
									list="#{1:'嫌いな食べ物は？',2:'母親の旧姓は？',3:'好きな動物は？'}" name="question"
									value="question" class="validate[required,custom[question]]"
									data-prompt-position="centerRight:0,-50"></s:select></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">答え<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="answer"
									value="%{answer}" size="40"
									class="validate[required,minSize[1],maxSize[16]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">郵便番号</th>
							<td class="userCreateTd">〒<input type="text" name="yuubin1"
								size="4" maxlength="3" onkeyup="nextField(this, 'yuubin4', 3)"
								class="validate[custom[number]">-<input type="text"
								name="yuubin4" size="4" maxlength="4"
								onKeyUp="AjaxZip3.zip2addr('yuubin1','yuubin4','userAddress','userAddress');"
								class="validate[custom[number]]"
								data-prompt-position="centerRight:0,-50">
							</td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">住所１<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="userAddress"
									size="50" value="%{userAddress}"
									class="validate[required,minSize[10],maxSize[50]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">郵便番号</th>
							<td class="userCreateTd">〒<input type="text" name="yuubin2"
								size="4" maxlength="3" onkeyup="nextField(this, 'yuubin5', 3)"
								class="validate[custom[number]">-<input type="text"
								name="yuubin5" size="4" maxlength="4"
								onKeyUp="AjaxZip3.zip2addr('yuubin2','yuubin5','userAddress2','userAddress2');"
								class="validate[custom[number]]"
								data-prompt-position="centerRight:0,-50">
							</td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">住所２</th>
							<td class="userCreateTd"><s:textfield name="userAddress2"
									size="50" value="%{userAddress2}"
									class="validate[minSize[10],maxSize[50]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">郵便番号</th>
							<td class="userCreateTd">〒<input type="text" name="yuubin3"
								size="4" maxlength="3" onkeyup="nextField(this, 'yuubin6', 3)"
								class="validate[custom[number]">-<input type="text"
								name="yuubin6" size="4" maxlength="4"
								onKeyUp="AjaxZip3.zip2addr('yuubin3','yuubin6','userAddress3','userAddress3');"
								class="validate[custom[number]]"
								data-prompt-position="centerRight:0,-50">
							</td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">住所３</th>
							<td class="userCreateTd"><s:textfield name="userAddress3"
									size="50" value="%{userAddress3}"
									class="validate[minSize[10],maxSize[50]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号１<em class="userCreateEm">※</em></th>
							<td class="userCreateTd"><s:textfield name="telNumber"
									value="%{telNumber}"
									class="validate[required,minSize[10],maxSize[13],custom[phone]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号２</th>
							<td class="userCreateTd"><s:textfield name="telNumber2"
									value="%{telNumber2}"
									class="validate[minSize[10],maxSize[13],custom[phone]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>

						<tr class="userCreateTr">
							<th class="userCreateTh">電話番号３</th>
							<td class="userCreateTd"><s:textfield name="telNumber3"
									value="%{telNumber3}"
									class="validate[minSize[10],maxSize[13],custom[phone]]"
									data-prompt-position="centerRight:0,-50" /></td>
						</tr>


					</table>

					<br>
					<s:submit value="入力内容確認画面へ" class="userCreateButton" />


				</s:iterator>
			</s:form>


		</div>
	</div>
	<jsp:include page="footer.jsp" />


</body>
</html>