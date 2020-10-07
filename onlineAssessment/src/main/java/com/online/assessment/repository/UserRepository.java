package com.online.assessment.repository;

import com.online.assessment.bean.UserBean;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserBean,String> {
   // Optional<UserBean> findByEmailId(String email);

}
