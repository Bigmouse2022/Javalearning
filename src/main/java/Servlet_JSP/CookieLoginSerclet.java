package Servlet_JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/login")
public class CookieLoginSerclet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CookieLoginSerclet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户登录成功");
        Cookie cookie=new Cookie("user","admin");
        cookie.setMaxAge(60*60*24*7);//7天
        resp.addCookie(cookie);
        resp.getWriter().println("login success");
    }
}
