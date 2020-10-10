<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>


    <form:form method="POST" action="">
        <label>Name: </label>
         <form:input type="text" path="name"></form:input>
         <label>Email Id: </label>
         <form:input type="text" path="emailId"/>

         
     </form:form>

</html>