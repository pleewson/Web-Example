package main.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LogUserAgentAndProcessingTimeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String userAgent = ((HttpServletRequest) servletRequest).getHeader("User-Agent");
        System.out.println("LogUserAgentAndProcessingTimeFilter userAgent : " + userAgent);
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
