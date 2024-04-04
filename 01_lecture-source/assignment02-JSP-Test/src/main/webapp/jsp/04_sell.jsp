<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sell</title>
</head>
<body>

    <%
        String menuName = (String) request.getAttribute("menuName");
        int amount = (Integer) request.getAttribute("amount");
        int orderPrice = (Integer) request.getAttribute("orderPrice");
    %>
    <h3>주문하신 음식 : <%= menuName %></h3>
    <h3>주문하신 음식 수량 : <%= amount %>인분</h3>
    <h3>주문하신 음식 가격은 : <%= orderPrice %>원</h3>
    <button type="button" onclick="location.href='/'">홈으로</button>

</body>
</html>
