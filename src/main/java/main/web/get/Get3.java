package main.web.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int width = 5;
        int height = 10;

        if (request.getParameter("width") != null) {
            width = Integer.parseInt(request.getParameter("width"));

        }
        if (request.getParameter("height") != null) {
            height = Integer.parseInt(request.getParameter("height"));
        }


        int sum = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                sum = i * j;
                response.getWriter().append(sum + " ");
            }
            response.getWriter().println();
        }
    }
}
