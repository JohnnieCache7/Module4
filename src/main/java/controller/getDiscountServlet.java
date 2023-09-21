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
 * Servlet implementation class getDiscountServlet
 */
@WebServlet("/getDiscountServlet")
public class getDiscountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDiscountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userCost = request.getParameter("userCost2");
		
		ShoppingCart userDiscount = new ShoppingCart(Double.parseDouble(userCost));
		
		//PrintWriter writer = response.getWriter();
		//writer.println(discount.toString());
		//writer.close();	
		request.setAttribute("userDiscount", userDiscount);
		getServletContext().getRequestDispatcher("/discount.jsp").forward(request, response);
	}

}
