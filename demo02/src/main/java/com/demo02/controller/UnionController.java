package com.demo02.controller;

import com.demo02.pojo.Union;
import com.demo02.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnionController {
    @Autowired
    private UnionService unionService;
    @GetMapping("/select")
    public List<Union> select(){
        return unionService.select();

    }
}
