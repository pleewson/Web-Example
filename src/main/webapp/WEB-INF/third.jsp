<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 18/02/2024
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>zad3</title>
</head>
<body>
<p>a:${empty param.get("a") ? "brak" : param.get("a")}</p>
<p>b:${empty param.get("b") ? "brak" : param.get("b")}</p>
</body>
</html>
