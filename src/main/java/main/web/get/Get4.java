package main.web.get;

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

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> map = new HashMap<>();
        map = req.getParameterMap();

        PrintWriter pw = resp.getWriter();
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            pw.println(entry.getKey() + " :");
            pw.println("<p></p>");
//            pw.println(" - " + Arrays.toString(entry.getValue()));
//            pw.println("<p></p>");
            for(String valueEntry : entry.getValue()){
                pw.println(" - "  + valueEntry);
                pw.println("<p></p>");
            }
        }

    }
}
