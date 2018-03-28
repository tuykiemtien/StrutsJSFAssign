<%-- 
    Document   : createNews
    Created on : Mar 28, 2018, 8:15:53 PM
    Author     : Nguyen Ngoc Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create News</title>
    </head>
    <body>
        <h1>Create News</h1>
        <s:form action="CreateNewsAction" method="POST">
            <s:textfield name="newsName" label="Name " errorPosition="bottom"/>
            <s:textfield name="newsStaff" label="Vacancies " errorPosition="bottom" />
            <s:textfield name="newsDepartment" label="Department " errorPosition="bottom" />
            <s:textfield name="newsOutDate" label="Day expires"  format="yyyy-MM-dd" />
            <s:textfield name="newsNumber" label="Number " errorPosition="bottom" />
            <s:textarea name="newDescription" label="Description " errorPosition="bottom" />
        </s:form>
    </body>
</html>
