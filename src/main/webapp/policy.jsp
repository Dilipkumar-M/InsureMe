<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<script>

function createPolicy(){
	alert("inside create ");
	var form = document.getElementById("polcyForm");
	
	form.action="createpolicy";
	//alert (document.getElementById("polcyForm").action);
	form.method="POST";
	form.method.type="POST";
	//alert (document.getElementById("polcyForm").method);
	form.submit();
}

function updatePolicy(){
	var form = document.getElementById("polcyForm");
	form.action="updatepolicy";
	form.method="PUT";
	form.method.type="PUT";
	form.submit();
}

function deletePolicy(){
	var form = document.getElementById("polcyForm");
	form.action="deletepolicy";
	form.method="DELETE";
	form.method.type="DELETE";
	form.submit();
}
</script>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World web application</title>
</head>
<body>
   	<form action="addpolicy" id="polcyForm" type="POST">

	<br>
    	Enter your ID: <input type="text" name="id" size="20">
    <br>
    	Enter your name: <input type="text" name="name" size="20">
    <br>	
    	Enter your address: <input type="text" name="address" size="50">
    	
    <br>	
    	Enter your contact: <input type="text" name="contact" size="50">
    	
    	
    	  <table>
    <thead>
      <tr>
        <th>Policy ID</th>
        <th>Customer Name</th>
        <th>Customer Address</th>
        <th>Contact Number</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${policyList}" var="policy">
        <tr>
          <td>${policy.policyId}</td>
          <td>${policy.customerName}</td>
          <td>${policy.customerAddress}</td>
          <td>${policy.contactNumber}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
    	
    	
    	<input type="submit" value="Create Insurance"  onClick="createPolicy()"/>
    	<input type="button" value="Update Insurance"  onclick="updatePolicy()"/>
    	<input type="button" value="Delete Insurance"  onclick="deletePolicy()"/>
    	
	</form>
</body>
</html>
