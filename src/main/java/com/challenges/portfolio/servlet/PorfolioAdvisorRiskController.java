package com.challenges.portfolio.servlet;

import com.challenges.portfolio.builder.BuilderPorfolioService;
import com.challenges.portfolio.vo.AdvisorObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "porfolioAdvisorRisk", urlPatterns = {"/getRecommendationRisk"}, loadOnStartup = 1)
public class PorfolioAdvisorRiskController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        String paramName = "risk";
        String paramValue = request.getParameter(paramName);
        double[] advisorObject = BuilderPorfolioService.build().getAdvisorObject(Integer.parseInt(paramValue));
        String jsonBody = BuilderPorfolioService.mapper.writeValueAsString(advisorObject);

        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        writer.write(jsonBody);
    }
}