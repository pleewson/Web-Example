package main.web.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    private final String FORM_TEMPLATE = "<form method='post'>" +
            "OCENA: <input type='number' min='0' max='6' name='mark'/>" +
            "<input type='submit'/>" +
            "</form>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(FORM_TEMPLATE);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(FORM_TEMPLATE);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        int mark = Integer.parseInt(req.getParameter("mark"));

        try {
            HttpSession session = req.getSession();
            List<Integer> marks = (List<Integer>) session.getAttribute("marks");

            if (marks == null) {
                marks = new ArrayList<>();
            }

            marks.add(mark);
            session.setAttribute("marks", marks);

            resp.getWriter().println(marks);
            resp.getWriter().println("<p></p>");
            resp.getWriter().println("avg: " + calcAvg(marks));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private double calcAvg(List<Integer> marks) {

        final double result = marks.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);

        return result;

//        double sum = 0;
//        for (Integer mark : marks) {
//            sum += (double) mark;
//        }
//
//        double avg = sum / marks.size();
//
//        return avg;

    }
}
