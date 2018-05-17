package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		if(uname.equals("admin") && pass.equals("123")){
			RequestDispatcher r=request.getRequestDispatcher("servlet2");
			r.forward(request, response);
			
		}
		else{
			RequestDispatcher r=request.getRequestDispatcher("index.html");
			o.print("uname or pass wrong");
			r.include(request, response);
			
		}
		
	}

}
