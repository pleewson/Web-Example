package main.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("start") == null || request.getParameter("end") == null) {
            response.getWriter().append("BRAK");
        }
        int start = Integer.parseInt(request.getParameter("start"));
        int end = Integer.parseInt(request.getParameter("end"));

        PrintWriter printWriter = response.getWriter();
        for (int i = start; i < end; i++) {
            printWriter.append(i + " ");
        }

    }
}
