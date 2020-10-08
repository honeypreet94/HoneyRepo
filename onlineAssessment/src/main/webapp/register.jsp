<%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<html>
    <head>
        <title> Register Page </title>
        <script type="text/javascript">
        function firstNameMsg(textbox)
           {

           var regex = /[A-Za-z]/;
           	var text=textbox.value;
        	if(text.length==0)
           		textbox.setCustomValidity("Please fill out Required field");
           	else if(!regex.test(text))
                 textbox.setCustomValidity('Please match the requested format');
           	else
           		textbox.setCustomValidity('');
         	return true;
           }

            function passwordInvalid(textbox)
                      {
                           var text=textbox.value;
                           if(text.length==0)
                              textbox.setCustomValidity("Please fill out Required field");
                           else if(text.length<8)
                               textbox.setCustomValidity('Please match the requested format');
                            else
                               textbox.setCustomValidity('');
                        return true;
                      }

            function emailInvalid(textbox)
            {
                var text=textbox.value;
                 var regex =/([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})/ ;
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
    <body>
        <h2> Registration </h2>
        <form:form method="POST" action="/registerpage">
            <form:label path="firstName"> First Name : </form:label>
            <form:input type="text" path="firstName" required="required"  oninput="firstNameMsg(this)"/>
            <br><br>
            <form:label path="lastName"> Last Name : </form:label>
            <form:input type="text" path="lastName" required="required"   oninput="firstNameMsg(this)"/>
             <br><br>
            <form:label path="emailId"> Email ID : </form:label>
             <form:input type="text" path="emailId" required="required"  oninput="emailInvalid(this)"/>
             <br><br>
             <form:label path="password"> Password : </form:label>
              <form:input type="password" path="password" required="required"   oninput="passwordInvalid(this)"/>
              <br><br>
               <input type="submit" value="REGISTER"/>

         </form:form>

    </body>

</html>