package com.example.demo.dao;

import com.example.demo.modules.User;
/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/

public interface UserDao
        /*extends JpaRepository<User, Long>*/
{

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

  /*  @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);*/

}

