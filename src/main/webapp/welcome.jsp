<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <%
        int a = 5;
        a += 5;
    %>
    ${a}
    <p><c:out value="${key}"></c:out></p>
    <p><c:out value='${header["user-agent"]}'></c:out></p>
</body>
</html>
