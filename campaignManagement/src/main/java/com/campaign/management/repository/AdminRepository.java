package com.campaign.management.repository;

import com.campaign.management.bean.AdminBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminBean,String> {
}
