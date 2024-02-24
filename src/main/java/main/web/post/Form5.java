package main.web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double temperature = Double.parseDouble(req.getParameter("temperature"));
        String type = req.getParameter("conversionType");

        if(type.equals("celcToFahr")){
            double result = (temperature * 9/5) + 32;
            resp.getWriter().println(result);
        }else if(type.equals("fahrToCelc")){
            double result = (temperature - 32) * 5/9 ;
            resp.getWriter().println(result);
        }

    }
}
