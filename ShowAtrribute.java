import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ShowAttributes")
public class ShowAttributes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	   	String single =req.getParameter("txt1");
			String multi = req.getParameter("txt2");
			out.println("<br>SingleUser Attribute : "+single);
			out.println("<br>MultiUser Attribute: "+multi+"</h1>");
			return;
	  	}

}
