package com.cssm.common.dao.impl;

import java.util.List;

import java.sql.Connection;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;


import com.cssm.common.dao.BaseDao;
import com.cssm.common.pojo.User;

public class UserDao extends SqlSessionDaoSupport  implements BaseDao{
	
	/**
     * 获取相关的数据库连接
     */
    public Connection getConnection() {
     return getSqlSession().getConnection();
    }

    
	public UserDao() {
		System.out.println("UserDao IN");
	}
    
	public User getUser(){
        String statement = "com.cssm.common.mapping.userMapper.getUser";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        User user = getSqlSession().selectOne(statement, 1);
        return user;
    }

	@Override
    public void saveObject(Object obj)
    {
        // TODO Auto-generated method stub
    }

    
}