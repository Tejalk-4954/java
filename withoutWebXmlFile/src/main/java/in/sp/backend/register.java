package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class register extends HttpServlet {
 @Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
    System.out.println("inside register ");
 }
}
