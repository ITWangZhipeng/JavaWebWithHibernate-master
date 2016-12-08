package com.sec.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;

/**
 * Created by Administrator on 2016/12/8.
 */
@WebServlet(name = "Test", urlPatterns = "/servlet/Test")
public class Test extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("Hello User.");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
