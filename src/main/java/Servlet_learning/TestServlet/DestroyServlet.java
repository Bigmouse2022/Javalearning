package Servlet_learning.TestServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(urlPatterns = "/destroy" ,loadOnStartup = 4)
public class DestroyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("正在销毁");
    }
}
