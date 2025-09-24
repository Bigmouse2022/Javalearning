package Servlet_JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cookie/index")
public class CookieIndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CookieIndexServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Cookie[] cs= req.getCookies();
      if(cs==null){
          resp.getWriter().println("user not login");
          return;
      }
      String user=null;
      for(Cookie c:cs){
          System.out.println(c.getName()+":"+c.getValue());
          if(c.getName().equals("user")){
              user=c.getValue();
              break;
          }
      }
      if(user==null){
          resp.getWriter().println("user not login");
      }else{
          resp.getWriter().println("user:"+user);
      }
    }
}
