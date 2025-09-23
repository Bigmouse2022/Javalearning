package Servlet_learning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestMethodServlet extends HttpServlet {
    //处理get请求
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        response.getWriter().println("<h1 style='color:green'>"+name+"</h1>");
    }
    //处理post请求
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        response.getWriter().println("<h1 style='color:red'>"+name+"</h1>");
    }
}
