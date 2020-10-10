package com.campaign.management.repository;

import com.campaign.management.bean.SurveyQuestionsBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateQuestionsRepository extends JpaRepository<SurveyQuestionsBean,Integer> {
}
