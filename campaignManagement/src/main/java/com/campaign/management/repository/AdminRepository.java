package com.campaign.management.repository;

import com.campaign.management.bean.AdminBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminBean,String> {
}
