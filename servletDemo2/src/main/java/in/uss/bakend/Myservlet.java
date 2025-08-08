package in.uss.bakend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitform")
public class Myservlet extends HttpServlet {
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	String MySearch=req.getParameter("search1");
    	
    	//res.sendRedirect("https://www.google.com");
    	res.sendRedirect("https://www.google.com/search?q="+MySearch);
    }	

}
