package com.voc.spring.boot.demo.service;

import com.voc.spring.boot.demo.dao.UserDao;
import com.voc.spring.boot.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User findById(Long id) {
        return userDao.findById(id);
    }

}
