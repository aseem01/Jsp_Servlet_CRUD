<%-- 
    Document   : Edit
    Created on : Mar 3, 2018, 12:34:11 PM
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
    <center><h1>Hello World!</h1></center>
    <form method="post" action="EditEmployeee">
        <table align="center">
            <tr>
                <td></td>
                <td><input type="hidden" name="id" value="${userdoc.id}"</td>
            </tr>
            
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" value="${userdoc.username}"</td>
            </tr>
            <tr>
                <td>FirstName</td>
                <td><input type="text" name="firstname" value="${userdoc.firstname}"</td>
            </tr>
            <tr>
                <td>LastName</td>
                <td><input type="text" name="lastname" value="${userdoc.lastname}"</td>
            </tr>
            <tr>
                <td>UserAge</td>
                <td><input type="text" name="userage" value="${userdoc.userAge}"</td>
            </tr>
            <tr>
                <td>Contact</td>
                <td><input type="text" name="contact" value="${userdoc.contact}"</td>
            </tr>
            <tr>
                <td>Telephone</td>
                <td><input type="texte" name="telephone" value="${userdoc.telephone}"</td>
            </tr>
            <tr>
                <td>Position</td>
                <td><input type="text" name="position" value="${userdoc.position}"</td>
            </tr>
            <tr>
                <td>Color</td>
                <td><input type="text" name="color" value="${userdoc.color}"</td>
            </tr>
            <tr>
                <td><input type="submit" value="Edit Save"</td>
            </tr>
        </table>
        
    </form>
    </body>
</html>
