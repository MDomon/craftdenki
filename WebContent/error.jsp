<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<html>
<head>
<meta charset="utf-8">
<style type="text/css">
.home2 {
	padding-top: 200px;
}
/* 下にスクロールでヘッダー非表示・上にスクロールでヘッダー表示*/
header {
	position: fixed;
	top: 0;
	left: 0;
	z-index: 2;
	width: 100%;
	transition: .3s;
}
/*メニューバー*/
.bar {
	width: 100%;
	text-align: center;
	background-color: #2c3e50;
}

.bar a {
	text-decoration: none;
	color: #fff;
	font-weight: bold;
	margin: 5%;
}
/*ヘッダー*/
header {
	height: 120px;
	line-height: 30px;
	background-color: ghostwhite;
	background-image: url("images/Paper01.jpg");
}
/*ロゴ*/
#logo {
	margin-left: 15px;
	margin-top: 30px;
	margin-bottom: 20px;
	width: 200px;
	height: 70px;
	background-repeat: no-repeat;
	background-image: url("images/logo.png");
	background-size: 200px;
}
/*検索フォーム左にロゴ真ん中にフォーム右に空div*/
nav {
	display: flex;
	justify-content: space-between;
	align-items: center;
	min-width: 885px;
}
/*minimalectにフォームの形を合わせる*/
input.area {
	font-family: "Segoe UI", Segoe, "Lucida Grande", "Lucida Sans Unicode",
		Arial, Helvetica, sans-serif;
	color: #333;
	background: #fff;
	position: relative;
	width: 400px;
	height: 45px;
	border: 1px solid #e5e5e5;
	border-radius: 3px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}
/*kensaku.jpgとフォームのずれ補正*/
input.area, input.hosei {
	vertical-align: top;
}
/*selectboxとフォーム横並びにして隙間なくす*/
table.table-header {
	border-collapse: collapse;
	border-spacing: 0;
}

#footer {
	height: 70px;
	background: #2c3e50;
	width: 100%;
}

.under {
	font-size: 20px;
	color: white;
	text-align: center;
}

.guide ul {
	display: flex;
	margin: 0;
}

.guide li {
	list-style-type: none;
	flex-grow: 1;
	text-align: center;
	text-decoration: none;
	color: #fff;
	font-weight: bold;
}

#error {
	text-align: center;
}
</style>
<script src="js/jquery-1.8.2.min.js"></script>
<link href="css/jquery.minimalect.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/validationEngine.jquery.css">
<script src="js/jquery.minimalect.js"></script>
<script src="js/jquery.validationEngine-ja.js"></script>
<script src="js/jquery.validationEngine.js"></script>
<script src="js/jquery.autoKana.js"></script>
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>

<script>
	$(function() {
		var $win = $(window), $header = $('header'), headerHeight = $header
				.outerHeight(), startPos = 0;

		$win.on('load scroll', function() {
			var value = $(this).scrollTop();
			if (value > startPos && value > headerHeight) {
				$header.css('top', '-' + headerHeight + 'px');
			} else {
				$header.css('top', '0');
			}
			startPos = value;
		});
	});

	$(document).ready(function() {
		$("#select1").minimalect({
			theme : "bubble"
		});
	});

	$(function() {
		$.fn.autoKana('#familyName', '#familyNameKana');
		$.fn.autoKana('#firstName', '#firstNameKana');
	});
	$(function() {
		jQuery("#form_1").validationEngine({
			scrollOffset : 170

		});
	});
	function nextField(i, n, m) {
		if (i.value.length >= m) {
			i.form.elements[n].focus();
		}
	}
</script>
<link href="https://fonts.googleapis.com/css?family=Press+Start+2P"
	rel="stylesheet">
<script src="js/footerFixed.js"></script>
</head>
<body class="home2">

	<header>
		<nav>
			<a href="start.jsp"><div id="logo"></div></a>

			<div class="kara"></div>
		</nav>
		<div class="bar">
			<span>&nbsp;</span>

		</div>
	</header>

	<h2 id="error">
		エラーページです <a href="start.jsp">最初から</a>やり直してください。
	</h2>



	<footer id="footer">
		<div id="footer">
			<div class="under">CraftDenki All right reserved.</div>
			<div class="guide">

				<ul>
					<li>お問い合わせ</li>
					<li>ヘルプ</li>
					<li>ご利用ガイド</li>
				</ul>

			</div>

		</div>
	</footer>


</body>
</html>