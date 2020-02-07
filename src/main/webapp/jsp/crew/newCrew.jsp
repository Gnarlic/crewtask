<%-- 
    Document   : newCrew
    Created on : Jan 21, 2020, 9:35:03 PM
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
        <h1>Hello World!</h1>
        ${crew.crewName}
        <sf:form role="form" modelAttribute="crew" method="POST" action="submitCrew">
            <sf:input type="text" id="crew-name" name="crewName" path="crewName" placeholder="Crew Name" required="required"/>
            <sf:input type="text" id="crew-lead" name="crewLead" path="crewLead" placeholder="Crew Lead" required="required"/>
            <sf:input type="text" id="crew-members" name="crewMembers" path="crewMembers" placeholder="Add names separated by commas" required="required"/>
            <button class="btn btn-default" type="submit">Submit</button>
        </sf:form>
        
    </body>
</html>
