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

@WebServlet("/session4")
public class Session4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        HttpSession session = req.getSession();
        CartItem product = new CartItem();
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");

        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }

        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);

        cartItems.add(product);

        double allProductSum = 0;
        for (CartItem c : cartItems) {
            double sum = c.getQuantity() * c.getPrice();
            resp.getWriter().println("<p> " + c.getName() + " " + c.getQuantity() + " x " + c.getPrice() + "zł = " + sum + "</p>");
            allProductSum += (c.getQuantity() * c.getPrice());
        }
        resp.getWriter().println("<p> SUMA: " + allProductSum + "</p>");

        session.setAttribute("cartItems", cartItems);
    }
}
