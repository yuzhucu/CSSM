package com.cssm.common.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;

import com.cssm.common.dao.UserMapper;
import com.cssm.common.pojo.User;
import com.cssm.common.service.UserService;

/**
 * 单元测试
 * @author developer
 */
// 告诉spring怎样执行
@RunWith(SpringJUnit4ClassRunner.class)
//  标明是web应用测试
@WebAppConfiguration(value = "WebContent") //可以不填，默认此目录
// 配置文件地址
@ContextConfiguration(locations = { "file:/WEB-INF/conf/spring/applicationContext.xml", "file:/WEB-INF/conf/spring/spring-mybatis.xml", "file:/WEB-INF/conf/spring/spring-mvc.xml" })

public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Before
    public void before(){
        System.out.println("准备测试！！！");
    }

    @After
    public void After(){
        System.out.println("测试结束！！！");
    }

    @Test
    public void get() {
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void add(){
        User user = new User();
        user.setUserId(7);
        user.setUserName("cyz");
        user.setPassWord("!@#$%^&");
        userService.insert(user);
    }

}
