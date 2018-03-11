<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 07/03/18
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/script.js" ></script>
    <title>Catalog</title>
    <style>
        body {
            background-size:contain;
            background: url("../static/images/background.jpeg") center;
        }
    </style>
</head>
<body>
<form>
    <input type="button" name="clickmebutton" value="Click Me" onclick="alertMe()">
</form>

<select id="options" onchange="getCatalog(2)">
    <option value="0">Video Catalog 1</option>
    <option value="1">Video Catalog 2</option>
    <option value="2">Video Catalog 3</option>
</select>

<div id="catalogNum" >

</div>

<table id="tableofvideos" border="10px">

</table>

</body>
</html>
