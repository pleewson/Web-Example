package main.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("book1", "author1", 101);
        Book book2 = new Book("book2", "author2", 120);
        Book book3 = new Book("book3", "author3", 300);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        req.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/WEB-INF/resultList.jsp").forward(req,resp);
    }
}
