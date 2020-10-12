<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>


    <form:form method="POST" action="/newSurvey">
        <table>
            <tr><td>
            <form:label path="title">Title: </form:label></td>
            <td><form:input type="text" path="title"></form:input></td></tr>
            <tr><td>
            <form:label path="description">Describe your survey: </form:label></td>
            <td><form:textarea path="description"/></td>
            <tr><td>
            <input type="submit" value="Create Survey"/></td>
        </table>

     </form:form>

</html>