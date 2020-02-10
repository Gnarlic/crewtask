<%-- 
    Document   : crewsuccess
    Created on : Feb 6, 2020, 8:44:54 PM
    Author     : Elnic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crew Added Successfully</h1>
        <h1>${crew.crewName}, ${crew.crewLead}, <c:forEach items="${crew.crewMembers}" var="crewmember">${crewmember}, </c:forEach> </h1>
        <hr/>
        <a href="${pageContext.request.contextPath}/crew/displayAllCrews">Display All Crews</a>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">home</a>
    </body>
</html>
