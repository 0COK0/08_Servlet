package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("이 서블릿으로 redirect 성공");

        StringBuilder redirectText = new StringBuilder();
        redirectText.append("<!doctype html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>이 서블릿으로 redirect 성공!</h1>\n")
                .append("</body>\n")
                .append("</html>\n");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(redirectText.toString());
        out.flush();
        out.close();

        /* redirect하면 url이 재작성되어 새로고침할 때 된 페이지에 대한 요청을 반복한다.
        * 즉, 이전 요청에 포함된 정보는 남아있지 않고 url이 변경되는 것이 의 특징이다.
        * http 요청은 요청시 잠시 connection을 맺고, 응답 시에도 잠시 connection을 맺으며
        * 요청 단위당 리퀘스트 객체는 한 개만 생성된다.
        * 따라서 첫요청시의 request와 현재 redirect된 페이지의 request는 서로 다른 객체이므로,
        * 리다이렉트는
        *
        * */
    }
}
