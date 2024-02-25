package main.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String binary = req.getParameter("binary");

        if (isBinary(binary)) {
            long decimal = convertBinaryToDecimal(binary);
            resp.getWriter().println(binary + " converted to decimal -> " + decimal);
        } else {
            resp.getWriter().println("your input wasn't binary value");
        }


    }

    protected boolean isBinary(String value) {
        char[] binaryArr = value.toCharArray();

        for (int i = binaryArr.length - 1; i >= 0; i--) {
            if (binaryArr[i] < '0' || binaryArr[i] > '1') {
                return false;
            }
        }

        return true;
    }

    protected long convertBinaryToDecimal(String value) {
        char[] binaryArr = value.toCharArray();

        long sum = 0;
        int pow = 0;
        for (int i = binaryArr.length - 1; i >= 0; i--) {
            int digitValue = binaryArr[i] - '0';
            if (digitValue == 1) {
                sum += (long) Math.pow(2, pow);
            }
            pow++;
        }

        return sum;
    }
}


