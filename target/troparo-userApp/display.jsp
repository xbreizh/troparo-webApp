<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
<h2>Result: </h2>

Try: <%= request.getAttribute("t1")%> + <%= request.getAttribute("t2")%>
Result = ${result}





</body>
</html>
