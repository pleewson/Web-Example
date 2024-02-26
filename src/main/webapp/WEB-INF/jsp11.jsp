<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 26/02/2024
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp11</title>
</head>
<body>
<c:out value="${userRole}" default="guest"/>
</body>
</html>
