package main.web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");

        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        cookie.setMaxAge(Integer.parseInt(req.getParameter("time")) * 60);

        resp.addCookie(cookie);
        resp.getWriter().println("added new cookie");
    }
}
