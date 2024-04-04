
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>메뉴 주문</h1>
    <form action="/menu/order" method="post">
    <select id="menu" name="menuName">
        <option value="감자튀김세트">감자튀김 세트</option>
        <option value="빵빵와플">빵빵와플</option>
        <option value="빵빵츄러스">빵빵츄러스</option>
        <option value="빵빵솜사탕">빵빵솜사탕</option>
        <option value="빵빵에이드">빵빵에이드</option>
    </select>
    <input type="number" min="0" max="100" step="1" name="amount">
    <button type="submit">선택 완료</button>
    </form>

</body>
</html>
