<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<Html>
  <head>
      <Title> CampaignRegisterationSystem </Title>
      <script>
        function display(text)
        {
            console.log(text.value);
            if(text.value=="Radio Button" || text.value=="Checkbox")
            {
                var x1 = document.getElementById("text1");

                if (window.getComputedStyle(x1).visibility === "hidden") {
                    x1.style.visibility = "visible";
                }
                var x2 = document.getElementById("text2");
                if (window.getComputedStyle(x2).visibility === "hidden") {
                    x2.style.visibility = "visible";
                }
                var x3 = document.getElementById("text3");
                if (window.getComputedStyle(x3).visibility === "hidden") {
                    x3.style.visibility = "visible";
                }
                var x4 = document.getElementById("text4");
                if (window.getComputedStyle(x4).visibility === "hidden") {
                    x4.style.visibility = "visible";
                }
            }
            else if(text.value=="Text Field")
            {
                console.log("here");
                var x1 = document.getElementById("text1");

                if (window.getComputedStyle(x1).visibility === "hidden") {
                    x1.style.visibility = "visible";
                }
                var x2 = document.getElementById("text2");
                if (window.getComputedStyle(x2).visibility === "visible") {
                    x2.style.visibility = "hidden";
                }
                var x3 = document.getElementById("text3");
                if (window.getComputedStyle(x3).visibility === "visible") {
                    x3.style.visibility = "hidden";
                }
                var x4 = document.getElementById("text4");
                if (window.getComputedStyle(x4).visibility === "visible") {
                    x4.style.visibility = "hidden";
                }
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
            <form:input type="text" path="option1" id="text1" required="required" style="visibility:hidden"/><br><br>
            <form:input type="text" path="option2" id="text2" required="required" style="visibility:hidden"/><br><br>
            <form:input type="text" path="option3" id="text3" required="required" style="visibility:hidden"/><br><br>
            <form:input type="text" path="option4" id="text4" required="required" style="visibility:hidden"/><br><br>

            <input type="submit" value="Add question"/>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" value="Finish" onclick="/saveSurvey">
         </form:form>
  </body>
</html>