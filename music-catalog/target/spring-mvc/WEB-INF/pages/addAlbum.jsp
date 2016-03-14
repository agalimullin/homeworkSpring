<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add album</title>
    <style>
        .text{
            text-align: center;
        }
    </style>
</head>
<body>
<div class = "text">
    <form action="/sendAlbum" method="post">
        <input type="text" name="name" placeholder="name">
        <input type="text" name="groupID" placeholder="groupID">
        <input type="text" name="id" placeholder="id">
        <button>Submit</button>
    </form>
</div>
</body>
</html>