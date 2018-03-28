<%-- 
    Document   : login
    Created on : Mar 28, 2018, 8:00:25 PM
    Author     : Nguyen Ngoc Son
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            .errorMessage{
                color: red;
                font-size: 13px;
            }
        </style>
 
    </head>
    <body>
        <h1>Login</h1>
        <s:form action="LoginAction" method="POST">
            <s:textfield name="username" label="Username"  errorPosition="bottom"/> <br />
            <s:password name="password" label="Password" errorPosition="bottom"/> <br />
            <s:submit name="submit" value="Login" />
        </s:form>
    </body>
</html>

