<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
    </head>
    <body>
        <h1>List of Candidates and Tests</h1>

        <table border="2">
            <tr>
                <th>Test Date</th>
                <th>Assessment</th>
                <th>Test marks</th>
                <th>Email Id</th>
                <th>Total Marks </th>
                <th>Results</th>
            </tr>

            <tr>
                <% List<String> ss = (List)request.getAttribute("list");
                    for(int i=0;i<ss.size();i++){
                        String str[] = ss.get(i).split(",");
                        int j=0;
                        for(j=0;j<str.length;j++){
                %>
                <td><%=str[j]%></td>
                <%}%>
                </tr>
                <%}%>



        </table>
    </body>
</html>
