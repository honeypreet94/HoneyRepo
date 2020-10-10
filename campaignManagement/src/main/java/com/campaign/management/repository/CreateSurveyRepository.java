package com.campaign.management.repository;

import com.campaign.management.bean.AdminBean;
import com.campaign.management.bean.SurveyListBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateSurveyRepository extends JpaRepository<SurveyListBean,Integer> {
}
