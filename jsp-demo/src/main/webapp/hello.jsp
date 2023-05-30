<%--
  Created by IntelliJ IDEA.
  User: 23731
  Date: 2023/5/26
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP,Hello World</h1>
    <%
        System.out.println("hello,jsp~");
        int i=3;
    %>

    <%=
    "hello"
    %>

    <%=
    i
    %>

    <%!
        void show(){

        }
        String name = "zhangsan";
    %>


</body>
</html>

