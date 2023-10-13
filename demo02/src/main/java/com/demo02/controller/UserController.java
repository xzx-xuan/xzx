package com.demo02.controller;

import com.demo02.pojo.Actor;
import com.demo02.pojo.Film;

import com.demo02.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/selectAll")
public List<Film> selectAll(){
    return userService.selectAll();
}

    @PostMapping("/add")
    public String add(@RequestBody Film film){
        return userService.add(film);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam  Integer id){
        return userService.delete(id);
    }
    @PutMapping("/update")
    public String update(@RequestBody Film film){
        return userService.update(film);
    }
}
