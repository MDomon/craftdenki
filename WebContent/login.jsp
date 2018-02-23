<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link href="css/craftdenki.css" rel="stylesheet">


<title>Insert title here</title>


<style>

</style>
</head>
<body>
	<jsp:include page="home2.jsp" />
	<div class="main">

				<br>
				<br>
				<s:if test="session.status == 'settlement'">
				<h2>商品購入前にログインしてください。</h2>
				</s:if>

		<div class="Abox">

			<div class="Bbox">

				<div id="box">ξ　　　　ロ グ イ ン　　　　ξ</div>

				<s:form action="LoginAction">


					<table>

						<tr>
							<td><s:if test="session.unknown != ''">
									<s:property value="session.unknown" />
									<br />
								</s:if></td>
						</tr>
						<tr>
							<td>ユーザーID</td>
						</tr>

						<tr>
							<td><s:textfield name="loginId" style="ime-mode:disabled;"
									size="40" /></td>
						</tr>
						<tr>
							<td><s:if test="session.IDerrormsg != ''">

									<s:property value="session.IDerror" />

								</s:if></td>
						</tr>

						<tr>
							<td>パスワード<br></td>
						</tr>

						<tr>
							<td><s:password name="loginPassword"
									style="ime-mode:disabled;" size="40" /></td>
						</tr>

						<tr>
							<td><s:if test="session.Passerrormsg != ''">
									<br>
									<s:property value="session.Passerror" />
								</s:if></td>
						</tr>

						<tr>
							<td><br><div id="message"> <s:submit value="ログイン" size="30"
									class="button" /></div></td>
						</tr>

					</table>

				</s:form>

				<table>

					<tr>

						<td><span>パスワードを忘れてしまった方は<a
								href='<s:url action="ChangePasswordAction"/>'>こちら</a>から
						</span></td>

					</tr>

				</table>

			</div>


			<div id="sbox"></div>


			<div class="Bbox">
				<table>
					<tr>
						<td>
							<div id="box">
								ξ　　　　新 規 登 録 　　　　ξ<br>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div id="message"><br> <br>
								会員登録をお願いします。 <br> <br> 会員登録は無料です。<br> <br>
							</div>
						</td>
					</tr>
					<tr>
						<td><div id="message"><s:form action="UserCreateAction"><br>
								<s:submit value="新規登録" class="button" />
							</s:form></div></td>
					</tr>
				</table>
			</div>
		</div>

</div>


<div id="a"></div>
	<jsp:include page="footer.jsp" />

</body>
</html>