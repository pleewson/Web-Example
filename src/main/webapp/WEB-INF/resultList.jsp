<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 27/02/2024
  Time: 00:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>resultList</title>
</head>
<body>

<c:forEach var="book" items="${books}">
    <p>
    <c:out value="${book.title}"/>
    <c:out value="${book.author}"/>
    <c:out value="${book.isbn}"/>
    </p>
</c:forEach>

</body>
</html>
