<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Blog Posts</title>
</head>
<body>
    <h2>Recent Posts</h2>
    <a href="createPost.jsp">Create a New Post</a>
    <hr>
    <c:forEach var="post" items="${posts}">
        <h3>${post.title}</h3>
        <p>${post.content}</p>
        <hr>
    </c:forEach>
</body>
</html>
