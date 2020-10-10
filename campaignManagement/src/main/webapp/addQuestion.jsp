<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<Html>
  <head>
      <Title> CampaignRegisterationSystem </Title>
  </head>

  <body>
        <h2>Add questions to your survey here!!!</h2>
        <form:form method="POST" action="/addQuestion">
            <form:label path="title"> Question Title : </form:label>
            <form:textarea path="title" required="required" />
            <br><br>
            <label>What kind of responses you wish</label>
            <form:label path="description">What kind of responses you wish for?</form:label>
            <form:radiobutton path="answerType" value="Radio Button"  label="Radio Button" />
            <form:radiobutton path="answerType" value="Checkbox" label="Checkbox" />
            <form:radiobutton path="answerType" value="Text Field" label="Text Field"/>
            <br><br>
            <input type="submit" value="Create Survey"/>

         </form:form>
  </body>
</html>