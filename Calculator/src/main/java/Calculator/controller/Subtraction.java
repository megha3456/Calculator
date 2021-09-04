package Calculator.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Addition
 */
public class Subtraction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Subtraction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<title>SUBTRACTION</title>");


				 
				double n1 = Double.parseDouble(request.getParameter("txtN1"));
				double n2 = Double.parseDouble(request.getParameter("txtN2"));
				double result =0;
				String opr=request.getParameter("opr");
				if(opr.equals("-")) {
					result = n1-n2;
					 out.println(" Difference of "+n1+" and "+n2+" = "+result+""); 
					 RequestDispatcher rd = request.getRequestDispatcher("First.html");
					 rd.include(request, response); 
				}
		   }    
	}


