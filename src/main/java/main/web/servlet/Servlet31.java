package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double ammount = Double.parseDouble(req.getParameter("ammount"));
        String typeCurrencyToConvert = req.getParameter("convert");

        double result;
        switch (typeCurrencyToConvert) {
            case "EUR_USD":
                result = ammount * 1.08;
                resp.getWriter().println(result);
                break;
            case "USD_EUR":
                result = ammount * 0.92;
                resp.getWriter().println(result);
                break;
            case "EUR_PLN":
                result = ammount * 4.31;
                resp.getWriter().println(result);
                break;
            case "PLN_EUR":
                result = ammount * 0.23;
                resp.getWriter().println(result);
                break;
            case "USD_PLN":
                result = ammount * 3.98;
                resp.getWriter().println(result);
                break;
            case "PLN_USD":
                result = ammount * 0.25;
                resp.getWriter().println(result);
                break;
        }
    }
}
