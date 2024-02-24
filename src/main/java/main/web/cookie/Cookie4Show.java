package main.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        if(cookies != null) {
            for (Cookie c : cookies) {
                String cookieName = c.getName();
                String linkToDel = "<a href='http://localhost:8080/removeCookie?cookieName=" + cookieName + "'<button>Delete</button> </a>";
                resp.getWriter().println(cookieName + " " + linkToDel);
                resp.getWriter().println("<p></p>");
            }
        }else{
            resp.getWriter().println("There are no cookies");
        }
    }
}
