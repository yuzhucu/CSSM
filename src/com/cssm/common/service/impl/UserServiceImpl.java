package com.cssm.common.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssm.common.dao.UserMapper;
import com.cssm.common.pojo.User ; 
import com.cssm.common.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User searchById(String id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Transactional
    public int delete(String id){
        return userMapper.deleteByPrimaryKey(id);
    }

}
