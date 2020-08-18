<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Athlete Details</title>
</head>
<body>
<font face="Times New Roman">
<center><h1>Noida Sports Academy</h1></center>

<br>
<h2>Athletics Registration System:</h2>
<br>


<table border = 2 width = "80%" cellpadding = "2" cellspacing = "2">
 <tr>
 <th>Athlete ID</th>
 <th>Athlete Name</th>
 <th>Gender</th>
 <th>Category</th>
 <th>Email Id</th>
 <th>Mobile</th>
 </tr>
 
 <c:forEach var="athlete" items = "${list}">
 <tr>
 <td>${athlete.athleteId}</td>
 <td>${athlete.athleteName}</td>
 <td>${athlete.athleteGender}</td>
 <td>${athlete.category}</td>
 <td>${athlete.athleteEmailId}</td>
 <td>${athlete.athleteMobileNo}</td>
 </tr>
 </c:forEach>

</table>
<br>
<a href="index">Home</a>

</font>
</body>
</html>