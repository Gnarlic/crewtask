<%-- 
    Document   : allCrews
    Created on : Jan 21, 2020, 9:35:17 PM
    Author     : Elnic
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>All Crews</title>
    </head>
    <body>
        <h1>All Crews</h1>
        <a href="${pageContext.request.contextPath}/crew/addCrew">add crew</a>
        <br><a href="${pageContext.request.contextPath}/index.jsp">home</a>
        <hr/>
        <c:forEach items="${crews}" var="crew">
            Crew: ${crew.crewName}
            <br>Crew Lead: ${crew.crewLead}
            <br>Available?: ${crew.isAvailable}
            <br>Crew Members: <c:forEach items="${crew.crewMembers}" var="crewMember">${crewMember}, </c:forEach>
            <br><a href="${pageContext.request.contextPath}/crew/deleteCrew?id=${crew.id}">delete</a> | <a href="${pageContext.request.contextPath}/crew/selectCrewForEdit/${crew.id}">Edit</a>
            <hr/>
        </c:forEach>
    </body>
</html>
