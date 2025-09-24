package Servlet_JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ua")
public class UserAgentServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

   public UserAgentServlet(){
       super();
   }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String userAgent=req.getHeader("User-Agent");
       resp.setContentType("text/html;charset=utf-8");
       resp.getWriter().println(userAgent);
       String output="";
       if(userAgent.indexOf("Windows NT")!=-1){
           output="<h1>PC端</h1>";
       }else if(userAgent.indexOf("iPhone")!=-1||userAgent.indexOf("Android")!=-1){
           output="<h1>移动端</h1>";
       }
       resp.getWriter().println(output);
    }
}
