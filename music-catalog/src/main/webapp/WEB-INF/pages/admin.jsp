<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administrator page</title>
    <style>
        .text {
            text-align: center;
            color: darkblue;
        }
    </style>
</head>
<body>
<div class="text">

    <h1> Hello, my friend. What are you want to do now? </h1>
    <hr>
    <a href="/addGroup">I wanna add new music group</a><br>
    <a href="/addAlbum">I wanna add new album for existing group </a><br>
    <a href="/addSong">I wanna add new song for existing group's album </a>
    <hr>
    <br>
    <a href="/showGroups">Show me all music groups, please</a><br>
</div>
</body>
</html>
