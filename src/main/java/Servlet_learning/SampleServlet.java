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
    //service是请求处理的核心方法，无论是get或者post都会被service()方法处理
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String methodName=request.getMethod();
        String name=request.getParameter("name");
        String moblie=request.getParameter("moblie");
        String sex=request.getParameter("sex");
        String[] specs=request.getParameterValues("spec");
        PrintWriter out= response.getWriter();//向浏览器输出的数据流
        out.println("<h1>methodName:"+methodName+"</h1>");
          out.println("<h1>name:"+name+"</h1>");
          out.println("<h1>moblie:"+moblie+"</h1>");
          out.println("<h1>sex:"+sex+"</h1>");
          for(int i=0;i< specs.length;i++){
              out.println("<h1>spec:"+specs[i]+"</h1>");
          }
          out.println("<a href='http://www.baidu.com'>baidu</a>");
    }

}
