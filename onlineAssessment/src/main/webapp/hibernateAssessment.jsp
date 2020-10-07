<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <h2> Hibernate Assessment </h2>
       
    </head>
    <body>
        <form:form method="POST" action="/hibernate">
            <label > Question 1: What is the full form of ORM? </label>
            <form:radiobutton  path="answer1" label="Object Random Memory" value="Object Random Memory"/>
            <form:radiobutton  path="answer1" label="Object Relational Mismatch"  value="Object Relational Mismatch" />
            <form:radiobutton  path="answer1" label="Object Relational Mapping"  value="Object Relational Mapping" />
            <form:radiobutton  path="answer1" label="Object Random Memory"  value="Object Random Memory" />
            <br><br>
            <label > Question 2: In Hibernate, based on directionality, what could be the mappings? </label>
             <form:radiobutton  path="answer2" label="Uni-directional & bi-directional" value="Uni-directional & bi-directional" />
             <form:radiobutton  path="answer2" label="one-to-many & many-to-one" value="one-to-many & many-to-one" />
             <form:radiobutton  path="answer2" label="Inheritence mapping" value="Inheritence mapping" />
             <form:radiobutton  path="answer2" label="north & south mapping" value="north & south mapping" />
            <br><br>
            <label > Question 3: In an Hibernate application, which file would have datasource details? </label>
            <form:radiobutton  path="answer3" label="hibernate mapping file"  value="hibernate mapping file" />
            <form:radiobutton  path="answer3" label="configuration file"  value="configuration file" />
            <form:radiobutton  path="answer3" label="Model/Entity class" value="Model/Entity class"/>
            <form:radiobutton  path="answer3" label="HibernateUtil class"  value="HibernateUtil class" />
            <br><br>
                <label> Question 4: What is the full form of HQL? </label>
            <form:radiobutton  path="answer4" label="High-Level Query Language"  value="High-Level Query Language" />
            <form:radiobutton  path="answer4" label="Hidden Query Language"  value="Hidden Query Language" />
            <form:radiobutton  path="answer4" label="Hibernate Query Language"  value="Hibernate Query Language" />
            <form:radiobutton  path="answer4" label="Hibernate Quadratic Language"  value="Hibernate Quadratic Language" />
            <br><br>
            <label > Question 5: In an Hibernate application,concurrency can be controlled bt setting? </label>
            <form:radiobutton  path="answer5" label="concurrency level"  value="concurrency level" />
            <form:radiobutton  path="answer5" label="one-to-one mapping"  value="one-to-one mapping" />
            <form:radiobutton  path="answer5" label="one-to-many bu-directional mapping"  value="one-to-many bu-directional mapping" />
            <form:radiobutton  path="answer5" label="isolation levels" value="isolation levels"/>

            <input type="submit" value="submit Test" />
        </form:form>
    </body>
</html>