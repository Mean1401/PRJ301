<%-- 
    Document   : output
    Created on : Feb 10, 2025, 8:55:19 AM
    Author     : Hako1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int n = (int)request.getAttribute("n");
            %>
            <h3> Bảng Cửu Chương <%=n%></h3>
            <%
                for(int i = 1; i <= 10; i++){
            %>
                    <%=n%> + <%=i%> = <%=(i*n)%>
            <%
                }
            %>
    </body>
</html>
