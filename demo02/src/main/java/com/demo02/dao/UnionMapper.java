package com.demo02.dao;

import com.demo02.pojo.Union;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UnionMapper {
    @Select("select * from actor a,store s where a.actor_id=s.store_id")
    List<Union> select();
}
