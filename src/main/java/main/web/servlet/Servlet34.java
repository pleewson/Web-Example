package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        boolean hasCookie = false;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visit")) {
                    hasCookie = true;
                }
            }
        }

        Cookie cookie;
        if (!hasCookie) {
            cookie = new Cookie("visit", "1");
            cookie.setMaxAge(60 * 60);
            cookie.setPath("/");
            resp.addCookie(cookie);
            resp.getWriter().println("Welcome first time on our site");
        } else {
            for (Cookie c : cookies) {
                if (c.getName().equals("visit")) {
                    resp.getWriter().println("Welcome, you have visited us already " + c.getValue() + " times");
                    int numVisits = Integer.parseInt(c.getValue()) + 1;
                    c.setValue(String.valueOf(numVisits));
                    resp.addCookie(c);
                }
            }


        }
    }
}
