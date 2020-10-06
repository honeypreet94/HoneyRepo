<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <title> Register Page </title>
    </head>
    <body>
        <h2> Registration </h2>
        <form:form method="POST" action="/registerpage">
            <form:label path="firstName"> First Name : </form:label>
            <form:input type="text" path="firstName" required="required"/>
            <br><br>
            <form:label path="lastName"> Last Name : </form:label>
            <form:input type="text" path="lastName" required="required"/>
             <br><br>
            <form:label path="emailId"> Email ID : </form:label>
             <form:input type="text" path="emailId" required="required"/>
             <br><br>
             <form:label path="password"> Password : </form:label>
              <form:input type="password" path="password" required="required"/>
              <br><br>
               <input type="submit" value="REGISTER"/>

         </form:form>

    </body>

</html>