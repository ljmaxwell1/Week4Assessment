package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NameSeperator;

/**
 * Servlet implementation class getNameSeperatorServlet
 */
@WebServlet("/getNameSeperatorServlet")
public class getNameSeperatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNameSeperatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		NameSeperator userNames = new NameSeperator(userName);
				
		
		request.setAttribute("userCoinPouch", userNames);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(userNames.toString());
		//writer.close();
	}

}
