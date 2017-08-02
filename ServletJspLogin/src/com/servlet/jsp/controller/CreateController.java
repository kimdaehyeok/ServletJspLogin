package com.servlet.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.jsp.vo.UserVO;

@WebServlet("/user/create")
public class CreateController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        UserVO userVO = new UserVO();
        
        userVO.setUserId(request.getParameter("userId"));
        userVO.setName(request.getParameter("name"));
        userVO.setPassword(request.getParameter("password"));
        userVO.setEmail(request.getParameter("email"));
        
        System.out.println(userVO.getName() + " " + userVO.getUserId() + " " +  userVO.getEmail());
        
        request.setAttribute("user", userVO);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/index.jsp");

        requestDispatcher.forward(request, response);
        
    }   
}
