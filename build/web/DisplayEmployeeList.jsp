<%-- 
    Document   : DisplayEmployeeList
    Created on : Mar 1, 2018, 4:39:36 PM
    Author     : Dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center><a href="Registration.jsp"<h1>Add Employee</h1></a></center>
    <center><h1>Employee List</h1></center>
        <table align="center" table border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id</th>
                <th>UserName</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>UserAge</th>
                <th>Contact</th>
                <th>Telephone</th>
                <th>Position</th>
                <th>Color</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="tt">
                <tr>
                    <td>${tt.id}</td>
                    <td>${tt.username}</td>
                    <td>${tt.firstname}</td>
                    <td>${tt.lastname}</td>
                    <td>${tt.userAge}</td>
                    <td>${tt.contact}</td>
                    <td>${tt.telephone}</td>
                    <td>${tt.position}</td>
                    <td>${tt.color}</td>
                    <td><a href="EditEmployee?id=${tt.id}">Edit</a></td>
                    <td><a href="DeleteEmployee?id=${tt.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
