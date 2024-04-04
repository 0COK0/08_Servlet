package com.ohgiraffers.assignment01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/logout")
public class LogOut extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nicName = (String) request.getAttribute("nicName");

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h2 align=\"center\" style=\"color: green\">")

                .append(nicName)
                .append("님 회원 가입을 완료 되셨습니다.<h2>")
                .append("<body>\n")
                .append("</html>\n");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print(responseText.toString());

        out.flush();
        out.close();

    }
}
