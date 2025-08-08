<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
  int a=50;
  String name="harry";
  
  int add(){
	  return a+a;
  }
%>

<%
   out.println("name:"+name);
   out.println("a:"+a);
    out.println(add());
    
    int  num =100;
    if(num<200)
    {
    	out.println("no is smaller than 200");
    }
    else
    {
    	out.println("num is greater than 200");
    }
    
    for(int i=1;i<=10;i++)
    {
    	out.println(i);
    }
%>

<%= a %>
<%= name %>

</body>
</html>