<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background: #E0E0E0;
	color: #333;
	font: 11px verdana, sans-serif;
	padding: 0px 20px;
}

#header {
	background: none repeat scroll 0 0 #549DC1;
	opacity: 0.5;
	text-align: center;
	vertical-align: middle;
	padding: 20px;
}

#menu {
	height: 26px;
	list-style-type: none;
	margin: 0;
	padding: 0px;
	position: relative;
}

#menu li {
	float: left;
	margin: 0;
	padding: 0;
	width: 33.33%;
}

#menu a {
	background: none repeat scroll 0 0 #B76EC4;
	color: #4A0955;
	position: relative;
	display: block;
	font-size: 10px;
	height: 24px;
	line-height: 24px;
	margin: 1px;
	text-align: center;
	text-decoration: none;
	text-transform: uppercase;
}

#menu a.first {
	margin-left: 0;
}

#menu a.last {
	margin-right: 0;
}

#menu a:hover {
	background: none repeat scroll 0 0 #4A0955;
	color: #B76EC4;
}

#menu a .square {
	background: none repeat scroll 0 0 #7F238F;
	display: block;
	height: 8px;
	left: 8px;
	position: absolute;
	top: 5px;
	width: 8px;
}

h2 {
	font-size: 18px;
	font-weight: normal;
	color: #C1D431;
}

#main {
	background-color: #FFFFFF;
	padding: 10px;
}

#loginForm {
	border: solid 2px #b7ddf2;
	background: #ebf4fb;
	padding: 20px;
	width: 320px;
	margin: 0 auto;
}

#loginForm label {
	font-weight: bold;
	text-align: right;
	width: 100px;
	float: left;
}

#loginForm input {
	font-size: 12px;
	padding: 4px 2px;
	border: solid 1px #aacfe4;
	margin: 2px 0 20px 10px;
	float: left;
}

#loginForm input.text {
	width: 200px;
}

#loginForm button {
	clear: both;
	margin-left: 150px;
	width: 125px;
	height: 31px;
	background: #666666 url(img/button.png) no-repeat;
	text-align: center;
	line-height: 31px;
	color: #FFFFFF;
	font-size: 11px;
	font-weight: bold;
}

#footer {
	margin: 50px 0 5px;
	padding: 5px 0;
	text-align: center;
	font-weight: bold;
	text-transform: uppercase;
	background: none repeat scroll 0 0 #B76EC4;
	color: #4A0955;
	border-color: #7F238F;
}

.error {
	color: #FF0000;
	text-align: center;
	font-weight: bold;
	text-transform: uppercase;
	font-size: 14px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="menu">
		<tiles:insertAttribute name="menu" ignore="true" />
	</div>
	<div id="main">
		<tiles:insertAttribute name="body" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>