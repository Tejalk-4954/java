package in.uss.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String myemail=req.getParameter("email");
	String pass=req.getParameter("pass1");
	
	PrintWriter out=res.getWriter();
	
	if(myemail.equals("tej@gmail.com") && pass.equals("tejal") )
	{   
		req.setAttribute("namekey","tejal" );
		RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
		rd.forward(req, res);
	}
	else
	{   
		res.setContentType("text/html");
		out.print("<h3 style='color:red'>email and password are incorrect</h3>");
	  	RequestDispatcher rd= req.getRequestDispatcher("/index.html");
	  	rd.include(req, res);
	}
	}

}
