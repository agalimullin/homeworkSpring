<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
    <style>
        .text {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="text">
    <h1>Add new user:</h1>
<form action="${pageContext.request.contextPath}/submitValue">
    <input type="text" name="name">
    <input type="submit" value="Submit">
</form>
</div>
</body>
</html>