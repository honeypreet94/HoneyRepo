          <%@ page language="java" contentType="Text/html; charset=UTF-8" pageEncoding="UTF-8" %>
          <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
          <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

          <Html>
              <head>
                  <Title> CampaignRegisterationSystem </Title>
              </head>

              <body>
                  <h1> Login to Campaign Registration Management System </h1>
                  <br>
                  <h2> Login </h2>
                  <br>
                  <form:form method="POST" action="/login">
                      <form:label path="email_id"> Email ID : </form:label>
                      <form:input type="text" path="email_id" required="required" />
                      <br><br>
                      <form:label path="password"> Password : </form:label>
                      <form:input type="password" path="password" required="required"/>
                      <br><br>
                      <input type="submit" value="LOGIN"  />
                      <br><br>

                  </form:form>

              </body>
          </html>