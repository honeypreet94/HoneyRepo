<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<Html>
    <head>
        <Title> Online Assessment </Title>
    </head>

    <body>

        <head>
        <script type="text/javascript">

                  function emailInvalid(textbox)
                           {
                               var text=textbox.value;
                                var regex =^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$ ;
                                if(text.length==0)
                                	textbox.setCustomValidity("Please fill out Required field");
                                else if(!regex.test(text))
                                	textbox.setCustomValidity('Please match the requested format');
                                else
                                	textbox.setCustomValidity('');
                              return true;
                            }

                </script>
        </head>
        <h1> Welcome to Online Assessments</h1>
        <br>
        <h2> Login </h2>
        <br>
        <form:form method="POST" action="/login">
            <form:label path="emailId"> Email ID : </form:label>
            <form:input type="text" path="emailId" required="required" oninvalid="emailInvalid(this);" oninput="emailInvalid(this)"/>
            <br><br>
            <form:label path="password"> Password : </form:label>
            <form:input type="password" path="password" required="required"/>
            <br><br>
            <input type="submit" value="LOGIN"  />
            <br><br>

        </form:form>
        <label> New User? </label>
         <a href="/register" >register here </a>
    </body>
</html>