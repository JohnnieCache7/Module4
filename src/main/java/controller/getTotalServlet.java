package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShoppingCart;

/**
 * Servlet implementation class getItemServlet
 */
@WebServlet("/getTotalServlet")
public class getTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userCost = request.getParameter("userCost");
		
		ShoppingCart userTax = new ShoppingCart(Double.parseDouble(userCost));
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userTax.toString());
		//writer.close();
		
		request.setAttribute("userTax", userTax);
		getServletContext().getRequestDispatcher("/total.jsp").forward(request, response);
	}

}
