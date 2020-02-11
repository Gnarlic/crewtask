<%-- 
    Document   : editCrew
    Created on : Jan 21, 2020, 9:35:10 PM
    Author     : Elnic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Crew</h1>
        <br>
        <br>${crew.crewName}
        <br>${crew.crewLead}
        <br>${crew.isAvailable}
        <br>
        <sf:form role="form" modelAttribute="crew" method="POST" action="editCrew">
            <sf:input type="text" id="crew-name" name="crewName" path="crewName" placeholder="${crew.crewName}" required="required"/>
            <sf:input type="text" id="crew-lead" name="crewLead" path="crewLead" placeholder="${crew.crewLead}" required="required"/>
            <sf:input type="text" id="crew-members" name="crewMembers" path="crewMembers" placeholder="${crew.crewMembers}" required="required"/>
            <sf:hidden path="id"/>
            <button class="btn btn-default" type="submit">Submit Edit</button
        </sf:form>
    </body>
</html>
