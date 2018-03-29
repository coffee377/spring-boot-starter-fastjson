package com.voc.spring.boot.demo.dao;

import com.voc.spring.boot.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Wu Yujie
 * @email coffee377@dingtalk.com
 * @time 2018/03/19 19:56
 */
@Repository
public class UserDaoImpl implements UserDao {
    public User findById(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("Test");
        user.setBirthday(new Date());
        return user;
    }
}
