<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../jsp/_include/head.jsp" %>
<h2>Hello World!</h2>

<%--<form:form method="POST"
           action="/add" >
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">
                Contact Number</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>--%>
<br><br><br>
<a href="/testBook">testBook</a>

<form action="testBook">

    <input type="text" name="word"><br>
    <input type="submit">
</form>
<%@include file="../jsp/_include/footer.jsp" %>
