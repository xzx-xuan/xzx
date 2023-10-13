package com.xzx.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    List list=new ArrayList(Arrays.asList("张三","李四","王五"));
    public Object method1(Integer index){
        return list.get(index);
    }
    public Object method2(String element){
        return list.add(element);
    }
    public Object method3(int index){
        return list.remove(index);
    }
    public Object method4(Integer index,String element){
        list.set(index,element);
        return list;
    }
    public Object method5(){
        return list;
    }

}