package Servlet_JSP.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SessionIndexServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String sessionId=session.getId();
        System.out.println(sessionId);
        String name = (String) session.getAttribute("name");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("当前用户是：" + name);
    }
}
