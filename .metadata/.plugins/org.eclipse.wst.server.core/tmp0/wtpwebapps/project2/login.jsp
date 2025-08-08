<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
       .container{
        border:2px solid #ccc;
        width:400px;
        padding:50px;
        margin:auto;
        margin-top;200px;
       
        border-radius:10px;
        background-color:skyblue;
        box-shadow:0 0 10px rgba(0,0,0,0.2);
     }

    body{
         font-family:Arial, sans-serif;
       background-color:#f0f0f0;
    }
    
    h2{
        text-align:center;
        margin-bottom:20px;
     }
     
     label{
        display:block;
        margin-bottom:5px;
        font-weight:bold;
     }
     
      input[type="text"]
     input[type="password"]
     {
        width:100%;
        padding:8px;
        margin-bottom:20px;
        border:1px solid black;
        border-radius:4px;
        
     }   
      input[type="submit"]
     {
        width:100%;
        padding:10px;
        background-color:Green;
        border:none;
        color:white;
        font-weight:bold;
        border-radius:4px;
        cursor:pointer;
        text-align:center;
        margin-top:25px;
     }  
     input[type="submit"]:hover{
       background-color:brown;
     }
</style>
</head>
<body>
<div class="container">
<h2>Login</h2>
<form action="login" method="post">
    <label>Email:</label>
    <input type="text"  name="email"><br>
    <label>Password:</label>
    <input type="password"  name="password"><br>
     <input type="submit" value="Login">
</form>
</div>
</body>
</html>