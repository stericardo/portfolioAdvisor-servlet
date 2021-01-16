package com.challenges.portfolio.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "porfolioAdvisorSuggestion", urlPatterns = {"/porfolioAdvisorSuggestion"}, loadOnStartup = 1)
public class PorfolioAdvisorSuggestionController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        String renderer = getServletConfig().getInitParameter("renderer-class-name");
        PrintWriter writer = resp.getWriter();
        writer.println("Suggestion: " + renderer);

        String servletName = getServletConfig().getServletName();
        writer.println("servlet name " + servletName);
    }
}