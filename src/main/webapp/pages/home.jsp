<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
div{
	border: 1px solid black;
  background-color: lightblue;
  padding-top: 50px;
  padding-right: 50px;
  padding-bottom: 50px;
  padding-left: 50px;
  margin-left: 90px;
  margin-right: 90px;
}
</style>
<title>Home Page</title>
</head>

<body>

<center>
<!-- <h1>List of Aliens</h1>
<form action="/getAllAlien">
<input type="submit" name="All List"><br/>
</form> -->
<h1> Welcome</h1>
<div>
<h1>Add Alien</h1>
<form action="/addAlien">
Name: <input type="text" name="aname"><br/><br/>
Technology: <input type="text" name="tech"><br/><br/>
<input type="submit" name="Save"><br/>
</form>
</div>
<br><br>

<div>
<h1>Find Alien by ID</h1>
<form action="/getAlien">
Id: <input type="text" name="aid"><br/><br/>
<input type="submit" name="Search"><br/>
</form>
</div>

<!-- <br><br>
<div>
<h1>Find Alien by Technology</h1>
<form action="/getAlienTech">
Tech: <input type="text" name="tech"><br/><br/>
<input type="submit" name="Search"><br/>
</form>
</div> -->
</center>
</body>
</html>