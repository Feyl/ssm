package com.feyl.ssm.service.impl;

import com.feyl.ssm.entity.User;
import com.feyl.ssm.mapper.UserMapper;
import com.feyl.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insert(user.getId(),user.getName(),user.getAge());
    }

    @Override
    public Integer deleteUser(Long id) {
        return userMapper.delete(id);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.update(user.getId(),user.getName(),user.getAge());
    }
}
