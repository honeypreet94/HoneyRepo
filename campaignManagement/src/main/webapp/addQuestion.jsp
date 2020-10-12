<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<Html>
  <head>
      <Title> CampaignRegisterationSystem </Title>
      <script>
        function display(text)
        {
            if(text.value=="Radio Button" || text.value="Checkbox")
            {
                document.getElementById("text1").style.visibility="visisble";
                document.getElementById("text2").style.visibility="visisble";
                document.getElementById("text3").style.visibility="visisble";
                document.getElementById("text4").style.visibility="visisble";

            }


        }
      </script>
  </head>

  <body>
        <h2>Add questions to your survey here!!!</h2>
        <form:form method="POST" action="/addQuestion">
            <form:label path="question"> Question 1: </form:label>
            <form:input type="text" path="question" required="required" />
             <br><br>
            <label >What kind of responses you wish for?<label>
            <form:radiobutton path="answerType" value="Radio Button"  label="Radio Button" onclick="display(this)" />
            <form:radiobutton path="answerType" value="Checkbox" label="Checkbox" onclick="display(this)" />
            <form:radiobutton path="answerType" value="Text Field" label="Text Field" onclick="display(this)"/>
            <br><br>
            <form:input type="text" path="option1" id="text1" required="required" style="display:none"/>
            <form:input type="text" path="option2" id="text2" required="required" style="display:none"/>
            <form:input type="text" path="option3" id="text3" required="required" style="display:none"/>
            <form:input type="text" path="option4" id="text4" required="required" style="display:none"/>

            <input type="submit" value="Create Survey"/>

         </form:form>
  </body>
</html>