<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME画面</title>

<!--  <link href="css/craftdenki.css" rel="stylesheet">-->
<style>
ul,li {
	list-style: none;
	margin:0;
	padding:0;

}

#craft	{
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%,-50%);
  -webkit-transform: translate(-50%,-50%);
  transform: translate(-50%,-50%);
  margin:0;
  padding-top:200px;
  transition: 1.0s ;
  /*文字の装飾は省略*/
  }
#craft:hover{
  filter: alpha(opacity=0);
  -moz-opacity:0;
  opacity:0;
}
</style>
<script>

</script>


</head>


<body>
	<jsp:include page="home2.jsp" />
	<div class="main2">

	<% double number = Math.random();%>

	</div>
	<div id="main_slide">
		<ul>
			<li><img src="images/ayasiihon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/eigonohon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/kowaihon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/mukasibanasibon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/nekonohon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/ryouribon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/suugakunohon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/boroborobon.png" alt="" width="300" height="240" /></li>
			<li><img src="images/bestbook.png" alt="" width="300" height="240" /></li>
		</ul>
	</div>
	<div id="main_slide2">
		<ul>
			<li><img src="images/sinpurunasuihannki.png" alt="" width="300" height="240" /></li>
			<li><img src="images/dennsirennzi.png" alt="" width="300" height="240" /></li>
			<li><img src="images/doraiya.png" alt="" width="300" height="240" /></li>
			<li><img src="images/ko-hi-me-ka-.png" alt="" width="300" height="240" /></li>
			<li><img src="images/terebi.png" alt="" width="300" height="240" /></li>
			<li><img src="images/haburasi.png" alt="" width="300" height="240" /></li>
			<li><img src="images/higesori.png" alt="" width="300" height="240" /></li>
			<li><img src="images/ketoru.png" alt="" width="300" height="240" /></li>
			<li><img src="images/mikisa.png" alt="" width="300" height="240" /></li>
			<li><img src="images/souziki.png" alt="" width="300" height="240" /></li>
		</ul>
	</div>
		<div id="main_slide3">
		<ul>
			<li><img src="images/illustrain04-nuigurumi10.png" alt="" width="300" height="240" /></li>
			<li><img src="images/pingpong.png" alt="" width="300" height="240" /></li>
			<li><img src="images/illustrain04-wanage04.png" alt="" width="300" height="240" /></li>
			<li><img src="images/robot.png" alt="" width="300" height="240" /></li>
			<li><img src="images/mazyan.png" alt="" width="300" height="240" /></li>
			<li><img src="images/tezina.png" alt="" width="300" height="240" /></li>
			<li><img src="images/igo.png" alt="" width="300" height="240" /></li>
		</ul>
	</div>

<img src="images/logoanime.svg?<%=number %>" width="900" height="500" id="craft" class="denki"/>
	<jsp:include page="footer.jsp" />
</body>
</html>