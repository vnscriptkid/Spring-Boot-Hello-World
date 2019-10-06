package com.example.springboothello.servlet;

import java.io.IOException;

// fitler
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
// servlet
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) {
    System.out.println("Running Hello Servlet doGet method");
  }
}

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
class HelloFitler implements Filter {
  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println("Executing doFilter method");
    filterChain.doFilter(servletRequest, servletResponse);
    System.out.println("Done executing doFilter method");
  }
}