<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="container">
        <h2>Registration Form</h2>
        <form action="register" method="post">
            <label>Name:</label> <input type="text" name="name1" required><br><br>
            <label>Email:</label> <input type="text" name="email1" required><br><br>
            <label>Password:</label> <input type="password" name="pass1" required><br><br>
            <label>Phone No:</label> <input type="text" name="phone1"><br><br>
            <label>Gender:</label>
            <input type="radio" name="gender1" value="Male">Male
            <input type="radio" name="gender1" value="Female">Female<br><br>
            <label>City:</label>
            <select name="city1">
                <option> Select City </option>
                <option> Hyderabad </option>
                <option> Mumbai </option>
                <option> Pune </option>
                <option> Bangalore </option>
            </select><br><br>
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>