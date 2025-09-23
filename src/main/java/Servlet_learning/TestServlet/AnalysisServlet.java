package Servlet_learning.TestServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AnalysisServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("正在分析");
    }
}
