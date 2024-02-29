package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        int c = Integer.parseInt(req.getParameter("c"));
        int d = Integer.parseInt(req.getParameter("d"));

        double avg = (a + b + c + d) / 4;
        int sum = a + b + c + d;
        int iloczyn = a * b * c * d;

        resp.getWriter().println("<p>Liczby:<br>" +
                a + "<br>" +
                b + "<br>" +
                c + "<br>" +
                d + "<br>" +
                "</p>" +
                "<p>Srednia:<br>" +
                avg + "</p>" +
                "<p>Suma:<br>" +
                sum + "</p>" +
                "<p>Iloczyn:<br>" +
                iloczyn + "</p>");
    }
}
