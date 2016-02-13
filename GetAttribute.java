import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class GetAttribute extends HttpServlet
{
  public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    HttpSession ses = req.getSession(true);
	ServletContext ctx = getServletContext();
    String str1 = (String)ses.getAttribute("single");
    String str2 = (String)ctx.getAttribute("multi");
	out.println("<br>SingleUser Attribute : "+str1);
	out.println("<br>MultiUser Attribute: "+str2+"</h1>");
  }
}
