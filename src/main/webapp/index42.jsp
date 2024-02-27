<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adrianplewa
  Date: 27/02/2024
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index42</title>
</head>
<body>

<c:forEach begin="1" end="20" step="2" var="jump">
  <p><c:out value="${jump}"/></p>
</c:forEach>

</body>
</html>
