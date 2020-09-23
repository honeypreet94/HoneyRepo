<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CreditCard-Home Page</title>
        
        <script type="text/javascript">
        
        function invalidMsg(textbox)
        {
        	var text=textbox.value;

        	var regex = /^[A-Z]{5}[0-9]{4}[A-Z]{1}?$/;
        	
        	if(text.length==0)
        		textbox.setCustomValidity("Please fill out Required field");
        	else if(text.length!=10 && !regex.test(text))
        		textbox.setCustomValidity('Please match the requested format which is 10 character alphanumeric');
        	else
        		textbox.setCustomValidity(''); 
        	
        	
        	
        	return true;
        }
        
        </script>
    </head>
    <body>
    	<h1>Check for Credit Card Eligbility</</h1>
    	<br><br>
    	<%-- <form method="POST" action="/onlinebanking/checkEligibility" >
    		<table>
    			<tr>
    				<td><label class="pan"> Enter Pan Number : </label> </td>
    				<td><input class="pan" required/> </td> 
    			</tr>
    			<tr>
    				<td><input type="submit" value="submit"></td>
    			</tr>
    		</table>
    	</form> --%>
    	<form:form method="POST" action="/onlinebanking/checkEligibility">
    		<table>
    			<tr>
    				<td><form:label path="pan"> Enter Pan Number : </form:label> </td>
    				<td><form:input path="pan" required="required" oninvalid="invalidMsg(this);" oninput="invalidMsg(this)"/> </td> 
    			</tr>
    			<tr>
    				<td><input type="submit" value="Check"></td>
    			</tr>
    		</table>
    	</form:form>
        
    </body>
</html>
