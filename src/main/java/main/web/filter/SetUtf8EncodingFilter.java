package main.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class SetUtf8EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("UTF-8");
        System.out.println("set content and character encoding");
    }
}
