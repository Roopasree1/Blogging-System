<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="login" method="post">
            <label>Email:</label> <input type="text" name="email1" required><br><br>
            <label>Password:</label> <input type="password" name="pass1" required><br><br>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
    