package com.admin.h2.repository;

import com.admin.h2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author dengchao
 * @date 2020/2/7 10:29
 */
@Repository
@Mapper
public interface UserDao {

    @Select("select * from user where id= #{id}")
    User findById(Integer id);
}