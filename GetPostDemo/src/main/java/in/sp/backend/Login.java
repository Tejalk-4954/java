package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String Myemail=req.getParameter("email");
		String Mypass=req.getParameter("pass1");
		
		if(Myemail.equals("abc@gmail.com")&& Mypass.equals("abc@123"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("failed");
		}
	}
	

}
