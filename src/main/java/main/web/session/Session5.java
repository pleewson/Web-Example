package main.web.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/servlet5")
public class Session5 extends HttpServlet {
    final String FORMAT_TEMPLATE = "<form method='post'>" +
            "Name <input type='text' name='name'> " +
            "Surname <input type='text' name='surname'> " +
            "email <input type='text' name='email'>";

    final String CAPTCHA_TEMPLATE =
            "CAPTCHA <input type='number' name='captcha'>" +
            "<br> <input type='submit'>" +
            "</form>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        resp.getWriter().println(FORMAT_TEMPLATE);

        Random rn = new Random();
        int num1 = rn.nextInt(101);
        int num2 = rn.nextInt(101);
        int captchaSum = num1 + num2;

        session.setAttribute("captcha", captchaSum);

        resp.getWriter().println("<br>Enter sum below</br>");
        resp.getWriter().println(num1 + " + " + num2);

        resp.getWriter().println(CAPTCHA_TEMPLATE);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int captchaSum = (Integer) session.getAttribute("captcha");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        int captcha = Integer.parseInt(req.getParameter("captcha"));

        if (captcha != captchaSum) {
            resp.getWriter().println("Invalid number");
        } else {
            resp.getWriter().println("Name " + name);
            resp.getWriter().println("<br>Surname " + surname);
            resp.getWriter().println("<br>email " + email);
        }
    }
}
