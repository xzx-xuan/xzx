package com.demo02.dao;

import com.demo02.pojo.Actor;
import com.demo02.pojo.Film;

import org.apache.ibatis.annotations.*;

import java.sql.ResultSet;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from film_text")
    List<Film> selectAll();

    @Insert("insert into film_text (film_id,title,description) values (#{filmId},#{title},#{description})")
    void add(Film film);

    @Delete("delete from film_text where film_id=#{filmId}")
    void delete(Integer id);
@Update("update film_text set film_id=#{filmId},title=#{title},description=#{description} where film_id=#{filmId}")
    void update(Film film);
}
