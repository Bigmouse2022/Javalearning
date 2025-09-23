<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2025/9/23
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
    boolean isPrime(int num) {
        boolean flag = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
%>
<%
    List<Integer> primes=new ArrayList();
    for (int i = 2; i < 1000; i++) {
        boolean flag = isPrime(i);
        if (flag == true) {
//            out.println("<h1>" + i + "</h1>");
            primes.add(i);
        }
    }
%>
<%
    for(int p:primes){
      //  out.println("<h1>+"+p+"是质数</h1>");
%>
<h1><%=p %>是质数</h1>
<%
    }
%>
</body>
</html>
