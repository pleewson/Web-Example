package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        HttpSession session = req.getSession();

        String[] parameters = (String[]) session.getAttribute("parameters");
        if (parameters == null) {
            parameters = new String[5];
        }

        String TEMPLATE_FORMAT = "<form method='post'>" +
                "text1<input type='text' name='text1' value='" + (parameters[0] != null ? parameters[0] : "") + "'><br>" +
                "text2<input type='text' name='text2' value='" + (parameters[1] != null ? parameters[1] : "") + "'><br>" +
                "text3<input type='text' name='text3' value='" + (parameters[2] != null ? parameters[2] : "") + "'><br>" +
                "text4<input type='text' name='text4' value='" + (parameters[3] != null ? parameters[3] : "") + "'><br>" +
                "text5<input type='text' name='text5' value='" + (parameters[4] != null ? parameters[4] : "") + "'><br>" +
                "<input type='submit'>" +
                "</form>";

        resp.getWriter().println(TEMPLATE_FORMAT);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String[] parameters = new String[5];
        parameters[0] = req.getParameter("text1");
        parameters[1] = ":)";
        parameters[2] = req.getParameter("text3");
        parameters[3] = req.getParameter("text4");
        parameters[4] = req.getParameter("text5");

        session.setAttribute("parameters", parameters);
        System.out.println("works");

        resp.sendRedirect("/servlet33");


    }
}
