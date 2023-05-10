package com.raghu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p style="text-align:center"><span style="color:#2980b9"><strong><span style="font-size:26px">WELCOME TO GRADLE APPLICATION</span></strong></span></p>");
        out.println("<p style="text-align:center"><span style="color:#e74c3c"><span style="font-size:20px"><strong>By Mr. RAGHU</strong></span></span></p>");
        out.println("<p style="text-align:center"><span style="color:#ffffff"><span style="font-size:22px"><strong><span style="background-color:#f1c40f">(Developer and Trainer | Fullstack = Java + DevOps + AWS + ReactJS)</span></strong></span></span></p>");
        out.println("</body></html>");
    }
}
