<%-- 
    Document   : example03
    Created on : Feb 10, 2025, 8:35:18 AM
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
            for(int i=2;i<=9;i++){
               %>
               <hr/>
               <h3> Bảng Cửu Chương <%=i%></h3>
               <% for(int a = 1; a<=10; a++){
                   int b =i*a;
                   %>
                   <b> <%=i%> * <%=a%> = <%=b%> </b></br>                          
                   <%
               }
            } 
        %>
    </body>
</html>
