<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 07/03/18
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestPage</title>
</head>
<body>
<div id="divid"></div>

<video width="320" height="240" controls>
    <source src="${pageContext.request.contextPath}/static/videos/videocatalog2/movie0.mp4" type="video/mp4">
    Your browser does not support the video tag.
</video>
</body>
</html>