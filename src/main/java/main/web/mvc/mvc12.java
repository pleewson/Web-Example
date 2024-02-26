package main.web.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int start = Integer.parseInt(req.getParameter("start")) + 10;
        int end = Integer.parseInt(req.getParameter("end")) + 10;
        req.setAttribute("start", start);
        req.setAttribute("end", end);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp2.jsp");
        dispatcher.forward(req, resp);
    }
}
