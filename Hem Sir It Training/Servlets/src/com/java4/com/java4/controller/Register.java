package com.java4.com.java4.controller;

import com.java4.com.java4.com.java4.services.Userdao;
import com.java4.com.java4.dto.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Pravat Kiran Timsina on 6/13/2017.
 */
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String address=req.getParameter("address");

        user user1=new user();
        user1.setName(name);
        user1.setEmail(email);
        user1.setAddress(address);
        user1.setPassword(password);

        Userdao.registerUser(user1);
        resp.sendRedirect("index.html");
//        resp.getWriter().print("<h1 style='color:red'>registered!!!! "+name+"</h1>");
    }
}
