<%--
  Created by IntelliJ IDEA.
  User: 803-02
  Date: 2024-04-04
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--응답을 해주는 서블릿-->
    <%
        String menuName = (String) request.getAttribute("menuName");
        int amount = (Integer) request.getAttribute("amount");
        int orderPrice = (Integer) request.getAttribute("orderPrice");
    %>
    <h3>주문하신 음식 : <%= menuName %></h3>
    <h3>주문하신 수량 : <%= amount %>인분</h3>
    <h3>결제하실 최종 금액 : <%= orderPrice %>원</h3>
    <h3></h3>
    <h3></h3>
</body>
</html>
