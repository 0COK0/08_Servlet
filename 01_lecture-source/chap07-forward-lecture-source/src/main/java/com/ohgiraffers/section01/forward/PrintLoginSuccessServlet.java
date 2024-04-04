package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String userId = request.getParameter("userId");
//        String password = request.getParameter("password");
//
//        System.out.println("userId" + userId);
//        System.out.println("password" + password);


        String userId = (String) request.getAttribute("userId");

        // 화면에 보여주게 하려면 스트리빌더로 responseText로 서언해서
        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n") // 뒤에 붙이겠다
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("님 환영합니다.<h3>")
                .append("<body>\n")
                .append("</html>\n");

        response.setContentType("text/html");
        //내보내주려면
        PrintWriter out = response.getWriter();

        out.print(responseText.toString());

        out.flush();    // 강제로 밀어주고
        out.close();    // 닫아주고




    }
}
