package com.ohgiraffers.section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 클라이언트가 입력한 값이 뭐였는지 알아내려고
        // userId를 문자열로 리퀘스트.파라미터로 유일하게 하나만 넘겨오고
        // 다음페이지로 넘기려면 셋 어트리뷰트를 써서 속성 노드명을 새로운 속성값으로 변환(키값)()
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        System.out.println("userId : " + userId);
        System.out.println("password : " + password);

        // 리퀘스트의 속성값을 변경해서          키값에 저장
        request.setAttribute("userId", userId);
                            // 속성 노드명, 새로운 속성값

        // forward라는 메소드를 사용해 리퀘, 리스폰을
        // RequestDispatcher request에 담긴 정보를 저장하고 있다가
        // 다음 페이지에 저장한 정보를 볼 수 있게 계속 저장
        // 리퀘스트로 프린트로 겟방식으로 print에 전달
        RequestDispatcher rd = request.getRequestDispatcher("print");
            // 다른 리소스로 넘겨주는 역할
            rd.forward(request, response);

        // http 요청의 파라미터 값을 얻기 위해 사용하는 것이 requestParameter 메소드
        // 클라이언트가 입력한 값이 뭐였는지 알아 낼 수 있는게 리퀘스트.파라미터
    }
}
