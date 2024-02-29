package main.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rememberMe")
public class Cookie36 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<form method='post'>" +
                "name: <input type='text' name='name'><br>" +
                "Remember me:<input type='checkbox' name='checkbox'><br>" +
                "<input type='submit'>"+
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String checkbox = req.getParameter("checkbox");
        Cookie[] cookies = req.getCookies();
        String name = req.getParameter("name");

        if(checkbox != null && checkbox.equals("on")){
            Cookie cookie = new Cookie("name", name);
            cookie.setPath("/");
            cookie.setMaxAge(60*60);
            resp.addCookie(cookie);

            resp.getWriter().println("Welcome " + name);
        }else{
            for (Cookie cookie : cookies){
                if(cookie.getName().equals("name")){
                    resp.getWriter().println("Czesc " + cookie.getValue() + " Twoje dane zostaly wczytane z ciasteczka");
                }
            }
        }


    }
}
