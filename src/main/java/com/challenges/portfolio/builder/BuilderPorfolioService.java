package com.challenges.portfolio.builder;

import com.challenges.portfolio.provider.PortfolioProvider;
import com.challenges.portfolio.service.PortfolioAdvisorService;
import com.challenges.portfolio.service.impl.PortfolioAdvisorServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class BuilderPorfolioService {

    public static final ObjectMapper mapper = new ObjectMapper();

    private BuilderPorfolioService(){

    }

    public static PortfolioAdvisorService build(){
        return PortfolioAdvisorServiceImpl.getInstance(PortfolioProvider.getInstance());
    }

}
