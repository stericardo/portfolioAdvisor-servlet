package com.challenges.portfolio.service;

import com.challenges.portfolio.vo.AdvisorObject;
import com.challenges.portfolio.vo.RecommendedChange;
import com.challenges.portfolio.vo.RequestAdvisor;

public interface PortfolioAdvisorService {

    /**
     *
     * @param risk preferense for the client
     * @return double[] based on risk
     */
    double[] getAdvisorObject(int risk);

    /**
     *
     * @param requestAdvisor with allocation money
     * @return RecommendedChange with all steps
     */
    RecommendedChange getSuggestionAllocation(RequestAdvisor requestAdvisor);

}
