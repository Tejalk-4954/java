<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>   
<style>
   
     .container{
        border:2px solid #ccc;
        width:500px;
        padding:50px;
        margin:auto;
        margin-top;100px;
        border-radius:10px;
        background-color:#f2f3;
        box-shadow:0 0 10px rgba(0,0,0,0.2);
     }
     body {
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
        background-color:purple;
        border:none;
        color:white;
        font-weight:bold;
        border-radius:4px;
        cursor:pointer;
        text-align:center;
        margin-top:25px;
     }  
     input[type="submit"]:hover{
       background-color:#32cd32;
     }
     
</style>
</head>
<body>
<div class="container">
<h2>Registration Form</h2>
 <form action="regform" method="post">
 
    <Label>Name:</Label>
    <input type="text" name="name"><br>
   
   
    <label>Email:</label>
    <input type="text" name="email"><br>
    
    <label>Password:</label>
    <input type="password" name="password"><br>
   
   
    <label>Gender:</label>
    <label>
    <input type="radio" id="male" name="gender" value="Male">
    Male</label><br>
    <label>
    <input type="radio" id="female" name="gender" value="Female">
    Female</label><br>
    <label>
    <input type="radio" id="other" name="gender" value="other">
   other</label><br>
    
    <label>City:</label>
    <input type="text" name="city"><br>
     <input type="submit" value="register">
     <P style="margin-top :10px;">Already Registered?<a href="login.jsp" style="color:#A52A2A;">Login</a></P>
   
 </form>
 </div>
</body>
</html>