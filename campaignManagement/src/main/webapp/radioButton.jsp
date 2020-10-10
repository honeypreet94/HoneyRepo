<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <h2>Add questions to your survey here!!!</h2>
            <form:form method="POST" action="/addAnswer">
                <form:label path="options"> Please enter your options with comma separated</form:label>
                <form:textarea path="options" required="required" />
                <br><br>
                <input type="submit" value="next"/>
            </form:form>


</html>