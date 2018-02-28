<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;URL=<s:url action='ProductListAction' />">
<title>完了画面</title>
<!--<link href="css/nakajima.css" rel="stylesheet">-->
<link href="css/craftdenki.css" rel="stylesheet">
</head>
<body>
<jsp:include page="home2.jsp"/>

<div class="main">

<h3>ユーザー登録完了</h3>

<ol class="stepBar">
<li class="visited"><span>1</span><br>必要事項の入力</li>
<li class="visited"><span>2</span><br>入力内容の確認</li>
<li class="visited"><span>3</span><br>登録完了</li>
</ol>
<br><br><br><br><br><br><br>
<h1>ユーザーの登録が完了しました。
3秒後にログイン画面に遷移します。
ジャンプしない場合は、以下のリンクをクリックしてください。
<a href='<s:url action="ProductListAction"/>'>移転先のページ</a></h1>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>