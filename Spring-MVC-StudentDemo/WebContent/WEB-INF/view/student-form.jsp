<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action= "processForm" modelAttribute="student">

		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name: <form:input path="lastName"/>	
		
		<br><br>
		
		Country:
		
		<form:select path="country">
		
		<!-- For Normal Dropdown List
		<form:option value="India" label="India"></form:option>
		<form:option value="Germany" label="Germany"></form:option>
		<form:option value="USA" label="USA"></form:option>
		<form:option value="France" label="France"></form:option>
		 -->
		 
		 <!-- To get the dropdown values from simple Java class -->
		 
		 <form:options items = "${student.countryOptions}"/>
		 
		</form:select>
		
		<br><br>
		<input type="submit" value="Submit">
	
	</form:form>

</body>

</html>