package main.web.jspServlety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index41")
public class index41 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        req.setAttribute("author", author);

        if(author == null){
            resp.getWriter().println("null value");
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/index41.jsp").forward(req,resp);
        }
    }
}
