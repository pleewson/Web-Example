package main.web.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc11")
public class mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role;
        if (req.getParameter("role") == null) {
            role = "guest";
        } else {
            role = req.getParameter("role");
            role = "ROLE_" + role.toUpperCase();
        }
        req.setAttribute("userRole", role);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp11.jsp");
        dispatcher.forward(req, resp);
    }
}
