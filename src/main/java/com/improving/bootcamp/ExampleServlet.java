package com.improving.bootcamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/css");
        PrintWriter out = resp.getWriter();
        out.println("#sidebar { min-height: 100vh; background-color: lightgray; }");
        out.println("#sidebar.active { margin-left: 250px; }");
        out.println("#logo { width: 100px; }");
        out.println("#logo img { width: 100px; margin: 10px auto 10px 40px; }");
    }
}
