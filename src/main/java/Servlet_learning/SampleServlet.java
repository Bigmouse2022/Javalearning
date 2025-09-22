package Servlet_learning;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        PrintWriter out= response.getWriter();//向浏览器输出的数据流
          out.println("<h1>name:"+name+"</h1>");
          out.println("<a href='http://www.baidu.com'>baidu</a>");


    }
}
