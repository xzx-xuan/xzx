package com.demo02.service;

import com.demo02.pojo.Actor;
import com.demo02.pojo.Film;


import java.sql.ResultSet;
import java.util.List;

public interface UserService {
    List<Film> selectAll();

    String add(Film film);

    String delete(Integer id);


    String update(Film film);
}
