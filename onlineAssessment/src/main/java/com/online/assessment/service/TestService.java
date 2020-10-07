package com.online.assessment.service;

import com.online.assessment.bean.Test;
import com.online.assessment.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestRepository testRepository;

    public void testStore(Test test)
    {
        testRepository.saveAndFlush(test);
    }
    public List<Test> testList()
    {
        return (List)testRepository.findAll();
    }

}
