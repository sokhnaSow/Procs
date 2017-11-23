<%@page import="domain.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>

<html:html>
	<head>
		<title><bean:message key="add.contact"/></title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<html:base/>
	</head>
	
	<body style="background-color:#FFFACD">
		<div class="container">
			<html:form action="/AddContact" styleClass="form-horizontal">
			
				<div style="color: red">
					<html:errors/>
				</div>
				<center>
					<h3><bean:message key="details.entered"/></h3> <br><br>
				</center>
				
				<center>
					<table>
						
							<tr>
								<td align="right"><bean:message key="form.firstName"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="firstName" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.lastName"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="lastName" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.email"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="email" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.street"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="street" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.zip"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="zip" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.city"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="city" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.country"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="country" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.cellPhone"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="phoneKind" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
							<tr>
								<td align="right"><bean:message key="form.phone"/></td>
								<td align="left">
									<div class="col-sm-10">
										<html:text property="phoneNumber" size="30" maxlength="30" styleClass="form-control" /> <br>
									</div>
								</td>
							</tr>
							
					</table> <br><br><br>
					
					<html:submit property="btn" value="Enregistrer">Save</html:submit>
					
				</center>
				
				<br><br>
			
			</html:form>
			
		</div>
		
		<html:form action="/Retour">
		<center>
			<html:submit property="btn" value="Retour au menu principal"></html:submit>
		</center>
		</html:form>
	</body>
</html:html>
