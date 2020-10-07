<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <h2> Spring Assessment </h2>

    </head>
    <body>
        <form:form method="POST" action="/spring">
                    <label > Question 1: What is spring? </label>
                    <form:radiobutton  path="answer1" value="J2EE App Server" label="J2EE App Server" />
                    <form:radiobutton  path="answer1" value="J2EE App Development Framework " label="J2EE App Development Framework "/>
                    <form:radiobutton  path="answer1" value="Configuration management Tool"  label="Configuration management Tool" />
                    <form:radiobutton  path="answer1" value="Build tool " label="Build tool "/>
                    <br><br>
                    <label > Question 2: What is the full form of IOC? </label>
                     <form:radiobutton path="answer2"  value="Inversion Of Control" label="Inversion Of Control" />
                     <form:radiobutton  path="answer2" value="Injection Of Control" label="Injection Of Control"/>
                     <form:radiobutton  path="answer2" value="Internal Object Control"  label="Internal Object Control" />
                     <form:radiobutton  path="answer2" value="In-built Object Control"  label="In-built Object Control" />
                    <br><br>
                    <label > Question 3: What is the full form of AOP? </label>
                    <form:radiobutton   path="answer3" value="Anticipation Of Properties"  label="Anticipation Of Properties" />
                    <form:radiobutton  path="answer3" value="Aspect Oriented Programming" label="Aspect Oriented Programming" />
                    <form:radiobutton  path="answer3" value="Associated Object Programming" label="Associated Object Programming"/>
                    <form:radiobutton  path="answer3" value="Anti Object Programming" label="Anti Object Programming" />
                    <br><br>
                        <label > Question 4: Which of the below is Spring Container? </label>
                    <form:radiobutton  path="answer4" value="View Resolver" label="View Resolver" />
                    <form:radiobutton  path="answer4" value="Application Context " label="Application Context "/>
                    <form:radiobutton  path="answer4" value="Handler Mapping" label="Handler Mapping" />
                    <form:radiobutton  path="answer4" value="Dispatcher Servlet " label="Dispatcher Servlet "/>
                    <br><br>
                    <label > Question 5: What is spring front Controller Implemention? </label>
                    <form:radiobutton  path="answer5" value="Bean Factory" label="Bean Factory" />
                    <form:radiobutton  path="answer5" value="Class name Application Context" label="Class name Application Context"/>
                    <form:radiobutton  path="answer5" value="Application Context" label="Application Context" />
                    <form:radiobutton  path="answer5" value="Dispatcher Servlet " label="Dispatcher Servlet "/>

                    <input type="submit" value="submit Test" />
                </form:form>
    </body>
</html>