package com.sp.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
  
  private static final String query =" INSERT INTO BOOKDATA(BOOKNAME , BOOKEDITION , BOOKPRICE) VALUES(?,?,?)";
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter pw = resp.getWriter();
    
    resp.setContentType("text/html");
    // GET THE BOOK DETAILS
    String bookName= req.getParameter("bookName");
    String bookEdition = req.getParameter("bookEdition");
    float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));
    // load the driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException cnf) {
      cnf.printStackTrace();
      
    }
    //generate the connection
    try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","Aditi@31"); 
      PreparedStatement ps = con.prepareStatement(query);){
      ps.setString(1, bookName);
      ps.setString(2, bookEdition);
      ps.setFloat(3, bookPrice);
      int count = ps.executeUpdate();
      if(count==1) {
        pw.println("<h2>registered sucessfully</h2>");
      }
      else
      {
        pw.println("<h2>not registered </h2>");
      }
    }
    catch(SQLException se) {
      se.printStackTrace();
      pw.println("<h1>" + se.getMessage()+"<h2>");
    }catch(Exception e) {
      e.printStackTrace();
      pw.println("<h1>" + e.getMessage()+"<h2>");
    }
    pw.println("<a href='index.html'>Home</a>");
    pw.println("<br>");
    pw.println("<a href=\"booklist\">List Of Books</a>");
    
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req,resp);
  }
}