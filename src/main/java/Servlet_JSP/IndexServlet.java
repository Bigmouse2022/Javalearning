package Servlet_JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/direct/index")
public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    public IndexServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=(String)req.getAttribute("username");
        resp.getWriter().println("index Page,current username is "+username);
    }
}
