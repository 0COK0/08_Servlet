package com.ohgiraffers.assignment01;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/registers")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String id2 = request.getParameter("id2");
        String password2 = request.getParameter("password2");
        String confirm = request.getParameter("confirm");
        String nicName = request.getParameter("nicName");
        String phone = request.getParameter("phoneNum");

        System.out.println("id2 = " + id2);
        System.out.println("password2 = " + password2);
        System.out.println("confirm = " + confirm);
        System.out.println("nicName = " + nicName);
        System.out.println("phoneNum = " + phone);

        request.setAttribute("id2", id2);
        request.setAttribute("password2", password2);
        request.setAttribute("confirm", confirm);
        request.setAttribute("nicName", nicName);
        request.setAttribute("phoneNum", phone);

        RequestDispatcher rd2 = request.getRequestDispatcher("/logout");

        rd2.forward(request, response);
    }
}
