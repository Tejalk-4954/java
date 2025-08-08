package in.uss.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/abc")
public class Myservlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

       String Myname=req.getParameter("name1");
       String Myemail=req.getParameter("email1");
       
       System.out.println("Name:"+Myname);
       System.out.println("Email:"+Myemail);
       
       PrintWriter out=res.getWriter();
       out.print("Name:"+Myname);
       out.print("Email:"+Myemail);
;	}

}
