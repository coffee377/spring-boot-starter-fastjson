package com.voc.spring.boot.demo.service;

import com.voc.spring.boot.demo.entity.User;

public interface UserService {

    User findById(Long id);

}
