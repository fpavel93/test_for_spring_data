package com.spring_data.test_for_spring_data.controllers;

import com.spring_data.test_for_spring_data.repo.RepoForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring_data")
public class TestController {
    @Autowired
    private RepoForTest repo;

    @GetMapping("/test")
    public String test(){
        return repo.test();
    }
}
