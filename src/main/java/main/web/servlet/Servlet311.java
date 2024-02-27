package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {

    final private String FORMAT_TEMPLATE = "<form action=\"servlet312\" method=\"post\">\n" +
            "    <p>SELECT LANGUAGE</p>\n" +
            "    <select  name=\"lang\">\n" +
            "        <option value=\"en\">en</option>\n" +
            "        <option value=\"pl\">pl</option>\n" +
            "        <option value=\"de\">de</option>\n" +
            "        <option value=\"es\">es</option>\n" +
            "        <option value=\"fr\">fr</option>\n" +
            "    </select>\n" +
            "    <input type=\"submit\">\n" +
            "</form>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(FORMAT_TEMPLATE);

        Cookie[] cookies = req.getCookies();
        Cookie langCookie = new Cookie("lang", "pl");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lang")) {
                    langCookie = cookie;
                    break;
                }
            }
        }

        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");

        for (Map.Entry<String, String> mapEntry : lang.entrySet()) {
            if (langCookie.getValue().equals(mapEntry.getKey())) {
                resp.getWriter().println(mapEntry.getValue());
                break;
            }
        }


    }
}
