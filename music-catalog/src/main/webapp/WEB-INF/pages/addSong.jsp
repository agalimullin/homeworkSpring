<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add song</title>
    <style>
        .text{
            text-align: center;
        }
    </style>
</head>
<body>
<div class = "text">
    <form action="/sendSong" method="post">
        <input type="text" name="name" placeholder="name">
        <input type="text" name="text" placeholder="text">
        <input type="text" name="albumID" placeholder="albumID">
        <button>Submit</button>
    </form>
</div>
</body>
</html>