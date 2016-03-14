<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add group</title>
    <style>
        .text {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="text">

    <form action="/sendGroup" method="post">
        <input type="text" name="id" placeholder="id">
        <input type="text" name="name" placeholder="name">
        <input type="text" name="info" placeholder="info">
        <button>Submit</button>
    </form>
</div>
</body>
</html>