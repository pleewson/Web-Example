package main.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("cookie51","thisIsCookie51");
        cookie.setPath("/");
        resp.addCookie(cookie);

        String linkToCookie52 = "<a href='http://localhost:8080/cookie52'> Go To Cookie52 </a>";
        resp.getWriter().println(linkToCookie52);

    }
}
