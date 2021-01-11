package com.spring_data.test_for_spring_data.service;

import com.spring_data.test_for_spring_data.repo.RepoForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private RepoForTest repo;

    @EventListener(ContextRefreshedEvent.class)
    public void testMethod()
    {
        System.out.println(repo.test());
    }
}
