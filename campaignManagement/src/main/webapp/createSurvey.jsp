<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<Html>
  <head>
      <Title> CampaignRegisterationSystem </Title>
  </head>

  <body>
        <h2>Create New survey</h2>
        <form:form method="POST" action="/newSurvey">
            <form:label path="title"> Title : </form:label>
            <form:input type="text" path="title" required="required" />
            <br><br>
            <form:label path="description"> Please provide description here  : </form:label>
            <form:textarea  path="description" required="required" />
            <br><br>
            <input type="submit" value="Create Survey"/>

         </form:form>
  </body>
</html>