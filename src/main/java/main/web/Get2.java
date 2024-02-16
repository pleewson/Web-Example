package main.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@WebServlet ("/get2")
public class Get2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Map<String, String[]> parameterMap = request.getParameterMap();

        PrintWriter writer = response.getWriter();
        for(Map.Entry<String, String[]> entry : parameterMap.entrySet()){
            writer.println(entry.getKey());
            writer.println(Arrays.toString(entry.getValue()));
        }

    }
}
