package main.web.cookie;

import org.apache.tomcat.util.buf.Utf8Encoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        boolean enter = false;
        for(Cookie c : cookies){
            if(c.getName().equals("cookie51")){
                c.setMaxAge(0);
                resp.addCookie(c);

                resp.getWriter().println("Witamy na stronie Cookie52");
                enter = true;
            }
        }

        if(enter == false){
            String message = "Nie odwiedziłeś jeszcze tej strony";
            resp.sendRedirect("http://localhost:8080/cookie51?msg="+ URLEncoder.encode(message, "UTF-8"));
        }
    }
}
