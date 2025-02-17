<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Post</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Create Post</h2>
        <form action="createPost" method="post">
            <label>Title:</label> <input type="text" name="title" required><br><br>
            <label>Content:</label> <textarea name="content" rows="10" required></textarea><br><br>
            <input type="submit" value="Create Post">
        </form>
    </div>
</body>
</html>
    