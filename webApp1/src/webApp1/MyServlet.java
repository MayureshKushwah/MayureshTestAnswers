package webApp1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mayu")
public class MyServlet extends HttpServlet{
	

	public void init() throws ServletException {
System.out.println("from init---it will run only onces---always");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from servbi---it will run only onces---always");

	}
	@Override
	public void destroy() {
		System.out.println("from destroy---it will run only onces---always");

	}

}
