<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <h2> Hibernate Assessment </h2>
    </head>
    <body>
        <form:form method="POST" action="">
            <form:label path="ques1"> Question 1: What is the full form of ORM? </form:label>
            <form:input type="radio" >Object Random Memory </form:input>
            <form:input type="radio" >Object Relational Mismatch </form:input>
            <form:input type="radio" >Object Relational Mapping </form:input>
            <form:input type="radio" >Object Random Memory </form:input>
            <br><br>
            <form:label path="ques2"> Question 2: In Hibernate, based on directionality, what could be the mappings? </form:label>
             <form:input type="radio" >Uni-directional & bi-directional </form:input>
             <form:input type="radio" >one-to-many & many-to-one</form:input>
             <form:input type="radio" >Inheritence mapping </form:input>
             <form:input type="radio" >north & south mapping </form:input>
            <br><br>
            <form:label path="ques3"> Question 3: In an Hibernate application, which file would have datasource details? </form:label>
            <form:input type="radio" >hibernate mapping file </form:input>
            <form:input type="radio" >configuration file </form:input>
            <form:input type="radio" >Model/Entity class</form:input>
            <form:input type="radio" >HibernateUtil class </form:input>
            <br><br>
                <form:label path="ques4"> Question 4: What is the full form of HQL? </form:label>
            <form:input type="radio" >High-Level Query Language </form:input>
            <form:input type="radio" >Hidden Query Language </form:input>
            <form:input type="radio" >Hibernate Query Language </form:input>
            <form:input type="radio" >Hibernate Quadratic Language </form:input>
            <br><br>
            <form:label path="ques5"> Question 5: In an Hibernate application,concurrency can be controlled bt setting? </form:label>
            <form:input type="radio" >concurrency level </form:input>
            <form:input type="radio" >one-to-one mapping </form:input>
            <form:input type="radio" >one-to-many bu-directional mapping </form:input>
            <form:input type="radio" >isolation levels</form:input>

            <input type="submit" value="submit Test"/>
        </form:form>
    </body>
</html>