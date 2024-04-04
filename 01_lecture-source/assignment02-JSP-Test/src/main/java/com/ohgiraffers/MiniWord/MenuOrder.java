package com.ohgiraffers.MiniWord;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String menuName = request.getParameter("menuName");
        int amount = Integer.parseInt(request.getParameter("amount"));

        System.out.println("menuName = " + menuName);
        System.out.println("amount = " + amount);

        int orderPrice = 0;

        switch (menuName) {
            case "감자튀김세트" : orderPrice = 5000 * amount; break;
            case "빵빵와플" : orderPrice = 5500 * amount; break;
            case "빵빵츄러스" : orderPrice = 3500 * amount; break;
            case "빵빵솜사탕" : orderPrice = 2500 * amount; break;
            case "빵빵에이드" : orderPrice = 4500 * amount; break;
        }

        request.setAttribute("menuName", menuName);
        request.setAttribute("amount", amount);
        request.setAttribute("orderPrice", orderPrice);

        RequestDispatcher rd = request.getRequestDispatcher("/jsp/04_sell.jsp");

        rd.forward(request, response);




    }
}
