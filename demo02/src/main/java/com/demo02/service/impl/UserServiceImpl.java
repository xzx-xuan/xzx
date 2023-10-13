package com.demo02.service.impl;

import com.demo02.dao.UserMapper;
import com.demo02.pojo.Actor;
import com.demo02.pojo.Film;
import com.demo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Actor> selectAll() {
       return userMapper.selectAll();
    }

    @Override
    public String add(Film film) {
        userMapper.add(film);
        return "您已新增成功";
    }

    @Override
    public String delete(Integer id) {
        userMapper.delete(id);
        return "您已删除成功";
    }

    @Override
    public String update(Actor actor) {
        userMapper.update(actor);
        return "您已修改成功";
    }
}
