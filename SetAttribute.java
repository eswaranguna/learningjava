import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class SetAttribute extends HttpServlet
{
  public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
	res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    HttpSession ses = req.getSession(true);
	String str1 = (String)ses.getAttribute("single");
	if(str1==null)
	{
		String single =req.getParameter("single");
		String multi = req.getParameter("multi");
		ses.setAttribute("single",single);
		getServletContext().setAttribute("multi",multi);
		out.println("<br>Value Added to Session State");
		out.println("<br><form method=post>"+
		"<input type=submit value=getValue></form>");
		return;
    }
    res.sendRedirect("GetAttribute");
  }
}
