<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <c:set var="a" value="5"/>
    <c:set var="b"/>
    <p>\${a} = ${a}</p>
    <p>\${b} = ${b}</p>
    <p>\${nullAttr} = ${nullAttr}</p>
    <p>c:out(a) = <c:out value="${a}"/></p>
    <p>c:out(b) = <c:out value="${b}"/></p>
    <p>c:out(nullAttr) = <c:out value="${nullAttr}"/></p>
    <p>c:out(keySession) = <c:out value="${keySession}"/></p>
    <p>c:out(keyRequest) = <c:out value="${keyRequest}"/></p>
    <p>c:out(key) = <c:out value="${key}"/></p>
    <p>c:out(requestScope.key) = <c:out value="${requestScope.key}"/></p>
    <p>c:out(sessionScope.key) = <c:out value="${sessionScope.key}"/></p>
    <p>c:out(header["user-agent"]) = <c:out value='${header["user-agent"]}'/></p>
</body>
</html>
