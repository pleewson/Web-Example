package main.web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post2")
public class Form2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String consequences = req.getParameter("consequences");
        String phrase = req.getParameter("phrase");

        if(consequences == null){
            resp.getWriter().println(Censor.doCensor(phrase));
            return;
        }

        resp.getWriter().println(phrase);
    }
}



