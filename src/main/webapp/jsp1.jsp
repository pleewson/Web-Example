<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 25/02/2024
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp1</title>
</head>
<body>
<p>${param.km}</p>
<c:out value="$param.km"></c:out>
<%Double kmToMiles = Double.parseDouble(request.getParameter("km")) * 0.62; %>
</body>
</html>
