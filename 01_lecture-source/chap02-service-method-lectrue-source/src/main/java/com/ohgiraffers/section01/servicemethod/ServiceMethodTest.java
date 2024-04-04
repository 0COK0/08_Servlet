package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodTest extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) request; // 다운캐스팅을 해서
        HttpServletResponse httpResponse = (HttpServletResponse) response; // 받아와준다

        String httpMethod = httpRequest.getMethod();
        /* a태그의 href 속성은 화면의 url 내용을 변경하는 방식으로 GET 요청에 해당한다. */
        System.out.println("httpMethod" + httpMethod);

        if (("GET").equals(httpMethod)) {
            /* GET 요청을 처리할 메소드로 요청과 응답 정보를 전달한다. */
            doGet(httpRequest, httpResponse);
    } else if(("PDST").equals(httpMethod)); {
        doPost(httpRequest, httpResponse);
    }

}


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출");
    }
}
