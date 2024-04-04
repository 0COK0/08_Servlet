    <!--페이지 지시자 태그-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--html 주석-->

    <%--jsp 주석 : 클라이언트에게 노출 되지 않는다. --%>

    <!--선언 태그--->
    <%!
        private String name;
        private int age;
    %>

    <!--scriptlet 태그--->
    <%
        name = "홍길동";
        age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    %>
    <!--ex 태그-->
name : <%= name %><br>
age : <%= age %>

</body>
</html>
