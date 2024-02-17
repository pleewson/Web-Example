package main.web.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/redirect")
public class Redirect extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.sendRedirect("https://github.com/pleewson");
        System.out.println("redirected to https://github.com/pleewson");
    }



}
