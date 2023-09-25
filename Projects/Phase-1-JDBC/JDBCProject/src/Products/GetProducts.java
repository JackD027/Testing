package Products;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetProducts
 */
@WebServlet("/getProduct")
public class GetProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public GetProducts() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "root");
			String searchName= request.getParameter("searchName");
			PreparedStatement ps = con.prepareStatement("select * from product where product_name='"+searchName+"'");
			ResultSet rs = ps.executeQuery();
			boolean found=false;
			while (rs.next()) {

				System.out.print("ID: " + rs.getString("id") + "\t");
				System.out.print("Product Name: " + rs.getString("product_name") + "\t");
				System.out.print("Quantity: " + rs.getString("quantity") + "\t");
				System.out.print("Category: " + rs.getString("category") + "\t");
				System.out.println("Price: " + rs.getString("price"));
				found=true;
			}
			if(!found) {
				System.out.println("No Product with given name");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}