<%-- 
    Document   : displayStudent
    Created on : Oct 16, 2019, 6:55:13 PM
    Author     : Thanh Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP using ELs</h1>
        <h2>Hello ${student.name}</h2>
        <h2>Student is full time: ${student.fullTime}</h2>
    </body>
</html>
