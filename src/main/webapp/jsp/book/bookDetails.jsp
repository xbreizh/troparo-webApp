<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
<%--<c:out value="${result.size}"/>--%>
Size: ${result.size()}

<c:forEach var="BookTypeOut" items="${result}">
    <c:out value="${BookTypeOut.author}"/>
</c:forEach>
</body>
</html>
