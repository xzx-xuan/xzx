package com.demo02.service.impl;

import com.demo02.dao.UnionMapper;
import com.demo02.pojo.Union;
import com.demo02.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnionServiceImpl implements UnionService {
    @Autowired
    private UnionMapper unionMapper;
    @Override
    public List<Union> select() {

        return unionMapper.select();
    }
}
