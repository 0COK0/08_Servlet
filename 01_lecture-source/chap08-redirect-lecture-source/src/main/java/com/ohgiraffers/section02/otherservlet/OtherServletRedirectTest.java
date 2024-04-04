package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServletRedirectTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("redirect");
        // 쿼리스트링 방식으로 넘기면 url에 노출되어 좋지 않음
        // 클라이언트에 쿠키를 넘겨주는데 쿠키는 보안에 취약함
        // 사용자마다 공간을 만들어 서버에 저장해 각자에 공간에 저장
        // 민감한 정보는 섹션에 저장
    }
}
