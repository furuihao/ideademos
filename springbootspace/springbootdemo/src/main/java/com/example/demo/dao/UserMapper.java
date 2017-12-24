package com.example.demo.dao;

import com.example.demo.modules.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis 接口
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where name=#{name}")
    List<User> findByName(@Param("name") String name);

    /*User findByNameAndAge(String name, Integer age);*/

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("delete from user")
    void deleteAll();
}


