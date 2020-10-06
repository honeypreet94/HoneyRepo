<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <h2> Spring Assessment </h2>
    </head>
    <body>
        <form:form method="POST" action="">
            <form:label path="ques1"> Question 1: What is spring? </form:label>
            <input type="radio" >J2EE App Server </input>
            <input type="radio" id="answer1" >J2EE App Development Framework </input>
            <input type="radio" >Configuration management Tool </input>
            <input type="radio" >Build tool </input>
            <br><br>
            <form:label path="ques2"> Question 2: What is the full form of IOC? </form:label>
             <input type="radio" id="answer2" >Inversion Of Control </input>
             <input type="radio" >Injection Of Control</input>
             <input type="radio" >Internal Object Control </input>
             <input type="radio" >In-built Object Control </input>
            <br><br>
            <form:label path="ques3"> Question 3: What is the full form of AOP? </form:label>
            <input type="radio" >Anticipation Of Properties </input>
            <input type="radio" id="answer3">Aspect Oriented Programming </input>
            <input type="radio" >Associated Object Programming</input>
            <input type="radio" >Anti Object Programming </input>
            <br><br>
                <form:label path="ques4"> Question 4: Which of the below is Spring Container? </form:label>
            <input type="radio" >View Resolver </input>
            <input type="radio" id="answer4">Application Context </input>
            <input type="radio" >Handler Mapping </input>
            <input type="radio" >Dispatcher Servlet </input>
            <br><br>
            <form:label path="ques5"> Question 5: What is spring front Controller Implemention? </form:label>
            <input type="radio" >Bean Factory </input>
            <input type="radio" >Class Path Application Context</input>
            <input type="radio" >Application Context </input>
            <input type="radio" id="answer5">Dispatcher Servlet </input>

            <input type="submit" value="submit Test"/>
        </form:form>
    </body>
</html>