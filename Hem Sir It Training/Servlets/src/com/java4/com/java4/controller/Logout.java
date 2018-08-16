package com.java4.com.java4.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by USER on 6/20/2017.
 */
public class Logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession(false); //if session available destory but dont create new one

        if(session!=null){
            session.removeAttribute("user-name");
            session.invalidate();
            System.out.println("user logged out");
            resp.sendRedirect("index.html");

        }

    }
}
