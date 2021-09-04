package Calculator.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Addition
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
				
		        String opr = request.getParameter("opr");
		
				if(opr.equals("+")) {
					RequestDispatcher rd = request.getRequestDispatcher("Addition");
					rd.forward(request, response); 
				}
				else if (opr.equals("-")){
					RequestDispatcher rd = request.getRequestDispatcher("Subtraction");
					rd.forward(request, response);
					
				}else if (opr.equals("*")){
					RequestDispatcher rd = request.getRequestDispatcher("Multiplication");
					rd.forward(request, response);
					
				}else if (opr.equals("/")){
					RequestDispatcher rd = request.getRequestDispatcher("Division");
					rd.forward(request, response);
				}	
				
				 
				}    
	}


