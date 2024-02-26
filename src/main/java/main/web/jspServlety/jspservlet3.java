package main.web.jspServlety;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jspservlet3")
public class jspservlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("foo","bar");
        cookie.setPath("/");
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/third3.jsp");
        dispatcher.forward(req, resp);
    }
}
