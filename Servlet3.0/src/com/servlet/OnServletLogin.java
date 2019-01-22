package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnServletLogin
 */
@WebServlet("/login")
public class OnServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		
		if(user.equals("java4s")  && pass.equals("java4s"))
		{
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, res);
			
		}
		else
		{
			pw.println("login failed...");
		}
		
		pw.close();
	}

}
