package swm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	// resp.sendRedirect("WEB-INF/jsp/filter/HelloWorldFilter.jsp");
	this.doPost(req, resp);
	System.out.println("doGet method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.sendRedirect("/swm/HelloWorldServlet.jsp");
	// String message = req.getParameter("message");
	// resp.setContentType("text/html");
	// // 实际的逻辑是在这里
	// PrintWriter out = resp.getWriter();
	// out.println("<h1>"+message+"</h1>");

	System.out.println("doPost method");
    }
}
