<%@ taglib uri="http://www.springframework.org/tags" prefix="locale" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
  <title></title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
  <%--<span><a href="?lang=en">en</a> | <a href="?lang=ru">ru</a></span><br>--%>
  <span><locale:message code="label.square" />=${square}</span><br>
  <span><locale:message code="label.perimeter" />=${perimeter}</span>
  <%--<ul>--%>
    <%--<li><a href="/circle.form"><locale:message code="label.circle" /></a></li>--%>
    <%--<li><a href="/rectangle.form"><locale:message code="label.rectangle" /></a></li>--%>
    <%--<li><a href="/rectanglepoint.form"><locale:message code="label.rectanglepoint" /></a></li>--%>
  <%--</ul>--%>

  <form action="/circle.form">
    <input type="text" name="radius">
    <input type="submit" value="circle calc">
  </form>

  <form action="/rectangle.form">
    <input type="text" name="width">
    <input type="text" name="hight">
    <input type="submit" value="rectangle calc">
  </form>

  <form action="/rectanglepoint.form">
    <input type="text" name="x1">
    <input type="text" name="y1">
    <input type="text" name="x2">
    <input type="text" name="y2">
    <input type="submit" value="rectangle point calc">
  </form>

</body>
</html>
