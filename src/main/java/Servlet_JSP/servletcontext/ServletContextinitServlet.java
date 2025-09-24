package Servlet_JSP.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletcontext/init")
public class ServletContextinitServlet extends HttpServlet {

    public ServletContextinitServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ServletContext context=  req.getServletContext();
      context.setAttribute("copyright","c 2018 dazz 自备");
      context.setAttribute("title","程序员的梦工厂");
      resp.getWriter().println("init success");
    }
}
