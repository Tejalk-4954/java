<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
     String myname=(String)request.getAttribute("namekey");
  %>
  
  <h2>Welcome :<%= myname %></h2>
   <a href="profile.jsp">profile</a><br>
   <a href="aboutus.jsp">about us</a>
</body>
</html>