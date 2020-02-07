package com.admin.h2.controller;

import com.admin.h2.entity.User;
import com.admin.h2.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengchao
 * @date 2020/2/7 10:31
 */
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userDao.findById(id);
    }
}
