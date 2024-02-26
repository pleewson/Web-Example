<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 26/02/2024
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp2</title>
</head>
<body>

<c:forEach begin="${start}" end="${end}" step="1" var="index">
    <tr>
        <td>${index}</td>
    </tr>
</c:forEach>
</body>
</html>
