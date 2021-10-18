<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here</title>
<link rel="stylesheet" href="main.css" type="text/css" />
</head>
<body>
<div class="card">
	<div class="container">
    <h1> Thanks you</h1>
    <p> Your info: </p>
    <label>Last Name: </label>
    <span>${user.lastName} </span>
    <br>
    <label>First Name: </label>
    <span>${user.firstName} </span>
    <br>
    <label>Heard from: </label>
    <span>${user.heardFrom} </span>
    <br>
    <label>Updates: </label>
    <span>${user.updates} </span>
    <br>
    <label>Contact via: </label>
    <span>${user.contactVia} </span>
    <br>
    <label>Email: </label>
    <span>${user.email} </span>
    <form action =""  method ="get">
    	<input type = "hidden" name = "action" value="join">
    	<input type = "submit" value="Return" id="submit">
    </form>
    </div>
    </div>
</body>
</html>