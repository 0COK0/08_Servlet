package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

// 퍼스트 하위에 있는 모든 것들을 불러오겠다.
@WebFilter("/first/*")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("Filter init 호출");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter doFilter 호출");
        filterChain.doFilter(request, response);

        System.out.println("Servlet 확인");
    }

    @Override
    public void destroy() {

        System.out.println("Filter destroy 호출");
    }
}
