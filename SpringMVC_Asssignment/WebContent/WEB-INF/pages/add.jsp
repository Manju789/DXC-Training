<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add details</title>
</head>
<body>
<font face="Times New Roman">
<center><h1>Noida Sports Academy</h1></center>

<br>

<h3>Add New Athlete Details</h3>
       <form:form method="post" action="save">  
      	<table border="2" cellspacing="2" cellpadding="2">  
         <tr>  
          <td><label for="athleteName">Athlete Name </label></td> 
          <td><input type="text" id="athleteName" name="athleteName"  required></td>
         </tr>  
         <tr>  
          <td>Gender</td>  
          <td>
          	  <label><input type="radio" name="athleteGender" value="Female"/>Female</label>
          	  <label><input type="radio" name="athleteGender" value="Male"/>Male</label>
          </td>
         </tr> 
         <tr>  
          <td><label for="category">Category</label></td>  
          <td><select id="category" name="category">
          		<option disabled selected>Select</option>
          			<optgroup>
          				<option>Running</option>
          				<option>High Jump</option>
          				<option>Hurdles</option>
          				<option>Relay</option>
          				<option>Shot Put</option>
          				<option>Javelin Throw</option>
          			</optgroup>
          	  </select>
          </td>
         </tr> 
         <tr>  
          <td><label for="athleteEmailId">Email </label> </td> 
          <td><input type="text" id="athleteEmailId" name="athleteEmailId" pattern="[a-z0-9_.@]*" title="abc@xyz.com"></td>
         </tr>  
         <tr>  
          <td>Mobile  </td> 
          <td><input id="athleteMobileNo" name="athleteMobileNo" pattern="[0-9]{10}" title="Number should have 10 digits. e.g. 9898989898"></td>
         </tr> 
         <tr>  
          <td><input type="submit" value="ADD" /><input type="submit" value="CANCEL" /> </td>
          <td><a href="index">Home</a></td>    
         </tr>  
        </table>  
       </form:form>  
       

</font>
</body>
</html>