<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="images/favicon.ico" rel="shortcut icon"/>
<style type="text/css">



.home2{
	padding-top:200px;

}
  /* 下にスクロールでヘッダー非表示・上にスクロールでヘッダー表示*/
header {
    position:fixed;
    top: 0;
    left: 0;
    z-index: 2;
    width: 100%;
    transition: .3s;
}
/*メニューバー*/
.bar {
  width:100%;
  text-align: center;
  background-color: #2c3e50;

}
.bar a {
    text-decoration: none;
    color: #fff;
    font-weight: bold;
    margin:5%;
}
/*ヘッダー*/
header{
    height:120px;
    line-height:30px;
    background-color:ghostwhite;
    background-image:url("images/Paper01.jpg");

}
/*ロゴ*/
#logo{
    margin-left:15px;
    margin-top:30px;
    margin-bottom:20px;
    width: 200px;
    height:70px;
    background-repeat:no-repeat;
    background-image:url("images/logo.png");
    background-size: 200px;
}
/*検索フォーム左にロゴ真ん中にフォーム右に空div*/
nav{
    display:flex;
    justify-content: space-between;
    align-items: center;
    min-width:885px;
    }
/*minimalectにフォームの形を合わせる*/
input.area{
  font-family: "Segoe UI", Segoe, "Lucida Grande", "Lucida Sans Unicode", Arial, Helvetica, sans-serif;
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
    input.area,input.hosei{
        vertical-align:top;
    }
/*selectboxとフォーム横並びにして隙間なくす*/
    table.table-header {
  border-collapse: collapse;
  border-spacing: 0;

}

</style>
<script src="js/jquery-1.8.2.min.js"></script>
<link href="css/jquery.minimalect.css" rel="stylesheet">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link rel="stylesheet" href="css/validationEngine.jquery.css">
<script src="js/jquery.minimalect.js"></script>
<script src="js/jquery.validationEngine-ja.js"></script>
<script src="js/jquery.validationEngine.js"></script>
<script src="js/jquery.autoKana.js"></script>
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>

<script>
$(function() {
  var $win = $(window),
      $header = $('header'),
      headerHeight = $header.outerHeight(),
      startPos = 0;

  $win.on('load scroll', function() {
    var value = $(this).scrollTop();
    if ( value > startPos && value > headerHeight ) {
      $header.css('top', '-' + headerHeight + 'px');
    } else {
      $header.css('top', '0');
    }
    startPos = value;
  });
});


$(document).ready(function(){
    $("#select1").minimalect({theme: "bubble"});
});

$(function() {
	$.fn.autoKana('#familyName', '#familyNameKana');
	$.fn.autoKana('#firstName', '#firstNameKana');
});
$(function() {
	jQuery("#form_1").validationEngine({
		scrollOffset: 170

	});
});
function nextField(i, n, m) {
		if (i.value.length >= m) {
	 	  i.form.elements[n].focus();
		 }
	}

</script>
</head>
<body class="home2">

<header>
    <nav>
        <a href='<s:url action="StartAction" />'><div id="logo"></div></a>
        	<div class="search">
        		<table class="table-header"><s:form method="post" action="ItemSearchAction" class="kensaku">
            		<tr>
						<td>
                    	<select name="category" id="select1">
	                        <option value="0" selected="selected">すべて</option>
	                        <option value="1">本</option>
	                        <option value="2">家電・パソコン</option>
	                        <option value="3">おもちゃ・げーむ</option>
                    	</select>
                    	 </td>
                    	<td><input type="text" name="searchWord" maxlength="16" class="area" /><input type="image" src="images/kensaku.jpg" alt="検索"  value="検索" class="hosei"/>
                		</td>
            		</tr>
            								</s:form>
       </table>

        </div>
        <div class="kara"></div>
    </nav>
    <div class="bar">
    <s:if test="session.trueID == null">
        <span><a href='<s:url action="GoLoginAction" />'><i class="fas fa-sign-in-alt"></i>ログイン</a></span>
    </s:if>
    <s:else>
        <span><a href='<s:url action="LogoutAction" />'>ログアウト<i class="fas fa-sign-out-alt"></i></a></span>
    </s:else>
     <s:if test="session.trueID != null">
        <span><a href='<s:url action="GoMyPageAction" />'><i class="fas fa-user"></i>マイページ</a></span>
      </s:if>
        <span><a href='<s:url action="CartAction" />'><i class="fas fa-shopping-cart"></i>カート</a></span>
        <span><a href='<s:url action="ItemSearchAction" />'><i class="fas fa-book"></i>商品一覧</a></span>
    </div>
</header>



</body>
</html>