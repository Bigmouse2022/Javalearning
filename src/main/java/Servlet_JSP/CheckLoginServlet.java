package Servlet_JSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CheckLoginServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户登录成功");
        req.setAttribute("username","admin");
        //实现了请求转发功能
        req.getRequestDispatcher("/direct/index").forward(req,resp);
        //响应重定向需要增加contextPath
        //resp.sendRedirect("/learn_java_Web_exploded/direct/index");
    }
}
