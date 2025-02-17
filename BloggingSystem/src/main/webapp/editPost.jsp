<%@ page import="com.example.model.Post" %>
<%
    Post post = (Post) request.getAttribute("post");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Post</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Edit Post</h2>
        <form action="editPost" method="post">
            <input type="hidden" name="id" value="<%= post.getId() %>">
            <label>Title:</label> <input type="text" name="title" value="<%= post.getTitle() %>" required><br><br>
            <label>Content:</label> <textarea name="content" rows="10" required><%= post.getContent() %></textarea><br><br>
            <input type="submit" value="Update Post">
        </form>
    </div>
</body>
</html>
