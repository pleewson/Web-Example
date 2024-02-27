package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String selectLangOption = req.getParameter("lang");
        Cookie cookie = new Cookie("lang", selectLangOption);
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60);
        resp.addCookie(cookie);

    }
}
