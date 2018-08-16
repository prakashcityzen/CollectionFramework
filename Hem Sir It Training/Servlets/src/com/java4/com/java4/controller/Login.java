package com.java4.com.java4.controller;

import com.java4.com.java4.com.java4.services.Validation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User on 6/19/2017.
 */
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name=req.getParameter("name");
    String password=req.getParameter("password");

        if(Validation.validate(name,password)){

            HttpSession session=req.getSession();

            session.setAttribute("user-name",name);
            session.setMaxInactiveInterval(1*60);

            resp.sendRedirect("profile.html");
        }else {
            resp.sendRedirect("login-form.html");
        }

    }
}
