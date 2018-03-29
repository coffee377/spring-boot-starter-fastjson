package com.voc.spring.boot.demo.dao;


import com.voc.spring.boot.demo.entity.User;

public interface UserDao  {
    User findById(Long id);
}

