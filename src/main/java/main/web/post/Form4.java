package main.web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm4")
public class Form4 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = Double.parseDouble(req.getParameter("c"));

        double delta = Math.pow(b,2) - 4 * a * c;

        if(delta < 0){
            resp.getWriter().println("delta < 0");
        }else{
            resp.getWriter().println(delta);
        }

        //(ax^2+bx+c)
//        int calc = Math.pow(a, a) +
    }
}
