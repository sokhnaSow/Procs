<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="s" uri="http://struts.apache.org/tags-nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <html:html>
   <head>
<title>Index</title>
</head>

<body style="background-color:#FFFACD;" >
<center>
<div class="container" >
<h2>Authentification</h2>
<br><br>
 <html:form action="/Login">
<table>
<tr>
 <td align="right">
            ID
          </td>
          <td align="left">
        
            <html:text property="userName" size="30" maxlength="30"/>
          </td>
 </tr>    
<tr>
 <td align="right">
            Password
          </td>
          <td align="left">
            <html:password property="password" size="30" maxlength="30"/>
          </td>
  </table>
   <html:submit>Save</html:submit>
 </html:form>
 </div>
 </center>
   </body>
 </html:html>