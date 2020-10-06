<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
    </head>
    <body>
        <h1>List of All Users</h1>

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email Id</th>
                <th>User Type</th>
            </tr>
            <tr>
            <c:forEach items="${list}" var="list1">
             <tr>
                 <td>${list1.get(items)}</td>
                 <td>${list1}</td>
                 <td>${list1}</td>
                 <td>${list1}</td>
             </tr>
             </c:forEach>
            </tr>

        </table>
    </body>
</html>
