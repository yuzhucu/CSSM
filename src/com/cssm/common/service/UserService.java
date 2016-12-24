package com.cssm.common.service;

import com.cssm.common.pojo.User;

public interface UserService {

    User searchById(String id);

    int insert(User user);

    int delete(String id);
}