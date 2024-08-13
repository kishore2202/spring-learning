<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addAlien">
	Enter id: <input type="number" name="aid"><br>
	Enter name: <input type="text" name="aname"><br>
	Enter language: <input type="text" name="lang"><br>
	<input type="Submit" value="Submit">
	</form><br>
	<form action="readAlien">
	Enter id to search: <input type="number" name="aid"><br>
	<input type="Submit" value="Submit">
	</form><br>
	<form action="deleteAlien">
	Enter id to delete: <input type="number" name="aid"><br>
	<input type="Submit" value="Submit">
	</form><br>
	<form action="update">
	Enter id: <input type="number" name="aid">
	update name: <input type="text" name="name">
	update lang: <input type="text" name="lang"><br>
	<input type="submit" value="Submit">
	</form>
</body>
</html>
