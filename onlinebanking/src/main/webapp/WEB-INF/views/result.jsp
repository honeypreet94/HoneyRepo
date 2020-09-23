<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   
  <html>
  	<body>
  		
  		<c:set var="el" scope="session" value="${eligible }"/>	
  		
  		
  		<c:if test= "${error==1}">
  			<h2>Invalid Pan Entry !!!</h2>
  			<a href="/onlinebanking/">Enter Again</a>
  		</c:if>
  		<c:if test= "${error==0}">
  			<c:if test= "${eligible==0}">
  				<h2>Sorry!!! You are not eligible for a credit card</h2>
  			</c:if>
  		</c:if>
  		<c:if test= "${error==0}">
  			<c:if test= "${eligible==1}">
  				<h2>Congratulation!!! You are eligible for a credit card</h2>
  			</c:if>
  		</c:if>
  		<%-- <p>${decision}</p>
  		<p>${score}</p>
  		<p>${error}</p> --%>
  	</body>
  
  </html>