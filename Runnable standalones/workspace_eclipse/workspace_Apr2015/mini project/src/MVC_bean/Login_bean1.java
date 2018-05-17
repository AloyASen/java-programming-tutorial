package MVC_bean;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconfig.Operation;

/**
 * Servlet implementation class Login_bean1
 */
@WebServlet("/Login_bean1")
public class Login_bean1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login_bean1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request,response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException, ServletException {
		response.setContentType("text/html");
		
		String pass=request.getParameter("password");
		String uname=request.getParameter("username");
		boolean flag=new Operation().validate(uname, pass);
		if(flag==true)
		{	/*HttpSession s=request.getSession();
			s.setAttribute("status",uname);
			response.sendRedirect("dashboard.jsp");*/
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request,response);
			
		}
		else
		{
			/*HttpSession s=request.getSession();
			s.setAttribute("status","User name or password Wrong");
			response.sendRedirect("index.jsp");*/
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}