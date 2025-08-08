<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile Page</title>
</head>
<body>
<%
    String myname = (String) request.getAttribute("namekey");
    if (myname != null) {
%>
    <h2>Welcome, <%= myname %>!</h2>
<%
    } else {
%>
    <h2>User information not found.</h2>
<%
    }
%>
</body>
</html>
